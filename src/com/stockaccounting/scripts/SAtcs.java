package com.stockaccounting.scripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.stockaccounting.master.Testbase;

public class SAtcs extends Testbase
{

@Test(dataProvider="udata")
public void Unit_Of_Measurement(String UOMID,String UOMDescription)
{
SL.Unit_Of_Measurement(UOMID,UOMDescription);
}

@DataProvider
public Object[][] udata()
{
	Object[][] obj=new Object[3][2];
	obj[0][0]="13";
	obj[0][1]="test1";
	
	obj[1][0]="18";
	obj[1][1]="test2";
	
	obj[2][0]="13";
	obj[2][1]="test3";
	
	return obj;
	
}

}
