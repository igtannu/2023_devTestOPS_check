package com.nagp.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartAndCheckOutPage {
	WebDriver driver;
	public AddToCartAndCheckOutPage(WebDriver driver)  {
this.driver=driver;
PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@FindBy(xpath = "//div[contains(@class,'size')]//div[contains(text(),'30')]")
	private WebElement selectSize;
	@FindBy(xpath = "//div[contains(@class,'color')]//div//div[2]")
	private WebElement color;
	@FindBy(id = "qty")
	private WebElement qty;
	@FindBy(id = "product-addtocart-button")
	private WebElement addToCart;
	@FindBy(xpath = "//div[contains(@class,'minicart-wrapper')]")
	private WebElement cart;
	@FindBy(xpath = "//button[contains(text(),'Proceed to Checkout')]")
	private WebElement proceedToCheckOut;
	@FindBy(xpath = " //div[@name='shippingAddress.street.0']//input")
	private WebElement street;
	@FindBy(name = "city")
	private WebElement city;
	
	@FindBy(xpath = "//select[@name='region_id']")
	private WebElement region;
	
	@FindBy(name = "postcode")
	private WebElement postCode;
	@FindBy(name = "country_id")
	private WebElement country;
	@FindBy(name = "telephone")
	private WebElement mobileNo;
	@FindBy(xpath="//span[contains(text(),'Next')]")
	private WebElement next;
	@FindBy(xpath="//span[contains(text(),'Place Order')]")
	private WebElement placeOrder;
	@FindBy(xpath="//span[contains(text(),'	Thank you for your purchase!')]")
	private WebElement thanks;
	@FindBy(xpath="//div[@id='checkout-shipping-method-load']//tbody/tr[1]/td[1]")
	private WebElement shippingMethod;

	
	public void clickSize() {
		selectSize.click();
	}
	public void clickColor() throws InterruptedException {
		Thread.sleep(200);
		color.click();
		Thread.sleep(200);

	}
	public void clickQty(String qtys) {
		qty.click();
		qty.clear();
		qty.sendKeys(qtys);
	}
	public void clickAddToCart() {
		addToCart.click();
	}
	public void clickCart() {
		System.out.println("###############################");
		
	cart.click();
	}
	public void clickProceedTo() {
		proceedToCheckOut.click();
	}
	
	public void clickstreet(String streetname) {
//		region.click();
		street.click();
		street.sendKeys(streetname);
	}

	public void clickcity(String City) {
		city.click();
		city.sendKeys(City);
		
	}
	public void clickregion(String region_id) throws InterruptedException {
		Thread.sleep(200);
		region.click();
		Thread.sleep(200);
		region.sendKeys(region_id);
		
	}
	public void clickpostCode(String postno) {
		postCode.click();
		postCode.sendKeys(postno);
		
	}
	public void countryclick(String countryno) throws InterruptedException {
		Thread.sleep(300);
		country.click();
		Thread.sleep(300);

		country.sendKeys(countryno);
	}
	public void mobileNoclick(String mob) {
		mobileNo.click();
		mobileNo.sendKeys(mob);
	}
	public void shiipingMethodClick() {
		 shippingMethod.click();
	}

	public void nextclick() throws InterruptedException {
		Thread.sleep(300);
		next.click();
	}
	public boolean isPlaceOrder() throws InterruptedException {
		Thread.sleep(300);
		return placeOrder.isDisplayed();
	}


}
