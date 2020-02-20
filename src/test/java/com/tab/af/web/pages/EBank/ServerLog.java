package com.tab.af.web.pages.EBank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.tab.af.web.pages.BasePage;

public class ServerLog extends BasePage {
	
	
	public ServerLog() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Search']")
	private WebElement btn_Search;
	
	@FindBy(xpath = "//div[text()='Users']//following::span[1]")
	private WebElement btn_CloseUsersTab;
	
	@FindBy(xpath = "//div[text()='Server Log']")
	private WebElement lbl_ServerLog;
	
	@FindBy(xpath = "//div[text()='Local Node']")
	private WebElement txt_LocalNode;
	
	@FindBy(xpath = "//div[text()='JMX Connection']//following::input[1]")
	private WebElement txt_JMXConnection;
	
	@FindBy(xpath = "//div[text()='View']")
	private WebElement lnk_View;
	
	@FindBy(xpath = "//div[text()='Options']")
	private WebElement lnk_Options;
	
	@FindBy(xpath = "//div[text()='Log File']//following::input[1]")
	private WebElement txt_LogFile;
	
	@FindBy(xpath = "//span[text()='Download']")
	private WebElement btn_DownLoad;
	
	@FindBy(xpath = "//span[text()='Show Tail']")
	private WebElement btn_ShowTail;
	
	@FindBy(xpath = "//div[text()='Logger']//following::input[1]")
	private WebElement txt_Logger;
	
	@FindBy(xpath = "//div[text()='Appender']//following::input[1]")
	private WebElement txt_Appender;
	
	@FindBy(xpath = "//div[text()='Level']//following::input[1]")
	private WebElement txt_Level;
	
	@FindBy(xpath = "//div[text()='Threshold']//following::input[1]")
	private WebElement txt_Threshold;
	
	@FindBy(xpath = "//span[text()='Control']")
	private WebElement btn_Control;
	
	@FindBy(xpath = "//label[text()='Auto Refresh']//preceding::input[1]")
	private WebElement chk_AutoRefresh;

	public void verifyOptionsServerLogPage() {
		try {
			webActions.waitUntilPresentAndDisplayed(txt_LogFile, "Log file field");
			Assert.assertEquals(true,  txt_LocalNode.isDisplayed());
			Assert.assertEquals(true,  txt_JMXConnection.isDisplayed());
			Assert.assertEquals(true,  lnk_View.isDisplayed());
			Assert.assertEquals(true,  lnk_Options.isDisplayed());
			report.reportPass("All Options Displayed from server log default page");

		} catch (Exception e) {
			report.reportHardFail(e,"Failed to verify all the options from server log default page");
		}
	}

	public void toggle() {
		try {
			webActions.clickBYJS(lnk_Options, "Options tab");
			webActions.waitUntilPresentAndDisplayed(txt_Logger, "Logger field");
			Assert.assertEquals(true,  txt_Logger.isDisplayed());
			webActions.clickBYJS(lnk_View, "View tab");
			webActions.waitUntilPresentAndDisplayed(txt_LogFile, "Log file field");
			Assert.assertEquals(true,  txt_LogFile.isDisplayed());
			report.reportPass("All Options Displayed from view and options tabs");

		} catch (Exception e) {
			report.reportHardFail(e,"Failed to verify all the options from view and options tabs");
		}
	}

	

	public void verifyOptionsTabOptions() {
		try {
			webActions.clickBYJS(lnk_Options, "Options tab");
			webActions.waitUntilPresentAndDisplayed(txt_Logger, "Logger field");
			Assert.assertEquals(true,  txt_Logger.isDisplayed());
			Assert.assertEquals(true,  txt_Appender.isDisplayed());
			Assert.assertEquals(true,  txt_Level.isDisplayed());
			Assert.assertEquals(true,  txt_Threshold.isDisplayed());
			Assert.assertEquals(true,  btn_Control.isDisplayed());
			report.reportPass("All Options Displayed from options tabs");

		} catch (Exception e) {
			report.reportHardFail(e,"Failed to verify all the options from options tab");
		}
	}
	public void verifyViewOptions() {
		try {
			webActions.clickBYJS(lnk_View, "View tab");
			webActions.waitUntilPresentAndDisplayed(txt_LogFile, "Log file field");
			Assert.assertEquals(true,  txt_LogFile.isDisplayed());
			Assert.assertEquals(true,  btn_ShowTail.isDisplayed());
			Assert.assertEquals(true,  btn_DownLoad.isDisplayed());
			Assert.assertEquals(true,  chk_AutoRefresh.isDisplayed());
			report.reportPass("All Options Displayed from View tab");

		} catch (Exception e) {
			report.reportHardFail(e,"Failed to verify all the options from View tab");
		}
	}

	public void downLoadLog(String format) {
		try {
			webActions.sendKeysByChar(txt_LogFile, format, "Download file format");
			webActions.clickBYJS(btn_DownLoad, "Download");
			report.reportPass("Log File downloaded succeefully");

		} catch (Exception e) {
			report.reportHardFail(e,"Failed to Download log file");
		}	
	}

	@Override
	protected ExpectedCondition getPageLoadCondition() {
		// TODO Auto-generated method stub
		return ExpectedConditions.visibilityOf(lbl_ServerLog);
	}


}
