package com.stockaccounting.validation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchscreen_valid {

	
	public static void main(String[] args) {
		String Expval,Actval;
		 WebDriver Driver=new FirefoxDriver();
	      Driver.get("http://webapp.qedgetech.com");
	      Driver.manage().window().maximize();
	      Expval="Login";
	      Actval=Driver.findElement(By.id("btnsubmit")).getText();
	      if(Expval.equalsIgnoreCase(Actval))
	      {
	    	  System.out.println("Stock accounting launched successfully");
	      }
	      else
	      {
	    	  System.out.println("fail");
	      }
	}

}
