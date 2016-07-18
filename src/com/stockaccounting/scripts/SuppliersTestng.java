package com.stockaccounting.scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.stockaccounting.master.Testbase;

public class SuppliersTestng extends Testbase 

{
	@Test(priority=0)
	
	public void Suppliers()
	{
		SL.Suppliers("Madhu");
	}
	
	@Test(priority=1,dataProvider="udata")
	
	public void Suppliercreation(String suppliername,String address,String city,String country,String contactperson,String phonenumber,String email,String mobilenumber,String notes) throws IOException 
	{
		
	SL.Suppliercreation(suppliername, address, city, country, contactperson, phonenumber, email, mobilenumber, notes);
	}
	@DataProvider
	public Object[][] udata()
	{
		Object[][] obj=new Object[2][9];
		obj[0][0]="navya";
		obj[0][1]="lb.nagar";
		obj[0][2]="hyd";
	    obj[0][3]="India";
	    obj[0][4]="madhu";
	    obj[0][5]="985678990";
	    obj[0][6]="tfggh@gmail.com";
	    obj[0][7]="98656789";
	    obj[0][8]="note";
		
	    obj[1][0]="navya1";
		obj[1][1]="lb.nagarg";
		obj[1][2]="hydh";
	    obj[1][3]="Indian";
	    obj[1][4]="madhuri";
	    obj[1][5]="985678980";
	    obj[1][6]="tfgih@gmail.com";
	    obj[1][7]="986568789";
	    obj[1][8]="note1";
		
		return obj;
		
	}

}
