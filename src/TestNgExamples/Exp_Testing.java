package TestNgExamples;



import java.io.FileInputStream;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.hrms.lib.Genral;

import jxl.Sheet;
import jxl.Workbook;



public class Exp_Testing  {
	
	Genral ng1=new Genral();
	@BeforeClass
	public void openApp() {
		ng1.OpenApplication();
	}
	@AfterClass
	public void closeApp() {
		ng1.closeApplication();
		
	}
	/*@Test
	public void login() throws Exception {
		FileInputStream file= new FileInputStream("C://testData//Login.xls");
		Workbook wb= Workbook.getWorkbook(file);
		Sheet st= wb.getSheet(0);
		String Username= st.getCell(0,1).getContents();
		String Pass= st.getCell(1,1).getContents();
		Reporter.log(Username);
		Reporter.log(Pass);
		ng1.login();
		
	}*/
	//@AfterMethod
	//public void logout() throws Exception {
//		ng1.logout();
		
	//}
	@Test
	public void login_Logout() throws Exception {
		ng1.login();
		ng1.logout();
	}
	@Test(priority=0)
	public void add() throws Exception{
		ng1.login();
		
		
		ng1.enterFrame();
		ng1.Add_Emp();
		ng1.exitFrame();
		Reporter.log("employee aded");
		ng1.logout();
			
	}
	
}
