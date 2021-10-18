package trezzy21git;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionStart {
	
	public static void main(String[]args) {
		//array-static size
		int [] nums= new int [] {1,2,4};
		int [] numsShort= {1,2,4};
		
		int []numsLong=new int[3]; //defining the array with a length of 3 so if add another
									// numsLong[3]=5; will give exception
		numsLong[0]=1;
		numsLong[1]=2;
		numsLong[2]=4;
		System.out.println("Size of my array: " + numsShort.length);
		System.out.println(numsShort[0]); // index 0 = 1
		
		
		//List-dynamic array, not static size
		
		List<String> listOfFruit= new ArrayList<String>();
		listOfFruit.add("apple");
		listOfFruit.add("orange");
		System.out.println("Size of my list: " + listOfFruit.size());
		for(int i=0;i<listOfFruit.size();i++) {
			System.out.println(listOfFruit.get(i));
		}
		//removing from a arraylist > remove()
		listOfFruit.remove(2);//will remove the item at index 2
		System.out.println("size of my list after removal = " + listOfFruit.size());
		
		Set<String> setOfFruits=new HashSet<String>();
		setOfFruits.add("apple");
		setOfFruits.add("orange");
		System.out.println("Size of my set: " + setOfFruits.size());
		
		//how we print out a set
		System.out.println("Printing from my set of fruit basket");
		Iterator iter=setOfFruits.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
			
		/*Map - like a dictionary, key */
		
		System.out.println();
		Map mapOfFruits=new HashMap<String,Integer>();
		mapOfFruits.put("apple", 1);
		mapOfFruits.put("orange", 2);
		System.out.println("size of my map: " + mapOfFruits.size());
		
		System.out.println("how many apples do i have = " + mapOfFruits.get("apple"));
		System.out.println("How many oranges do I have = " + mapOfFruits.get("orange"));
		
		
		
		
		
		
	}
	
}
