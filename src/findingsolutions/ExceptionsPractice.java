package findingsolutions;

public class ExceptionsPractice {
	
	public static void main(String []args) {
		checkedExceptionSampleWithTryCatch();
		System.out.println("printing something");/* checked exceptions - checked at compile time */
		uncheckedExceptionSample();
	
	
	}
	
	
	
	
	public static void checkedExceptionSampleWithTryCatch() {
	
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void uncheckedExceptionSample() {
		int[] numbers = {1,2};
		System.out.println("Number at 0th index" + numbers[0]);
		
	}
	
	
	public static void checkedExceptionHandledWithThrows() throws InterruptedException{
		Thread.sleep(3000);
	}

}
