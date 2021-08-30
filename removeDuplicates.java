package week3day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		Set<String> uniquewords = new LinkedHashSet<String>();
		Set<String> duplicatewords = new LinkedHashSet<String>();
		 
			
		for (String eachword:split) {
			uniquewords.add(eachword);
			duplicatewords.add(eachword);
			
		}
		System.out.println("Unique words: " + uniquewords);
		
	  
	    	
	}
	   
	}  
	


