import java.util.*;

class Test {
	public static void main(String [] args){
		SortArray sobj = new SortArray();
		//selectionSort(sobj.iArr);
		//bubbleSort(sobj.iArr);
		insertionSort(sobj.iArr);
		
		
		System.out.println(sobj.a);
		System.out.println(Arrays.toString(sobj.iArr));
	}//main

	//selectionSort
	static void selectionSort(int[] arr){
		//Sort the array arr[]
		for (int i = 0; i < arr.length - 1; i++) { //outer
			int index = i;
				for (int j = i + 1; j < arr.length; j++)
					if (arr[j] < arr[index]) index = j;    
				int smallerNumber = arr[index]; 
				arr[index] = arr[i];
				arr[i] = smallerNumber;
		}//for i
	}//selectionSort

	//bubbleSort
	static void bubbleSort(int[] arr){
		//Sort the array arr[]
		for (int i = 0; i<  arr.length - 1; i++) {
			for (int j = 1; j <  arr.length - i; j++) {
				if (arr[j-1] > arr[j]) {
					//swap(j-1, j)
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}//if
			} //for j
		}//for i
	}//bubbleSort

	//insertionSort
	static void insertionSort(int[] arr){
		//Sort the array arr[]
		for (int i = 1; i < arr.length; i++) { //outer loop
			for(int j = i ; j > 0 ; j--){    //inner loop
				if(arr[j] < arr[j-1]){ 
					//swap (array at j & j-1)
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}//if
			}//for j
		} //for i
	}//insertionSort
}//class
