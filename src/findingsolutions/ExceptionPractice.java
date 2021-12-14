package findingsolutions;

public class ExceptionPractice {

	public static void main(String[] args) {
	

		
		//checkedExceptionSample();
		//System.out.println("print anything");
		uncheckedExceptionSample();
		
		
		
	}

	
	/* Checked exceptions - checked at compile time */
	/* whoever declared knew
	public static void checkedExceptionSample() /*throws InterruptedException */ {
		
		try {
		Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/* Unchecked exceptions (Runtime exceptions) - detected only at Runtime */
	public static void uncheckedExceptionSample() {
		
		int[] numbers = {1,2};
		System.out.println("Number at 0th index" + numbers[100]);
	}
	
	
	
}
