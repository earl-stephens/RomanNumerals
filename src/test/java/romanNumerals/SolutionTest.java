package romanNumerals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

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
	@Disabled
	@Test
	void testTwoOfTheSameCharacters() {
		assertEquals(2, solution.romanToInt("II"));
		assertEquals(10, solution.romanToInt("VV"));
		assertEquals(200, solution.romanToInt("CC"));
	}
	
	@Test
	void testInputToArray() {
		assertEquals(3, solution.inputToArray("CIV").length);
		assertEquals("C", solution.inputToArray("CIV")[0]);
	}
	
	@Test
	void testNonconsecutiveCharacters() {
		assertEquals(58, solution.romanToInt("lvIII"));
	}
	
	@Test
	void testCheckInputForXCPair() {
		solution.checkInputForPairs("XCII");
		
		assertEquals(90, solution.output);
		assertEquals("II", solution.inputValues);
	}
	
	@Test
	void testCheckInputForXLPair() {
		solution.checkInputForPairs("MCXLI");
		assertEquals(40, solution.output);
		assertEquals("MCI", solution.inputValues);
	}
	
	@Test
	void testCheckInputForIVPair() {
		solution.checkInputForPairs("MCLIV");
		assertEquals(4, solution.output);
		assertEquals("MCL", solution.inputValues);
	}
	
	@Test
	void testCheckInputForIXPair() {
		solution.checkInputForPairs("CCLIX");
		assertEquals(9, solution.output);
		assertEquals("CCL", solution.inputValues);
	}
	
	@Test
	void testCheckInputForCDPair() {
		solution.checkInputForPairs("MMCDX");
		assertEquals(400, solution.output);
		assertEquals("MMX", solution.inputValues);
	}
	
	@Test
	void testCheckInputForCMPair() {
		solution.checkInputForPairs("CMLI");
		assertEquals(900, solution.output);
		assertEquals("LI", solution.inputValues);
	}
	
	@Disabled
	@Test
	void testForSpecialCharacterSequences() {
		assertEquals(4, solution.romanToInt("IV"));
	}
}
