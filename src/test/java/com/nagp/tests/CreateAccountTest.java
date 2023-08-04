package com.nagp.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.nagp.Pages.CreateAccountPage;
import com.nagp.Pages.HomePage;

public class CreateAccountTest extends BaseTest {

	Faker faker = new Faker();
	CreateAccountPage signUp;

	public CreateAccountTest() {
		super();
	}

	public WebDriver driver;

	@BeforeMethod
	public void setup() {

		driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browser"));
		HomePage homePage = new HomePage(driver);
		signUp = homePage.clickCreateAccount();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

	@Test(priority = 1, testName = "Create Account test", description = "Create New Account using Faker Details")
	public void createAccountTest() {
		logger.info(new Object() {
		}.getClass().getEnclosingMethod().getName() + "  start ");
		String pass = faker.internet().password(10, 19, true, true);
		signUp.firstNameclick(faker.name().firstName());
		signUp.lastNameclick(faker.name().lastName());
		signUp.emailclick(faker.internet().emailAddress());
		signUp.passwordclick(pass);
		signUp.confirmPasswordclick(pass);
		signUp.createAccountButtonclick();
		Assert.assertTrue(signUp.isMyAccountDisplayed());
		logger.info(new Object() {
		}.getClass().getEnclosingMethod().getName() + "  start ");
	}

}
