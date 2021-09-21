package week3.day2.Assignments;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionPrintDuplicates {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(14);
		al.add(12);
		al.add(13);
		al.add(11);
		al.add(15);
		al.add(14);
		al.add(18);
		al.add(16);
		al.add(17);
		al.add(19);
		al.add(18);
		al.add(17);
		al.add(20);
		
		Collections.sort(al);
		
		int size = al.size();
		for (int i = 0; i < size - 1; i++) {
			int count = 0;
			for (int j=i + 1; j < size;) {
				if (al.get(i) == al.get(j))
					count = count + 1;
				break;
			}
			if (count > 0)
				System.out.println(al.get(i));
		}
	}
}
