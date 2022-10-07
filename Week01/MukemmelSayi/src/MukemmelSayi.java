
// Bir sayının çarpanlarının toplamı kendisini veriyorsa mükemmel sayıdır.

public class MukemmelSayi {

	public static void main(String[] args) {
		int number = 29;
		int toplam = 0;
		
		for (int i=1; i<number;i++) {
			if(number % i == 0) {
				toplam+=i;
			}
		}
		
		if(toplam == number) {
			System.out.println(number +" sayısı mükemmel sayıdır.");
		} else {
			System.out.println(number + " sayısı mükemmel sayı değildir.");
		}

	}

}
