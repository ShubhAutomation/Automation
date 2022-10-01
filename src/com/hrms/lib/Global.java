package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
//provide all the test data
	
	public WebDriver driver;
	public String url="http://183.82.103.245/nareshit/login.php";
	
	public String Username= "nareshit";
	public String pass= "nareshit";
	public String FN="Sanjot";
	public String LN="Pawar";
	
	//elements
	
	public String txt_user= "txtUserName";
	public String txt_pwd= "txtPassword";
	public String btn_login= "Submit";
	public String link_logout= "//a[text()='Logout']";
	public String btn_Add="//input[@value='Add']";
	public String txt_LN="//input[@id='txtEmpLastName']";
	public String txt_FN="//input[@id='txtEmpFirstName']";
	public String btn_save="btnEdit";
	public String frm_frame="rightMenu";
	
}
