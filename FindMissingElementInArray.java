package week3.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMissingElementInArray {
	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,7,6,8};

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		Collections.sort(list);
		System.out.println(list);
		for (int i = 1; i < list.size() ; i++) {
			if(i != list.get(i-1)) {
				System.out.println("Missing Element is : "+i);
				break;
			}
		}


	}

}
