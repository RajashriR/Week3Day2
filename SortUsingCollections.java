package week3day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingCollections {

	public static void main(String[] args) {
		
		List<String> sort = new ArrayList<String>();
		sort.add("HCL");
		sort.add("TCS");
		sort.add("CTS");
		sort.add("Infosys");
		sort.add("BOFA");
		System.out.println(sort);

	//Length of the array
		int arraysize = sort.size();
		System.out.println("Length of the array");
		System.out.println(arraysize);
		
		//Sorting the List
		Collections.sort(sort);
		System.out.println("Sorting");
		System.out.println(sort);
		
		//Reverse Order
		Collections.reverse(sort);
		System.out.println("Reverse Order");
		System.out.println(sort);
	}

}
