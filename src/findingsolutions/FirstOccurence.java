package findingsolutions;

import java.util.ArrayList;
import java.util.List;

public class FirstOccurence {

	public static void main(String[] args) {

		int[] numArray = {2,3,4,0,0};
		int result = occurrenceInArray(0, numArray);
		System.out.println("First occurred at " + result);
		
		String word = "apple";
		List<String> words = new ArrayList<>();
		word.add("orange");
		word.add("papaya");
		word.add("apple");
		int result2 = occurrenceInList(word, words);
		System.out.println(word + "first occured at " + result2);
		
	}
		
		/*
		 * Write a function that returns index of first occurrence
		 * of given integer in an array
		 * input - logic/processing - output
		 */
		
		public static int occurrenceInArray(int n, int[] numArray) {
			
			for (int i = 0; i < numArray.length; i++) {
				if(n == numArray[0]) {
					return i;
				}
		}
		return -1;
	}
    
		
		/*
		 * Write a function that returns index of first occurrence
		 * of given word in an list of words 
		 * If the given word never occurs, return "does not occur"
		 * input - logic/processing - output
		 */
        public static int occurrenceInList(String word, List<String> words) {
			
			for (int j = 0; j < words.size(); j++) {
				if(word.equals(words.get(j))) {
					return j;
				}
			}
			return -1;
           }
}
