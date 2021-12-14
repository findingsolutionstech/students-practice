package findingsolutions;

import java.util.ArrayList;
import java.util.List;

public class UnboxingAutoboxingPractice {

	public static void main(String[] args) {
		
		/*autoboxing is automatic change
		 * used to covert primitive data type (like int) to object wrapper type (like Integer)
		 * 
		 */

		List<Integer> listOfNumbers = new ArrayList<>();
		for (int i = 1; i < 50; i++) {
			listOfNumbers.add(i);             // equivalent to doing ListOfNumbers.add (Integer.valueOf(i));
		}
		List<int> listOfPrimitiveInt = new ArrayList<>();
		
		/*conversion of object wrapper type (like Integer) to primitive type (like int)
		 */
		Integer num = -8;
		printNum(num);
		
		/* unboxing is manual change
		 * used to convert object wrapper type (like Integer) to primitive type (like int)
		 */
		
		Integer num1 = 1;
		int unboxedNum = num1;
		System.out.println(unboxedNum);
		
	}

	public static void printNum(int num) {
		System.out.println(num);
	}
	
}
