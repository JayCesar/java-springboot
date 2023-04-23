package entities;

public class AccountCorrection {
	private int number;
	private String name;
	private double balance;
	
	public AccountCorrection(int number, String name, double depositValue) {
		this.number = number;
		this.name = name;
		deposit(depositValue);
	}
	
	public AccountCorrection(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ number 
				+ ", Holder: "
				+ name 
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
}
