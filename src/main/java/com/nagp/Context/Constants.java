package com.nagp.Context;

/**
 * The Class is for Constants.
 *
 * @author Bharathish
 */
public class Constants {
	
	

	/** The Constant WORKING_DIRECTORY. */
	public static final String WORKING_DIRECTORY = System.getProperty("user.dir");

	/** The Constant REPORT_DIRECTORY. */
	public final static String REPORT_DIRECTORY = WORKING_DIRECTORY + "/ExtentReports/extentReport.html";

	/** The Constant PROJECT_NAME. */
	public final static String PROJECT_NAME = "TanuGupta_3183491_SeleniumAutomation";


	public final static String LOG_PROPERTIES_PATH = WORKING_DIRECTORY + "/src/test/resources/log4j.properties";

	public final static String EXCEL_SHEET = WORKING_DIRECTORY + "/src/test/resources/TestData.xlsx";
	
	public final static String CONFIG_PROP = WORKING_DIRECTORY + "/src/test/resources/config.properties";


	}
