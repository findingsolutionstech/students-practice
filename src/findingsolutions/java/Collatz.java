package findingsolutions.java;

public class Collatz {
	
	/*Take any number between 9 and 21
	 *If number is even, divide it by 2
	 *If number is odd, divide it by 3, then add 1.
	 *Repeat and keep printing the number till you reach 1.
	 */
	public static void main(String[] args) {
		
		collatzPrint(9);
	}
	
	// input - of a number
	// processing - logic
	// output - void (return nothing)
	static void collatzPrint(int number) {
		
		System.out.println(number);

		//for(int i = 0; i <= 10; i++) {}
		
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

}
