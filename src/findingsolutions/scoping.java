package findingsolutions;

public class scoping {

	private static int num = 2; // global variable
	public static void main(String[] args) {
		
		
		int num = 1; // local variable takes precedence
		num = 3;
		System.out.println("In main function: num = " + num);
		printNum();
	}
		
		
		
		
		static void printNum() {
			System.out.println("In printNum function: num = " + num);
		}
		
	}
	

