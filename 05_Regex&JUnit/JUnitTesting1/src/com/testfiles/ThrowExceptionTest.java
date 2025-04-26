package com.testfiles;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.test.ThrowException;


public class ThrowExceptionTest{
	ThrowException t = new ThrowException();
	 @Test
	    public void testDivideByZero() {
	        Exception exception = assertThrows(ArithmeticException.class, () -> {
	            t.divide(10, 0);
	        });
	        assertEquals("Cannot divide by zero", exception.getMessage());
	    }
	
}