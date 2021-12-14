package findingsolutions;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Sum of two number" + sum(3,1));
		System.out.println("Minus of two number" + minus(10,5));
		System.out.println("Multiply of two number" + multiply(9,9));
		System.out.println("Divison of two number" + divide(40,20));
		System.out.println("Remainder of two number" + remainder(40,20));
		
		
	}

	// program/method/function that takes 2 numbers and returns their sum(+)
		public static int  sum(int num1, int num2 ) { 
			return num1 + num2;
		
		}
		

		// function that takes 2 numbers as input and returns their difference(-)
		
		public static int minus(int num3, int num4) { 
			return num3 - num4;
		
		}
		
		// Function that takes 2 numbers as input and returns their product(*)
		
		public static int multiply (int num5, int num6) { 
			return num5 * num6;
		
		}
		
		// function that takes 2 numbers as input and return their quotation(/)
		
		public static int divide (int num7, int num8) { 
			return num7 / num8;
		
		}
		
		// function that takes 2 numbers as input and returns the remainder of their division
		
		public static int remainder (int num9, int num10) { 
			return num9 % num10;
		
		}
		
}
