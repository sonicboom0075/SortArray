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

}//class