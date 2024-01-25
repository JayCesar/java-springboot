package fundamentos;

public class Wrapper {

	public static void main(String[] args) {

		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		Integer convertedInteger = Integer.parseInt("1000");
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(convertedInteger);
		
		Float f = 123F;
		System.out.println(f);
		
		Double d = 124.2;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString());
		
		Character c = '#';
		System.out.println(c + "...");
		
	}
}
