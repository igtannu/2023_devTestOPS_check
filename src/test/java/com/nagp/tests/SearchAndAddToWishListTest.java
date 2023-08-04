//package com.nagp.tests;
//
//import java.io.IOException;
//
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import com.nagp.Pages.AddToCartAndCheckOutPage;
//import com.nagp.Pages.HomePage;
//import com.nagp.Pages.SearchAndAddToWishListPage;
//import com.nagp.Pages.SignInPage;
//import com.nagp.Pages.WhatsNewPage;
//import com.nagp.Utils.ConfigReader.ExcelReader;
//
//public class SearchAndAddToWishListTest extends BaseTest {
//
//	AddToCartAndCheckOutPage addToCart;
//	SignInPage signIn;
//	WhatsNewPage whtasnew;
//	SearchAndAddToWishListPage addWish;
//
//	public SearchAndAddToWishListTest() {
//		super();
//	}
//
//	public WebDriver driver;
//
//	@BeforeMethod
//	public void setup() {
//
//		driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browser"));
//		HomePage homePage = new HomePage(driver);
//		signIn = new SignInPage(driver);
//		addWish = new SearchAndAddToWishListPage(driver);
//
//	}
//
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//
//	}
//
//	@DataProvider(name = "validCredentialsLogin")
//	public Object[][] validTestData() {
//		Object[][] data = ExcelReader.getTestDataFromExcel("ValidLogin");
//		return data;
//	}
//
//	@Test(priority = 1, dataProvider = "validCredentialsLogin", 
//			testName = "Search Product After Login AddToWishlist Test", 
//			description = "Search Product After Login AddToWishlist Test",groups = "Sanity")
//	public void SearchProductAfterLoginAddToWishlistTest(String Email, String Password)
//			throws InterruptedException, InvalidFormatException, IOException {
//		logger.info(new Object() {
//		}.getClass().getEnclosingMethod().getName() + "  start ");
//		signIn.clickSignIn();
//		signIn.Login(Email, Password);
//		Thread.sleep(500);
//		addWish.clickSearch("Pants");
//		addWish.clickprodu();
//		addWish.clickAddTo();
//		Assert.assertTrue(addWish.isMyWishList());
//		System.out.println(new Object() {
//		}.getClass().getEnclosingMethod().getName() + "  ends ");
//
//	}
//
//}
