package videoClasses;


public class ProgramForEach {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}

		// using forEach
		
		System.out.println("------------------");
		for (String obj : vect) {
			System.out.println(obj);
		}
	}

}
