package com.nagp.Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nagp.Utils.Logs.Logs;

public class SignInPage{

	WebDriver driver;
	public SignInPage(WebDriver driver)   {
this.driver=driver;
PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@FindBy(id = "email")
	private WebElement Email;
	
	@FindBy(id = "pass")
	private WebElement Password;
	
	@FindBy(id = "send2")
	private WebElement SignInButton;
	
	@FindBy(xpath = "//div[contains(@class,'panel header')]//span[contains(text(),'Welcome,')]")
	private WebElement WelcomeName;
	
	@FindBy(linkText = "Sign In")
	private WebElement signInClick;
	
	public void clickSignIn() {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
//		Logs.logger.info( "Click on "+ new Object(){}.getClass().getEnclosingMethod().getName()+" Successfully ");
		signInClick.click();
		
	}
	
	public void Login(String email,String password)
	{
		Email.click();
		Email.sendKeys(email);
		Password.click();
		Password.sendKeys(password);
		SignInButton.click();

	}
	public void clickEmail(String email) {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
//		Logs.logger.info( "Click on "+ new Object(){}.getClass().getEnclosingMethod().getName()+" Successfully ");
		Email.click();
		Email.sendKeys(email);
		
	}
	public void clickPass(String password) {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
//		Logs.logger.info( "Click on "+ new Object(){}.getClass().getEnclosingMethod().getName()+" Successfully ");
		Password.click();
		Password.sendKeys(password);
		
	}
	public void clickSignInButton() {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
		Logs.logger.info( "Click on "+ new Object(){}.getClass().getEnclosingMethod().getName()+" Successfully ");
		SignInButton.click();
		
	}
	public boolean checkIfWelcomeShown() {
		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
//		Logs.logg/er.info( "Click on "+ new Object(){}.getClass().getEnclosingMethod().getName()+" Successfully ");
		return WelcomeName.isDisplayed();
		
	}

}
