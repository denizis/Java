
public class main {

	public static void main(String[] args) {
		
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.dataBaseManager= new ORacleDataBaseManager();
		customerManager.getCustomers();

	}

}
