package Project_TestNG;

import java.util.ArrayList;

public class TestUtilities {
	
	static Xls_Reader reader;
	
	public static ArrayList<Object[]> getData() {
		
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		reader = new Xls_Reader("C:\\Users\\lisna\\Downloads\\Book1.xlsx");
		
		for(int rownum=2;rownum<=reader.getRowCount("sheet1");rownum++) {
			//String size = reader.getCellData("sheet1", "Size", rownum);
			String email = reader.getCellData("sheet1", "Email", rownum);
			String password = reader.getCellData("sheet1", "password", rownum);
			
			Object obj[] = {email, password};
			mydata.add(obj);
		}
		return mydata;
		
	}
}
