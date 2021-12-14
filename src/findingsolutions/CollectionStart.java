package findingsolutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CollectionStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//printing concatenation
		int add = 2 + 3;
		System.out.println("my addition result: " + add);
		
		
		//array - static size
		int[] numsLong = new int[3];
		numsLong[0] = 1;
		numsLong[1] = 2;
		numsLong[2] = 4;
		
		int[] nums = new int[] { 1, 2, 4 };
		int[] numsShort = { 1, 2, 4 };
		System.out.println("Size of array: " + numsShort.length);

		
		// List - dynamic array, not static size
		List numList = new ArrayList<String>();
		System.out.println("Size of my list: " + numList.size());
		
		
		System.out.println();
		System.out.println("");
		for(int i = 0; i < .size()); i++ {
			System.out.println( .get(i));
		}
		
		// Set - similar to a list but doesn't take duplicate
		System.out.println();
		Set set = new HashSet<String>();
		.add();
		.add();
		.add();
		System.out.println("Size of my set: " + .size());
		
		System.out.println();
		Iterator iter = .iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// Map - is like a dictionary
		System.out.println();
		Map mapOf = new HashMap<String, Integer>();
		mapOf .put(iter, 1);
		mapOf .put(iter, 2);
		System.out.println("Size of my map: " + mapOf.size());
		
		System.out.print("How many apples do i have ? " + mapOf.get(""));
		
	}

}
