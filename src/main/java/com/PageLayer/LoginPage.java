package com.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class LoginPage extends BaseClass{
	
		@FindBy(name="email")
		WebElement typeUsername;
		
		@FindBy(name="password")
		WebElement typepassword;
		
		@FindBy(xpath="//div[text()='Login']")
		WebElement clickOnSubmit;
		
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		

		public void LoginFunctionality(String uname, String pass) {
			typeUsername.sendKeys(uname);
			typepassword.sendKeys(pass);
			clickOnSubmit.click();
		}

}
