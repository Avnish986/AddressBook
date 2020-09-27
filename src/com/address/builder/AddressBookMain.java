
package com.address.builder;

import java.util.*;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to the Address Book");
		ContactDetails newPerson = new ContactDetails();
		
		AddressBook person = new AddressBook();
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter 1 to Add Person details ");
		int choice = sc.nextInt();
		Scanner sc1 = new Scanner(System.in); 
		switch(choice)
		{
		case 1:
			System.out.print("\nEnter Firstname: ");
	        newPerson.setFname(sc1.nextLine());
	        
	        System.out.print("Enter Lastname: ");
	        newPerson.setLname(sc1.nextLine());

	        System.out.print("Enter Address: ");
	        newPerson.setAddress(sc1.nextLine());

	        System.out.print("Enter City: ");
	        newPerson.setCity(sc1.nextLine());

	        System.out.print("Enter State: ");
	        newPerson.setState(sc1.nextLine());

	        System.out.print("Enter Zip: ");
	        newPerson.setZip(sc1.nextLine());

	        System.out.print("Enter Phone Number: ");
	        newPerson.setPhone(sc1.nextLine());
	        
	        System.out.print("Enter Email: ");
	        newPerson.setEmail(sc1.nextLine());
	        
	        person.addContact(newPerson);
	        System.out.println("person details added successfully");
	        System.out.println(person.getAddressBook());
	        
	        break;
	        
	        default:
	        	System.out.println("Enter correct value");
		}
	}

}
