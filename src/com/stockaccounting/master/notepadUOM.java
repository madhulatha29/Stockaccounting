package com.stockaccounting.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class notepadUOM {

	
	public static void main(String[] args) throws IOException {
		
		String res;
		 Stockaccounting_lib lib=new Stockaccounting_lib();
		res= lib.OpenApp("http://webapp.qedgetech.com");
		System.out.println(res);
		lib.Adminlogin("admin", "master");
		//lib.Suppliers("Madhu");
		/*//Reading data from notepad
		String Fpath="D:\\Madhu\\ERP_Madhu\\src\\com\\stockaccounting\\testdata\\UOMtestdata.txt";
		String Rpath="D:\\Madhu\\ERP_Madhu\\src\\com\\stockaccounting\\results\\UOMresults.txt";
		String SD;
		FileReader FR=new FileReader(Fpath);
		BufferedReader BR=new BufferedReader(FR);
		String Sread=BR.readLine();
		System.out.println(Sread);
		
		//Writing data into another notepad
		FileWriter FW=new FileWriter(Rpath);
		BufferedWriter BW=new BufferedWriter(FW);
		BW.write(Sread +"$$$"+ "Results");
		BW.newLine();
		while((SD=BR.readLine())!=null)
		{
			System.out.println(SD);
			String[] SR=SD.split("###");
			String UID=SR[0];
			System.out.println(UID);
			String UDESC=SR[1];
			System.out.println(UDESC);
			
			res=lib.Unit_Of_Measurement(UID, UDESC);
			System.out.println(res);
			
			BW.write(UID +"@@@"+ UDESC +"@@@"+ res);
			BW.newLine();
		}
		BW.close();
		BR.close();
		*/
		
		/*//Reading supplier data from notepad
		String Fpath="D:\\Madhu\\ERP_Madhu\\src\\com\\stockaccounting\\testdata\\Supplierdata.txt";
		String Rpath="D:\\Madhu\\ERP_Madhu\\src\\com\\stockaccounting\\results\\Supplierresults.txt";
		String SD;
		FileReader FR=new FileReader(Fpath);
		BufferedReader BR=new BufferedReader(FR);
		String Sread=BR.readLine();
		System.out.println(Sread);
		
		FileWriter FW=new FileWriter(Rpath);
		BufferedWriter BW=new BufferedWriter(FW);
		BW.write(Sread +"$$$"+ "Results");
		BW.newLine();
		
		while((SD=BR.readLine())!=null)
				{
			System.out.println(SD);
			String[] SR=SD.split( "###" );
			String Sname=SR[0];
			System.out.println(Sname);
			String address=SR[1];
			System.out.println(address);
			String city=SR[2];
			System.out.println(city);
			String country=SR[3];
			System.out.println(country);
			String cperson=SR[4];
			System.out.println(cperson);
			String phonenum=SR[5];
			System.out.println(phonenum);
			String email=SR[6];
			System.out.println(email);
			String mobilenum=SR[7];
			System.out.println(mobilenum);
			String notes=SR[8];
			System.out.println(notes);
			
			
			res=lib.Suppliercreation(Sname, address, city, country, cperson, phonenum, email, mobilenum, notes);
			System.out.println(res);
			
			BW.write(Sname +"@@@"+ address +"@@@"+ city +"@@@"+ country +"@@@"+ cperson +"@@@"+ phonenum +"@@@"+ email +"@@@"+ mobilenum +"@@@"+ notes +"@@@"+ res);
			BW.newLine();
			
				}
		BW.close();
		BR.close();
	}
        
}
*/
		
		/*lib.Stockcategories("19");
		
		String SD;
		FileReader FR=new FileReader("D:\\Madhu\\ERP_Madhu\\src\\com\\stockaccounting\\testdata\\Categorydata.txt");
		BufferedReader BR=new BufferedReader(FR);
		String Sread=BR.readLine();
		System.out.println(Sread);
		
		FileWriter FW=new FileWriter("D:\\Madhu\\ERP_Madhu\\src\\com\\stockaccounting\\results\\Categoryresults.txt");
	    BufferedWriter BW=new BufferedWriter(FW);
	    BW.write(Sread +"$$$"+ "Results");
	    BW.newLine();
	    
	    while((SD=BR.readLine())!=null)
	    {
	    	System.out.println(SD);
	    	String cname=SD;
	    	//System.out.println(cname);
	    	  Sleeper.sleepTightInSeconds(3);
	    	
	    	res=lib.Stockcategorycreate(cname);
	    	System.out.println(res);
	    	
	    	BW.write(cname +"@@@"+ res);
	    	BW.newLine();
	    	
	    }
	BW.close();
	BR.close();
	
	
	}
}
		
	*/
		String SD;
		FileReader FR=new FileReader("D:\\Madhu\\ERP_Madhu\\src\\com\\stockaccounting\\testdata\\Stockcreation.txt");
		BufferedReader BR=new BufferedReader(FR);
		String Sread=BR.readLine();
		System.out.println(Sread);
		
		
		FileWriter FW=new FileWriter("D:\\Madhu\\ERP_Madhu\\src\\com\\stockaccounting\\results\\Stockcreation.txt");
		BufferedWriter BW=new BufferedWriter(FW);
		BW.write(Sread +"$$$"+ "Results");
		BW.newLine();
		
		while((SD=BR.readLine())!=null)
		{
			System.out.println(SD);
			String[] SR=SD.split("###");
			String category=SR[0];
			System.out.println(category);
			String snum=SR[1];
			System.out.println(snum);
			String stockname=SR[2];
			System.out.println(stockname);
			String UOM=SR[3];
			System.out.println(UOM);
			String Pprice=SR[4];
			System.out.println(Pprice);
			String Sprice=SR[5];
			System.out.println(Sprice);
			String notes=SR[6];
			System.out.println(notes);
			
			res=lib.Stockitems_Create(category, snum, stockname, UOM, Pprice, Sprice, notes);
			System.out.println(res);
			BW.write(category +"@@@"+ snum+"@@@"+stockname+"@@@"+UOM+"@@@"+Pprice+"@@@"+Sprice+"@@@"+notes+"@@@"+ res);
		    BW.newLine();
			
		}
		
		BW.close();
		BR.close();
		
		
	}
}
