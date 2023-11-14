package practiceJava;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] myIntArray = new int[10];
		
//		myIntArray[0] = 100;
//		myIntArray[1] = 200;
//		myIntArray[2] = 300;
//		
//		System.out.println("Array index 0 - " + myIntArray[0]);
//		System.out.println("Array index 1 - " + myIntArray[1]);
//		System.out.println("Array index 2 - " + myIntArray[2]);
//		System.out.println("Array index 3 - " + myIntArray[3]);
//		
//		String[] myStringArray = new String[10];
//		
//		myStringArray[0] = "BMW";
//		myStringArray[1] = "Audi";
//		myStringArray[2] = "Benz";
//		
//		System.out.println("Array index 0 - " + myStringArray[0]);
//		System.out.println("Array index 1 - " + myStringArray[1]);
//		System.out.println("Array index 2 - " + myStringArray[2]);
//		System.out.println("Array index 3 - " + myStringArray[3]);
		
		String[] myStringArray = {"BMW", "Audi", "Benz"};
		
		int len = myStringArray.length;
		
		for(int i = 0; i < len; i=i+1) {
			System.out.println("Array index " + i +" - "+ myStringArray[i]);
		}
		
		
		
	}

}
