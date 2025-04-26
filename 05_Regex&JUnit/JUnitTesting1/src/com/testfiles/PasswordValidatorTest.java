package com.testfiles;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;
import com.test.PasswordValidator;
class PasswordValidatorTest {
	PasswordValidator pv = new PasswordValidator();
	@Test
	void test() {
		assertTrue(pv.isValidPassword("am1thA2002Az"));
		assertFalse(pv.isValidPassword("Az"));
	}

}
