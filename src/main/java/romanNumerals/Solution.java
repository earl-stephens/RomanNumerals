package romanNumerals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {
	int output = 0;
	String inputValues = null;
	
	public int romanToInt(String input) {
		inputValues = input.toUpperCase();
		checkInputForPairs(inputValues);
		String[] rawArray = inputToArray(inputValues);
		List<String> inputArray = validateArray(rawArray);
		
		Iterator<String> iterator = inputArray.iterator();
		while(iterator.hasNext()) {
			for(int i = 0; i < inputArray.size(); i++) {
				if(inputArray.get(i) == "I" && inputArray.get(i + 1) == "V") {
					output = output + 4;
				} else
				output = output + Numeral.valueOf(iterator.next()).getIntValue();
			}
		}
		
		return output;
	}
	
	public String[] inputToArray(String input) {
		return input.split("");
	}
	
	public List<String> validateArray(String[] rawArray) {
		for(String letter : rawArray) {
			try {
				Numeral.valueOf(letter.toUpperCase()).getIntValue();
			} catch(IllegalArgumentException e) {
				throw new IllegalArgumentException("That is not a valid input value.", e);
			}
		}
		List<String> listOfLetters = new ArrayList<>();
		for(String letter : rawArray) {
			listOfLetters.add(letter.toUpperCase());
		}
		return listOfLetters;
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
