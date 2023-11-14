package practiceJava;

public class LoopsDemo {
	
	
	public static void main(String[] args) {
		
//		while
//		int i = 0;
//		while (i < 5) {
//		  System.out.println(i);
//		  i++;
//		}
//		
//		do while
//		int i = 0;
//		do {
//		  System.out.println(i);
//		  i++;
//		}
//		while (i < 5);


//		for (int i = 0; i <= 10; i=i+2) {
//			  System.out.println(i);
//			}

//		Nested Loops
//		for (int i = 1; i <= 2; i++) {
//			  System.out.println("Outer: " + i); // Executes 2 times
//			  
//			  // Inner loop
//			  for (int j = 1; j <= 3; j++) {
//			    System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
//			  }
//			} 
//	
	
	
	String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	for (String i : cars) {
	  if (i == "Ford") {
		  System.out.println("Skipping Ford");
		  continue;
	  }
	  System.out.println(i);

	  
	  
	}
	
	
	}


}
