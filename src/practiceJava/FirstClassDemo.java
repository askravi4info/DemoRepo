package practiceJava;

public class FirstClassDemo {

	public static void main(String[] args) {
		
		String language = "Ruby";
		int favNumber = 100;
		float floatNum = 100.00f;
		char charVal = 'h';
		
//		int x = 5;
//		int y = 6;
//		int z = 50;
		
//		int x = 5,  y = 6,  z = 50;
		
		int x,y,z;
		x=y=z=50;
		
		System.out.println(language);
		System.out.println("Integer Num is " + favNumber);
		
		favNumber = 7;
		
		System.out.println("Integer Num is " + favNumber);

	}

}
