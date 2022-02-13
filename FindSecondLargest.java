package week3.assignments;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindSecondLargest {
	public static void main(String[] args) {
		Integer[] data = {3,2,11,4,6,7};
		int length  = data.length;
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(data));
		Collections.sort(list);
		System.out.println(list);
		int element = list.get(length-2);
		System.out.println("Second Largest Number is : " +element);




	}

}
