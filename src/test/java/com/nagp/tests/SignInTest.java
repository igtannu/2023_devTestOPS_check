//package com.nagp.tests;
//
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import com.nagp.Pages.CreateAccountPage;
//import com.nagp.Pages.HomePage;
//import com.nagp.Pages.SignInPage;
//import com.nagp.Utils.ConfigReader.ExcelReader;
//import com.nagp.Utils.Logs.Utilities;
//
//public class SignInTest extends BaseTest {
//	SignInPage signIn ;
//	public SignInTest() {
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
//		signIn = homePage.naviageToSigninPage();
//	}
//	@AfterMethod
//	public void tearDown() {
//		
//		driver.quit();
//		
//	}
//
//	@DataProvider(name="validCredentialsLogin")
//	public Object[][] validTestData() {
//		Object[][] data = ExcelReader.getTestDataFromExcel("ValidLogin");
//		return data;
//	}
//	
//	@DataProvider(name="invalidCredentialsLogin")
//	public Object[][] inValidTestData() {
//		Object[][] data = ExcelReader.getTestDataFromExcel("InvalidLogin");
//		return data;
//	}
//	
//	
//	@Test(priority=1,dataProvider="validCredentialsLogin",testName = "Sign In Valid test", 
//			description = "SignIn with valid test credentials",groups = "Sanity")
//	public void ValidLoginTest(String Email,String Password) {
//		logger.info( new Object(){}.getClass().getEnclosingMethod().getName()+"  start ");
//		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
//		signIn.clickEmail(Email);
//		signIn.clickPass(Password);
//		signIn.clickSignInButton();
//		Assert.assertTrue(signIn.checkIfWelcomeShown());
//		logger.info( new Object(){}.getClass().getEnclosingMethod().getName()+"  ends ");
//
//		}
//	
//	//This is test will fail as screenshot will attach on report
//	@Test(priority=2,dataProvider="invalidCredentialsLogin",testName = "Sign In Invalid test",
//			description = "SignIn with Invalid test credentials",groups = "Sanity")
//	public void InValidLoginTest(String Email,String Password) {
//		logger.info( new Object(){}.getClass().getEnclosingMethod().getName()+"  start ");
//		System.out.println(new Object(){}.getClass().getEnclosingMethod().getName());
//		driver.get(prop.getProperty("url"));
//		logger.info( new Object(){}.getClass().getEnclosingMethod().getName() +"   Start   ");
//		SignInPage signIn = new SignInPage(driver);
////		signIn.clickSignIn();
//		signIn.clickEmail(Email);
//		signIn.clickPass(Password);
//		signIn.clickSignInButton();
////		signIn.Login(Email, Password);
//
//		Assert.assertTrue(signIn.checkIfWelcomeShown());
//		logger.info( new Object(){}.getClass().getEnclosingMethod().getName()+"  ends ");
//
//		}
//
//}
