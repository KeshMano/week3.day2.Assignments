package week3.day2.Assignments;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionFindSecondlargest {

	public static void main(String[] args) {
		// Here is the input
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(3);
		al.add(2);		
		al.add(11);
		al.add(4);
	    al.add(6);
		al.add(7);
		Collections.sort(al);
		int size=al.size();
		System.out.println(al.get(size-2));

	}

}
