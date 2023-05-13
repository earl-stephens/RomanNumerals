package romanNumerals;

public class Solution {

	public int romanToInt(String input) {
		String[] inputArray = inputToArray(input);
		int output = 0;
		
		for(String letter : inputArray) {
			try {
				output = output + Numeral.valueOf(letter.toUpperCase()).getIntValue();
			} catch(IllegalArgumentException e) {
				throw new IllegalArgumentException("That is not a valid input value.", e);
			}
		}
		return output;
	}
	
	public String[] inputToArray(String input) {
		return input.split("");
	}
}
