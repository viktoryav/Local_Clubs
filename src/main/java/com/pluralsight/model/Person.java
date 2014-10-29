package com.pluralsight.model;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

@MappedSuperclass
public class Person {
	
	public Person() {
		super();
	}
	@Id
	@GeneratedValue
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@OneToOne(cascade = CascadeType.ALL)
	ContactDetails contactDetails = new ContactDetails();
	@OneToOne(cascade = CascadeType.ALL)
	AddressDetails homeAddress = new AddressDetails();
	public ContactDetails getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}
	public AddressDetails getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(AddressDetails homeAddress) {
		this.homeAddress = homeAddress;
	}
	
}
