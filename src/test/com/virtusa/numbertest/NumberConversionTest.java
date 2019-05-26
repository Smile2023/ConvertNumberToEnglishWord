package com.virtusa.numbertest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.virtusa.convertnumtowords.assignment.ConversionFromNumToWords;

public class NumberConversionTest {
	
	
	@Test
	public void TestZeroConversion() {
		ConversionFromNumToWords c = new ConversionFromNumToWords();
		assertEquals(c.numberToWord(0),"zero");
	}
	
	@Test
	public void TestOnesConversion() {
		ConversionFromNumToWords c = new ConversionFromNumToWords();
		assertEquals(c.numberToWord(1),"one");
	}
	
	@Test
	public void TestTensConversion() {
		ConversionFromNumToWords c = new ConversionFromNumToWords();
		assertEquals(c.numberToWord(21),"twenty-one");
	}
	
	@Test
	public void TestHundredsConversion() {
		ConversionFromNumToWords c = new ConversionFromNumToWords();
		assertEquals(c.numberToWord(105),"one hundred five");
	}
	
	@Test
	public void TestMillionConversion() {
		ConversionFromNumToWords c = new ConversionFromNumToWords();
		assertEquals(c.numberToWord(56945781),"fifty-six million nine hundred forty-five thousand seven hundred eighty-one");
	}
	@Test
	public void TestAboveMillionConversion() {
		ConversionFromNumToWords c = new ConversionFromNumToWords();
		assertEquals(c.numberToWord(999999999),"nine hundred ninety-nine million nine hundred ninety-nine thousand nine hundred ninety-nine");
	}
	@Test
	public void TestNegativeConversion() {
		ConversionFromNumToWords c = new ConversionFromNumToWords();
		assertEquals(c.numberToWord(-345),"minus three hundred forty-five");
	}
}
