package com.simplilearn.CMS.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ContactDetails {

	List<ContactSystem> csd = new ArrayList<ContactSystem>();
	
	public void addDetails(ContactSystem cs) {
		csd.add(cs);
		System.out.println("EmployeeName " +cs.getName()+ " Contact add Successfully ...");
	}
	
	public List<ContactSystem> getContacts(){
		return csd;	
	}
	
	public ContactSystem getContactById(int id) {
		ContactSystem available = null;
		
		for(ContactSystem cs : csd) {
			if(cs.getContactID()== id) {
				available = cs;
				break;
			}
		}
		return available;
	}
	public void deleteDetails(ContactSystem cs) {	
		
		csd.remove(cs);
		System.out.println("Employee "+cs.getName()+" Contact Deleted Successfully ...");
	}	
}
