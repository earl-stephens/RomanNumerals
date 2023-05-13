package romanNumerals;

public class Solution {

	public int romanToInt(String input) {
		int output = 0;
		String formattedInput = input.toUpperCase();
		try {
			output = Numeral.valueOf(formattedInput).getIntValue();
		} catch(IllegalArgumentException e) {
			throw new IllegalArgumentException("That is not a valid input value.", e);
		}
		return output;
	}
	
	public String[] inputToArray(String input) {
		return input.split("");
	}
}
