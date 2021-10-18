package findingsolutions.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsStart {

	public static void main(String[] args) {
		
		// printing concatenation
		int add = 2 + 3;
		System.out.println("my addition result: " + add);

		/* array - static size */
		String[] arrayOfFruits = new String[3];
		arrayOfFruits[0] = "apple";
		arrayOfFruits[1] = "orange";
		arrayOfFruits[2] = "pear";
		
		String[] arrayOfFruitsShortenedForm = new String[] { "apple", "orange", "pear"};
		String[] arrayOfFruitsShortestForm = { "apple", "orange", "pear"};
		System.out.println("Size of my array: " + arrayOfFruitsShortestForm.length);
		for(int i = 0; i < arrayOfFruitsShortestForm.length; i++) {
			System.out.println(arrayOfFruits[i]);
		}
				
		/* List - dynamic array, not static size */
		System.out.println();
		List<String> listOfFruits = new ArrayList<String>();
		listOfFruits.add("apple");
		listOfFruits.add("orange");
		listOfFruits.add("apple");
		System.out.println("Size of my list: " + listOfFruits.size());
	
		System.out.println("Printing my list of fruit basket");
		for(int i = 0; i < listOfFruits.size(); i++) {
			System.out.println(listOfFruits.get(i));
		}
		
		// removing from a list
		listOfFruits.remove(2);
		System.out.println("Size of my list after removing the fruit in 2th place/ third place: " + listOfFruits.size());
		
		/* Set - similar to a list but doesn't take duplicates */
		System.out.println();
		Set<String> setOfFruits = new HashSet<String>();
		setOfFruits.add("apple");
		setOfFruits.add("apple");
		setOfFruits.add("orange");
		System.out.println("Size of my set: " + setOfFruits.size());
		
		System.out.println("Printing my set of fruit basket");
		Iterator iter = setOfFruits.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		/* Map - like a dictionary, key-value pair */
		System.out.println();
		Map mapOfFruits = new HashMap<String, Integer>();
		mapOfFruits.put("apple", 1);
		mapOfFruits.put("orange", 2);
		System.out.println("Size of my map: " + mapOfFruits.size());
		
		System.out.println("How many apples do I have ? " + mapOfFruits.get("apple"));
		System.out.println("How many oranges do I have ? " + mapOfFruits.get("orange"));
	}

}
