package com.testfiles;

import com.test.UserRegister;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserRegisterTest {
    UserRegister ur = new UserRegister();
	@Test
	void testUser() {
		assertEquals("User registered successfully",ur.registerUser("pancham1p","panchXm12" ,"p897@gmail.com"));
	}
	@Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> {
            ur.registerUser("pan", "panchXm12", "p897@gmail.com");
        });
    }

    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> {
            ur.registerUser("pancham1p", "password", "p897@gmail.com");
        });
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            ur.registerUser("pancham1p", "panchXm12", "p897gmail.com");
        });
    }

}
