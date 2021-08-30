package week3day2;

import java.util.ArrayList;
import java.util.List;

public class learnList1 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Watermelon");
		list.add("Mango");
		list.add("Orange");
		
		//Finding List size
		int listsize = list.size();
		System.out.println(listsize);
		
		//Print the list elements
		System.out.println(list);
		
		//Different format
		for(int i=0; i<list.size(); i++)
		{
		System.out.println(list.get(i));	
			
		}
		//To get an element from the list
		//for each Loop
		System.out.println(" For Each ");
        System.out.println("***********");
		for (String foreach : list) {
			System.out.println(foreach);
			
					}
		
		//Insert an element to the List in the last
		list.add("Kiwi");
		System.out.println(list);
		
		//Insert an element in the middle
		//method overriding
		list.add(2, "Jackfruit");
		System.out.println(list);
		
		//Remove an element from the List using Index
		list.remove(2);
		System.out.println(list);
	    
		//Remove an element using value
		list.remove("Apple");
		System.out.println(list);
	}  

}
