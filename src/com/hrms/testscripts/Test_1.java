package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.Genral;

public class Test_1 {
	@Test
	public  void abc() throws Exception {
		//DOMConfigurator.configure("log4j.xml");
		Genral ob=new Genral();
		ob.OpenApplication();
		ob.login();
		ob.logout();
		ob.closeApplication();
	}

}
