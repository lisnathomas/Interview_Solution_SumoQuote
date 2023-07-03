package com.Utilities;

public class ReadWriteExcelFile {

	public static void main(String[] args) {
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\lisna\\OneDrive\\Desktop\\Data.xlsx");
		
		System.out.println(reader.getRowCount("sheet1"));
		System.out.println(reader.getColumnCount("sheet1"));
		System.out.println(reader.getCellData("sheet1", 1, 2));
		
		//main method on xls reader for getCelldata is String. We have to check the type of method on xls reader. That we used String username. 
		String username = reader.getCellData("sheet1", "UserName", 2);
		System.out.println(username);
		
		reader.addColumn("sheet1", "Phonenumber");
	    reader.setCellData("sheet1", "Phonenumber", 2, "123456");//to add data to the sheet
	}

}
