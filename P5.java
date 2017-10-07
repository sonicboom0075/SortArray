/*
Aaron Avila
*/

import java.util.*;

class Test {

	public static void main(String [] args){
		System.out.println("\nInsertion Sort:\n");
		SortArray obj = new SortArray();
		obj.insertionSort();
		System.out.println("\n\nOriginal= " +obj.a +"\nSorted= " +obj);
		
		System.out.println("\nBubble Sort:");
		SortArray obj2 = new SortArray("         45   456 12 3 32    ");
		obj2.bubbleSort();
		System.out.println("\n\nOriginal= " +obj2.a +"\nSorted= " +obj2);
		
		System.out.println("\nSelection Sort:");
		SortArray obj3 = new SortArray(new int[]{22,18,28,11});
		obj3.selectionSort();
		System.out.println("\n\nOriginal= " +obj3.a +"\nSorted= " +obj3);
		
	}//main

}//class
