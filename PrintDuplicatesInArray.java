package week3.assignments;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;



public class PrintDuplicatesInArray {
	public static void main(String[] args) {
		Integer[]  arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println("Duplicate Elements in the given array are:");
		for (int i=0 ; i<= list.size() ; i++) {
			for (int j = i+1 ; j < list.size() ; j++) {
				if (list.get(i) == list.get(j)) {
					System.out.println(list.get(j));
				}
			}

		}
	}
}
