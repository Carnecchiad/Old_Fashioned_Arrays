package _02_diy_array_list;

public class ArrayList<T>{
	T[] arr = (T[]) new Object[0];
	
	public ArrayList() {
		
	}
	
	void print() {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	void add(T value) {
		T[] newArr = (T[]) new Object[arr.length+1];
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		newArr[arr.length] = value;
		arr = newArr;
	}
	void addAt(int index, T value) {
		T[] newArr = (T[]) new Object[arr.length+1];
		for(int i = 0; i < arr.length; i++) {
			if(i < index) {
				newArr[i] = arr[i];
			} else {
				newArr[i+1] = arr[i];
			}
		}
		newArr[index] = value;
		arr = newArr;
	}
	void remove(int index) {
		int ctr = 0;
		T[] newArr = (T[]) new Object[arr.length-1];
		for(int i = 0; i < arr.length; i++) {
			if(i!=index) {
				newArr[ctr++] = arr[i];
			}
		}
		arr = newArr;
	}
	boolean contains(T value) {
		for(int i = 0; i < arr.length; i++) {
			if(value == arr[i]) {
				return true;
			}
		}
		return false;
	}
	T get(int index) {
		return arr[index];
		
	}
	void set(int index, T value) {
		arr[index] = value;
	}
	
	
}
