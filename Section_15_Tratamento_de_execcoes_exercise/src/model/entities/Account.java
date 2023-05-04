package model.entities;

import model.exceptions.DomainException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount){
		if (balance <= 0.0 || balance == null) {
			throw new DomainException("Withdraw error: Not enough balance");
		}
		else if (amount > withdrawLimit){
			throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
		}
		else {
			balance -= amount;
		}
	}
	
	@Override
	public String toString() {
		return "New balance: " + String.format("%.2f", balance);
	}
	

}
