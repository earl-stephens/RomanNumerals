package romanNumerals;

import static org.junit.jupiter.api.Assertions.*;

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
	}

}
