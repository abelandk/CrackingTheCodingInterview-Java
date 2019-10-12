package datastructures;

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

	@Override
	public String toString() {
		return s.toString();
	}
	
	
}
