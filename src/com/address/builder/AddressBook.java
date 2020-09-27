package com.address.builder;

import java.util.*;

public class AddressBook {
	 ArrayList<ContactDetails> addressBook = new ArrayList<ContactDetails>();
	
	
	 public ArrayList<ContactDetails> getAddressBook(){
		 return this.addressBook;
	 }
	 public void addContact(ContactDetails contactObj) {
		 addressBook.add(contactObj);
	 }
	 public List<ContactDetails> viewContactDetails() {
		 return addressBook;
	 }
	 public boolean checkName(String name)
	 {
		 for(ContactDetails x: addressBook) {
			 if(x.f_name.equalsIgnoreCase(name)) 
				 return true;
		 }
		 return false;
	 }
//	 public int findDetails(String name)
//	 {
//		 
//	 }
//	 public void update(String s, String p)
//	 {
//		 if(addressBook.indexOf(s) >= 0) {
//			 System.out.println(s);
//			 System.out.println(addressBook.indexOf(s));
//			 System.out.println("yes");}
//		 else {
//			 System.out.println(s);
//			 System.out.println(addressBook.indexOf(s));
//			 System.out.println("no");}
//	 }
	 public String updateContact(ContactDetails a) {
		 
		 for(ContactDetails x: addressBook) {
			 addressBook.remove(x);
			 addressBook.add(a);
			 }
		 return "Contact update success";
		 
	 }
public String deleteContact() {
		 
		 addressBook.clear();
		 return "Contact delete success";
		 
	 }
}
