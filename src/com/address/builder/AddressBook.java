package com.address.builder;
import java.util.*;

public class AddressBook {
	public String bookname;
	ArrayList<ContactDetails> addressBook = new ArrayList<ContactDetails>();
 
 public AddressBook(String name) {
	 bookname = name;
 }
 
 public void setAddressBook(ArrayList<ContactDetails> m) {
	 this.addressBook= m;
 }
 public List<ContactDetails> getAddressBook(){
	 return this.addressBook;
 }
 public void addContactDetails(ContactDetails ContactDetailsObj) {
	 addressBook.add(ContactDetailsObj);
 }
 public List<ContactDetails> viewContactDetailss() {
	 return addressBook;
 }
 public String updateContactDetails(ContactDetails a) {
	 int y=0;
	 ContactDetails b = new ContactDetails("", "", "", "", "", "", "", "");
	 ContactDetails c = new ContactDetails("", "", "", "", "", "", "", "");
	
	 for(ContactDetails x: addressBook) {
		 if(x.f_name.equalsIgnoreCase(a.f_name) && x.l_name.equalsIgnoreCase(a.l_name)) {
			 c=x;
		 b=a;
		 y++;
		 }
	 }
	 if(y==0)
		 return "No ContactDetails found with this name";
	 else {
		 addressBook.remove(c);
		 addressBook.add(b);
		 return "ContactDetails Updated";
	 }
		
 }
 public boolean removeContactDetails(String f_name, String l_name) {
	 ContactDetails a=new ContactDetails("","","", "", "", "","", "");
	 for(ContactDetails x:addressBook) {
		 if(x.f_name.equalsIgnoreCase(f_name) && x.l_name.equalsIgnoreCase(l_name)) {
			 a=x;
		 }
	 }
	 return addressBook.remove(a);
 }
}