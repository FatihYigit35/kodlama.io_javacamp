package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade oranı";

		Product product1 = new Product();
//		product1.name = "Delonghi Kahve Makinesi";
//		product1.unitPrice = 7500;
//		product1.discount = 7;
//		product1.unitInStock = 3;
//		product1.imageUrl = "image1.jpg";
		product1.setName("Delonghi Kahve Makinesi");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitInStock(3);
		product1.setImageUrl("image1.jpg");

		Product product2 = new Product();
//		product2.name = "Smeg Kahve Makinesi";
//		product2.unitPrice = 6500;
//		product2.discount = 8;
//		product2.unitInStock = 2;
//		product2.imageUrl = "image2.jpg";
		product2.setName("Smeg Kahve Makinesi");
		product2.setUnitPrice(6500);
		product2.setDiscount(8);
		product2.setUnitInStock(2);
		product2.setImageUrl("image2.jpg");

		Product product3 = new Product();
//		product3.name = "Kitchen Aid Kahve Makinesi";
//		product3.unitPrice = 4500;
//		product3.discount = 9;
//		product3.unitInStock = 4;
//		product3.imageUrl = "image3.jpg";
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setUnitPrice(4500);
		product3.setDiscount(9);
		product3.setUnitInStock(4);
		product3.setImageUrl("image3.jpg");

		Product[] products = { product1, product2, product3 };

		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");

		}
		System.out.println("</ul>");

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05222222");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Fatih");
		individualCustomer.setLastName("Yiğit");

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("05333333");
		corporateCustomer.setCustomerNumber("54321");
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setTaxNumber("111111111");
		
		Customer[] customer = {individualCustomer,corporateCustomer};

	}

}
