import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import datastructures.StringBuilder;

class DataStructuresTest {
	
	@Test
	void StringBuilderTest() {
		StringBuilder sb = new StringBuilder("Orange");
		sb.add(" + Banana");
		assertEquals("Orange + Banana", sb.toString());
		
		StringBuilder sb2 = new StringBuilder();
		sb2.add("Orange");
		sb2.add("Banana");
		assertEquals("OrangeBanana", sb2.toString());

	}

}
