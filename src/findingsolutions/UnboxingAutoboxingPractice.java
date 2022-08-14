package findingsolutions;

import java.util.ArrayList;
import java.util.List;

public class UnboxingAutoboxingPractice {

	public static void main(String[] args) {

		/*
		 * conversion of primitive data type (like int) to object wrapper type (like
		 * Integer) is called autoboxing
		 */
		List<Integer> listOfNumbers = new ArrayList<>();
		for (int i = 1; i < 50; i++) {
			listOfNumbers.add(i); // equivalent to doing listOfNumbers.add(Integer.valueOf(i));
		}

		/*
		 * conversion of object wrapper type (like Integer) to primitive type (like int)
		 * is called unboxing
		 */
		Integer num = -8;
		printNum(num);

		/*
		 * below won't work as Collections expect object wrapper type not primitives
		 * while arrays can be of both primitives and object types List<int>
		 * listOfPrimitiveInt = new ArrayList<>();
		 */
		int[] array = {};
		Integer[] array2 = {};
	}

	public static void printNum(int num) {
		System.out.println(num);
	}

}