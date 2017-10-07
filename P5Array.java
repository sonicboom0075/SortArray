/*
Aaron Avila
*/

import java.util.*;

class SortArray{

	//attributes
	String a;
	int [] iArr;

	//constructor no parameter
	SortArray(){
		a = readNumbers();
		String [] stArr = makeSArray(a);
		iArr = convertIntArr(stArr);
	}//constructor
	
	//constructor string parameter
	SortArray(String s){
		a = s;
		String [] stArr = makeSArray(a);
		iArr = convertIntArr(stArr);
	}
	//constructor
	
	//constructor array parameter
	SortArray(int[] intArr){
		a = Arrays.toString(intArr);
		iArr = intArr;
	}
	//constructor
	
	//methods
	
	//readNumbers
	static String readNumbers(){
		//read a line form keyboard (a seg of integers)
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input list of numbers: ");
		String s = input.nextLine();

		return s;
	}//readNumbers

	//makeSArray
	static String[] makeSArray(String s){
		//trim front and back
		s = s.trim();
		s = s.replaceAll("\\s+", " ");
		
		//split the line into substrings
		String [] sArr = new String[s.length()];
		sArr = s.split(" ");
		
		return sArr;
	}//makeSArray

	//convertIntArr
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
	void selectionSort(){
		//Sort the array arr[]
		for (int i = 0; i < iArr.length - 1; i++) { //outer
			int index = i;
				for (int j = i + 1; j < iArr.length; j++)
					if (iArr[j] < iArr[index]) index = j;    
				int smallerNumber = iArr[index]; 
				iArr[index] = iArr[i];
				iArr[i] = smallerNumber;
		}//for i
	}//selectionSort

	//bubbleSort
	void bubbleSort(){
		//Sort the array arr[]
		for (int i = 0; i<  iArr.length - 1; i++) {
			for (int j = 1; j <  iArr.length - i; j++) {
				if (iArr[j-1] > iArr[j]) {
					//swap(j-1, j)
					int temp = iArr[j-1];
					iArr[j-1] = iArr[j];
					iArr[j] = temp;
				}//if
			} //for j
		}//for i
	}//bubbleSort

	//insertionSort
	void insertionSort(){
		//Sort the array arr[]
		for (int i = 1; i < iArr.length; i++) { //outer loop
			for(int j = i ; j > 0 ; j--){    //inner loop
				if(iArr[j] < iArr[j-1]){ 
					//swap (array at j & j-1)
					int temp = iArr[j];
					iArr[j] = iArr[j-1];
					iArr[j-1] = temp;
				}//if
			}//for j
		} //for i
	}//insertionSort

	//toString
	public String toString(){
		return Arrays.toString(iArr);
	}//toString
	
}//class
