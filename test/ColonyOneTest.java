

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.placona.helloWorld.ColonyOne;

public class ColonyOneTest {
	
	ColonyOne first = new ColonyOne();

	@Test
	public void testGetCount() {
		System.out.println("Expected: 1583");
		System.out.println("Found:    " + first.getCount());
		
		assertEquals(1583, first.getCount());
	}

	@Test
	public void testGetName() {
		System.out.println("Expected: The 1583 Musketeers");
		System.out.println("Found:    " + first.getName());
		
		assertEquals("The 1583 Musketeers", first.getName());
	}

}
