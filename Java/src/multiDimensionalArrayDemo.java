import java.util.Scanner;

public class multiDimensionalArrayDemo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String [][] sehirler=new String[3][3];
		
		sehirler [0][0]="istanbul";
		sehirler [0][1]="Tokat";
		sehirler [0][2]="edirne";
		sehirler [1][0]="Çanakkale";
		sehirler [1][1]="Tabzon";
		sehirler [1][2]="Diyarbakır";
		sehirler [2][0]="Ordu";
		sehirler [2][1]="Giresunl";
		sehirler [2][2]="İkitelli";
		
		for (int i = 0; i < sehirler.length; i++) {
			for (int j = 0; j < sehirler.length; j++) {
				System.out.println(sehirler[i][j]);
			}
			
		}
		
		
		
		
		
	}

}
