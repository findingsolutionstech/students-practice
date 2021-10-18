package trezzy21git;

import java.util.ArrayList;
import java.util.List;

public class ListAssignment {
	public static void main(String[]args) {
		List<String>cars=new ArrayList<String>();
		cars.add("bmw");
		cars.add("ferrari");
		cars.add("dodge");
		System.out.println("size of my list: " + cars.size());
		
		System.out.println("printing my vehicles");
		for(int i=0;i<cars.size();i++) {
			System.out.println(cars.get(i));
		}
	}

}
