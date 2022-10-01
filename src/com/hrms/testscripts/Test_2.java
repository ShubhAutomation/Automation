package com.hrms.testscripts;

import java.io.IOException;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.Genral;

public class Test_2 {
	//public static void main(String args[]) throws Exception

	@Test
	public void tc() throws Exception{
		
		//DOMConfigurator.configure("log4j.xml");
		Genral ob2= new Genral();
	
	
	ob2.OpenApplication();
	ob2.login();
	ob2.enterFrame();
	ob2.Add_Emp();
	ob2.exitFrame();
	ob2.logout();
	ob2.closeApplication();
	}
}
