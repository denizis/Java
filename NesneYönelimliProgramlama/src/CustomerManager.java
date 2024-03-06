
public class CustomerManager {

	private Customer _customer;
	private ICreditManager creditManager;

	public CustomerManager(Customer customer,ICreditManager creditManager) {
        creditManager=creditManager;
		customer = customer;
	}

	public void save() {

		System.out.println("Müşteri kaydedildi " );
	}

	public void Delete() {

		System.out.println("Müşteri Silindi " );
	}

	public void GiveCredit() {

		creditManager.Calculate();
		System.out.println("Kredi verildi");
	}
}
