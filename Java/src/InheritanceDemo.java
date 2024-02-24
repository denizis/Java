
public class InheritanceDemo {

	public static void main(String[] args) {
		
		OgretmenKrediManager ogretmenKrediManager= new OgretmenKrediManager();
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesaplama(new OgretmenKrediManager());
		krediUI.KrediHesaplama(new AskerKrediManager());
		//Poliformizim
		

	}

}
