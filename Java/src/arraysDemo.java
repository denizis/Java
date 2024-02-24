
public class arraysDemo {

	public static void main(String[] args) {
		
		String ogrenci1="Engin ";
		String ogrenci2="Deniz";
		String ogrenci3="salih";
		String ogrenci4="Ahmet";
	  
		System.out.println(ogrenci1);
		
		
		String [] ogrenciler= new String[4];
		
		ogrenciler[0]=ogrenci1;
		ogrenciler[1]=ogrenci2;
		ogrenciler[2]=ogrenci3;
		ogrenciler[3]=ogrenci4;
		
		System.out.println(ogrenciler[3]+"\n");
		
		for(int i=0;i<ogrenciler.length;i++) {
			
			System.out.println(ogrenciler[i]);
		}
      
		System.out.println("\n");
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
			
		}
	
	}

}
