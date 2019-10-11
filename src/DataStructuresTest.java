import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import datastructures.ArrayList;
import datastructures.StringBuilder;

class DataStructuresTest {
	
	@Test
	void stringBuilderTest() {
		StringBuilder sb = new StringBuilder("Orange");
		sb.add(" + Banana");
		assertEquals("Orange + Banana", sb.toString());
		
		StringBuilder sb2 = new StringBuilder();
		sb2.add("Orange");
		sb2.add("Banana");
		assertEquals("OrangeBanana", sb2.toString());

	}
	
	@Test
	void arrayListTest() {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		assertEquals(10, al.getValue(0));
		assertEquals(20, al.getValue(1));
		assertEquals(2, al.length());
		assertEquals(Integer.MAX_VALUE, al.getValue(2));
		
	}

}
