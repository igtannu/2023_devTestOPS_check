package com.nagp.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchAndAddToWishListPage {
	WebDriver driver;
	public SearchAndAddToWishListPage(WebDriver driver)  {
this.driver=driver;
PageFactory.initElements(driver,this);

		// TODO Auto-generated constructor stub
	}
	
	
	
	
	@FindBy(id = "search")
	private WebElement search;
	
	@FindBy(xpath = "//div[contains(@class,'products-grid')]//li[3]")
	private WebElement choosePro;
	
	@FindBy(xpath = "//span[contains(text(),'Add to Wish List')]")
	private WebElement addToWishList;
	
	@FindBy(xpath = "//span[contains(text(),'My Wish List')]")
	private WebElement myWishList;
	
	public void clickSearch(String Product) {
		search.click();
		search.sendKeys(Product);
		search.sendKeys(Keys.ENTER);
	}
	public void clickprodu() {
		
		choosePro.click();
		
	}
public void clickAddTo() {
		
		addToWishList.click();
		
	}
public boolean isMyWishList() {
	return myWishList.isDisplayed();
}
}


