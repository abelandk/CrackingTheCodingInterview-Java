package datastructures;

import java.util.Arrays;
import java.util.HashMap;

public class Strings {

	String s;
	
	public Strings() {
		this("");
	}
	
	public Strings(String s) {
		this.s = s;
	}
	
	public void append(String s) {
		this.s  += s; 
	}
	
	public boolean isUnique() {
		HashTable hash = new HashTable();
		for(int i = 0; i < s.length(); i++) {
			String character = Character.toString(s.charAt(i));
			if(hash.isMember(character)) {
				return false;
			}
			hash.add(character);
		}
		return true;
	}

	/*
	 * Works for ASCII characters
	 */
	public boolean isPermutation(String str) {
		if(str.length() != this.s.length()) {
			return false;
		}
		
		int sumA = 0, sumB = 0;
		for(int i = 0; i < str.length(); i++) {
			sumA += str.charAt(i);
			sumB += s.charAt(i);
		}
		if(sumA != sumB) {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		return s.toString();
	}
	
	
}
