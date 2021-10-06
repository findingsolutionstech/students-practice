package findingsolutions.java;

public class FizzBuzz {

	/* Write a program that prints numbers from 1 to 30. But for
	 * multiples of 3 print "Fizz" instead of number and "Buzz" for multiples of 5.
	 * If there are multiples of both, print "FizzBuzz"
	 */
	public static void main(String[] args) {

		for (int i = 1; i <= 30; i++) {

			if (i % 3 == 0) { // use / to get quotient, % to get remainder
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}

	}
}
