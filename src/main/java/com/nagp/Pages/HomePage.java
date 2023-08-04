package com.nagp.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
WebDriver driver;
	
	//Objects
@FindBy(linkText = "Sign In")
private WebElement signInClick;

@FindBy(linkText = "Create an Account")
private WebElement createAccount;

@FindBy(xpath = "//a//span[contains(text(),\"What's New\")]")
private WebElement whatsNew;

@FindBy(xpath = "//a[contains(@class,'logo')]")
private WebElement home;

public HomePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
public SignInPage naviageToSigninPage() {
	signInClick.click();
	return new SignInPage(driver);
	
}
public ChooseProductFromDropDownPage naviageToHomeinPage() {
	home.click();
	return new ChooseProductFromDropDownPage(driver);
	
}
public CreateAccountPage clickCreateAccount() {
//	Logs.logger.info( "Click on "+ new Object(){}.getClass().getEnclosingMethod().getName()+" Successfully ");
		createAccount.click();
		return new CreateAccountPage(driver);
		
	}

public WhatsNewPage navigateToWhatsNew() {
//	Logs.logger.info( "Click on "+ new Object(){}.getClass().getEnclosingMethod().getName()+" Successfully ");
		whatsNew.click();
		return new WhatsNewPage(driver);
		
	}
}
