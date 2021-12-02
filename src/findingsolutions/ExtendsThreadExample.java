package findingsolutions;

public class ExtendsThreadExample extends Thread {

	// has a built in method called run()
	public void run() {
		try {
			//displays the thread is running
			System.out.println("Thread" + Thread.currentThread().getId() + "is running");

		} catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}

}
