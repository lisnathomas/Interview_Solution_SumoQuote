package com.Utilities;

import java.util.ArrayList;

public class TestUtilities_3 {
	
	static Xls_Reader reader; //Declaring xls reader as global variable so all method can access it. It is static bcz methods are also static

	public static ArrayList<Object[]> getdata() {
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();    //if we are making arraytype ofnobject we can store any type value string, int, double etc.
		
		//reader is the object  xls reader (the file in this package which has all methods)
		reader = new Xls_Reader("C:\\Users\\lisna\\OneDrive\\Desktop\\Data.xlsx");
	
		//use for loop to read data from excel.
		for(int rowNum=2;rowNum<=reader.getRowCount("sheet1");rowNum++) {
			String username = reader.getCellData("sheet1", "UserName", rowNum);
			String password = reader.getCellData("sheet1", "Password", rowNum);
	
		
			Object obj[] = {username,password};
			myData.add(obj);
	
	}
		return myData;
	}
}
