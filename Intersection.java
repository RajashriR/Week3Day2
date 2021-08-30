package week3day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Intersection {

	public static void main(String[] args) {
		int[] value = { 23, 24, 33, 22, 21 };
		int[] value1 = { 10, 98, 23, 33 };
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		
		for (Integer inter : value) {
			set.add(inter);
		}
		
		for (Integer inter1 : value1) {
			if (set.contains(inter1))
				System.out.println("Intersection values :" + inter1);
		}

	}

}
