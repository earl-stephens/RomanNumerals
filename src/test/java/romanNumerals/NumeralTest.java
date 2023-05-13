package romanNumerals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumeralTest {
	
	@Test
	void testValues() {
		assertEquals(1, Numeral.I.getIntValue());
		assertEquals(100, Numeral.C.getIntValue());
		assertEquals(1000, Numeral.M.getIntValue());
	}

}
