package pk;

public class Product {
	private int id;
	private double price;
	private int quantity;

	public Product() {
		super();
	}

	public Product(int id, double price, int quantity) {
		super();
		this.id = id;
		this.price = price;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "id: " + this.id + "\t price: " + this.price + "\t quantity: " + this.quantity;
	}

}
