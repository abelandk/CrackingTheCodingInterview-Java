package datastructures;

import java.util.Arrays;

public class HashTable {
	/**
	 * Very Simple HashTable of Integers,
	 * No Collision assumed
	 */
	String s [];
	int counter = 0;
	public HashTable() {
		s = new String[1000];
	}

	public void add(String s) {
		if(counter + 1000 >= Integer.MAX_VALUE) {
			System.out.println("Mamimum ArraySize reached");
			return;
		}
		if(counter >= this.s.length) {
			String[] ss = new String[counter + 1000];
			for(int i = 0; i < counter; i++) {
				ss[i] = Character.toString(s.charAt(i));
			}
			this.s = ss;
		}
		int hashCode = s.hashCode();
		int index = hashCodeToIndex(hashCode);
		this.s[index] = s;
		counter++;
	}
	
	private int hashCodeToIndex(int hashCode) {
		return hashCode % s.length;
	}
	
	public boolean isMember(String s) {
		for(int i = 0; i < this.s.length; i++) {
			if(this.s[i] != null && this.s[i].equals(s)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return Arrays.toString(s);
	}
	
}
