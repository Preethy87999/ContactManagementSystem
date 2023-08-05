package com.simplilearn.CMS.model;

public class ContactSystem {

	
	private int ContactID;
	private String Name;
	private String Phno;
	private String Email;
	
	public ContactSystem() {
		
	}
	
	public ContactSystem(int contactID, String name, String phno, String email) {
		ContactID = contactID;
		Name = name;
		Phno = phno;
		Email = email;
	}

	public int getContactID() {
		return ContactID;
	}

	public void setContactID(int contactID) {
		ContactID = contactID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPhno() {
		return Phno;
	}

	public void setPhno(String phno) {
		Phno = phno;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [ContactID=" + ContactID + ", Name=" + Name + ", Phno=" + Phno + ", Email=" + Email + "] "+"\n";
	}	
}
