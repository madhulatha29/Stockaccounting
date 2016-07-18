package com.stockaccounting.master;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import com.stockaccounting.master.Stockaccounting_lib;

    public class Testbase
    {
	
	public Stockaccounting_lib SL;
	
 
  @BeforeTest
  public void Adminlogin() 
  {
	 SL.Adminlogin("admin", "master");
	  
  }

  @AfterTest
  public void Logout() 
  {
	  SL.Logout();
  }

  @BeforeSuite
  public void OpenApp() 
  {
	
	SL.OpenApp("http://webappqedgetech.com");
	  
  }

  @AfterSuite
  public void CloseApp() 
  {
	  SL.CloseApp();
  }

}
