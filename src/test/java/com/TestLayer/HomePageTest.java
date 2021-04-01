package com.TestLayer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.HomePage;
import com.PageLayer.LoginPage;

public class HomePageTest extends BaseClass {
	LoginPage loginpage;
	HomePage homepage;

	@BeforeClass
	public void setUp() {
		BaseClass.Initiliazation();
		loginpage = new LoginPage(driver);
		loginpage.LoginFunctionality(prop.getProperty("username"), prop.getProperty("password"));
		homepage = new HomePage(driver);
	}
	
	@Test
	public void ValidateTilt() throws InterruptedException {

		String actualTitle = homepage.ValidateTitle();
		String ExpectedTitle = "Cogmento CRM";
		Thread.sleep(3000);
		Assert.assertEquals(actualTitle, ExpectedTitle);
	}
	
	@Test
	public void ValidateUrl() throws InterruptedException {
		String ActualUrl = homepage.ValidateUrl();
		String ExpectedUrl = "https://ui.cogmento.com/";
		Thread.sleep(3000);
		Assert.assertEquals(ActualUrl, ExpectedUrl);
	}
	
	@AfterClass
	public void TearDown() {
		driver.close();
	}
}