package com.stockaccounting.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Lib {

	
	public static void main(String[] args) throws IOException {
		String res;
		 Stockaccounting_lib lib=new Stockaccounting_lib();
		res= lib.OpenApp("http://webapp.qedgetech.com");
		System.out.println(res);
		
		lib.Adminlogin("admin", "master");
		
		/*//testdata path
		FileInputStream fis=new FileInputStream("D:\\Madhu\\ERP_Madhu\\src\\com\\stockaccounting\\testdata\\UOM testdata.xlsx");
		
		//create workbook
		XSSFWorkbook WB=new XSSFWorkbook(fis);
		XSSFSheet WS=WB.getSheet("UOM");
		int RC=WS.getLastRowNum();
		System.out.println(RC);
		for(int i=1;i<=RC;i++)
		{
			XSSFRow WR=WS.getRow(i);
			XSSFCell WC1=WR.getCell(0);
			XSSFCell WC2=WR.getCell(1);
			XSSFCell WC3=WR.createCell(2);
			String UOM_ID=WC1.getStringCellValue();
			String UOM_Desc=WC2.getStringCellValue();
			res=lib.Unit_Of_Measurement(UOM_ID, UOM_Desc);
			System.out.println(res);
			WC3.setCellValue(res);
			
		}
		//write results into another file
		FileOutputStream fos=new FileOutputStream("D:\\Madhu\\ERP_Madhu\\src\\com\\stockaccounting\\results\\UOMresults.xlsx");
		WB.write(fos);
		WB.close();
		*/
	
		
		/*XSSFRow WR=WS.getRow(1);
		XSSFCell WC=WR.getCell(0);
		String cdata=WC.getStringCellValue();
		System.out.println("cdata");
		*/
		
		
		
		
		
		//lib.Suppliers("Madhu");
		//TESTDATA PATH FOR SUPPLIER
		/*FileInputStream fis=new FileInputStream("D:\\Madhu\\ERP_Madhu\\src\\com\\stockaccounting\\testdata\\Supplierdata.xlsx");
		
		//Create workbook
		
		XSSFWorkbook WB=new XSSFWorkbook(fis);
		XSSFSheet WS=WB.getSheet("Supplier");
		int RC=WS.getLastRowNum();
		System.out.println(RC);
		for(int i=1;i<=RC;i++)
		{
			XSSFRow WR=WS.getRow(i);
			XSSFCell WC1=WR.getCell(0);
			XSSFCell WC2=WR.getCell(1);
			XSSFCell WC3=WR.getCell(2);
			XSSFCell WC4=WR.getCell(3);
			XSSFCell WC5=WR.getCell(4);
			XSSFCell WC6=WR.getCell(5);
			XSSFCell WC7=WR.getCell(6);
			XSSFCell WC8=WR.getCell(7);
			XSSFCell WC9=WR.getCell(8);
			XSSFCell WC10=WR.createCell(9);
			
			String SupplierName=WC1.getStringCellValue();
		
			String Address=WC2.getStringCellValue();
			String City=WC3.getStringCellValue();
			String Country=WC4.getStringCellValue();
			String Contact_Person=WC5.getStringCellValue();
			String Phone_Number=WC6.getStringCellValue();	
			String Email=WC7.getStringCellValue();
			String Mobile_Number=WC8.getStringCellValue();
			String Notes=WC9.getStringCellValue();
			
			res=lib.Suppliercreation(SupplierName, Address, City, Country, Contact_Person, Phone_Number, Email, Mobile_Number, Notes);
			System.out.println(res);
			WC10.setCellValue(res);
		}
			
		//Write result in another file
		FileOutputStream fos=new FileOutputStream("D:\\Madhu\\ERP_Madhu\\src\\com\\stockaccounting\\results\\Supplierresults.xlsx");
		WB.write(fos);
		WB.close();
		*/
		
		/*lib.Stockcategories("19");
		
		FileInputStream fis=new FileInputStream("D:\\Madhu\\ERP_Madhu\\src\\com\\stockaccounting\\testdata\\Categorydata.xlsx");
		
		XSSFWorkbook WB=new XSSFWorkbook(fis);
		XSSFSheet WS=WB.getSheet("Category");
		int RC=WS.getLastRowNum();
		System.out.println(RC);
		
		
		for(int i=1;i<=RC;i++)
		{
			XSSFRow WR=WS.getRow(i);
			XSSFCell WC1=WR.getCell(0);
			XSSFCell WC2=WR.createCell(1);
			
			
			String cname=WC1.getStringCellValue();
			System.out.println(cname);
			 Sleeper.sleepTightInSeconds(3);
			res=lib.Stockcategorycreate(cname);
			System.out.println(res);
			WC2.setCellValue(res);
			
			
		}
		
		FileOutputStream fos=new FileOutputStream("D:\\Madhu\\ERP_Madhu\\src\\com\\stockaccounting\\results\\Categoryresults.xlsx");
		WB.write(fos);
		WB.close();
		
		*/
		
		FileInputStream fis=new FileInputStream("D:\\Madhu\\ERP_Madhu\\src\\com\\stockaccounting\\testdata\\Stockcreation.xlsx");
		
		XSSFWorkbook WB=new XSSFWorkbook(fis);
		XSSFSheet WS=WB.getSheet("Stockcreation");
		int RC=WS.getLastRowNum();
		System.out.println(RC);
		XSSFRow WR=WS.getRow(0);
		XSSFCell WC=WR.createCell(7);//creating headercell name in excel
		
		
		for(int i=1;i<=RC;i++)
		{
			XSSFRow WR1=WS.getRow(i);
			XSSFCell WC1=WR1.getCell(0);
			XSSFCell WC2=WR1.getCell(1);
			XSSFCell WC3=WR1.getCell(2);
			XSSFCell WC4=WR1.getCell(3);
			XSSFCell WC5=WR1.getCell(4);
			XSSFCell WC6=WR1.getCell(5);
			XSSFCell WC7=WR1.getCell(6);
			XSSFCell WC8=WR1.createCell(7);
			
			String category=WC1.getStringCellValue();
			System.out.println(category);
			String snum=WC2.getStringCellValue();
			System.out.println(snum);
			String stockname=WC3.getStringCellValue();
			System.out.println(stockname);
			String UOM=WC4.getStringCellValue();
			System.out.println(UOM);
			String Pprice=WC5.getStringCellValue();
			System.out.println(Pprice);
			String Sprice=WC6.getStringCellValue();
			System.out.println(Sprice);
			String notes=WC7.getStringCellValue();
			System.out.println(notes);
			
			
			 Sleeper.sleepTightInSeconds(5);
			res=lib.Stockitems_Create(category, snum, stockname, UOM, Pprice, Sprice, notes);
			System.out.println(res);
              
			WC.setCellValue("RESULTS");//extra header name in excel
			WC8.setCellValue(res);
			
			
				
			
		}
		FileOutputStream fos=new FileOutputStream("D:\\Madhu\\ERP_Madhu\\src\\com\\stockaccounting\\results\\Stockcreation.xlsx");
		WB.write(fos);
		WB.close();
		
		
		
	
		
		
		
		//lib.Suppliercreation("Madhu", "sachivalayanagar,hyderabad", "Hyderabad", "India", "latha", "8765456778", "abcd@gmail.com", "87678990", "note");
		
		//lib.Stockcategorycreate("Books");
		//lib.Unit_Of_Measurement("U30", "Description about books");
		//lib.Stockitems_Create("Books", "Madhu", "RS Agarwal", "Description about bo", "700", "800", "note");
		//res=lib.Logout();
		//System.out.println(res);

	}

}
