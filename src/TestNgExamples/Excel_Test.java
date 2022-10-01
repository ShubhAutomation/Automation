package TestNgExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class Excel_Test {

	@Test 
	public void Ex() throws Exception{
		
		FileInputStream file= new FileInputStream("C://testData//Login.xls");
		Workbook wb= Workbook.getWorkbook(file);
		Sheet st= wb.getSheet(0);
		String Username= st.getCell(0,1).getContents();
		String Pass= st.getCell(1,1).getContents();
		Reporter.log(Username);
		Reporter.log(Pass);
		int rowcount = st.getRows();
		System.out.println(rowcount);
		System.out.println(st.getName());
		
	}

}
