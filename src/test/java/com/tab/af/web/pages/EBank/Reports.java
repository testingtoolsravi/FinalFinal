package com.tab.af.web.pages.EBank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.tab.af.web.pages.BasePage;

public class Reports extends BasePage {
	
	
	public Reports() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@class='v-tabsheet-caption-close']")
	private WebElement btn_CloseTab;
	
	public void closePage() {
		try {
			webActions.clickBYJS(btn_CloseTab, "Close button");
			report.reportPass("Page closed succeefully");
		}catch(Exception e) {
			report.reportHardFail(e,"Failed to Close page");
		}
	}

	@Override
	protected ExpectedCondition getPageLoadCondition() {
		// TODO Auto-generated method stub
		return ExpectedConditions.visibilityOf(btn_CloseTab);
	}

}
