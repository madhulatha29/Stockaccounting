package com.stockaccounting.master;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class Stockaccounting_lib {
	public static Properties PR;
	public static FileInputStream fis;
	public static WebDriver driver;
	public static String Eval,Aval;
	public static List<WebElement> okbs;
	public String OpenApp(String URL) throws IOException 
	{
		PR=new Properties();
		fis=new FileInputStream("D:\\Madhu\\ERP_Madhu\\src\\com\\stockaccounting\\master\\stockaccounting.properties");
		PR.load(fis);
	Eval="Login";
	driver=new FirefoxDriver();
	driver.get(URL);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	Aval=driver.findElement(By.id(PR.getProperty("Login"))).getText();
	if(Eval.equalsIgnoreCase(Aval))
	{
		return "pass";
	}
	else
	{
		return "fail";
	}
		
	}
	
	public void Adminlogin(String un,String pwd) throws IOException
	{
		PR=new Properties();
		fis=new FileInputStream("D:\\Madhu\\ERP_Madhu\\src\\com\\stockaccounting\\master\\stockaccounting.properties");
		PR.load(fis);
		Eval="Administrator";
		driver.findElement(By.id(PR.getProperty("reset"))).click();
		driver.findElement(By.id(PR.getProperty("un"))).sendKeys(un);
		driver.findElement(By.id(PR.getProperty("pwd"))).sendKeys(pwd);
		driver.findElement(By.id(PR.getProperty("Login"))).click();
		Aval=driver.findElement(By.xpath(".//*[@id='msUserName']/font/strong")).getText();
		if(Eval.equalsIgnoreCase(Aval))
		{
			System.out.println("Admin login successfull");
			
		}
		else
		{
			System.out.println("fail");
			
		}
	}
	
	public void Suppliers(String supplier)
	{
		Eval="Supplier Number";
		driver.findElement(By.linkText("Suppliers")).click();
		Aval=driver.findElement(By.xpath(".//*[@id='elh_a_suppliers_Supplier_Number']/div/span[1]")).getText();
		if(Eval.equalsIgnoreCase(Aval))
		{
			System.out.println("suppliers page opened");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	public String Suppliercreation(String suppliername,String address,String city,String country,String contactperson,String phonenumber,String email,String mobilenumber,String notes) throws IOException
	{
		PR=new Properties();
		fis=new FileInputStream("D:\\Madhu\\ERP_Madhu\\src\\com\\stockaccounting\\master\\stockaccounting.properties");
	    PR.load(fis);
	    
		Eval="Add Succeeded";
		//driver.findElement(By.linkText("Suppliers")).click();
		Sleeper.sleepTightInSeconds(6);
	driver.findElement(By.xpath(PR.getProperty("Add"))).click();
	//Aval=driver.findElement(By.xpath(".//*[@id='elh_a_suppliers_Supplier_Name']")).getText();
	
	 driver.findElement(By.id(PR.getProperty("Suppliername"))).sendKeys(suppliername);
	 driver.findElement(By.id(PR.getProperty("Address"))).sendKeys(address);
	 driver.findElement(By.id(PR.getProperty("City"))).sendKeys(city);
	 driver.findElement(By.id(PR.getProperty("Country"))).sendKeys(country);
	 driver.findElement(By.id(PR.getProperty("Contactperson"))).sendKeys(contactperson);
	 driver.findElement(By.id(PR.getProperty("Phonenumber"))).sendKeys(phonenumber);
	
	 driver.findElement(By.id(PR.getProperty("Email"))).sendKeys(email);
	 driver.findElement(By.id(PR.getProperty("Mobilenumber"))).sendKeys(mobilenumber);
	 driver.findElement(By.id(PR.getProperty("Notes"))).sendKeys(notes);
	 driver.findElement(By.id(PR.getProperty("Addbutton"))).click();
     driver.findElement(By.xpath(PR.getProperty("Ok"))).click();
     Aval=driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[3]/div/div")).getText();
     if(Eval.equalsIgnoreCase(Aval))
		{
			System.out.println("supplier added successfully");
		}
		else
		{
			System.out.println("fail");
		}
     Sleeper.sleepTightInSeconds(6);
     driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
     
	return "pass";
	 	 }
	
	public void Stockcategories(String categoryid)
	{
		 Actions Act=new Actions(driver);
	     Act.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
	     driver.findElement(By.linkText("Stock Categories")).click();
	     Eval="Category ID";
	     Aval=driver.findElement(By.xpath(".//*[@id='elh_a_stock_categories_Category_ID']/div/span[1]")).getText();
	     if(Eval.equalsIgnoreCase(Aval))
	     {
	    	 System.out.println("Stock categories opened");
	     }
	     else
	     {
	    	 System.out.println("fail");
	     }
	     
	}
	     
	 public String Stockcategorycreate(String categoryname)
	 {
		 driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
	     driver.findElement(By.id("x_Category_Name")).sendKeys(categoryname);
	     driver.findElement(By.id("btnAction")).click();
	 
	     driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
	     
	     driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
		return "pass";
	    
	 }
	 
	 public String Unit_Of_Measurement(String UOMID,String UOMDescription)
	 {
		 Actions Act=new Actions(driver);
		 Act.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
	     
	     driver.findElement(By.linkText("Unit of Measurement")).click();
	     
	     driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
	     driver.findElement(By.id("x_UOM_ID")).sendKeys(UOMID);
	     driver.findElement(By.id("x_UOM_Description")).sendKeys(UOMDescription);
	     driver.findElement(By.id("btnAction")).click();
	     
	     driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
	     Sleeper.sleepTightInSeconds(3);
	     driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
		return "PASS";
	
	
	     
	 }
	 
	 public String Stockitems_Create(String category,String suppliernumber,String stockname,String unitofmeasurement,String purchasingprice,String sellingprice,String notes)
	 {
		 driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a")).click();
		 driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
		 Select a=new Select(driver.findElement(By.id("x_Category")));
	      a.selectByVisibleText(category);
	      Sleeper.sleepTightInSeconds(3);
	      Select b=new Select(driver.findElement(By.id("x_Supplier_Number")));
	      b.selectByVisibleText(suppliernumber);
	      Sleeper.sleepTightInSeconds(3);
	      
	      driver.findElement(By.id("x_Stock_Name")).sendKeys(stockname);
	      Sleeper.sleepTightInSeconds(3);
	      
	      Select c=new Select(driver.findElement(By.id("x_Unit_Of_Measurement")));
	      c.selectByVisibleText(unitofmeasurement);
	      
	      driver.findElement(By.id("x_Purchasing_Price")).sendKeys(purchasingprice);
	      driver.findElement(By.id("x_Selling_Price")).sendKeys(sellingprice);
	      driver.findElement(By.id("x_Notes")).sendKeys(notes);
	      Sleeper.sleepTightInSeconds(3);
	      
	      driver.findElement(By.id("btnAction")).click();
	      
	      Sleeper.sleepTightInSeconds(3);
		     driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
		     Sleeper.sleepTightInSeconds(3);
		     driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
			return "pass";
	      
	      
	 }
	 
	 public String Logout()
	 {
		int i;
		 driver.findElement(By.xpath(".//*[@id='logout']")).click();
		 
		okbs=driver.findElements(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]"));
		
		for(i=0;i<okbs.size();i++)
		{
			if(okbs.get(i).getText().equalsIgnoreCase("OK!"))
			{
			okbs.get(i).click();
			}
		}
		
		 //driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
		return "logout";
	 }
	 
	 
	 
	 public void CloseApp()
	 {
	   driver.close();  
	}
}

	



