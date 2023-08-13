package com.nagp.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.nagp.Pages.ReadReviewsForProductPage;
import com.nagp.Pages.SignInPage;
import com.nagp.Pages.WhatsNewPage;
import com.nagp.Utils.ConfigReader.ExcelReader;

public class ReadAndWriteReviewsForProductTest extends BaseTest {

	WhatsNewPage whtasnew;
	ReadReviewsForProductPage review;
	SignInPage signIn;

	public ReadAndWriteReviewsForProductTest() {
		super();
	}

	public WebDriver driver;

	@BeforeMethod
	public void setup() {

		driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browser"));
//		HomePage homePage = new HomePage(driver);
		whtasnew = new WhatsNewPage(driver);
		signIn = new SignInPage(driver);
		review = new ReadReviewsForProductPage(driver);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

	@DataProvider(name = "writeReview")
	public Object[][] validTestta() {
		Object[][] data = ExcelReader.getTestDataFromExcel("WriteReview");
		return data;
	}

	@Test(priority = 1, testName = "Read Review Test", description = "Read Reviews Fucntionality", 
			groups ="Sanity" )
	public void ReadReviewTest() throws InterruptedException {
		logger.info(new Object() {
		}.getClass().getEnclosingMethod().getName() + "  start ");
		whtasnew.clickwhtsnew();
		Thread.sleep(300);
		review.clickReview();
		Assert.assertTrue(review.isCustomerReview());

	}

	@Test(priority = 2, dataProvider = "writeReview", testName = "Write Review Test", description = "Test Fuctionality For "
			+ "Write Review", groups = "Sanity")
	public void WriteReviewTest(String Name, String Summary, String Review) throws InterruptedException {
		logger.info(new Object() {
		}.getClass().getEnclosingMethod().getName() + "  start ");
		whtasnew.clickwhtsnew();
		Thread.sleep(300);
		review.AddReviewclick();
		Thread.sleep(900);
		review.startReviewclick();
		review.nicknameclick(Name);
		review.summaryclick(Summary);
		review.reviewclick(Review);
		review.submitreviewclick();
		Assert.assertTrue(review.isSubmitted());
		logger.info(new Object() {
		}.getClass().getEnclosingMethod().getName() + "  End ");

	}

}
