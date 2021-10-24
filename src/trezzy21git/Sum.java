package trezzy21git;

public class Sum {

	public static void main(String[] args) {
	System.out.println("this is the sum of 2 numbers: " + sum1(1,2));
	System.out.println("this is the subtraction of 2 nums: " + minus2(9,3));
	System.out.println("this is the multiplication line:  " + multiply(3,2));
	System.out.println("this is the divison line: " + divide(5,2));
	System.out.println("this is the divison line: " + remainder(10,5));
		
		//program that takes 2 numbers and returns their sum
		
	
	}
	
	//addition
	public static int sum1(int a, int b) {
		return a+b;
	}
	
	//if you get rid of public it will be a default constructor
	//subtraction
	public static int minus2(int a1,int b2) {
		return a1-b2;
	}
	
	//product
	public static int multiply(int m1,int m2) {
		return m1*m2;
	}
		
	//divide
	public static int divide(int r1,int r2) {
		return r1/r2;
	}
	
	public static int remainder(int d1,int d2) {
		return d1 % d2;
	}

}


	

