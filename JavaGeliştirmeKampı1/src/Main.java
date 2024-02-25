
public class Main {

	public static void main(String[] args) {

		String ortaMetin="İlginizi çekebilir ";
		String altMetin="Vade süresi";
		
		
		System.out.println(ortaMetin+altMetin);
		
		
		int vade=12;
		double skor=1.4;
		double dolarBugun=30.80;
		boolean  sonuc=skor>2;
		boolean dolarDustumu=false;
		
		System.out.println(sonuc);
		
		String okYonu="down.svg";
		
		if(dolarDustumu==true) {
			
			System.out.println("Dolar düşmüş");
		}
		else if(dolarBugun>skor) {
			System.out.println("Dolar Bugğn daha yüksek ");
			
		}
		else {
			System.out.println("Dolar düşmemiş");
			
		}
		
		String kredi1="Hızlı kredi";
		String kredi2="Kredi X";
		String kredi3="Kredi Y";
		
		String[] krediler= {"Hızlı kredi ","Maaşın ı Halkbanktan","Mutlu Emekli"};
		
	
           System.out.println(krediler[0]);
           System.out.println(" \t");
		
		for(int i=0;i<krediler.length;i++) {
			
			System.out.println(krediler[i]);
			
		}
		
		
	}

}
