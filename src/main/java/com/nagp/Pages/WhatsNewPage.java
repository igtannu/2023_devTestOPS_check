package com.nagp.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhatsNewPage {

	
	WebDriver driver;
	
	public WhatsNewPage(WebDriver driver)  {
this.driver=driver;
PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a//span[contains(text(),\"What's New\")]")
	private WebElement whatsNew;
	
	@FindBy(xpath = "//span[contains(text(),'Shop Eco Friendly')]")
	private WebElement shopEco;
	
	@FindBy(xpath = "//div[contains(@class,'products-grid grid')]//li[3]")
	private WebElement product;
	
	@FindBy(xpath = "//div[contains(@class,'columns')]//div[contains(@class,'media')]")
	private WebElement isProductDisplay;
	
	public void clickwhtsnew() {
		whatsNew.click();
		shopEco.click();
		product.click();


	}
	public void clickShopEco() {
		shopEco.click();
	}
	public void clickProduct() {
		product.click();
	}
	
	public boolean isProductImageOpen() {
		return isProductDisplay.isDisplayed();
	}
	
}
