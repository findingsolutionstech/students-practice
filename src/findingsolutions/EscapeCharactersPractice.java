package findingsolutions;

/*java escape characters are preceded by backslash
 * 
 * 
 */

public class EscapeCharactersPractice {
	public static void main(String[]args) {
		System.out.println("hello \t world"); // insert a tab
		
		System.out.println("this is a \"blue\" pen"); // insert a double quote
		
		System.out.println("option 1 \\ option2"); //insert a backslash
		
		System.out.print("Hello"); //these two should print on the same line
		System.out.print("world");
		
		System.out.print("Hello \n world"); // /n puts hello world on seperate lines
	}
}
