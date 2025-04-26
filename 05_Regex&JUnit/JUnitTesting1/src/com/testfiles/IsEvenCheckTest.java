package com.testfiles;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.test.IsEvenCheck;

public class IsEvenCheckTest {
    
	IsEvenCheck ec = new IsEvenCheck();
	
	@ParameterizedTest
	@ValueSource(ints = {2,4,6,8,12})
	void testIsEven(int a) {
		assertTrue(ec.iseven(a));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {7,9})
	void testIsNotEven(int a) {
		assertFalse(ec.iseven(a));
	}

}
