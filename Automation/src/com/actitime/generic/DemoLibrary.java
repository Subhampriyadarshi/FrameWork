package com.actitime.generic;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;

public class DemoLibrary
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
     FileLib f=new FileLib();
     //reading the data from property file
     String url=f.getPropertyData("url");
     System.out.println(url);
     //writing the data to excel file
     f.setExcelData("CreateCustomer",1,4,"pass");
     //reading the data from excel file
     System.out.println(f.getExcelData("CreateCustomer",1,4));
	}

}
