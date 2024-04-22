package com.vogella.junit5;

/** Author: Zachary J. Hancock
 *  Course: CS-320
 *  Date: March 18, 2024
 *	File: Contact.java
 *	Purpose: To hold data fields for contacts info such as ID, first name, last name, phone number, and address.
 */

public class Contact {
	private String contactID = "";
	private String firstName = "";
	private String lastName = "";
	private String phoneNumber = "";
	private String address = "";
		
	// Contact(String ID, String first, String last, String phone, String home): sets ID as a non null less than or equal to 10 string, and calls setter methods for other fields to set to parameters
	public Contact(String ID, String first, String last, String phone, String home) {
		
		// Since every field is required it is first assessed if every input is not null and if they are not it then accepts data entry
		if(ID != null && first != null && last != null && phone != null && home != null) {
			// If-else used to check whether the length is longer than 10 or not then set to contactID
			 // Since ID is bigger than 10 it takes the first ten elements of the ID string
		
		// Since all the other fields are able to be updated they then have publicly accessed setters
		setID(ID);
		setFirstName(first);
		setLastName(last);
		setPhoneNumber(phone);
		setAddress(home);
		
		
		
		
		}
		
		
		
	}
	
	// getID: Returns the contactID variable
	public String getID() {
		return contactID;
	}
	
	// getFirstName: Returns the firstName variable
	public String getFirstName() {
		return firstName;
	}
	
	// getLastName: Returns the lastName variable
	public String getLastName() {
		return lastName;
	}
	
	// getPhoneNumber: Returns the phoneNumber variable
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	// getAdress: Returns the address variable
	public String getAddress() {
		return address;
	}
	
	private void setID(String ID) {
		if(ID.length() <= 10) 
			contactID = ID;
		else
			contactID = ID.substring(0,10);
	}
	
	//setFirstName: sets firstName variable as parameter String, not allowed to be null or longer than 10 characters
	public void setFirstName(String first) {
		//If checks if first is null
		if(first != null) {
			// If-else used to check whether the length is longer than 10 or not then set
			if(first.length() <= 10)
				firstName = first;
			else
				firstName = first.substring(0,10); // Since it is bigger than 10 it takes the first ten elements
		}
	}
	
	//setLastName: sets lastName variable as parameter String, not allowed to be null or longer than 10 characters
	public void setLastName(String last) {
		//If checks if last is null
		if(last != null) {
			// If-else used to check whether the length is longer than 10 or not then set
			if(last.length() <= 10)
				lastName = last;
			else
				lastName = last.substring(0, 10);// Since it is bigger than 10 it takes the first ten elements
		} 
	}
	
	//setPhoneNumber: sets phoneNumber variable as parameter String, not allowed to be null, non-digits, and longer or shorter than 10 length
	public void setPhoneNumber(String phone) {
		//If checks if phone is null and length of 10
		if(phone != null && phone.length() == 10) {
		
			boolean isAllDigits = true;// Set initially to true, then used to check if the phone string is all digits
		
			//For loop iterates over phone length to check each character if its a digit, if it finds a non digit it then sets isAllDigit bool to false and breaks the for loop
			//Time complexity of O(10): 10 being the length of phone
			for(int j = 0; j < phone.length(); j++)
				if(!Character.isDigit(phone.charAt(j))) {
					isAllDigits = false;
					break;
				}
					
			// IF checks if phone composes of all digits then sets phoneNumber equal to phone if so
			if(isAllDigits) 
				phoneNumber = phone;
		
		}
	}
	
	//setAddress: sets address variable as parameter String, not allowed to be null and longer than 30 characters
	public void setAddress(String home) {
		//If checks if home is null
		if(home != null) {
			// If-else used to check whether the length is longer than 30 or not then set
			if(home.length() > 30)
				address = home.substring(0, 30); // Since it is bigger than 30 it takes the first 30 elements
			else
				address = home;
		}
		
	}
	
}
