package com.vogella.junit5;
import java.util.ArrayList;

/** Author: Zachary J. Hancock
 *  Course: CS-320
 *  Date: March 18, 2024
 *	File: ContactService.java
 *	Purpose: To be able to add and delete contact objects using their ID's as well as update allowable fields of info such as first name, last name, phone number, and address
 */

public class ContactService {
	
	// Initialize an empty ArrayList for storing the Contact objects
	private ArrayList<Contact> contacts = new ArrayList<Contact>();
	
	// addContact: uses parameters and uses ArrayList.add() to push the new Contact into the list
	public void addContact(String ID, String first, String last, String phone, String home) {
		if(getContact(ID) == null && ID != null && first != null && last != null && phone != null && home != null) // ensures that there is not a a contact with that ID present already
			contacts.add(new Contact(ID, first, last, phone, home));
	}
	
	//deleteContact: uses ID and removeIF to delete the contact from the list
	public void deleteContact(String ID) {
		contacts.removeIf(i->i.getID() == ID);
	}
	

	//getContact: returns contact object of the searched
	public Contact getContact(String ID) {
		if(getContactIndex(ID) != -1)
			return contacts.get(getContactIndex(ID));
		return null;
	}
	
	//updateFirstName: updates the first name
	public void updateFirstName(String ID, String first) {
		if(first != null && first.length() <= 10) { // If  checks if the  parameter is not null and proper length
			int index = getContactIndex(ID);
			if(index != -1) // if found call setFirstName
				contacts.get(index).setFirstName(first);
		}
	}
	
	//updateLastName: updates the last name
	public void updateLastName(String ID, String last) {
		if(last != null && last.length() <= 10) { // If  checks if the  parameter is not null and proper length
			int index = getContactIndex(ID);
			if(index != -1) // if found call setLastName
				contacts.get(index).setLastName(last);
		}
	}
	
	//updatePhoneNumber: updates phone number
	public void updatePhoneNumber(String ID, String phone) {
		if(phone != null && phone.length() == 10) { // If  checks if the  parameter is not null and proper length
			int index = getContactIndex(ID);
			if(index != -1) // if found call setPhoneNumber
				contacts.get(index).setPhoneNumber(phone);
		}
	}
	
	//updateAddress: updates address
	public void updateAddress(String ID, String address) {
		if(address != null && address.length() <= 30) { // If  checks if the  parameter is not null and proper length
			int index = getContactIndex(ID); 
			if(index != -1) // if found call setAddress
				contacts.get(index).setAddress(address);
		}
	}
	
	//getContactIndex: Used internally in the ContactService class to find a Contact using the ID
	private int getContactIndex(String ID) {
		for(int i = 0; i < contacts.size(); i++) { // For loop iterates over contacts arrayList
			if(contacts.get(i).getID() == ID) // if contact with ID found returns the index
				return i ;
		}
		return -1; // return -1 if not found
	}
	
}
