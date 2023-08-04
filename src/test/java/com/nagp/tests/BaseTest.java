package com.nagp.tests;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.nagp.Context.Constants;
import com.nagp.Utils.Logs.Logs;
import com.nagp.Utils.Logs.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;
	public Properties prop;
	public Properties dataProp;
	public static Logger logger;

	static {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh-mm-yy");
		System.setProperty("current.date", dateFormat.format(new Date()));
	}

	public BaseTest() {

		prop = new Properties();
		File propFile = new File(Constants.CONFIG_PROP);
		logger = Logs.logSetup();
//		dataProp = new Properties();
//		File dataPropFile = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\tutorialsninja\\qa\\testdata\\testdata.properties");

//		try {
//			FileInputStream dataFis = new FileInputStream(dataPropFile);
//			dataProp.load(dataFis);
//		}catch(Throwable e) {
//			e.printStackTrace();
//		}
//		
		try {
			FileInputStream fis = new FileInputStream(propFile);
			prop.load(fis);
		} catch (Throwable e) {
			e.printStackTrace();
		}

	}

//	@BeforeClass
//	public void logsetup() {
//		logger = Logger.getLogger("Logger_file");
//		PropertyConfigurator.configure(Constants.LOG_PROPERTIES_PATH);
////		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-YY hh_mm_ss");
////	    System.setProperty("current.date", dateFormat.format(new Date()));
//		logger.info( new Object(){}.getClass().getEnclosingMethod().getName());
//	}
////	
//	@BeforeMethod
//	public void set() {
//		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-YY hh_mm_ss");
//	    System.setProperty("current.date", dateFormat.format(new Date()));
//	}

	public WebDriver initializeBrowserAndOpenApplicationURL(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-infobars");
			options.setExperimentalOption("prefs", chromePrefs);
			options.addArguments("--remote-allow-origins=*");
			try {
				driver = new ChromeDriver(options);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			EdgeOptions op = new EdgeOptions();
			WebDriverManager.edgedriver().setup();
			op.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver(op);
		} else {
			System.out.println("Please pass the correct browser value : " + browser);
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utilities.PAGE_LOAD_TIME));
		driver.get(prop.getProperty("url"));
		logger.info(new Object() {
		}.getClass().getEnclosingMethod().getName() + "  Ends ");

		return driver;

	}

}