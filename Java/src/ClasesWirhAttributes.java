import javax.management.Descriptor;

public class ClasesWirhAttributes {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Leptop");
		product.setPrice(5000);
		product.setStockAmount(3);

		productManager productManager = new productManager();

		productManager.add(product);

		System.out.println(product.getKod());

	}

}
