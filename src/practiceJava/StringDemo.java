package practiceJava;

public class StringDemo {

	public static void main(String[] args) {
//		
////		String Literal
//		String str1 = "Ruby";
//		String str3 = "Ruby";
//
////		Heap Storage
//		String str2 = new String("welcome");
//		String str4 = new String("welcome");

		
		String str = "This is the test for String";
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "hello";
		String str4 = "test";
		String str5 = "";
		String str6 = " Welcome to ";
		
		String str7 = "It's ok";
		String str8 = "I like \"Java\" class";
		String str9 = "Good\\Bad";

				
		System.out.println("Length of the String is " + str.length());
		
		System.out.println("Character at Index 5 is " + str.charAt(5));
		
		System.out.println("Appending Text - " + str.concat(" Adding More Text"));
		
		System.out.println("Contains Check1 - " + str.contains("test"));
		System.out.println("Contains Check2 - " + str.contains("testing"));
		
		System.out.println("Starts with Text1 - " + str.startsWith("This"));
		System.out.println("Starts with Text2 - " + str.startsWith(" This"));

		System.out.println("Ends with Text1 - " + str.endsWith("String"));
		System.out.println("Ends with Text2 - " + str.endsWith(" String "));

		System.out.println("Check if the contents are equal - " + str1.equals(str2));
		System.out.println("Check if the contents are equal - " + str1.equals(str3));
		
		System.out.println("Index of 'h' is " + str.indexOf('h'));
		System.out.println("Index of 'test' is " + str.indexOf(str4));
		
		System.out.println("Check if the String is empty1 - " + str4.isEmpty());
		System.out.println("Check if the String is empty2 - " + str5.isEmpty());
		
		
		System.out.println("Replace the text -" + str.replace("String", "Array"));
		
		System.out.println("Substring1 - " + str.substring(5));
		System.out.println("Substring2 - " + str.substring(5,10));
		
		System.out.println("Lower Case - " + str1.toLowerCase());
		System.out.println("Upper Case - " + str1.toUpperCase());
		
		System.out.println("Trim the leading and trailing spaces - " + str6.trim());

		System.out.println(str7);
		System.out.println(str8);
		System.out.println(str9);
		
	}

}
