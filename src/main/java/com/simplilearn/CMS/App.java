package com.simplilearn.CMS;


import java.util.List;

import com.simplilearn.CMS.model.ContactDetails;
import com.simplilearn.CMS.model.ContactSystem;

public class App 
{
    public static void main( String[] args )
    {
        ContactSystem cs = new ContactSystem(1,"Ajay","9226588347","ajay@gmail.com");
       System.out.println("Welcome to ABC PVT ltd Company...");
       System.out.println(cs);
        
    }
}
