package com.stockaccounting.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage_pom {
	
	@FindBy(xpath=".//*[@id='mi_dashboard_php']/a")
	WebElement dashboard;
	
	@FindBy(xpath=".//*[@id='mi_a_stock_items']/a")
	WebElement stockitems;
	
	@FindBy(xpath=".//*[@id='mi_a_suppliers']/a")
	WebElement suppliers;
	
	@FindBy(xpath=".//*[@id='mi_a_purchases']/a")
	WebElement purchases;
	
	@FindBy(xpath=".//*[@id='mi_a_customers']/a")
	WebElement customers;
	
	public void dashboard()
	{
		dashboard.click();
	}
	
	public void Stockitems()
	{
		stockitems.click();
	}
	
	public void Suppliers()
	{
		
		suppliers.click();
	}
	public void purchases()
	{
		purchases.click();
	}
	
	public void customers()
	{
		customers.click();
	}

}
