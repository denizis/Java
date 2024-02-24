
public class Product {
	//constructor
	public Product(int id ,String name ,String description ,double price ,int stockAmount,String renk) {
		
		System.out.println("Yapıcı blok çalıştı");
		
		this.description=description;
		this.id=id;
		this.kod=kod;
		this.name=name;
		this.price=price;
		this.renk=renk;
		this.stockAmount=stockAmount;
	}
	public Product() {};
	// attribute |field
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;

	public int getId() {
		return id;
	}

	public String getKod() {
		return this.name.substring(0, 1) + id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

}
