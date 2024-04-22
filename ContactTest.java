package com.vogella.junit5;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/** Author: Zachary J. Hancock
 *  Course: CS-320
 *  Date: March 18, 2024
 *	File: ContactTest.java
 *	Purpose: Tests Contacts methods
 */

class ContactTest {
	
	private String tooLong = "This string is longer than 50 characters long which is longer than all of the data fields maximum to test max lengths properly!!!!!!";
	private String correctLength = "Perfect!!!";


	@Test
	void testContact() {
		Contact testContact = new Contact(null, null, null, null, null); // Initialize a contact object for test
		
		assertNotNull(testContact.getID()); // Tests if the ID was set to null
		
		assertNotNull(testContact.getFirstName()); // Tests if the firstName was set to null
		
		
		assertNotNull(testContact.getLastName()); // Tests if the lastName was set to null

		
		assertNotNull(testContact.getPhoneNumber()); // Tests if the PhoneNumber was set to null

		assertNotNull(testContact.getAddress()); // Tests if the address was set to null
		
		testContact = new Contact(tooLong,  correctLength, correctLength, correctLength, correctLength);
		
		assertEquals(testContact.getID(), tooLong.substring(0,10));
		
	}

	@Test
	void testGetID() {
		Contact testContact = new Contact("999", "John", "Doe", "1234567890", "Planet Earth"); // Initialize a contact object for test
		assertEquals(testContact.getID(), "999"); // Tests if the retrieved ID equals the object created

	}

	@Test
	void testGetFirstName() {
		Contact testContact = new Contact("999", "John", "Doe", "1234567890", "Planet Earth");// Initialize a contact object for test
		assertEquals(testContact.getFirstName(), "John"); // Tests if the retrieved firstName equals the object created
	}

	@Test
	void testGetLastName() {
		Contact testContact = new Contact("999", "John", "Doe", "1234567890", "Planet Earth");// Initialize a contact object for test
		assertEquals(testContact.getLastName(), "Doe"); // Tests if the retrieved lastName equals the object created
	}

	@Test
	void testGetPhoneNumber() {
		Contact testContact = new Contact("999", "John", "Doe", "1234567890", "Planet Earth");// Initialize a contact object for test
		assertEquals(testContact.getPhoneNumber(), "1234567890"); // Tests if the retrieved phoneNumber equals the object created
	}

	@Test
	void testGetAddress() {
		Contact testContact = new Contact("999", "John", "Doe", "1234567890", "Planet Earth"); // Initialize a contact object for test
		assertEquals(testContact.getAddress(), "Planet Earth"); // Tests if the retrieved address equals the object created
	}

	@Test
	void testSetFirstName() {
		Contact testContact = new Contact("999", "John", "Doe", "1234567890", "Planet Earth"); // Initialize a contact object for test
		assertEquals(testContact.getFirstName(), "John");
		
		testContact.setFirstName(null); // Tries to use setFirstName to set firstName to null
		assertNotNull(testContact.getFirstName()); // Test if firstName was set to null 

		
		testContact.setFirstName("Michelangelo"); // Tries to use setFirstName to set firstName with a String greater than 10 length
		assertFalse(testContact.getFirstName().length() > 10); // Tests if firstName was set to longer than 10
			
	}

	@Test
	void testSetLastName() {
		Contact testContact = new Contact("999", "John", "Doe", "1234567890", "Planet Earth"); // Initialize a contact object for test
		assertEquals(testContact.getLastName(), "Doe"); //Tests to see if lastName was set properly
			
		
		testContact.setLastName(null); // Tries to call setLastName to set lastName to null
		assertNotNull(testContact.getLastName()); // Tests if lastName was set to null
			
		
		testContact.setLastName("Buonarroti Simoni"); // Tries to set lastName longer than 10 characters
		assertFalse(testContact.getLastName().length() > 10); // Tests if lastNAme was set to longer than 10 characters

	}

	@Test
	void testSetPhoneNumber() {
		Contact testContact = new Contact("999", "John", "Doe", "1234567890", "Planet Earth"); // Initialize a contact object for test
		assertEquals("1234567890", testContact.getPhoneNumber()); // Tests if setPhoneNumber sets properly
				
		
		testContact.setPhoneNumber(null); // Tries to set phoneNumber to null
		assertNotNull(testContact.getPhoneNumber());// Test to see if PhoneNumber is equal to null
			
		
		testContact.setPhoneNumber("123456789"); //Tries to set phoneNumber smaller than 10 characters long and if branches for fail
		assertFalse(testContact.getPhoneNumber().length() < 10);

		
		testContact.setPhoneNumber("1234567890123456789"); // Tries to set phoneNumber larger than 10 characters long and if branches for fail
		assertFalse(testContact.getPhoneNumber().length() > 10);
		
		testContact.setPhoneNumber("notdigits");		// Tries to set phoneNumber equal to non-digits
		assertNotEquals("notdigits", testContact.getPhoneNumber());
		
	}

	@Test
	void testSetAddress() {
		Contact testContact = new Contact("999", "John", "Doe", "1234567890", "Planet Earth"); // Initialize a contact object for test
		assertEquals("Planet Earth", testContact.getAddress()); // Tests to see if set to Planet Earth
				
		
		testContact.setAddress(null); // Tries to setAddress to null and if branches for test
		assertNotNull(testContact.getPhoneNumber());
			
		
		testContact.setAddress("1234 ACME Drive Somewhere, Planet Earth"); // Tries to setAddress to longer than 30 characters and fails if its longer than 30
		assertFalse(testContact.getAddress().length() > 30);

	}

}
