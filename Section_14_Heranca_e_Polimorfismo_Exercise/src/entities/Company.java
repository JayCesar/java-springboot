package entities;

public class Company extends TaxPayer{

	private Integer numberOfEmployers;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double anualIncome, Integer numberOfEmployers) {
		super(name, anualIncome);
		this.numberOfEmployers = numberOfEmployers;
	}


	public Integer getNumberOfEmployers() {
		return numberOfEmployers;
	}

	public void setNumberOfEmployers(Integer numberOfEmployers) {
		this.numberOfEmployers = numberOfEmployers;
	}

	@Override
	public double tax() {
		double tax = 0.0;
		return tax += (numberOfEmployers > 10) 
				? anualIncome * 0.14 
				: anualIncome * 0.16;
	}

}
