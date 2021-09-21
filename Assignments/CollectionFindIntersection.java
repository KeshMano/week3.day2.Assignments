package week3.day2.Assignments;

import java.util.ArrayList;

public class CollectionFindIntersection {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(3);
		al.add(2);		
		al.add(11);
		al.add(4);
	    al.add(6);
		al.add(7);
		ArrayList<Integer>al1=new ArrayList<Integer>();
		al1.add(1);
		al1.add(2);		
		al1.add(8);
		al1.add(4);
	    al1.add(9);
		al1.add(7);
		 int size= al.size();
		 int size1 = al1.size();
		for(int i=0;i<size;i++) {
			//System.out.println(i);
			for(int j=0;j<size1;j++) {
				//System.out.println(j);
			if(al.get(i)==al1.get(j)) {
				System.out.println(al.get(i));
			}
			}
		}
		

		 /** a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */

	}

}
