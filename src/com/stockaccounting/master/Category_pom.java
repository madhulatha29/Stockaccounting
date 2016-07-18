package com.stockaccounting.master;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;

public class Category_pom {
	
	@FindBy(xpath=".//*[@id='mi_a_stock_categories']/a")
	WebElement stockcategories;
	

	@FindBy(xpath=".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")
	WebElement addb;
	
	@FindBy(id="x_Category_Name")
	WebElement cname;
	
	@FindBy(id="btnAction")
	WebElement addbutton;
	
	@FindBy(xpath="html/body/div[19]/div[2]/div/div[4]/div[2]/button[1]")
	List<WebElement> ok;
	
	@FindBy(xpath="html/body/div[17]/div[2]/div/div[4]/div[2]/button")
	WebElement Ok;
	
	public void stockcategory()
	{
		stockcategories.click();
		Sleeper.sleepTightInSeconds(6);
		addb.click();
	}
	
	public void category(String categoryname)
	{
		int i;
		cname.sendKeys(categoryname);
		addbutton.click();
		for(i=0;i<ok.size();i++)
		{
			if(ok.get(i).getText().equalsIgnoreCase("OK!"))
			{
			ok.get(i).click();
			
			}
		}
		
		Sleeper.sleepTightInSeconds(6);
		Ok.click();
	}

	
		
	}


