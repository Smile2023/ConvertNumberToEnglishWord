package com.virtusa.convertnumtowords.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ConversionTestClass {

	public static void main(String[] args) throws IOException {
		ConversionFromNumToWords c = new ConversionFromNumToWords();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Entered Number For Unit Description :");
		int number = Integer.parseInt(br.readLine());
		System.out.println("Given Number Unit Is :"+c.numberToWord(number));
		
	}

}
