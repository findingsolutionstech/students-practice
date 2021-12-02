package findingsolutions;

public class ImplementRunnableExample  implements Runnable{
	
	@Override
	public void run() {
		try {
			//displays the thread is running
			System.out.println("Thread" + Thread.currentThread().getId() + "is running");

		} catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}

}
