package practiceJava;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myNum = addNum(2,3);
		System.out.println(myNum);
		
		double myDoubleNum = addNum(2.0,3.0);
		System.out.println(myDoubleNum);
		
		double myDoubleNum3 = addNum(2.0,3);
		System.out.println(myDoubleNum3);
	}
	
	
	static int addNum(int x, int y) {
		return x+y;
	}

	static double addNum(double x, double y) {
		return x+y;
	}
	
	
	
}
