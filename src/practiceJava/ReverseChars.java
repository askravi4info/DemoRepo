package practiceJava;

import java.util.Scanner;

public class ReverseChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myObj = new Scanner(System.in);
		System.out.println("Please enter a Text to be reversed:");

		String originalText = myObj.nextLine();
		myObj.close();
//		'Welcome'
		
		ReverseChars output = new ReverseChars();
		String reversedText = output.reverseCharacters(originalText);
		System.out.println("Reversed Text - " + reversedText);
		
	}
	
	private String reverseCharacters(String originalText) {
		
		String reverseText = "";
		
		for(int i=originalText.length()-1; i>=0; i--) {
//			System.out.println(originalText.charAt(i));
			reverseText = reverseText + originalText.charAt(i);
			System.out.println(reverseText);
		}
		
		return reverseText;
		
		
	}
	
	
	
	
	
	

}
