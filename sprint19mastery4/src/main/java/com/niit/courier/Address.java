package com.niit.courier;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Address {
    // Declare the attributes that correspond to Address
	private String name;
	private int houseNo;
	private String street;
	private String city;
	private String phoneNo;


    // This methods takes a phone no as a string and validates the phone number
    // The phone no must be in the format below
    //  +<area code><10 digit numbers> - +919776855678
    // or a 10 digit number - 9776855678

    public int isPhoneNoValid(String phone)
    {
        if(!phone.substring(0,3).equals("+91") || phone.substring(3,phone.length()).length()!=10)
        	return 0;
        return 1;
        
    }

    // Setter and getter methods

    public String getName() {
        return name;
    }
    public int getHouseNo() {
        return houseNo;
    }
    public String getStreet() {
        return street;
    }
    public String getCity() {
        return city;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    // setPhoneNo in the class, the phone number cannot be modified outside the class
    void setPhoneNo(String phoneNo) {
    	this.phoneNo = phoneNo;
    }
	public void setName(String name) {
		this.name = name;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

    // The method must return the address in the below format
   // Address [city=xxx,houseNo=xxx,name=xxx,phoneNo=xxx,street=xxx]
    
    @Override
    public String toString() {
        return "Address [city="+this.city+", houseNo="+this.houseNo+", name="+this.name+", phoneNo="+this.phoneNo+", street="+this.street+"]"; 
    }

    // Parameterized constructor
    public Address(String name, int houseNo, String street, String city, String phoneNo) {
        // Initialize values here
    	this.name = name;
    	this.houseNo = houseNo;
    	this.street = street;
    	this.city = city;
    	this.phoneNo = phoneNo;
    }

    
}