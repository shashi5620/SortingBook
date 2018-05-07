package org.learn.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingApplication {

	public static void main(String[] args) {
		List<Integer> integers=Arrays.asList(new Integer[] {10,1,15,2,3,4,5});
		
		System.out.println(integers);
		Collections.sort(integers);
		System.out.println("After sorting");
		System.out.println(integers);
	}
}
