package nep;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App with a recursive fibonacci sequence method.
 */
public class AppTest 
{
	/**
	 * Tests the numbers 1-10 to make sure there is no chance that we are accidentally geting the right awnsers through the wrong method.
	 * @author Nicolo Perrelli
	 */
	@Test
	public void fibTest1To10(){
		assertEquals(1, App.fibRecursive(1));
		assertEquals(1, App.fibRecursive(2));
		assertEquals(2, App.fibRecursive(3));
		assertEquals(3, App.fibRecursive(4));
		assertEquals(5, App.fibRecursive(5));
		assertEquals(8, App.fibRecursive(6));
		assertEquals(13, App.fibRecursive(7));
		assertEquals(21, App.fibRecursive(8));
		assertEquals(34, App.fibRecursive(9));
		assertEquals(55, App.fibRecursive(10));
	}

	/**
	 * Tests REGEX method to make sure users are entering in the right types of inputs. Method does not have a case yet for whole numbers like "5.0" or "10."
	 * @author Nicolo Perrelli
	 */
	@Test
	public void numbersOnlyRegEXTest(){
		//TRUE
		//Different Numbers
		assertTrue(App.numbersOnlyRegEX("1"));
		assertTrue(App.numbersOnlyRegEX("12"));
		assertTrue(App.numbersOnlyRegEX("50"));

		//FALSE
		//No Numbers
		assertFalse(App.numbersOnlyRegEX("a"));
		assertFalse(App.numbersOnlyRegEX("!"));
		//Numbers With Other
		assertFalse(App.numbersOnlyRegEX("1a"));
		assertFalse(App.numbersOnlyRegEX("1a2"));
		assertFalse(App.numbersOnlyRegEX("5.6"));
		assertFalse(App.numbersOnlyRegEX("26!"));
	}

}
