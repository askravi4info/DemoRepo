package practiceJava;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myObj = new Scanner(System.in);
		System.out.println("Please enter a String to be reversed:");

		String originalText = myObj.nextLine();
		myObj.close();
//		'Welcome to Java Sessions'
		
		ReverseString output = new ReverseString();
		String reversedText = output.reverseString(originalText);
		System.out.println("Reversed String - " + reversedText);
		
	}
	
	private String reverseString(String originalText) {
		
		String reverseText = "";
		
		String[] originalArray = originalText.split(" ");
		
		if(originalText.isEmpty()) {
			System.out.println("Empty Strings are NOT allowed");
		} else {
		
		for(String eachItem:originalArray) {
//			System.out.println(eachItem);
			
			reverseText = eachItem + " " + reverseText;
		}
		}
		
		return reverseText;
		
	}
	
	
	
	
	
	

}
