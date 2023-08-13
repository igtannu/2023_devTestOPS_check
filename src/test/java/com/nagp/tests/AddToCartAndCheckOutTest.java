package com.nagp.tests;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.nagp.Context.Constants;
import com.nagp.Pages.AddToCartAndCheckOutPage;
import com.nagp.Pages.HomePage;
import com.nagp.Pages.SignInPage;
import com.nagp.Pages.WhatsNewPage;
import com.nagp.Utils.ConfigReader.ExcelReader;

public class AddToCartAndCheckOutTest extends BaseTest {

	AddToCartAndCheckOutPage addToCart;
	SignInPage signIn;
	WhatsNewPage whtasnew;

	public AddToCartAndCheckOutTest() {
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

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

	@DataProvider(name = "validCredentialsLogin")
	public Object[][] validTestData() {
		Object[][] data = ExcelReader.getTestDataFromExcel("ValidLogin");
		return data;
	}

	@Test(priority = 1, dataProvider = "validCredentialsLogin", testName = "Add To Cart CheckOut Test", 
			description = "Test Add to cart Fuctionality with checkOut",groups = "Sanity")
	public void AddToCartCheckOut(String Email, String Password)
			throws InterruptedException, InvalidFormatException, IOException {
		logger.info(new Object() {
		}.getClass().getEnclosingMethod().getName() + "  start ");
		System.out.println(new Object() {
		}.getClass().getEnclosingMethod().getName());
		signIn.clickSignIn();
		signIn.Login(Email, Password);
		whtasnew.clickwhtsnew();
		addToCart.clickSize();
		addToCart.clickColor();
		addToCart.clickQty("3");
		addToCart.clickAddToCart();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		Thread.sleep(300);
		addToCart.clickCart();

		addToCart.clickProceedTo();
		Thread.sleep(500);
		List<Map<String, String>> testData = ExcelReader.getData(Constants.EXCEL_SHEET, "Address");
		addToCart.clickstreet(testData.get(0).get("Street"));
		addToCart.clickcity(testData.get(0).get("City"));
		addToCart.clickregion(testData.get(0).get("Region"));
		addToCart.clickpostCode(testData.get(0).get("Postcode"));
		addToCart.countryclick(testData.get(0).get("Country"));
		addToCart.mobileNoclick(testData.get(0).get("MobileNo"));
		addToCart.shiipingMethodClick();
		addToCart.nextclick();
		addToCart.isPlaceOrder();
		logger.info(new Object() {
		}.getClass().getEnclosingMethod().getName() + "  start ");

	}

}
