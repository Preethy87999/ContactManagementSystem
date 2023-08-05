package com.simplilearn.CMS;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.simplilearn.CMS.model.ContactDetails;
import com.simplilearn.CMS.model.ContactSystem;

public class AppTest 
{
	static List<ContactSystem> cs;
	static ContactDetails data=new ContactDetails();
	@BeforeAll
	public static void beforeAll() {
		cs = data.getContacts();
		ContactSystem cs1 = new ContactSystem(1,"Ajay","9333445265","ajay@example.com");
		ContactSystem cs2 = new ContactSystem(2,"Ram","9333445265","ram@example.com");
		ContactSystem cs3 = new ContactSystem(3,"Geetha","9444455532","geetha@example.com");
		ContactSystem cs4 = new ContactSystem(4,"Yuvi","7444454336","yuvi@example.com");
		ContactSystem cs5 = new ContactSystem(5,"Tamil","7773332265","tamil@example.com");
		data.addDetails(cs1);
		data.addDetails(cs2);
		data.addDetails(cs3);
		data.addDetails(cs4);
		data.addDetails(cs5);
		System.out.println(cs.size());
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("Testcase  are Finished ...");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("Test get started...");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("Test get Ended...");
	}
	
	@Disabled("Skip")
	@Test
	public  void assertListEmpty() {
		ContactDetails data = new ContactDetails();
		List<ContactSystem> cs = data.getContacts();
		System.out.println(cs);
		assertTrue(cs.isEmpty());
	}
	
	
		@Test
	public void assertIdNotFound() {
		
		ContactSystem actualid = data.getContactById(8);
		assertNull(actualid,"Data Not Found");
	}
	
	@Test
	public void assertAddByLength() {
    	System.out.print("List size Before");
    	System.out.print(cs.size()+"\n");
		ContactSystem cs6 = new ContactSystem(6,"Pooja","9888844453","pooja@example.com");
		data.addDetails(cs6);
		int d=cs.size();
		assertTrue(d == 6);
		System.out.println(d);

	}
	
	@Test
	public void assertAddById() {
    	System.out.print("Getting of mention data \n");
		ContactSystem actualid = data.getContactById(6);
		assertNotNull(actualid);
	}
	
	@Test
	public void assertCheckNotEmptyList() {
    	System.out.print("List \n");
    	System.out.println(cs);
		assertFalse(cs.isEmpty());
	}
	
	@Test
	public void assertEqualsInList() {
		
		ContactSystem actualda = data.getContactById(4);
		assertEquals(4,actualda.getContactID());
		assertEquals("Yuvi",actualda.getName());
	}

	@Test
	public void assertDelete() {
		int f=cs.size();
    	ContactSystem d=data.getContactById(1);
    	data.deleteDetails(d);
    	int f1=cs.size();
    	assertEquals(f-1,f1);
	  
	}
	
	@Test
	public void assertDeleteCheck() {
		ContactSystem d=data.getContactById(1);
    	assertNotNull("Ajay");
	  
	}
}
