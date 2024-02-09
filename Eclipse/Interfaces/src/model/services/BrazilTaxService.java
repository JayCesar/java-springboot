package model.services;

public class BrazilTaxService implements TaxService{ // O TaxService é um tipo genérico
	// Aqui ocorre um UpCasting (Mando debaixo pra cima);
	// Pois BrazilTaxSerice é tipo um 'filho' de TaxService (Implementa!)
	
	@Override
	public double tax(double amount) {
		if (amount <= 100.0) {
			return amount * 0.2;
		}
		else{
			return amount * 0.15;
		}
	}
}
