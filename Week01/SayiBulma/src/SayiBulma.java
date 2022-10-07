
public class SayiBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 6;
		boolean bulundu = false;

		for (int i = 0; i < sayilar.length; i++) {
			if (aranacak == sayilar[i]) {
				bulundu = true;
			}

		}

		if (bulundu) {
			System.out.println("Sayı bulundu.");
		} else {
			System.out.println("Sayı bulunamadı.");
		}

	}

}
