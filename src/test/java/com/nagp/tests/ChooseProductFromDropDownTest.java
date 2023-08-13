package com.nagp.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nagp.Pages.AddToCartAndCheckOutPage;
import com.nagp.Pages.ChooseProductFromDropDownPage;
import com.nagp.Pages.HomePage;
import com.nagp.Pages.SignInPage;
import com.nagp.Pages.WhatsNewPage;

public class ChooseProductFromDropDownTest extends BaseTest {

	AddToCartAndCheckOutPage addToCart;
	SignInPage signIn;
	ChooseProductFromDropDownPage drpdwn;
	WhatsNewPage whtasnew;

	public ChooseProductFromDropDownTest() {
		super();
	}

	public WebDriver driver;

	@BeforeMethod
	public void setup() {

		driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browser"));
		HomePage homePage = new HomePage(driver);
		signIn = new SignInPage(driver);
		whtasnew = new WhatsNewPage(driver);
		addToCart = new AddToCartAndCheckOutPage(driver);
		drpdwn = homePage.naviageToHomeinPage();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

	@Test(priority = 1, testName = "Choose Product from drop down Test", 
			description = "Choose Product from inhereted dropdowns",groups = "Sanity")
	public void ChoosePro() throws InterruptedException {
		logger.info(new Object() {
		}.getClass().getEnclosingMethod().getName() + "  start ");
		System.out.println(new Object() {
		}.getClass().getEnclosingMethod().getName());
		drpdwn.womenclick();
		drpdwn.sizeChoose();
		Thread.sleep(400);
		logger.info(new Object() {
		}.getClass().getEnclosingMethod().getName() + "  ends ");

	}
}
