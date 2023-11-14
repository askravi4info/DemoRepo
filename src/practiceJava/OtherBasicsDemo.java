package practiceJava;

public class OtherBasicsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int day = 8;
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		    
		  default:
			  System.out.println("The Days are DONE");
		}

		
		int x = 30;
		int y = 10;
		int z = 30;
		float k = -33f;
		
		if(x<y) {
			System.out.println("x is lesser than y");
		}
		else {
			System.out.println("x is greater than y");
	
		}
		
		
		int time = 20;
		String result = (time < 18) ? "Good day." : "Good evening.";
		System.out.println(result);

		
//		
//		System.out.println(x+y);
//		System.out.println(x-y);
//		System.out.println(x*y);
//		System.out.println(x/y);
//		System.out.println(x%y);
//		System.out.println(++y);
//		System.out.println(--x);
//		System.out.println(z+=5);
//
//		System.out.println(x == y);
//		System.out.println(x != y);
//		System.out.println(x > y);
//		System.out.println(x < y);
//		System.out.println(x >= y);
//		System.out.println(x <= y);

//		
////		System.out.println("Using Math class - " + Math.max(x, y));
////		System.out.println("Using Math class - " + Math.min(x, y));
////		System.out.println("Using Math class - " + Math.abs(k));
		
//		System.out.println("Random Num using Math class - Ravi" + (int)(Math.random()*101));


		

	}

}
