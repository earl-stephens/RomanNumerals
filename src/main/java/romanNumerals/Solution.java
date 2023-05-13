package romanNumerals;

public class Solution {

	public int romanToInt(String input) {
		String formattedInput = input.toUpperCase();
		return Numeral.valueOf(formattedInput).getIntValue();
	}
}
