package week3day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class secondLargest {

	
	
	public static void main(String[] args) {
		
		int arr[] = {98,23,12,45,54,32};
		List<Integer> list =new ArrayList<Integer>();
		Arrays.asList(arr);
		for (int res :arr)
			list.add(res);
			Collections.sort(list);
			System.out.println("Second Largest No :" +(list.get(list.size()-2)));
	}

}
