
public class SesliHarfler {

	public static void main(String[] args) {
		char harf = 'E';

		switch (harf) {
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println(harf + " : İnce sesli harftir.");
			break;
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(harf + " : Kalın sesli harftir.");
		default:
			System.out.println("Sesli harf giriniz.");
			break;

		}

	}

}
