package findingsolutions.java;

import java.util.ArrayList;
import java.util.List;

public class UnboxingAutoboxingPractice {

	public static void main(String[] args) {

		/*
		 * conversion of primitive data type (like int) to object wrapper type (like
		 * Integer)
		 */
		List<Integer> listOfNumbers = new ArrayList<>();
		for (int i = 1; i < 50; i++) {
			listOfNumbers.add(i); // equivalent to doing listOfNumbers.add(Integer.valueOf(i));
		}

		/*
		 * below won't work as Collections expect object wrapper type not primitives
		 * while arrays can be of both primitives and object types List<int>
		 * listOfPrimitiveInt = new ArrayList<>();
		 */
		int[] array = {};
		Integer[] array2 = {};

		/*
		 * conversion of object wrapper type (like Integer) to primitive type (like int)
		 */
		Integer num = -8;
		printNum(num);
	}

	public static void printNum(int num) {
		System.out.println(num);
	}

}
