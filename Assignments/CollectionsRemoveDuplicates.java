package week3.day2.Assignments;

import java.util.HashSet;
import java.util.Set;

public class CollectionsRemoveDuplicates {

	public static void main(String[] args) {
		
		
		String string = "PayPal India";
		char[] charArray = string.toCharArray();
		//System.out.println(charArray);
		Set<Character> charSet = new HashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			charSet.add(charArray[i]);
		
		}
		System.out.println(charSet);
	}
}
	


