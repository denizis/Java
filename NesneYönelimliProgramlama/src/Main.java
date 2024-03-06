
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		;

		CreditManager creditManager = new CreditManager();
		//creditManager.Calculate();

		Customer customer = new Customer();

	
		customer.id = 1;
		customer.city = "İstanbul";

		//CustomerManager customerManager = new CustomerManager(Person);

		//customerManager.save();
		//customerManager.Delete();
		
		

		Company company = new Company();
		company.TaxNumber = "123213";
		company.CompanyName="Arçelik";
		company.id=133;
		
		//CustomerManager customerManager2 = new CustomerManager(new  Person()) ;
		
		Person person= new Person();
		person.NationalIdentity="123214";
		person.firstName = "Deniz";
		person.lastName = "iskender";
		
		Customer c1= new Customer();
		Customer c2= new Customer();
		Customer c3= new Customer();

	}

}
