package com.stockaccounting.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	
	@FindBy(id="btnreset")
	WebElement Reset;
	
	@FindBy(id="username")
	WebElement UN;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="btnsubmit")
	WebElement Login;
	
	public void Adminlogin(String un,String pwd)
	{
		Reset.click();
		UN.sendKeys(un);
		Password.sendKeys(pwd);
		Login.click();
			
	}

}
