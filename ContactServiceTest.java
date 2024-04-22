package com.vogella.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Author: Zachary J. Hancock
 *  Course: CS-320
 *  Date: March 18, 2024
 *	File: ContactServceTest.java
 *	Purpose: Tests ContactService methods
 */


class ContactServiceTest {

	@Test
	void testAddContact() {
		ContactService testContactServ = new ContactService(); // Initialize ContactService object for test
		testContactServ.addContact("999", "John", "Doe", "1234567890", "Planet Earth"); // Adds contact to ArrayList for test
		assertNotNull(testContactServ.getContact("999"));
		
	}

	@Test
	void testDeleteContact() {
		ContactService testContactServ = new ContactService(); // Initialize ContactService object for test
		testContactServ.addContact("999", "John", "Doe", "1234567890", "Planet Earth");
		testContactServ.deleteContact("999"); // Deletes contact to ArrayList for test
		assertNull(testContactServ.getContact("999")); // Uses removeIF which returns true if it was able to find the object with the ID and false if it cant find it
	
	}

	
	@Test
	void testUpdateFirstName() {
		ContactService testContactServ = new ContactService(); // Initialize ContactService object for test
		testContactServ.addContact("999", "John", "Doe", "1234567890", "Planet Earth"); // Adds contact to ArrayList for test
		testContactServ.updateFirstName("999", "Lewis");
		assertEquals("Lewis", testContactServ.getContact("999").getFirstName());
	}
	
	@Test
	void testUpdateLastName() {
		ContactService testContactServ = new ContactService(); // Initialize ContactService object for test
		testContactServ.addContact("999", "John", "Doe", "1234567890", "Planet Earth"); // Adds contact to ArrayList for test
		testContactServ.updateLastName("999", "Hamilton");
		assertEquals("Hamilton", testContactServ.getContact("999").getLastName());
	}
	
	@Test
	void testUpdatePhoneNumber() {
		ContactService testContactServ = new ContactService(); // Initialize ContactService object for test
		testContactServ.addContact("999", "John", "Doe", "1234567890", "Planet Earth"); // Adds contact to ArrayList for test
		testContactServ.updatePhoneNumber("999", "1234567890");
		assertEquals("1234567890", testContactServ.getContact("999").getPhoneNumber());

	}
	
	@Test
	void testUpdateAddress() {
		ContactService testContactServ = new ContactService(); // Initialize ContactService object for test
		testContactServ.addContact("999", "John", "Doe", "1234567890", "Planet Earth"); // Adds contact to ArrayList for test
		
		testContactServ.updateAddress("999", "444 home dr");
		assertEquals("444 home dr", testContactServ.getContact("999").getAddress());
		
	
	}
}
