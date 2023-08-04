package com.nagp.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.javafaker.Faker;
import com.nagp.Utils.Logs.Logs;


public class CreateAccountPage{

	WebDriver driver;
	public CreateAccountPage(WebDriver driver)  {
this.driver=driver;
PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@FindBy(id = "firstname")
	private WebElement firstName;
	
	@FindBy(id = "lastname")
	private WebElement lastName;
	@FindBy(linkText = "Create an Account")
	private WebElement createAccount;	
	@FindBy(id = "email_address")
	private WebElement email;
	
	@FindBy(id = "password")
	private WebElement password; 
	
	@FindBy(id = "password-confirmation")
	private WebElement confirmPassword;
	
	@FindBy(xpath = "//span[contains(text(),'Create an Account')]")
	private WebElement createAccountButton;
	
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	private WebElement isMyAccountDisplayed;
	
//	public void CreateAccount(String fname,String lname,String mail,String pass) {
//		firstName.click();	
//		firstName.sendKeys(fname);
//		lastName.click();	
//		lastName.sendKeys(lname);
//		email.click();	
//		email.sendKeys(mail);
//		password.click();	
//		password.sendKeys(pass);
//		confirmPassword.click();	
//		confirmPassword.sendKeys(pass);
//		createAccountButton.click();	
//	}
	
	public CreateAccountPage clickCreateAccount() {
//		Logs.logger.info( "Click on "+ new Object(){}.getClass().getEnclosingMethod().getName()+" Successfully ");
			createAccount.click();
			return new CreateAccountPage(driver);
			
		}
	public void firstNameclick(String fname) {
		firstName.click();	
		firstName.sendKeys(fname);
//		Logs.logger.info( "C.lick on "+ new Object(){}.getClass().getEnclosingMethod().getName()+" Successfully ");

		
	}
	public void lastNameclick(String lname) {
		lastName.click();	
		lastName.sendKeys(lname);
//		Logs.logger.info( "Click on "+ new Object(){}.getClass().getEnclosingMethod().getName()+" Successfully ");



	}
	public void emailclick(String mail) {
		email.click();	
		email.sendKeys(mail);
//		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
//		Logs.logger.info( "Click on "+ new Object(){}.getClass().getEnclosingMethod().getName()+" Successfully ");


	}
	public void passwordclick(String pass) {
		password.click();	
		password.sendKeys(pass);
		
	}
	public void confirmPasswordclick(String pass) {
		confirmPassword.click();	
		confirmPassword.sendKeys(pass);
	}
	public void createAccountButtonclick() {
		createAccountButton.click();	
	}
	
	public boolean isMyAccountDisplayed() {
		return isMyAccountDisplayed.isDisplayed();
	}
}
