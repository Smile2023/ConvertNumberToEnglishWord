package com.virtusa.convertnumtowords.assignment;

public class ConversionFromNumToWords {

	static String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

	static String tensArray[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
			"ninety" };

	  public String numberToWord(int number) {
		
        //Declare variable for result store
		String englishword = "";

		// Number Check is zero or not
		if (number == 0) {
			return "zero";
		}
		// add minus before conversion if the number is less than 0
		if (number < 0) {
			String numberStr = "" + number;
			numberStr = numberStr.substring(1);
			return "minus " + numberToWord(Integer.parseInt(numberStr));
		}
		
		// check if number is divisible by 1 million
		if ((number / 1000000) > 0) {
			englishword  += numberToWord(number / 1000000) + " million ";
			number %= 1000000;
		}
		// check if number is divisible by 1 thousand
		if ((number / 1000) > 0) {
			englishword += numberToWord(number / 1000) + " thousand ";
			number %= 1000;
		}
		// check if number is divisible by 1 hundred
		if ((number / 100) > 0) {
			englishword += numberToWord(number / 100) + " hundred ";
			number %= 100;
		}

		if (number > 0) {
			// check if number is within teens
			if (number < 20) {
				englishword += unitsArray[number];
			} else {
				englishword += tensArray[number / 10];
				if ((number % 10) > 0) {
					englishword += " " + unitsArray[number % 10];
				}
			}
		}

		return englishword;

	}

}
