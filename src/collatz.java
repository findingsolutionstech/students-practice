
//public class collatz {

	/* Take any number between 9 and 21
	 * if number is even, divide it by 2
	 * if number is odd, divide it by 3, then add 1.
	 * Repeat and keep printing and you'll eventually reach 1.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		collatzPrint(21);
	}
	
	// input - of a number
	// processing - logic
	// output - void (return nothing)
	static void collatzPrintForLoop(int number) {
		
		static void collatzPrintWhileLoop(int number);
		System.out.println(number);
		
		for(int i = 0; i <= 10; i++) {}
		
		int i = number;
		while(i > 1) {
			
		}
		
		
		
		if(number % 2 == 0) { // == equal
			number = number/2;
		} else if(number % 2 != 0) {
			number = number/3 + 1;
		}
		System.out.println(number);
		i = number;
	}

}
