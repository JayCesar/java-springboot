package model.services;

public class BrazilInterestService2 implements InterestService {

	private double interestRate;

	public BrazilInterestService2(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}
}