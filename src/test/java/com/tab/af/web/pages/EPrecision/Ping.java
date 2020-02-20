package com.tab.af.web.pages.EPrecision;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.tab.af.web.pages.BasePage;

import junit.framework.Assert;

public class Ping extends BasePage {
	@FindBy(xpath = "//div[text()='Connection Tests']")
	private WebElement lbl_ConnectionTests;
	@FindBy(xpath = "//span[text()='PING SONIC']")
	private WebElement btn_PingSonic;
	@FindBy(xpath = "//span[text()='Test Account Inquiry']")
	private WebElement btn_TestAccountInquiry;
	@FindBy(xpath = "//span[text()='Test Accrual Date']")
	private WebElement btn_TestAccrualDate; 
	@FindBy(xpath = "//span[text()='Direct Query Precision']")
	private WebElement btn_DirectQueryPrecision; 
	@FindBy(xpath = "//h1[contains(text(),'Sonic System is UP : ')]")
	private WebElement lbl_SonicPingSystemUpMessage; 
	
	@FindBy(xpath = "//h1[contains(text(),'Sonic inquiry count')]")
	private WebElement lbl_SonicEnquiryMessage; 
	
	@FindBy(xpath = "//h1[contains(text(),'accrual date')]")
	private WebElement lbl_AccrualDateMessage; 
	
	@FindBy(xpath = "//h1[contains(text(),'testPrecision Called,')]")
	private WebElement lbl_TestPrecisionMessage; 
	 
	
	@Override
	protected ExpectedCondition getPageLoadCondition() {
		// TODO Auto-generated method stub
		return ExpectedConditions.visibilityOf(lbl_ConnectionTests);
	}

	public void validateOptions() {
		try {

			Assert.assertEquals(true, btn_PingSonic.isDisplayed());
			Assert.assertEquals(true, btn_TestAccountInquiry.isDisplayed());
			Assert.assertEquals(true, btn_TestAccrualDate.isDisplayed());
			Assert.assertEquals(true, btn_DirectQueryPrecision.isDisplayed());
			report.reportPass("Validate Ping Options");
		} catch (Exception e) {
			report.reportHardFail(e,"Validate Ping Options");
		}
	}

	public void clickPingSonicButton() {
		try {

			webActions.waitAndCickBYJS(btn_PingSonic, "Ping Sonic"); 
			report.reportPass("Click Ping Sonic");
		} catch (Exception e) {
			report.reportHardFail(e,"Click Ping Sonic");
		}
	}
	
	public void clickTestAccountInquiryButton() {
		try {

			webActions.waitAndCickBYJS(btn_TestAccountInquiry, "Test account enquiry"); 
			report.reportPass("Clicked on Test account enquiry button successfully");
		} catch (Exception e) {
			report.reportHardFail(e,"Faile to click on Test account enquiry button");
		}
	}
	
	
	
	public void validateSonicPingSystemUpMessage()
	{
		try {

			webActions.waitUntilPresentAndDisplayed(lbl_SonicPingSystemUpMessage, "Sonic Ping System Up Message") ;
			report.reportPass("Sonic Ping Test Success");
		} catch (Exception e) {
			report.reportHardFail(e,"Sonic Ping Test Success");
		}
	}
	
	public void validateSonicEnquiryMessage()
	{
		try {

			webActions.waitUntilPresentAndDisplayed(lbl_SonicEnquiryMessage, "Sonic inquiry count 1") ;
			report.reportPass("Sonic inquiry message verified successfully Test Success");
		} catch (Exception e) {
			report.reportHardFail(e,"Sonic inquiry message verification failed");
		}
	}
	
	public void clickTestAccurateDateButton() {
		try {

			webActions.waitAndCickBYJS(btn_TestAccrualDate, "Test account enquiry"); 
			report.reportPass("Clicked on Test Accrual button successfully");
		} catch (Exception e) {
			report.reportHardFail(e,"Faile to click on Test accrual date button");
		}
	}
	
	public void validateTestAccurateMessage()
	{
		try {

			webActions.waitUntilPresentAndDisplayed(lbl_AccrualDateMessage, "Test Accrual date") ;
			report.reportPass("Test accrual date message verified successfully Test Success");
		} catch (Exception e) {
			report.reportHardFail(e,"Test Accrual date message verification failed");
		}
	}
	
	public void clickDirectQueryPrecisionButton() {
		try {

			webActions.waitAndCickBYJS(btn_DirectQueryPrecision, "Direct Query Precision"); 
			report.reportPass("Clicked on DirectQueryPrecision button successfully");
		} catch (Exception e) {
			report.reportHardFail(e,"Faile to click on DirectQueryPrecision button");
		}
	}
	
	public void validateDirectQueryPrecisionMessage()
	{
		try {

			webActions.waitUntilPresentAndDisplayed(lbl_TestPrecisionMessage, "Test Precision Called") ;
			report.reportPass("test Precision Called message verified successfully Test Success");
		} catch (Exception e) {
			report.reportHardFail(e,"TestPrecision Called message verification failed");
		}
	}
	
	
	
	
	
}
