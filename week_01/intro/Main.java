package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world!");

		String ortaMetin = "İlginizi çekebilir";
		String altMetin = "Vade süresi";

		System.out.println(ortaMetin);
		System.out.println(altMetin);

		int vade = 12;

		double dolarDun = 18.18;
		double dolarBugun = 18.28;

		boolean dolarDustuMu = true;

		String okYonu = "";

		if (dolarBugun < dolarDun) {

			okYonu = "down.svg";

		} else if (dolarBugun == dolarDun) {

			okYonu = "equal.svg";

		} else {

			okYonu = "up.svg";

		}

		System.out.println(okYonu);

		String[] krediler = { "Hızlı kredi", "Maaşını Halkbanktan", "Mutlu Emekli" };

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

	}

}
