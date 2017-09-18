/*
Aaron Avila
*/

import java.util.*;

class SortArray{

	//attributes
	String a;
	int [] iArr;

	//constructor
	SortArray(){
		a = readNumbers();
		String [] stArr = makeSArray(a);
		iArr = convertIntArr(stArr);

		//selectionSort(iArr);
		//bubbleSort(iArr);
		insertionSort(iArr);
	}//constructor

	static String readNumbers(){
		//read a line form keyboard (a seg of integers)
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input list of numbers: ");
		String s = input.nextLine();

		//trim front and back
		s = s.trim();
		s = s.replaceAll("\\s+", " ");

		return s;
	}//readNumbers

	static String[] makeSArray(String s){
		//split the line into substrings
		String [] sArr = new String[s.length()];
		sArr = s.split(" ");
		
		return sArr;
	}//makeSArray

	static int[] convertIntArr(String[] sArr){
		//convert all substrings to integers
		int [] iArr = new int[sArr.length];
		for(int i = 0; i < sArr.length; i++){
			if(!sArr[i].equals("")){
				iArr[i] = Integer.parseInt(sArr[i]);
			}
		}//for

		return iArr;
	}//convertIntArr

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
