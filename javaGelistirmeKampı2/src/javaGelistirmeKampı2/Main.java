package javaGelistirmeKampı2;



public class Main {

	public static void main(String[] args) {

		// set
		product product1 = new product();

		product1.setName("Fiat egea");
		product1.setDiscount(7);
		product1.setUnitPrice(7900);
		product1.setUnitInStock(4);
		product1.setImageUrl("image1.jpeg");

		// get
		// System .out.println(product1.name);
		// System.out.println(product1.unitPrice);
		// System.out.println(product1.discount);
		// System.out.println(product1.unitInStock);
		// System.out.println(product1.imageUrl);

		product product2 = new product();
		// set
		product2.setName("Renaul Megan");
		product2.setDiscount(7);
		product2.setUnitPrice(7900);
		product2.setUnitInStock(4);
		product2.setImageUrl("image1.jpeg");

		product product3 = new product();
		// set
		product3.setName("BMW 320");
		product3.setDiscount(7);
		product3.setUnitPrice(7900);
		product3.setUnitInStock(4);
		product3.setImageUrl("image1.jpeg");

		product[] products = { product1, product2, product3 };

		System.out.println("<ul>");
		for (product product : products) {

			System.out.println("<li>" + product.getName() + "</li>");

		}
		System.out.println("</ul>");
		
		IndividualCustomer indi = new IndividualCustomer();
		
		indi.setId(1);
		indi.setPhone("0505551");
		indi.setCustomerNumber("12345");
		indi.setFirstName("Deniz");
		indi.setLastName("İskender");
		
		
		CorporateCustomer corp=new CorporateCustomer();
		
		corp.setId(2);
		corp.setCompanyName("Kodlama.io");
		corp.setPhone("053656660");
		corp.setTaxNumber("1222");
		corp.setCustomerNumber("54321");
		
		
	
		
		
		
		
		
		
		
		

	}

}
