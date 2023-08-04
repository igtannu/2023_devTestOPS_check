package com.nagp.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReadReviewsForProductPage {
	WebDriver driver;
	public ReadReviewsForProductPage(WebDriver driver)  {
this.driver=driver;
PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@FindBy(xpath = "//span[text()='Reviews']")
	private WebElement reviews;
	@FindBy(xpath = "//div//strong[text()='Customer Reviews']")
	private WebElement customerReview;
	@FindBy(xpath = "//a[text()='Add Your Review']")
	private WebElement AddReview;
	@FindBy(xpath = "//label[@id='Rating_4_label']")
	private WebElement starReview;
	@FindBy(id = "nickname_field")
	private WebElement nickname;
	@FindBy(id = "summary_field")
	private WebElement summary;
	@FindBy(id = "review_field")
	private WebElement review;
	@FindBy(xpath = "//span[text()='Submit Review']")
	private WebElement submitreview;
	@FindBy(xpath = "//div[text()='You submitted your review for moderation.']")
	private WebElement yousubmit;
	public void clickReview() {
		reviews.click();

	}
	public void AddReviewclick() {
		AddReview.click();

	}
	public void startReviewclick() {
		Actions action=new Actions(driver);
		action.moveToElement(starReview).click().perform();;
//		starReview.click();

	}
	public void nicknameclick(String name) {
		nickname.click();
		nickname.sendKeys(name);
		

	}
	public void summaryclick(String sum) {
		summary.click();
		summary.sendKeys(sum);
		

	}public void reviewclick(String reviews) {
		review.click();
		review.sendKeys(reviews);

	}
	public void submitreviewclick() {
		submitreview.click();

	}
	public boolean isSubmitted() {
		return yousubmit.isDisplayed();

	}
	public boolean isCustomerReview() {
		return customerReview.isDisplayed();

	}
}
