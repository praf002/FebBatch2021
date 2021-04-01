package com.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.BaseLayer.BaseClass;

public class WebDriverEventListerner extends BaseClass implements WebDriverEventListener {

	public void beforeAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateTo(String url, WebDriver driver) {
	
		System.out.println("Before Navigating url "+url);
		
	}

	public void afterNavigateTo(String url, WebDriver driver) {

		System.out.println("After Navigating url "+url);
		
	}

	public void beforeNavigateBack(WebDriver driver) {
	
		System.out.println("Before Navigating back ");
		
	}

	public void afterNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {

		System.out.println("Trying to find out element :  "+by.toString());
		
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {

		System.out.println("Web Element is found :  "+by.toString());
		
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {

		System.out.println("Trying to click on Element : "+element.toString());
		
	}

	public void afterClickOn(WebElement element, WebDriver driver) {

		System.out.println("click on element : "+element.toString());
		
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {

		System.out.println("before change the Value of Element : "+element.toString() );
		
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {

		System.out.println("After Element Value is changes : "+element.toString() );
		
	}

	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeSwitchToWindow(String windowName, WebDriver driver) {

		System.out.println("Trying to switch window "+windowName.toString());
		
	}

	public void afterSwitchToWindow(String windowName, WebDriver driver) {

		System.out.println("After switch to window "+windowName.toString());
		
	}

	public void onException(Throwable throwable, WebDriver driver) {
		
		System.out.println("exception is occured :"+throwable);
		
		utilClass.TakeScreenShotEndOfTest();
		
	}

	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		
	}

	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		
	}

	public void beforeGetText(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterGetText(WebElement element, WebDriver driver, String text) {
		// TODO Auto-generated method stub
		
	}

	
}
