package com.testfiles;
import com.test.TemperatureConverter;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureConverterTest {
    TemperatureConverter tc = new TemperatureConverter();
	@Test
	void testFtoC() {
		assertEquals(93.33, tc.fahrenheitToCelsius(200), 0.01);
	}
	@Test
	void testCtoF() {
		assertEquals(200.0, tc.celsiusToFahrenheit(93.33), 0.5);
	}

}
