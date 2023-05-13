package romanNumerals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.omg.CORBA.portable.ApplicationException;

class SolutionTest {
	Solution solution = new Solution();
	
	@Test
	void testItExists() {
		assertNotNull(solution);
	}
	
	@Test
	void testCanConvertASingleValue() {
		assertEquals(1, solution.romanToInt("I"));
		assertEquals(5, solution.romanToInt("V"));
		assertEquals(10, solution.romanToInt("X"));
		assertEquals(50, solution.romanToInt("L"));
		assertEquals(100, solution.romanToInt("C"));
		assertEquals(500, solution.romanToInt("D"));
		assertEquals(1000, solution.romanToInt("M"));
		assertNotEquals(1, solution.romanToInt("V"));
	}
	
	@Test
	void testThrowsExceptionForInvalidInput() {
		  IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
	           solution.romanToInt("B");
	  });

	  assertEquals("That is not a valid input value.", thrown.getMessage());
	}

}
