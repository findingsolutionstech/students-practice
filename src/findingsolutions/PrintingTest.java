package findingsolutions;

public class PrintingTest {

	public static void main(String[] args) {

		printMe();
		printMeLongLine();
	}
		/*Write a method to print following line on the console
		 * Today is java review day
		 * Today is "Java Review" day
		 * my workspace is in C:\
		 * 
		 */
		public static void printMe() {
		System.out.println("Today is java review day");
		System.out.println("Today is \"Java Review\" day");
		System.out.println("My workspace is in C:\\");
		}
		
		// \n equals to hitting enter on your keyboard
		public static void printMeLongLine() {
			System.out.println("Today is Java review day. \today is \"Java Review\" day. My workspace is in C:\\");
	}

}
