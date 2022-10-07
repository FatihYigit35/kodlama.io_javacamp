
public class StringDemo2 {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		
		System.out.println(mesaj);

		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2,5)); // 2 den başla 5 e kadar
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		String mesaj2 = "    Bugün hava çok güzel.    ";
		System.out.println(mesaj2.trim()); // başındaki ve sonundaki boşlukları atar

	}

}
