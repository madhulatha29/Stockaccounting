package com.stockaccounting.master;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Testbase {

	public Stockaccounting_lib SL=new Stockaccounting_lib();
	
	 
	  @BeforeTest
	  public void Adminlogin() throws IOException 
	  {
		 SL.Adminlogin("admin", "master");
		  
	  }

	@AfterTest
	  public void Logout() 
	  {
		String res;
		  res=SL.Logout();
		  System.out.println(res);
	  }
	  

	  @BeforeSuite
	  public void OpenApp() throws IOException 
	  {
		
		SL.OpenApp("http://webapp.qedgetech.com");
		  
	  }

	  @AfterSuite
	  public void CloseApp() 
	  {
		  SL.CloseApp();
	  }

}
