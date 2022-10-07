
public class StringDemo1 {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		
		System.out.println(mesaj);
		
		System.out.println("Eleman sayısı : " + mesaj.length());
		System.out.println("5. eleman : " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasın!"));
		
		System.out.println(mesaj.startsWith("A")); // girilen karakter ile başlıyormu (true/false)
		System.out.println(mesaj.endsWith(".")); // girilen karakter ile bitiyormu (true/false)
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf("av")); // girilen karakter kaçıncı karakterden sonra başlıyor
		System.out.println(mesaj.lastIndexOf("a")); // girilen karakter sondan kaçıncı karakterden sonra başlıyor
		
		

	}

}
