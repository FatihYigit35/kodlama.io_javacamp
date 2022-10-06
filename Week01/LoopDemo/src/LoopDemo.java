public class LoopDemo {

	public static void main(String[] args) {
		// For
		for (int i = 2; i < 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("For Dongüsü Bitti.");
		
		//While
		int i = 2;
		while (i < 10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("While Dongüsü Bitti.");
		
		//Do-While
		int j = 10;
		do {
			System.out.println(j);
			i+=2;
		}while (i < 10);
		System.out.println("Do-While Dongüsü Bitti.");
	}

}
