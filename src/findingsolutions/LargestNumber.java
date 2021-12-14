package findingsolutions;

import java.util.ArrayList;
import java.util.List;

public class LargestNumber {
	
	public static void main(String[] args) {
		
	    List<Integer> nums = new ArrayList<>();
	    nums.add(1);
	    nums.add(200);
	    nums.add(3);
	    int result = largestInList(nums);
	    System.out.println("Largest number is " + result);
	}
		
		
		/*Write a method that returns the largest number in a list
		 * of numbers
		 * If lists is empty, return -1
		 * input - logic - output
		 * 
		 */
		
		
		
			
		public static int largestInList(List<Integer> nums) {
		
		int largest = -1;
		for (int i = 0; i < nums.size(); i++) {
			if(nums.get(i) > largest) {
				largest = nums.get(i);
			}
	}
	return largest;
	
	}
