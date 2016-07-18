package com.stockaccounting.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Supplierhome_pom {
	
	@FindBy(xpath=".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")
	WebElement add;
	
	public void add()
	{
		add.click();
	}

}
