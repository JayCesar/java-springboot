package entities;

public class ProductGettersAndSetters {
	private String name;
	private double price;
	private int quantity;
	
	public ProductGettersAndSetters() {
	}
	
	public ProductGettersAndSetters(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public ProductGettersAndSetters(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}



/*

public ProductGettersAndSetters(String name, double price, int quantity) {
	this.name = name;
	this.price = price;
	this.quantity = quantity;
}

public ProductGettersAndSetters(String name, double price) {
	this.name = name;
	this.price = price;
	quantity = 0; 
}

// Getters and Setters
public void setName(String name) {
	this.name = name;
}

public String getName() {
	return name;
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

*/