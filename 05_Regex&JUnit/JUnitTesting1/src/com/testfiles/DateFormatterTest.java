package com.testfiles;
import static org.junit.jupiter.api.Assertions.*;

import com.test.DateFormatter;
import org.junit.jupiter.api.Test;

class DateFormatterTest {
    DateFormatter df = new DateFormatter();

    @Test
    void testValidDate() {
        assertEquals("25-04-2025", df.formatDate("2025-04-25"));
        assertEquals("01-01-2023", df.formatDate("2023-01-01"));
    }

    @Test
    void testInvalidDateFormat() {
        assertThrows(IllegalArgumentException.class, () -> {
            df.formatDate("25-04-2025");
        });
    }

    @Test
    void testInvalidDateValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            df.formatDate("2025-02-30"); 
        });
    }
}
