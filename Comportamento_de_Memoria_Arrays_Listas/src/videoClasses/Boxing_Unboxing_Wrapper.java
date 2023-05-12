package videoClasses;
public class Boxing_Unboxing_Wrapper {

	public static void main(String[] args) {
		
		int x = 20;
		
		Object obj = x;
		
		System.out.println(obj);
		
		int y = (int) obj;
		
		System.out.println(y);
		
		// Using Wrapper class
		
		int a = 20;
		
		Integer objt = a;
		
		System.out.println(objt);
		
		int z = objt;
		
		System.out.println(z);

	}

}
