package _01_array_manipulation;

public class Sorting {

	public static void sort(String[] arr) {
		String temp = "";
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i].compareTo(arr[j]) > 0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
			}
		}
	}
}
}
