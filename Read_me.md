# SELENIUM AUTOMATION FRAMEWORK 
## Overview

#For Site
##[Software Testing Board](https://magento.softwaretestingboard.com/)

## What's in this repository? 
This repository contains a Test Suite written in Java that runs a few simple tests on . To run the tests successfully you'll need have the .apk  file of  app.You will get result in Extent Report.

## Requirements 
**Emulator should be opened  and contain Api-Demo.apk**
- Browser : Chrome,Edge,Firefox

## Tools & Technologies used
- TestNG
- Maven
- Java
- Selenium

## Packages Description
**Main** 
  - com.nagp.Context : for Constants paths
  - com.nagp.Pages: Have POM's for all tests
  - com.nagp.Utils.ConfigReader : For Config Reader
  - com.nagp.Utils.Listerners : For Lisetners
  - com.nagp.Utils.Logs: For Utils related to Logs
  - com.nagp.Utils.Reports : For utils related to Reports
 
**Test**
- AddToCartAndCheckOutTest : After Login product add to cart and then checkout happens 
- ChooseProductFromDropDownTest : Choose Products iterare from dropdown available at navBar
- CreateAccountTest : Test for Create new Account all details taken from faker
- ReadAndWriteReviewsForProductTest : Test for Read and Write Reviews
- SearchAndAddToWishListTest : Test for Search of product then add to WishList
- SignInTest : Test for LogIn functionality with data provided by @DataProvider with valid and Invalid                  fuctionality
- WhatsNewTest : Test for Whsta'New option availble on Site

 **In POM's and Test the respective of feature Files Functions are define**

### Other files description
- Appium_server.java  : To start  and stop Appium Server 
- ExcelReader.java : To read XLS File '
- extent.properties : To format Extent Report
- log4j.properties : To make Log File

## Important Directory and Resources
- bat : .cmd_Run.bat
- extent.properties : ./resources/extent.properties
- log4j.properties : ./resources/log4j.properties 
- Trial.xlsx : ./resources/Trial.xlsx
- Extent_Report : ./ExtentReports/ExtentReport.html
- Failed_screenshots : ./FailedScreenshots/.....
- Logs(application.html) : logs/application.html

## Running the tests

To run your tests simply you need to  execute :
 - testNg.xml file 
 - cmd.bat file

```
mvn test -DsuiteXmlFile=testng.xml
```