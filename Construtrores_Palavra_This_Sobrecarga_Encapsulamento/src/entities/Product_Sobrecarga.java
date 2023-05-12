package entities;

public class Product_Sobrecarga {
	public String name;
	public double price;
	public int quantity;
	
	public Product_Sobrecarga(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	
	public Product_Sobrecarga(String name, double price) {
		this.name = name;
		this.price = price;
		quantity = 0; 
		// É opcional pois a linguagem Java já começa com zero;
		// Eu também não preciso da palavra this
		// E uposso apagar se eu quiser;
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