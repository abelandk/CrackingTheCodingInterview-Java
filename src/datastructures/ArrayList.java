package datastructures;


import java.util.Arrays;

public class ArrayList{
	private int [] arr;
	private int counter = 0;
	
	public int length() {
		return counter;
	}
	public ArrayList() {
		arr = new int[1000];
	}
	
	public ArrayList(int size) {
		arr = new int[size + 1000];
	}
	
	public void add(int value) {
		if(counter + 1 <= arr.length) {
			copyToLargerArray();
		}
		if(counter < Integer.MAX_VALUE) {
			arr[counter] = value;
			counter++;
		}
	}
	
	private void copyToLargerArray() {
		if(arr.length + 1000 < Integer.MAX_VALUE) {
			Arrays.copyOf(arr, arr.length + 1000);
		}
		else {
			Arrays.copyOf(arr, Integer.MAX_VALUE);
		}
	}

	public int getValue(int index){
		if(index < counter) {
			return arr[index];
		}
		else {
			System.out.printf("ArrayIndexOutOfBoundsException: maxArraySize = %d.", counter);
			return Integer.MAX_VALUE;
		}
		
		
	}
	
	
}
