package findingsolutions.java;

public class UnderstandingScope {
  	
	private static int num = 2; // global variable

	public static void main(String[] args) {
		
		int num = 1;  // local variable takes precedence
		System.out.println("In main function: num = " + num);
		printNum();
	}
	
	static void printNum() {
		int num = 100;
		System.out.println("In printNum function: num = " + num);
	}

}
