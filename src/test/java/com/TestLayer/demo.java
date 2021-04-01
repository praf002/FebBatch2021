package com.TestLayer;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demo {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\L470_1\\Downloads\\edgedriver_win64 (4)\\msedgedriver.exe");
		driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement wb = driver.findElement(By.name("login"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='2px solid red'", wb);
		

	}

	

}
