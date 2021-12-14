package findingsolutions;

public class ThreadPracticeExtendingThread {

	public static void main(String[] args) {
		
		int n = 8;
		for (int i = 0; i < n; i++) {
			ExtendsThreadExample thread = new ExtendsThreadExample
			thread.start();
		}
		
	}
}
