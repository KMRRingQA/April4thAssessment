
package com.qa.testdrivendevelopment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Questions {
	public String[] csvScan(String csvInput) {
		String[] separateLine = csvInput.split("\n");
		String[] splitLine = {};
		String[] names = new String[separateLine.length];
		int counter = 0;
		for (int i = 0; i < separateLine.length; i++) {
			splitLine = separateLine[i].split(",");
			if (splitLine[2].equalsIgnoreCase("false")) {
				names[counter] = splitLine[0];
				counter++;
			}
		}
		names = this.removeDuplicates(names);
		List<String> tempList = new ArrayList<String>(Arrays.asList(names));
		tempList.removeAll(Collections.singleton(null));
		names = tempList.toArray(new String[0]);
		return names;
	}

	public int factorial(int number) {
		int sum = 1;
		for (int i = 1; i <= number; i++) {
			sum *= i;
		}
		return sum;
	}

	public int getVowel(String input) {
		int counter = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.substring(i, i + 1).equalsIgnoreCase("a") || input.substring(i, i + 1).equalsIgnoreCase("e")
					|| input.substring(i, i + 1).equalsIgnoreCase("i")
					|| input.substring(i, i + 1).equalsIgnoreCase("o")
					|| input.substring(i, i + 1).equalsIgnoreCase("u")) {
				counter++;
			}
		}
		return counter;
	}

	public String greetingExample(String name) {
		return "Hi " + name;
	}

	public boolean iBeforeE(String input) {
		for (int i = 0; i < input.length() - 1; i++) {
			if (i != 0) {
			}
			if (input.substring(i, i + 2).equalsIgnoreCase("ie")) {
				if (i == 0) {
					return true;
				}
				if (input.substring(i - 1, i).equals("c")) {
					return false;
				} else {
					return true;
				}
			}
			if (input.substring(i, i + 2).equalsIgnoreCase("ei")) {
				if (i == 0) {
					return false;
				} else if (input.substring(i - 1, i).equals("c")) {
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}

	public boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int[] listGen() {
		int[] randomArray = new int[5];
		for (int i = 0; i < 5; i++) {
			int random = (int) (Math.random() * (52 + 0));
			randomArray[i] = random * 2 + 100;
		}
		return randomArray;
	}

	public String[] removeDuplicates(String[] stringArray) {
		for (int i = 0; i < stringArray.length; i++) {
			for (int j = i + 1; j < stringArray.length - i; j++) {
				if (stringArray[i].equals(stringArray[j])) {
					List<String> tempList = new ArrayList<String>(Arrays.asList(stringArray));
					tempList.remove(j);
					stringArray = tempList.toArray(new String[0]);
				}
			}
		}
		return stringArray;
	}

	public int returnPosition(String input, char letter) {
		String chara = "" + letter;
		int counter = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.substring(i, i + 1).equals(chara)) {
				return counter + 1;
			} else if (input.substring(i, i + 1).equals(" ")) {
			} else {
				counter++;
			}
		}
		return -1;
	}

	public boolean wordFinder(String initialWord, String madeString) {
		for (int i = 0; i < madeString.length(); i++) {
			if (initialWord.contains(madeString.substring(i, i + 1))) {
			} else {
				return false;
			}
		}
		return true;
	}

	public String zipped(String input1, String input2) {
		String returnString = "";
		for (int i = 0; i < input1.length(); i++) {
			returnString += "" + input1.substring(i, i + 1) + input2.substring(i, i + 1);
		}
		return returnString;
	}

}