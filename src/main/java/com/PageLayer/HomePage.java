package com.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class HomePage extends BaseClass {
	@FindBy(xpath = "//span[text()='Praful Pawar']")
	WebElement Username;

	@FindBy(xpath = ".//*[@id='top-header-menu']/div[1]")
	WebElement Logo;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	public Boolean validateUsername() {
		Boolean unamePresent = Username.isDisplayed();
		return unamePresent;
	}

	public Boolean ValidateLogo() {
		Boolean CompanyLogo = Logo.isDisplayed();
		return CompanyLogo;
	}

	public String ValidateTitle() {
		String actualtitle = driver.getTitle();
		return actualtitle;
	}
	
	
	public String ValidateUrl() {
		String actualUrl=driver.getCurrentUrl();
		return actualUrl; 
	}

}
