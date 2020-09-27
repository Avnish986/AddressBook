
package com.address.builder;

import java.util.*;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to the Address Book");
		ContactDetails newPerson = new ContactDetails();
		
		AddressBook person = new AddressBook();
		Scanner sc = new Scanner(System.in);
		boolean switcher = true;
        do {
		System.out.println("Enter 1 to Add Person details");
		System.out.println("Enter 2 to Modify Person details");
		System.out.println("Enter 3 to View Person details");
		System.out.println("Enter 4 to Delete Person details");
		System.out.println("Enter 0 to quit ");
		int choice = sc.nextInt();
		if(choice !=1 && choice !=0 && choice!=2)
		{
			System.out.println("Enter 1 to Add Person details, Enter 1 to Add Person details, Enter 0 to quit  ");
		}
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
//	        ArrayList<ContactDetails> temp = new ArrayList<ContactDetails>();
//	        temp=person.getAddressBook();
//	        for(ContactDetails x:temp)
//	        {
//	        	System.out.println(x.f_name);
//	        }
//	        
//	        
	        System.out.println(person.getAddressBook());
	        
	        break;
	        
		case 2:
//		Scanner n = new Scanner(System.in); 
//		System.out.println("old");
//		String old=n.nextLine();
//		System.out.println("new");
//		String new1=n.nextLine();
//		AddressBook contact = new AddressBook();
//		contact.update(old,new1);
			ArrayList<ContactDetails> l1 = new ArrayList<ContactDetails>();
			l1=person.getAddressBook();
			if(l1.size() == 0) {
			System.out.println("first add a contact to modify");
			break;
			}
			else
			{
			Scanner n = new Scanner(System.in);	
			System.out.println("Enter fname of contact to be updated");
			System.out.println("Enter fname: ");
			String name1 = n.nextLine();
//			System.out.println(person.checkName(name1));
			if(person.checkName(name1))
			{
			Scanner up = new Scanner(System.in);
			System.out.println("Updated Contact details:");
			System.out.println("Enter first name: ");
			String fname1 = up.nextLine();
			System.out.println("Enter last name: ");
			String lname1 = up.nextLine();
			System.out.println("Enter address: ");
			String address1 = up.nextLine();
			System.out.println("Enter city: ");
			String city1 = up.nextLine();
			System.out.println("Enter state: ");
			String state1 = up.nextLine();
			System.out.println("Enter zip: ");
			String zip1 = up.nextLine();
			System.out.println("Enter phone number: ");
			sc.nextLine();
			String phNo1 = up.nextLine();
			System.out.println("Enter email: ");
			String email1 = up.nextLine();

			ContactDetails update = new ContactDetails(fname1, lname1, address1, city1, state1, zip1, phNo1, email1);
			String s = person.updateContact(update);
			System.out.println(s);

			List<ContactDetails> xyz = new ArrayList<ContactDetails>();
			xyz=person.viewContactDetails();
			System.out.println("The updated Contact in Address Book is: ");
			for(ContactDetails z:xyz) {
			System.out.println(z);
			}
			}
			else
			{System.out.println("No such contact found");
			break;}
			}
			break;
				
		case 3:
		List<ContactDetails> disp = new ArrayList<ContactDetails>();
		disp=person.viewContactDetails();
		if(disp.size()==0)
		{
			System.out.println("No details or deleted");
			break;
		}
		for(ContactDetails i:disp)
			System.out.println(i);
		break;
		
		case 4:
			ArrayList<ContactDetails> l2 = new ArrayList<ContactDetails>();
			l2=person.getAddressBook();
			if(l2.size() == 0) {
			System.out.println("first add a contact to get deleted");
			break;
			}
			else {
			System.out.println("Enter fname of contact to be deleted");
			Scanner del = new Scanner(System.in);
			String delName=del.nextLine();
			if(person.checkName(delName))
			{
				String s = person.deleteContact();
				System.out.println(s);
			}
			else
	
				{System.out.println("No such contact found");
				break;}
			}
			break;
		case 0:
	        	switcher=false;
		}
        }while(switcher!=false);
	}

}
