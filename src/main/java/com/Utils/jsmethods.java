package com.Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseLayer.BaseClass;


public class jsmethods extends BaseClass {

	public static void clickOnElementJS(WebDriver driver, WebElement wb) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", wb);
	}

	public static void sendKeysUsingJs(WebDriver Driver, WebElement wb) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='selenium testing';", wb);
	}

	public static String titleUsingJs(WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String actualtile = js.executeScript("return document.title;").toString();
		return actualtile;
	}

	public static void refreshPageUsingJS(WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		String actualtile = js.executeScript("return document.title;").toString();
		js.executeScript("history.go(0)");
	}

	public static void flash(WebElement wb, WebDriver driver) throws InterruptedException {

		String bgColour = wb.getCssValue("background-color");
		System.out.println(bgColour);
		for (int i = 0; i < 100; i++) {
			jsmethods.changeColour("rgb(0,0,0)", wb, driver);
			jsmethods.changeColour(bgColour, wb, driver);// it is orginal color of object

		}

	}

	public static void changeColour(String colour, WebElement wb, WebDriver driver) throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.backgroundColor = '" + colour + "'", wb);
		Thread.sleep(200);
	}
}
