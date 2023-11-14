package practiceJava;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		welcomeMessage();
		welcomeMessage();
		welcomeMessageForLanguage("Java", 1);
		welcomeMessageForLanguage("Ruby", 2);
		welcomeMessageForLanguage("JavaScript", 3);
		welcomeMessageForLanguage("Python", 4);
		
		int myRandomNum = getRandomNum();
		System.out.println("New UserName is Ravi" + myRandomNum);
		int myRandomNum1 = getRandomNum();
		System.out.println("New UserName is Ravi" + myRandomNum1);
		int myRandomNum2 = getRandomNum();
		System.out.println("New UserName is Ravi" + myRandomNum2);
		int myRandomNum3 = getRandomNum();
		System.out.println("New UserName is Ravi" + myRandomNum3);
		

	}
	
	static void welcomeMessage() {	
		System.out.println("Welcome to Java Classes");
	}
	
	static void welcomeMessageForLanguage(String language, int classNum) {
		System.out.println("Welcome to " + language + " Classes - " + classNum);
	}
	
	static int getRandomNum() {
		return (int)(Math.random()*101);
	}
	
	

}
