package week3.assignments;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class FindInterSection {

	public static void main(String[] args) {
	  
Integer[] array1 = {3,2,11,4,6,7};
Integer[] array2 = {1,2,8,4,9,7};
	  List<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(array1));
	  List<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(array2));
	  List<Integer> intSectionArr = new ArrayList<Integer>();

	  for (int i = 0; i < arr1.size() ; i++) 
	  {
		  for (int j= 0 ; j< arr2.size(); j++)
		  {
			  if(arr1.get(i) == arr2.get(j))		
			  {
				  intSectionArr.add(arr1.get(i));			 		 
		  }
			  }

	  }

	  System.out.println(intSectionArr);
			  }

}
