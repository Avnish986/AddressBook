package com.address.builder;

public class ContactDetails {
	
		String f_name;
		String l_name;
		String address;
		String city;
		String state;
		String zip_code;
		String ph_no;
		String email;
		
		public ContactDetails() {
	        
	    }
		
		public ContactDetails(String f_name, String l_name,	String address,	String city, String state,
		String zip_code, String ph_no,	String email)
		{
			this.f_name = f_name;
			this.l_name = l_name;
			this.address = address;
			this.city = city;
			this.state = state;
			this.zip_code = zip_code;
			this.ph_no = ph_no;
			this.email = email;
		}
		
		public String getFname() {
	        return f_name;
	    }
	    public void setFname(String fname) {
	        this.f_name = fname;
	    }
	    
	    public String getLname() {
	        return l_name;
	    }
	    public void setLname(String lname) {
	        this.l_name = lname;
	    }
	    
	    public String getAddress() {
	        return address;
	    }
	    public void setAddress(String address) {
	        this.address = address;
	    }
	    public String getCity() {
	        return city;
	    }
	    public void setCity(String city) {
	        this.city = city;
	    }
	    public String getState() {
	        return state;
	    }
	    public void setState(String state) {
	        this.state = state;
	    }
	    public String getZip() {
	        return zip_code;
	    }
	    public void setZip(String zip) {
	        this.zip_code = zip;
	    }
	    public String getPhone() {
	        return ph_no;
	    }
	    public void setPhone(String phone) {
	        this.ph_no = phone;
	    }
	    
	    public String getEmail() {
	        return ph_no;
	    }
	    public void setEmail(String email) {
	        this.email = email;
	    }
	    
		@Override
		public String toString()
		{
			return "First name "+f_name+"\nLast name "+l_name+"\n Address "+address+"\n city "
		    +city+"\n state "+state+"\n Zip Code "+zip_code+"\n Phone No. "+ph_no+"\nemail "+email;
		}
	}
