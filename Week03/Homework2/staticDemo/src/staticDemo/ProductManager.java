package staticDemo;

public class ProductManager {
	public void add(Product product) {
//		ProductValidator validator = new ProductValidator(); -> metod static olduğu için direkt sınıf ile çağırıldı
		if (ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		} else {
			System.out.println("Ürün bilgileri geçersizdir");
		}

		ProductValidator productValidator = new ProductValidator();
		productValidator.birsey();

	}

}
