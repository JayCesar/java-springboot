package entities;

public class SavingsAccountAbstrata extends AccountAbstrata {
	
	private Double interestRate;
	
	public SavingsAccountAbstrata() {
		super();
	}

	public SavingsAccountAbstrata(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
}