package findingsolutions;

import java.util.ArrayList;
import java.util.List;

public class UnboxingAutoboxingPractice {
	
	public static void main(String[]args) {
		
		/*autoboxing is automatic change
		 * used to convert primitive data type (like int data type) to obejct wrapper type (Like Integer)
		 * 
		 */
		
		List<Integer>listOfNumbers=new ArrayList<>();
		for(int i =1; i <50;i++) {
			listOfNumbers.add(i); //equivalent to doing listOfNumbers.add(Integer.valueOf(i)):
		}
		//below wont work as collections expect object wrapper type not primitives
		//while arrays can be of both primitives and object types List<int>
		//List<int> listOfPrimitiveInt=newArrayList<>();
		
		int[]array= {};
		Integer[]array2= {};
		
		/*conversion of object wrapper type (like Integer) to primitive type(like int)
		 * 
		 */
		
		Integer num = -8;
		printNum(num);
		
		
	}
		public static void printNum(int num) {
			System.out.println(num);
		}
		
		
		
	

}
