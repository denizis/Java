
public class sayıBulma {

	public static void main(String[] args) {
		// sayı bulma

		int[] sayılar = new int[] { 1, 2, 3, 4, 5, 67 };
		int aranacak = 8;
		boolean varmi = false;

		for (int i = 0; i < sayılar.length; i++) {
			if (aranacak == sayılar[i]) {

				varmi = true;
				break;
			}

		}

		if (varmi == true) {
			System.out.println("Var");
		} else {
			System.out.println("Yok");
		}

	}

}
