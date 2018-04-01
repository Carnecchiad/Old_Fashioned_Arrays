package _01_array_manipulation;



public class Inserting {
	public static int[] insertAt(int[] arr, int term, int value) {
		int size = arr.length+1;
		int[] newArray = new int[size];
		for(int i = 0; i < arr.length; i++) {
			if(i >= term) {
				newArray[i+1] = arr[i]; 
			} else {
				newArray[i] = arr[i];
			}
		}
		newArray[term] = value;
		return newArray;
	}
	public static String[] insertAt2(String[] arr, int term, String value) {
		int size = arr.length+1;
		String[] newArray = new String[size];
		for(int i = 0; i < arr.length; i++) {
			if(i >= term) {
				newArray[i+1] = arr[i]; 
			} else {
				newArray[i] = arr[i];
			}
		}
		newArray[term] = value;
		return newArray;
	}
	public static String[] insertAlphabetically(String[] order, String term) {
		Sorting s = new Sorting();
		order = insertAt2(order, 1, term);
		s.sort(order);
		return order;
	}
}
