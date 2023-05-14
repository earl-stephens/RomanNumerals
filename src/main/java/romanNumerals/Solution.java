package romanNumerals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
			switch(letter) {
			case "I":
				output += 1;
				break;
			case "V":
				output += 5;
				break;
			case "X":
				output += 10;
				break;
			case "L":
				output += 50;
				break;
			case "C":
				output += 100;
				break;
			case "D":
				output += 500;
				break;
			case "M":
				output += 1000;
				break;
			}
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
		if(input.contains("XC")) {
			output += 90;
			setInputValues(input.replace("XC", ""));
		}
		if(input.contains("XL")) {
			output += 40;
			setInputValues(input.replace("XL", ""));
		}
		if(input.contains("IV")) {
			output += 4;
			setInputValues(input.replace("IV", ""));
		}
		if(input.contains("IX")) {
			output += 9;
			setInputValues(input.replace("IX", ""));
		}
		if(input.contains("CD")) {
			output += 400;
			setInputValues(input.replace("CD", ""));
		}
		if(input.contains("CM")) {
			output += 900;
			setInputValues(input.replace("CM", ""));
		}
	}

	public void setInputValues(String inputValues) {
		this.inputValues = inputValues;
	}
}
