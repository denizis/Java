
public class Main {

	public static void main(String[] args) {
	    CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
	  
		//ICustomerDal customerDal=new OracleCustomerDal();
		
		customerManager.add();
		
		
	}

}
