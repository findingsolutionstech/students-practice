package findingsolutions.java;

public class Collatz {
	
	/*Take any number between 9 and 21
	 *If number is even, divide it by 2
	 *If number is odd, divide it by 3, then add 1.
	 *Repeat and keep printing the number till you reach 1.
	 */
	public static void main(String[] args) {
		
		//collatzPrintWhileLoop(21);
		collatzPrintForLoop(21);
	}
	
	// input - of a number
	// processing - logic
	// output - void (return nothing)
	static void collatzPrintWhileLoop(int number) {
		
		System.out.println(number);
		
		int i = number;
		while(i > 1) {
			
			if(number % 2 == 0) {  //  ==  equal
				number = number/2;
			} else if(number % 2 != 0) { // != not equals
				number = number/3 + 1;
			}
			System.out.println(number);
			i = number;
		}		
	}

	static void collatzPrintForLoop(int number) {
		
		System.out.println(number);
		
		for(int i = number; i > 1; i = number) {
			
			if(number % 2 == 0) {  //  ==  equal
				number = number/2;
			} else if(number % 2 != 0) { // != not equals
				number = number/3 + 1;
			}
			System.out.println(number);
		}
	}
	
}
