
public class MiniProjeAsalSayi {

	public static void main(String[] args) {
		int number = 29;
		boolean asal = true;

		if (number == 1) {
			System.out.println("Sayı asal değildir.");
			return;
		}

		if (number < 1) {
			System.out.println("Geçersiz sayı.");
			return;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				asal = false;

			}
		}

		if (asal) { // "asal == true" ile aynı anlama geliyor
			System.out.println(number + " sayısı asaldır");

		} else {
			System.out.println(number + " sayısı asal değildir");
		}

	}

}
