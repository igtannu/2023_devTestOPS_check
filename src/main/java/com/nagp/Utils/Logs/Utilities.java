package com.nagp.Utils.Logs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.nagp.Context.Constants;

public class Utilities {
	
	public static final int IMPLICIT_WAIT_TIME=80;
	public static final int PAGE_LOAD_TIME=20;
		
public static String captureScreenshot(WebDriver driver,String testName) {
				
		String screenshotPath = System.getProperty("user.dir")+"/FailedScreenshots/"+testName+".jpg";
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile, new File(screenshotPath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		 return screenshotPath ;
		}
	
}
