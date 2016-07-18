package com.stockaccounting.master;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;

public class Suppliers_pom {
	

	
	@FindBy(id="x_Supplier_Name")
	WebElement Suppliername;
	
	@FindBy(id="x_Address")
	WebElement Address;
	
	@FindBy(id="x_City")
	WebElement City;
	
	@FindBy(id="x_Country")
    WebElement Country;
	
	@FindBy(id="x_Contact_Person")
	WebElement Cperson;
	
	@FindBy(id="x_Phone_Number")
	WebElement Pnum;
	
	@FindBy(id="x__Email")
	WebElement Email;
	
	@FindBy(id="x_Mobile_Number")
	WebElement mobilenum;
	
	@FindBy(id="x_Notes")
	WebElement Notes;
	
	@FindBy(id="btnAction")
	WebElement addbutton;
	
	@FindBy(xpath="html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")
	WebElement ok;
	
	@FindBy(xpath="html/body/div[.]/div[2]/div/div[4]/div[2]/button")
	 List<WebElement> Ok;
	
	
	public void Suppliers(String sname,String address,String city,String country,String cperson,String pnum,String email,String mobnum,String notes)
	
	{

	int i;
		Suppliername.sendKeys(sname);
		Address.sendKeys(address);
		City.sendKeys(city);
		Country.sendKeys(country);
		Cperson.sendKeys(cperson);
		Pnum.sendKeys(pnum);
		Email.sendKeys(email);
		mobilenum.sendKeys(mobnum);
		Notes.sendKeys(notes);
		addbutton.click();
		Sleeper.sleepTightInSeconds(4);
		ok.click();
		
   
		
		for(i=0;i<Ok.size();i++)
		{
			if(Ok.get(i).getText().equalsIgnoreCase("OK"))
			{
			Ok.get(i).click();
			
			}
		}
	}


}
