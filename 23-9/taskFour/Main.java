class Main{
	

public static void main(String[] args) {
		
		String[] stringArray = {"a","b","c","d"};
		int[] intArray = {1,2,3,4,5,6};
		boolean[] booleanArray = {true,true,false,false};
		printArrays(stringArray);
		System.out.println(sumOfArray(intArray));
		System.out.println(avgOfArray(intArray));
	}

public static void printArrays(String[] stringArray){
	for ( int i = 0; i < stringArray.length; i++) {
		System.out.println(stringArray[i]);
		}
	}

public static int sumOfArray(int[] list){
		int sum = 0;
	
	
	for(int i = 0; i < list.length; i++) {
		sum = sum + list[i];

		}
	return sum;
	}
public static int avgOfArray(int[] list){

	int avg = sumOfArray(list)/list.length;
	return avg;
	}

}