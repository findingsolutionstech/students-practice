package findingsolutions.java;

public class ExceptionsPractice {

	public static void main(String[] args) {

		uncheckedExceptionSample();

		checkedExceptionHandledWithTryCatch();

		try {
			checkedExceptionHandledWithThrows();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/* Checked exceptions - checked at compile time
	 * whoever declared knew of the error that can occur */
	public static void checkedExceptionHandledWithTryCatch() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void checkedExceptionHandledWithThrows() throws InterruptedException {

		Thread.sleep(1000);
	}

	/* Unchecked exceptions (Runtime exceptions) - detected only at Runtime time
	 * occurs due to programmer short-sightedness */
	public static void uncheckedExceptionSample() {

		int[] numbers = { 1, 2 };
		System.out.println("Number at 0th index " + numbers[100]);
	}

}
