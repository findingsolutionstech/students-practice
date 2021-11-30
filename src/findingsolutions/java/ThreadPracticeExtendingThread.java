package findingsolutions.java;

public class ThreadPracticeExtendingThread  {
	
	public static void main(String[] args) {
		
        int n = 5; 						// Number of threads
        for (int i = 0; i < n; i++) {
            ExtendsThreadExample thread = new ExtendsThreadExample();
            thread.start();
        }
	}

}
