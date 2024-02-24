
public class methods {

	public static void main(String[] args) {
		
		sayiBulmaca();

	}
	
	public static void sayiBulmaca() {
		
		int[] sayılar = new int[] { 1, 2, 3, 4, 5, 67 };
		int aranacak = 4;
		boolean varmi = false;

		for (int i = 0; i < sayılar.length; i++) {
			if (aranacak == sayılar[i]) {

				varmi = true;
				break;
			}

		}

		if (varmi == true) {
			mesajVer(aranacak);
		} else {
			System.out.println("Yok");
		}
		
	}
	public static void mesajVer(int aranacak) {
		System.out.println("Sayı mevcuttur"+aranacak);
		
		
	}
	
	
	
	
	
	
	

}
