package week3day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class learnList2 {

	public static void main(String[] args) {
		String arr[] = { "Aston Martin", "Bugatti", "Bentley", "Alfa Romeo", "Buick", "Acura", "Audi" };
		List<String> list = new ArrayList<String>(Arrays.asList(arr));
		System.out.println(list);

	//Sort the List
		Collections.sort(list);
		System.out.println("Sorting elements");
		System.out.println(list);
	
	//Reverse the list
		Collections.reverse(list);
		System.out.println("Reversed List");
		System.out.println(list);
		
	//copy elements to a new list
		List<String> copied = new ArrayList<String>(list);
		System.out.println("Copying elements");
		System.out.println(copied);
		}

}
