package romanNumerals;

public class Solution {
	int output = 0;
	String inputValues = null;
	
	public int romanToInt(String input) {
		String[] letterArray = input.split("");
		validateArray(letterArray);
		setInputValues(input.toUpperCase());
		checkInputForPairs(inputValues);

		String[] remainingLetters = inputValues.split("");
		for(String letter : remainingLetters) {
			output += Numeral.valueOf(letter).getIntValue();
		}
		return output;
	}

	public void validateArray(String[] letterArray) {
		for(String letter : letterArray) {
			try {
				Numeral.valueOf(letter.toUpperCase()).getIntValue();
			} catch(IllegalArgumentException e) {
				throw new IllegalArgumentException("That is not a valid input value.", e);
			}
		}
	}
	
	public void checkInputForPairs(String input) {
		if(input.contains("CM")) {
			output += 900;
			setInputValues(input.replace("CM", ""));
		} else {
			setInputValues(input);
		}
		if(inputValues.contains("CD")) {
			output += 400;
			setInputValues(inputValues.replace("CD", ""));
		}
		if(inputValues.contains("XC")) {
			output += 90;
			setInputValues(inputValues.replace("XC", ""));
		}
		if(inputValues.contains("XL")) {
			output += 40;
			setInputValues(inputValues.replace("XL", ""));
		}
		if(inputValues.contains("IX")) {
			output += 9;
			setInputValues(inputValues.replace("IX", ""));
		}
		if(inputValues.contains("IV")) {
			output += 4;
			setInputValues(inputValues.replace("IV", ""));
		}
	}

	public void setInputValues(String inputValues) {
		this.inputValues = inputValues;
	}
}
