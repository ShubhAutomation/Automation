package com.hrms.lib;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class Genral extends Global{
	
	
	public void OpenApplication() {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened");
		//Log.info("Application opened");
	}
	
	public void closeApplication() {
		driver.close();
		System.out.println("Application Closed");
		//Log.info("Application closed");
	}
	
	public void login() throws IOException {
		driver.findElement(By.name(txt_user)).sendKeys(Username);
		driver.findElement(By.name(txt_pwd)).sendKeys(pass);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Logged In");
		//Log.info("Logged in");
		/*Assert.AssertEquals(true,false);
		File f1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File("D:\\TestResult.png"));
	*/}
	
	public void logout()  throws Exception{
		driver.findElement(By.xpath(link_logout)).click();
		Thread.sleep(4000);
		System.out.println("Loggod out");//console
		Reporter.log("Logged out");//html report
		//Log.info("Logged out");
	}

	public void enterFrame() {
		driver.switchTo().frame(frm_frame);
		System.out.println("Entered into frame");
		//Log.info("entered into frame");
	}
	public void exitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("Exit from frame");
		//Log.info("Exit from frame");
	}
	public void Add_Emp() {
		
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.xpath(txt_FN)).sendKeys(FN);
		driver.findElement(By.xpath(txt_LN)).sendKeys(LN);
		driver.findElement(By.id(btn_save)).click();
		System.out.println("Employe added");
		//Log.info("Employe added");
	}
	
}
