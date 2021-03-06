package findingsolutions.java.questions;

import java.util.ArrayList;
import java.util.List;

public class FirstOccurrence {
	
	public static void main(String[] args) {
		int num = 100;
		int[] numArray = {2,3,4,0,0};
		int result = occurrenceInArray(num, numArray);
		System.out.println(num + " first occurred at " + result);
		
		String word = "apple";
		List<String> words = new ArrayList<>();
		words.add("orange");
		words.add("papaya");
		words.add("apple");
		int result2 = occurrenceInList(word, words);
		System.out.println(word + " first occured at " + result2);
	}
	
	/* Write a function that returns index of first occurrence 
	 * of given integer in an array of numbers
	 * If the given number never occurs, return -1
	 * input - logic/processing - output
	 */
	public static int occurrenceInArray(int n, int[] numArray) {
		
		for(int i = 0; i < numArray.length; i++) {
			if(n == numArray[i]) {
				return i;
			}
		}
		return -1;
	}
	
	/* Write a function that returns index of first occurrence 
	 * of given word in an List of words
	 * If the given word never occurs, return -1
	 * input - logic/processing - output
	 */
	public static int occurrenceInList(String word, List<String> words) {
		for(int j = 0; j < words.size(); j++) {
			if(word.equals(words.get(j))) {
				return j;
			}
		}
		return -1;
	}
	
}
