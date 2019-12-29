// class Product 

public class Product {

	private String description;
	private String category;
	private int quantity;	
	private int weight;
	private int price;
	private int stocknumber;

	public Product(String description, String category, int quantity, int weight, int price, int stocknumber) {
		this.description = description;
		this.category = category;
		this.quantity = quantity;
		this.weight = weight;
		this.price = price;
		this.stocknumber = stocknumber;
	}

	public String getDescription() {
		return description;
	}
	public String getCategory() {
		return category;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public Integer getWeight() {
		return weight;
	}
	public Integer getPrice() {
		return price;
	}
	public Integer getStockNumber() {
		return stocknumber;
	}

	public String toString() {
//		return description+"\n"+category+"\n"+quantity+"\n"+weight+"\n"+price+"\n"+stocknumber;
		return "["+description+","+category+","+quantity+","+weight+","+price+","+stocknumber+"]";
	}
}
