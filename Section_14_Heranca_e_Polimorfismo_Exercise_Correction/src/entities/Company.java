package entities;

public class Company extends TaxPayer{

	private Integer numberOfEmployes;
	
	public Company(String name, Double anualIncome, Integer numberOfEmployes) {
		super(name, anualIncome);
		this.numberOfEmployes = numberOfEmployes;
	}
	
	public Integer getNumberOfEmployes() {
		return numberOfEmployes;
	}

	public void setNumberOfEmployes(Integer numberOfEmployes) {
		this.numberOfEmployes = numberOfEmployes;
	}

	@Override
	public double tax() {
		double basicTax = 0.0;
		return basicTax += 
				(getNumberOfEmployes() > 10) 
				? getAnualIncome() * 0.14 
				: getAnualIncome() * 0.16; 
	}

}
