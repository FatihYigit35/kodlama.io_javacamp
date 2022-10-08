
public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 6;
		boolean bulundu = false;

		for (int i = 0; i < sayilar.length; i++) {
			if (aranacak == sayilar[i]) {
				bulundu = true;
			}

		}

		if (bulundu) {
			mesajVer(aranacak + " Sayısı bulundu.");
		} else {
			mesajVer(aranacak + " Sayısı bulunamadı.");
		}

	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
		
	}

}
