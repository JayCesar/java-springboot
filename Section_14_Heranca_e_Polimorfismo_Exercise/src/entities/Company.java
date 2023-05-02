package entities;

public class Company extends TaxPayer{

	private Integer numberOfEmployees;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}


	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployers(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		double basicTax = 0.0;
		return basicTax += 
				(getNumberOfEmployees() > 10) 
				? getAnualIncome() * 0.14 
				: getAnualIncome() * 0.16; 
	}

}

