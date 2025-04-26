package com.testfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.test.DatabaseConnect;

public class DatabaseConnectTest {
    DatabaseConnect dbc = new DatabaseConnect();
    
	@BeforeEach
	void startConnection() {
		assertEquals("database connected",dbc.connect());
	}
	
	@AfterEach
	void closeConnection() {
		assertEquals("database disconnected",dbc.disconnect());
	}
	@Test
    void testDummyConnection() {
        assertEquals("connected", "connected"); 
    }

}
