
public class mukemmelSayi {

	public static void main(String[] args) {
		// Mükemmel Sayi
		
		int a=46;
		int total=0;
		
		for(int i=1;i<a;i++) {
			
			if(a%i==0) {
				
				total+=i;
				
			}
			
			
		}
		System.out.println("Sayımız: "+a+" Bölen sayıların  toplamı: "+total);
		
		if(a==total) {
			System.out.println(a+" Sayısı mükemmel sayııdır.");
		}
		else {
			System.out.println(a+" Sayısı mükemmel sayı değildir. ");
		}
		

	}

}
