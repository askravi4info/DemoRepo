package practiceJava;

public class GlobalVsLocalVarDemo {
	
	static byte byteVariable = 127;
	static short shortVariable = 1000;
	static int integerVariable = 100000;	
	static long longVariable = 100000000L;
	static float floatVariable = 20.1f;
	static double doubleVariable = 60.33;
	static boolean booleanVariable = true;
	static char charVariable = 'a';

	public static void main(String[] args) {
		
		System.out.println("Byte Value is " + byteVariable);
		
		System.out.println("Short value is " + shortVariable);
		
		System.out.println("Int value is " + integerVariable);

		System.out.println("Long value is " + longVariable);
		
		System.out.println("Float value is " + floatVariable);

		System.out.println("Double value is " + doubleVariable);

		System.out.println("Boolean value is " + booleanVariable);

		System.out.println("Char value is " + charVariable);
		
		
		anotherMethod();
		
	}
	
	public static void anotherMethod() {
		
		System.out.println("Byte Value is " + byteVariable);
		
		System.out.println("Short value is " + shortVariable);
		
		System.out.println("Int value is " + integerVariable);

		System.out.println("Long value is " + longVariable);
		
		System.out.println("Float value is " + floatVariable);

		System.out.println("Double value is " + doubleVariable);

		System.out.println("Boolean value is " + booleanVariable);

		System.out.println("Char value is " + charVariable);

		
	}
	
	
	
	
	
	
	

}
