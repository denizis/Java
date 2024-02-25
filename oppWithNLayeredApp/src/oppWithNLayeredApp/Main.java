package oppWithNLayeredApp;

import oppWithNLayeredApp.business.ProductManager;
import oppWithNLayeredApp.core.logging.DatabaseLogger;
import oppWithNLayeredApp.core.logging.FileLogger;
import oppWithNLayeredApp.core.logging.ILogger;
import oppWithNLayeredApp.dataAccess.JdbcProductDa;
import oppWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Product product1  = new Product(1,"Iphone 11",1133);
		
		ILogger[] Loggers=  { new DatabaseLogger(), new FileLogger()};
		
		ProductManager productManager= new ProductManager(new JdbcProductDa());
		productManager.add(product1);
		
		
		
		
		
		

	}

}
