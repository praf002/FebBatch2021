package com.TestLayer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.LoginPage;
import com.Utils.utilClass;

public class LoginPageTest extends BaseClass {
	

	@Test
	public void setUp() {
	
		BaseClass.Initiliazation();
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.LoginFunctionality(prop.getProperty("username"), prop.getProperty("password"));
		
		utilClass.TakeScreenShotEndOfTest();
		driver.close();
	}
	
	@Test(priority=3)
	public void m1() {
		Assert.assertEquals(12, 12);
	}
	@Test(priority=2)
	public void m2() {
		Assert.assertEquals(13, 12);
	}
	@Test(priority=4)
	public void m4() {
		Assert.assertEquals("Gmail"	, "Gmail");
	}
	
	
	
}
