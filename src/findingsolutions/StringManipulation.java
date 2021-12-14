package findingsolutions;

public class StringManipulation {

	public static void main(String[] args) {
		
		//length() gives number of characters in a string
		String username = "findingsolutions";
		System.out.println(username.length());
		// prints 10

		// equals() is used to compare between two strings(texts)
		String secondUsername = "username";
		String secondPassword = "password";
		String secondPasswordCorrected = "vdfbvsyubdsbbds";
		
		System.out.println(secondUsername.equals(secondPassword));                //prints true
		System.out.println(secondUsername.equals(secondPasswordCorrected));       //prints false
		System.out.println(secondUsername.equals(secondPasswordUppercase));        //prints false
		System.out.println(secondUsername.equalsIgnoreCase(secondPasswordUppercase)); //prints true
		
		
		//indexOf() returns first occurence of a substring
		String comment = "My name is Adam"
		String.out.println(comment.indexOf("name")); //prints 3
		String name = "adam";
		System.out.println(name.indexOf("a")); //prints 2
		System.out.println(name.indexOf("A")); //prints 0
		
		
		
		
		
		// print 
			
			//System
		
		
		
		
	}

}
