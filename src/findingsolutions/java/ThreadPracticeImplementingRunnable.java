package findingsolutions.java;

public class ThreadPracticeImplementingRunnable {

	public static void main(String[] args) {
		
        int n = 5; 						// Number of threads
        for (int i = 0; i < n; i++) {
            Thread thread = new Thread(new ImplementRunnableExample());
            thread.start();
        }
	}
}
