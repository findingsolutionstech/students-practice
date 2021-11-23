package findingsolutions.java;

/* Write a program that determines if a number is positive(1,2,5) or negative (-2,-5)*/
public class PositiveOrNegative {

	public static void main(String[] args) {
		positiveOrNegativeWithIf(0);
	}

	public static void positiveOrNegativeWithIf(int num) {

		if (num > 0) {
			System.out.println("The number is positive");
		} else if (num < 0) {
			System.out.println("The number is negative");
		} else {
			System.out.println("The number is zero");
		}
	}

}
