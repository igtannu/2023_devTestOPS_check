package com.nagp.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseProductFromDropDownPage {
	WebDriver driver;
	public ChooseProductFromDropDownPage(WebDriver driver)  {
this.driver=driver;
PageFactory.initElements(driver,this);

		// TODO Auto-generated constructor stub
	}
	
	
	
	@FindBy(xpath = "//nav//span[contains(text(),'Women')]")
	private WebElement Women;
	@FindBy(xpath = "//nav//span[contains(text(),'Tops')]")
	private WebElement Tops;
	@FindBy(xpath = "//nav//span[contains(text(),'Jackets')]")
	private WebElement Jackets;
	@FindBy(xpath = "//div[contains(text(),'Size')]")
	private WebElement Size;
	@FindBy(xpath = "//div[@class='filter-options-item allow active']//div[@option-label='L']")
	private WebElement SizeL;
	public void womenclick() {
//		Women.click();
		Actions action=new Actions(driver);

		action.moveToElement(Women).moveToElement(Tops).moveToElement(Jackets).click().perform();

	}
	public void sizeChoose() {
		Size.click();
		SizeL.click();
	}

}

