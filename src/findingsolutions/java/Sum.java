package findingsolutions.java;

public class Sum {
	
	public static void main(String[] args) {
		System.out.println("Sum of two numbers " + sum(3,1));
		System.out.println("Difference of two numbers " + difference(5,4));
		System.out.println("Product of two numbers " + product(5,4));
		System.out.println("Quotient of division of two numbers " + quotient(5,2));
	}

	// program/method/function that takes 2 numbers and returns their sum (+)
	public static int sum(int a, int b) {
		return a+b;
	}
	
	// function that takes 2 numbers as input and returns their difference (-)
	public static int difference(int a, int b) {
		return a-b;
	}
	
	// function that takes 2 numbers as input and returns their product (*)
	public static int product(int a, int b) {
		return a*b;
	}

	/* function that takes 2 numbers as input and returns 
	 * the quotient of their division (/)
	 */
	public static int quotient(int a, int b) {
		return a/b;
	}
	
	/* function that takes 2 numbers as input and returns the remainder of their division
	* (% - modulus operator)
	*/ 
}
