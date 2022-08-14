package findingsolutions;

import java.util.ArrayList;
import java.util.List;

public class AnotherLoopPractice {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(-2);
		nums.add(2);
		nums.add(5);
		addTwoToContents(nums);
	}

	/*
	 * Write a method that takes a list of numbers 
	 * and prints out the contents of
	 * the list after adding 2 to each number. 
	 * Input - processing - output
	 */
	public static void addTwoToContents(List<Integer> nums) {
		for (int i = 0; i < nums.size(); i++) {
			System.out.println(nums.get(i) +2);
		}
	}
}
