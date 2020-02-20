package com.tab.af.web.pages.EBank;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.tab.af.testbase.TestBase;
import com.tab.af.web.pages.BasePage;

public class BatchTransactionHistory extends BasePage {
    private final long fileDownloadTimeOut = Long.parseLong(TestBase.props.get("file.Download.Timeout").toString());
    @FindBy(xpath = "//span[text()='=']")
    private WebElement lbl_EqualsSearchCondition;
    @FindBy(xpath = "//span[text()=\"contains\" and @class=\"v-button-caption\"]")
    private WebElement btn_ContainsSearch;
    @FindBy(xpath = "//span[text()='Accounting']")
    private WebElement lbl_Accounting;
    @FindBy(xpath = "//span[text()='Journal Entry']")
    private WebElement lbl_JournalEntry;
    @FindBy(xpath = "//span[text()='Batch Transaction History']")
    private WebElement lbl_BatchTransactionHistory;
    @FindBy(xpath = "//span[text()='Add search condition']")
    private WebElement btn_AddSearchConditon;
    @FindBy(xpath = "//span[text()='Search']")
    private WebElement btn_Search;
    @FindBy(xpath = "//span[text()='Refresh']")
    private WebElement btn_Refresh;
    @FindBy(xpath = "//span[text()='Excel']")
    private WebElement btn_Excel;
    @FindBy(xpath = "//span[text()='=']//following::input[1]")
    private WebElement txt_SearchFilter;
    @FindBy(xpath = "//tr//td[4]")
    private List<WebElement> lbl_AccountList;
    @FindBy(xpath = "//div[text()='Batch Transaction History']")
    private WebElement lbl_BatchTransactionHistorytab;

    public void verifyOptions() {
	try {
	    webActions.waitUntilPresentAndDisplayed(btn_Search, "Search button");
	    webActions.assertDisplayed(btn_Search, "Search");
	    webActions.assertDisplayed(btn_Refresh, "Refresh");
	    webActions.assertDisplayed(btn_AddSearchConditon, "Add Search Condition");
	    webActions.assertDisplayed(btn_Excel, "Excel");
	    report.reportPass("All Options Displayed");
	} catch (Exception e) {
	    report.reportHardFail(e, "All Options Displayed");
	}
    }

    public void downloadExcel() {
	try {
	    webActions.waitAndCickBYJS(btn_Excel, "Export Excel");
	    // wait for download to complete
	    Thread.sleep(fileDownloadTimeOut);
	    if (!global.isFileDownloaded("Journal Item.xls")) {
		throw new Exception("Downlaod Failed");
	    }
	    report.reportPass("File Downloaded");
	} catch (Exception e) {
	    report.reportHardFail(e, "File Downloaded");
	}
    }

    public void validateSearch(String condition, String value) {
	try {
	    addSearchCondtion(condition, value);
	    webActions.waitForJSandJQueryToLoad();
	    Thread.sleep(5000);
	    for (WebElement ac : lbl_AccountList) {
		if (ac.getText() != "" && ac.getText().matches("-?\\d+(\\.\\d+)?")) {
		    if (!ac.getText().equals(value)) {
			throw new Exception("Assert Failed");
		    }
		}
	    }
	    report.reportPass("Validate Search");
	} catch (Exception e) {
	    report.reportHardFail(e, "Validate Search");
	}
    }

    public void addSearchCondtion(String conditionName, String value) {
	try {
	    webActions.clickBYJS(btn_AddSearchConditon, "Add Search condition");
	    WebElement element = webActions.findByText(conditionName, "//span[text()='Properties']//following::span");
	    webActions.doubleClick(element, conditionName);
	    webActions.waitAndCickBYJS(btn_ContainsSearch, "Contains Serach Button");
	    webActions.waitAndCickBYJS(lbl_EqualsSearchCondition, "= Search Condition");
	    webActions.waitAndSendKeysByChar(txt_SearchFilter, value, "Search filter Input");
	    webActions.clickBYJS(btn_Search, "Filter Search");
	    report.reportPass("Add Search Condtion:" + conditionName);
	} catch (Exception e) {
	    report.reportHardFail(e, "Add Search Condtion:" + conditionName);
	}
    }

    public void validateBatchTransactionHistoryOptions() {
	try {
	    webActions.assertDisplayed(btn_Search, "Search Button");
	    webActions.assertDisplayed(btn_AddSearchConditon, "Add Search Condtion Button");
	    webActions.assertDisplayed(btn_Refresh, "Refresh Button");
	    webActions.assertDisplayed(btn_Excel, "Excel Button");
	    report.reportPass("Validate Batch Transaction History Page Options");
	} catch (Exception e) {
	    report.reportHardFail(e, "Validate Batch Transaction History Page Options");
	}
    }

    @Override
    protected ExpectedCondition getPageLoadCondition() {
	// TODO Auto-generated method stub
	return ExpectedConditions.visibilityOf(lbl_BatchTransactionHistorytab);
    }
}