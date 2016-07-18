package com.stockaccounting.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.stockaccounting.master.Category_pom;
import com.stockaccounting.master.Homepage_pom;
import com.stockaccounting.master.Loginpage;
import com.stockaccounting.master.Supplierhome_pom;
import com.stockaccounting.master.Suppliers_pom;

public class SAexe
{
	@Test
	public void exe()
	
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://webapp.qedgetech.com");
		driver.manage().window().maximize();
		
		Loginpage lp=PageFactory.initElements(driver,Loginpage.class);
		lp.Adminlogin("admin","master");
		
		Homepage_pom hp=PageFactory.initElements(driver, Homepage_pom.class);
		//hp.dashboard();
		//hp.Stockitems();
		//hp.Suppliers();
		//hp.purchases();
		//hp.customers();
		
		//Supplierhome_pom sh=PageFactory.initElements(driver, Supplierhome_pom.class);
		//sh.add();
		
		/*Sleeper.sleepTightInSeconds(3);
		Suppliers_pom supp=PageFactory.initElements(driver, Suppliers_pom.class);
		supp.Suppliers("test", "ameerpet","hyderabad","India","test2","936789995","ytre@gmail.com","8946789995","note");
	*/
	
		 Actions Act=new Actions(driver);
	     Act.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
		Category_pom category=PageFactory.initElements(driver, Category_pom.class);
		category.stockcategory();
		
		category.category("bangles");
	}

}
