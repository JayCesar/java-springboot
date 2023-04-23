package entities;

public class Student {
	public String name;
	public double n1, n2, n3;
	
	public double sumNotes() {
		return n1 + n2 + n3;
	}
	
	public void verifyNotes(double sumNotes) {
		System.out.printf("FINAL GRADE %.2f%n", sumNotes());
		if (sumNotes > 60.00) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			double restant = 60 - sumNotes();
			System.out.printf("MISSING: %.2f POINTS", restant);
		}
		
	}
	
}
