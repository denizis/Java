import java.util.Iterator;
import java.util.Scanner;

public class reCapDemo2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double[] myList = new double[4];
		double total = 0;
		double max = 0;

		for (int i = 0; i < myList.length; i++) {
			// klavyeden veri girişi sağlıyoruz
			myList[i] = input.nextDouble();

		}

		System.out.println("\n");

		for (double number : myList) {
			total = total + number;

			System.out.println(number);
		}
		System.out.println("Girilen verilein toplamı= " + total);

		for (double number : myList) {

			if (max < number) {
				max = number;
			}
		}

		System.out.println("En büyük sayı :" + max);

	}

}
