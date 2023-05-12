package util;

public class CurrencyConverter {
    public static final double IOF = 0.06;
    
    public static double convertToReais(double dollarCotation, double dollarAmount) {
    	return (dollarCotation * dollarAmount) + (IOF * (dollarCotation * dollarAmount));
    	//return (dollarCotation * dollarAmount) + (1.0 + IOF);
    }
}
