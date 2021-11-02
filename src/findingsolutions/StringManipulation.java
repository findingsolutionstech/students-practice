package findingsolutions;

public class StringManipulation {
	
	public static void main(String[]args) {
		
		
		//length() gives the number of characters in a string
		String str="";
		System.out.println(str.length());
		//prints 10
		String name="findingsolutions";
		System.out.println(name.length());
		
		
		//equals() is used to compare between two strings (texts)
		String secondUsername="username";
		String secondPassword="username";
		String secondPasswordCorrected="yoyoyo!";
		String secondPasswordUppercase="Username";
		
		System.out.println(secondUsername.equals(secondPassword)); //true 
		System.out.println(secondUsername.equals(secondPasswordCorrected)); //false
		System.out.println(secondUsername.equals(secondPasswordUppercase));
		System.out.println(secondUsername.equalsIgnoreCase(secondPasswordUppercase));
		
		
		
		//System.out.println(s1.equals("Hello"));
		//System.out.println(s2.equals("Hello"));
		//System.out.println(s2.equalsIgnoreCase("world"));
		
		//indexOf() returns first occurrence of a substring (string within a sentence or another string)
		String ind="Hello World";
		System.out.println(str.indexOf(0));
		//prints 6
		
		String comment="My name is adam";
		System.out.println(comment.indexOf("name")); //prints 3
		String name1="Adam";
		System.out.println(name1.indexOf("a")); //prints 2
		System.out.println(name1.indexOf("A"));//prints 0
		
		
		//charAt() returns characters
		String str1="This is a string";
		System.out.println(str1.charAt(0));
		//prints 'T'
		System.out.println(str1.charAt(15));
		//prints 'G'
		
		
		
	}
	
	

}
