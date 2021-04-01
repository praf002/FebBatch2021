package com.BaseLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import com.Utils.*;

import com.Utils.WebDriverEventListerner;
import com.Utils.utilClass;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	public static WebDriverEventListerner eventListerner;
	public static EventFiringWebDriver e_driver;
	
	public BaseClass() {
		prop=new Properties();
		
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\L470_1\\Desktop\\Automation Script For Feb Batch\\FreeCRMApplication\\src\\main\\java\\com\\Config\\config.properties");
			prop.load(fis);
			
		} 
		catch (Exception e) {	
			e.printStackTrace();
		}
	}
	
	public static void Initiliazation() {
		
		String Browsername=prop.getProperty("browser");
		
		if(Browsername.equals("edge")) {
			System.setProperty("webdriver.edge.driver","C:\\Users\\L470_1\\Downloads\\edgedriver_win64 (4)\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		else if(Browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\L470_1\\Desktop\\30012021\\Selenium SetUp\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(Browsername.equals("ff")) {
			System.out.println("ff");
		}
		
		else if(Browsername.equals("opera")) {
			
			System.setProperty("webdriver.opera.driver","C:\\Users\\L470_1\\Downloads\\operadriver_win64 (1)\\operadriver_win64\\operadriver.exe");
			driver=new OperaDriver();
		}
		
		else {
			
		}
		
		eventListerner=new WebDriverEventListerner();
		e_driver=new EventFiringWebDriver(driver);
		
		e_driver.register(eventListerner);
		driver=e_driver;
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(utilClass.ImplicitWaitTimeOut, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(utilClass.PageLoadTimeOut, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}

}
