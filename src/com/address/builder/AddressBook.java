package com.address.builder;

import java.util.*;

public class AddressBook {
	private ArrayList<ContactDetails> addressBook = new ArrayList<ContactDetails>();
	
	
	 public List<ContactDetails> getAddressBook(){
		 return this.addressBook;
	 }
	 public void addContact(ContactDetails contactObj) {
		 addressBook.add(contactObj);
	 }
}
