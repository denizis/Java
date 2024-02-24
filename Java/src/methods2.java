
public class methods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(topla(5,7)+"\n");
		int toplam=topla2(1,2,3,4,5,252);
		System.out.println(toplam);

	}

	public static void ekle() {
		System.out.println("Eklendi");
 
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void guncelle() {
		System.out.println("Güncellendi");
	}
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	public static int topla2(int... sayilar) {
		int toplam=0;
		for(int sayi: sayilar) {
			toplam=toplam+sayi;
		}
		return  toplam;
	}
}
