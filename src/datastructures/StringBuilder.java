package datastructures;

import java.util.Arrays;

public class StringBuilder {

	int counter;
	char[] str = new char[2];
	
	public StringBuilder() {
		this("");
	}
	
	public StringBuilder(String s) {
		if(s.length() + counter >= str.length) {
			copyToBiggerArray(s);
		}
		add(s);
	}
	
	public void add(String s) {
		if(s.length() + counter >= str.length) {
			copyToBiggerArray(s);
		}
		s.getChars(0, s.length(), str, counter);
		counter += s.length();
	}
	
	private void copyToBiggerArray(String s) {
		str = Arrays.copyOf(str, str.length + 2*s.length());
	}

	@Override
	public String toString() {
		return String.valueOf(Arrays.copyOf(str, counter));
	}
	
}
