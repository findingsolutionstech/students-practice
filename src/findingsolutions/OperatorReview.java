package findingsolutions;

public class OperatorReview {

	public static void main(String[] args) {

		int result = difference(2,3);
		System.out.println("Difference is " + result);
	}
	
	//Write a method that returns difference (-) between two number/integers */

	public static int difference(int a, int b) {

		return a-b;
	}

	//Write a method that prints out even numbers between zero and twelve excluding zero and twelve (0<even<12)
	public static void evenNumbersBetweenZeroAndTwelve() {
		for(int i = 1; i < 12 ;i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	
	
	
}
