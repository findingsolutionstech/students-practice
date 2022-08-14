package findingsolutions;

public class StringManipulation {

	public static void main(String[] args) {
		
		// length() gives number of characters in a string
		String username = "findingsolutions";
		System.out.println(username.length());

		
		// equals() is used to compare between two strings(texts)
		String secondUsername = "username";
		String secondPassword = "username";
		String secondPassordCorrected = "herG!@Hjsldkfj";
		String secondPasswordUppercase = "Username";

		System.out.println(secondUsername.equals(secondPassword)); // prints true
		System.out.println(secondUsername.equals(secondPassordCorrected)); // prints false
		System.out.println(secondUsername.equals(secondPasswordUppercase)); // prints false
		System.out.println(secondUsername.equalsIgnoreCase(secondPasswordUppercase)); // prints true

		
		// indexOf() returns first occurrence of a substring (string within a sentence or another String)
		String comment = "My name is Adam";
		System.out.println(comment.indexOf("name"));   // prints 3
		String name = "Adam";
		System.out.println(name.indexOf("a"));  // prints 2
		System.out.println(name.indexOf("A"));  // prints 0
		
		
		// charAt() returns character at given index
		System.out.println(comment.charAt(0));  // prints 'M'
		System.out.println(comment.charAt(15)); // throws Runtime exception since our sentence isn't that long
	}
		
}
