package week3day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class learnList3 {

	public static void main(String[] args) {
		String arr[] = { "Aston Martin", "Bugatti", "Bentley", "Alfa Romeo", "Buick", "Acura", "Audi" };
		String arr1[] = {"Bugatti","Bentley","Acura","Alfa Romeo"};
		
		List<String> list1 = new ArrayList<String>(Arrays.asList(arr));
		List<String> list2 = new ArrayList<String>(Arrays.asList(arr1));
		
		/*to remove duplicates
		list1.removeAll(list2);
		System.out.println(list1);
		//prints all duplicates from list1
		*/
		
		list1.retainAll(list2);
		System.out.println(list1);
		
		boolean contains = list1.contains("Acura");
		System.out.println(contains);
	}

}
