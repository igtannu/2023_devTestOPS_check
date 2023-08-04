package com.nagp.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nagp.Pages.HomePage;
import com.nagp.Pages.WhatsNewPage;

public class WhatsNewTest extends BaseTest {
	WhatsNewPage whtasnew;

	public WhatsNewTest() {
		super();
	}

	public WebDriver driver;

	@BeforeMethod
	public void setup() {

		driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browser"));
		HomePage homePage = new HomePage(driver);
		whtasnew = homePage.navigateToWhatsNew();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

	@Test(priority = 1, testName = "Whsta nww wtest", description = "Create New Account using Faker Details", groups = "Sanity")
	public void WhatsNewProductTest() {
		logger.info(new Object() {
		}.getClass().getEnclosingMethod().getName() + "  start ");
		whtasnew.clickShopEco();
		whtasnew.clickProduct();
		Assert.assertTrue(whtasnew.isProductImageOpen());

	}

}
