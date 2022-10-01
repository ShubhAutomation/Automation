package com.hrms.testscripts;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebooklogintest {
@Test
	public void fb () throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement username=driver.findElement(By.xpath("//input[@name='email']"));
		username.sendKeys("shubhampawar3100@gmail.com");
		
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Shubh@3100");
		
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		
		System.out.println("loggedIn");
		
		/*
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Shrikant Ban, Aurangabad");
		System.out.println("searched");
	
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		*/
		//System.out.println("Enter pressed");
		//driver.findElement(By.xpath("//div[@class='p8bdhjjv rj0o91l8 p9ctufpz ihx95mk1']")).click();
		//System.out.println("see all");
		//Thread.sleep(4000);
		//JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("window.ScrollBy(0,300)", "");
		//Thread.sleep(4000);
		//driver.findElement(By.xpath("//div//span//span[text()='Add friend']")).click();
		
		//driver.findElement(By.xpath("//div//span//span[text()='Add Friend']")).click();
		//System.out.println("Friend request sent");
		
		//driver.findElement(By.xpath("//div[@class='om3e55n1 alzwoclg']")).click();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//div//div//div//span[text()='Log Out']")).click();
		System.out.println("loggedOut");
		
		
		
		driver.close();
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.ScrollBy(0,250)","");
		//JavascriptExecutor js=(JavascriptExecutor)(driver);
		
		//TakesScreenshot ts= (TakesScreenshot)(driver);
		//ts.getScreenshotAs(OutputType.FILE);
		
	}

}
