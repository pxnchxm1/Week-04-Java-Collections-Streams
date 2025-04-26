package com.testfiles;

import com.test.StringUtils;      
import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.*; 

class StringUtilsTest {
    StringUtils su = new StringUtils();
    String s = "malayalam";
	@Test
	void testReverse() {
		assertEquals("malayalam",su.reverse(s));
	}
	@Test
	void testPalindrome() {
		assertTrue(su.isPalindrome(s));
	}
	@Test
	void testUpperCase() {
		assertEquals("MALAYALAM",su.toUppercase(s));
	}

}
