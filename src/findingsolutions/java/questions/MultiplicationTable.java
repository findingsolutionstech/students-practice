package findingsolutions.java.questions;

/* Write a program that takes a number as input 
 * and prints its multiplication table up to 10
 * 
 * Example -
 * number: 8
 * Expected Output in console:
 * 8 x 1 = 8
 * 8 x 2 = 16
 * .
 * .
 * 8 x 10 = 80
 */
public class MultiplicationTable {

	public static void main(String[] args) {
		multiplicationTable(8);
	}
	
	/* input - logic - output */
	public static void multiplicationTable(int num) {
		for(int i = 1; i <= 10; i++) {
			System.out.println(num + "x" + i + "=" + num*i);
		}
	}
}
