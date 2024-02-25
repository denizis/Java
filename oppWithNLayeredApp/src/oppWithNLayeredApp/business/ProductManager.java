package oppWithNLayeredApp.business;
import java.util.List;
import oppWithNLayeredApp.core.logging.ILogger;
import oppWithNLayeredApp.dataAccess.HibernateProductDao;
import oppWithNLayeredApp.dataAccess.ProductDao;
import oppWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private List<ILogger> Loggers;

	public ProductManager(ProductDao productDao) {

		this.productDao = productDao;
		this.Loggers = Loggers;
	}

	public void add(Product product) throws Exception {

		if (product.getUnitPrice() < 10) {

			throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
		}

		// HibernateProductDao productDao = new HibernateProductDao();
		productDao.add(product);
		
		
		for(ILogger logger:Loggers) {
			logger.log(product.getName());
		}

	}

}
