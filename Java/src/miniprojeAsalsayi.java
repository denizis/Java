import java.util.Scanner;

public class miniprojeAsalsayi {

	public static void main(String[] args) {
		// Sayı asal mı değilmi 

		Scanner input = new Scanner(System.in);
		System.out.println("-Asal SAyı kontrol Sistemi-\n");
		System.out.println("Lutfen kontrol etmek istediğini sayıyı girini.");

		int number = input.nextInt();

		boolean durum = true;

		for (int i = 2; i < number; i++) {

			if (number % i == 0) {
				durum = false;
				break;
			}

		}

		if (durum == false) {
			System.out.println("Sayımız Asal değildir");
		} else if (durum == true) {

			System.out.println("Sayımız asaldır");
		}

	}

}
