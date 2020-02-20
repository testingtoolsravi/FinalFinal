package com.tab.af.web.pages.OnBoarding;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.tab.af.testbase.TestBase;
import com.tab.af.web.pages.BasePage;

public class Commons extends BasePage {
    @FindBy(xpath = "//span[text()='Close']")
    private WebElement btn_Close;
    @FindBy(xpath = "//body")
    private WebElement page;
    @FindBy(xpath = "//span[text()='Add search condition']")
    private WebElement btn_AddSearchCondition;
    @FindBy(xpath = "//div[text()='Add condition']")
    private WebElement lbl_AddCondition;
    @FindBy(xpath = "//span[text()='View']/..//parent::div[@role=\"button\"]")
    private WebElement btn_View;
    @FindBy(xpath = "//span[text()='=']//following::input[1]")
    private WebElement txt_SearchFilter;
    @FindBy(xpath = "//span[text()='Search']")
    private WebElement btn_Search;
    @FindBy(xpath = "//span[text()='Select']//..//parent::div")
    private WebElement btn_SelectAccessGroup;
    @FindBy(xpath = "//div[text()='Application Task']")
    private WebElement lbl_ApplicationTask;
    @FindBy(xpath = "//div[text()='OLD_TAB Bank']")
    private WebElement lbl_OlbTabBank;
    @FindBy(xpath = "//div[text()='Access Groups']")
    private WebElement lbl_AccessGroups;
    @FindBy(xpath = "(//div[@cuba-id=\"groupsTable\"]//tr[contains(@class,'table-row')]//td)[1]")
    private WebElement lst_AccessGroupsRow1;
    @FindBy(xpath = "//div[@cuba-id=\"groupsTable\"]//tr[contains(@class,'table-row')]//td")
    private List<WebElement> lst_AccessGroups;
    @FindBy(xpath = "//div[text()='TAB Bank']")
    private WebElement lbl_TabBank;
    @FindBy(xpath = "//span[text()='Assigned groups']//following::span[text()='Add']")
    private WebElement btn_AddGroups;
    @FindBy(xpath = "//div[@role=\"button\"]//following::span[text()='OK' or text()='Ok']")
    private WebElement btn_OK;
    @FindBy(xpath = "//div[@role=\"button\"]//following::span[text()='Yes']")
    private WebElement btn_DialogYes;
    @FindBy(xpath = "//span[text()='Perform']/..//parent::div")
    private WebElement btn_Perform;
    @FindBy(xpath = "//span[text()='Begin Work']//..//parent::div")
    private WebElement btn_BeginWork;
    @FindBy(xpath = "(//div[text()='State']//following::input[@type=\"text\"])[1]")
    private WebElement txt_TaskState;
    @FindBy(xpath = "//*[contains(text(),'Do you want to return to the application editor')]")
    private WebElement lbl_ReturnToTask;
    @FindBy(xpath = "//div[contains(text(),'Application Editor')]")
    private WebElement lbl_ApplicationEditor;
    @FindBy(xpath = "//span[text()='Begin Review']//..//parent::div")
    private WebElement btn_BeginReview;
    @FindBy(xpath = "//span[contains(text(),'Continue Work')]")
    private WebElement btn_ContinueWork;
    @FindBy(xpath = "//span[text()='Deny']//..//parent::div")
    private WebElement btn_Deny;
    @FindBy(xpath = "//span[text()='On Hold' or text()='On hold']//..//parent::div")
    private WebElement btn_OnHold;
    @FindBy(xpath = "//span[text()='Decline']//..//parent::div")
    private WebElement btn_Decline;
    @FindBy(xpath = "//span[text()='Save']")
    private WebElement btn_Save;

    public Commons() {
	PageFactory.initElements(driver, this);
    }

    public void selectTask(WebElement element, String elementName) throws Exception {
	webActions.waitUntilPresentAndDisplayed(element, elementName);
	webActions.scrollIntoViewByJS(element, elementName);
	webActions.doubleClick(element, elementName);
    }

    public void focusTask(WebElement element, String elementName) throws Exception {
	webActions.waitUntilPresentAndDisplayed(element, elementName);
	webActions.scrollIntoViewByJS(element, elementName);
	webActions.clickAction(element, elementName);
	webActions.waitUntilEnabledCubaTBox(btn_View, "View");
    }

    public void clickPerformButton() throws Exception {
	webActions.waitUntilEnabledAndCickBYJS(btn_Perform, "Perform Button");
    }

    public void clickDenyTask() throws Exception {
	webActions.waitAndCickBYJS(btn_Deny, "Deny");
    }

    public void clickDeclineTask() throws Exception {
	webActions.waitAndCickBYJS(btn_Decline, "Decline");
    }

    public void clickOnHoldTask() throws Exception {
	webActions.waitAndCickBYJS(btn_OnHold, "on Hold");
    }

    public void waitForTaskStateToBeInProgress() {
	webActions.waitForTextToBePresentInValue(txt_TaskState, "In progress", "Task State");
    }

    public void performAndBeginWork() throws Exception {
	clickPerformButton();
	webActions.waitAndCickBYJS(btn_BeginWork, "Begin Work");
	waitForTaskStateToBeInProgress();
    }

    public void performAndBeginReview() throws Exception {
	clickPerformButton();
	webActions.waitAndCickBYJS(btn_BeginReview, "Begin Review");
	waitForTaskStateToBeInProgress();
    }

    public void performAndContinueWork() throws Exception {
	clickPerformButton();
	webActions.waitAndCickBYJS(btn_ContinueWork, "Continue Work");
	waitForTaskStateToBeInProgress();
    }

    public void addSearchCondtionAndSearch(String conditionName, String value) throws Exception {
	try {
	    webActions.waitAndCickBYJS(btn_AddSearchCondition, "Add Search Condition");
	    webActions.waitUntilPresentAndDisplayed(lbl_AddCondition, "Add Condition");
	    WebElement element = webActions.findByText(conditionName, "//span");
	    webActions.doubleClick(element, conditionName);
	    webActions.waitUntilNotPresent(element, conditionName);
	    webActions.waitAndSendKeysByChar(txt_SearchFilter, value, "Search filter Input");
	    webActions.clickBYJS(btn_Search, "Filter Search");
	} catch (Exception e) {
	    System.out.print("");
	}
    }

    public void addAssignedGroup(WebElement task, String taskName) {
	try {
	    webActions.waitUntilPresent(task, taskName);
	    boolean assignGroup = true;
	    WebElement groups = task.findElement(By.xpath("following::td[6]"));
	    focusTask(groups, "Task Groups");
	    if (groups.getText().contains("OLD_TAB Bank") || groups.getText().contains("TAB Bank")) {
		assignGroup = false;
	    }
	    if (assignGroup) {
		selectTask(task, taskName);
		webActions.waitUntilPresentAndDisplayed(lbl_ApplicationTask, "Application Task");
		webActions.clickBYJS(btn_AddGroups, "Add Button");
		webActions.waitUntilPresentAndDisplayed(lst_AccessGroupsRow1, "Access Groups List Row 1");
		if (TestBase.props.getProperty("onboarding.env").equals("acpt")) {
		    addSearchCondtionAndSearch("Name", "TAB Bank");
		    webActions.waitUntilPresentAndDisplayed(lbl_TabBank, "TabBank");
		    webActions.doubleClick(lbl_TabBank, "TabBank");
		} else if (TestBase.props.getProperty("onboarding.env").equals("int")) {
		    int originalSize = lst_AccessGroups.size();
		    addSearchCondtionAndSearch("Name", "OLD_TAB Bank");
		    int iter = 10;
		    while (lst_AccessGroups.size() == originalSize && iter > 0) {
			Thread.sleep(1000);
			iter--;
		    }
		    webActions.waitUntilPresentAndDisplayed(lbl_OlbTabBank, "OLD TabBank");
		    webActions.clickAction(lbl_OlbTabBank, "OLD TabBank");
		    webActions.waitUntilEnabledAndCickBYJS(btn_SelectAccessGroup, "Select Access Group");
		    webActions.waitUntilNotPresent(btn_SelectAccessGroup, "Select Access Group");
		}
		webActions.waitUntilPresentAndDisplayed(btn_OK, "OK Button");
		webActions.clickBYJS(btn_OK, "OK Button");
		report.reportPass("Assign OLD TAB Bank Group");
	    }
	} catch (Exception e) {
	    report.reportHardFail(e, "Assign OLD TAB Bank Group");
	}
    }

    public void assertTaskStatusDone(WebElement element) throws Exception {
	scrollToTask(element);
	global.assertEquals(element.getText(), "Done");
    }

    public void assertTaskStatusDeclined(WebElement element) throws Exception {
	scrollToTask(element);
	global.assertEquals(element.getText(), "Declined");
    }

    public void assertTaskStatusOnHold(WebElement element) throws Exception {
	scrollToTask(element);
	global.assertEquals(element.getText(), "On hold");
    }

    public void assertTaskStatusEscalate(WebElement element) throws Exception {
	scrollToTask(element);
	global.assertEquals(element.getText(), "Escalate");
    }

    public void assertTaskStatusDenied(WebElement element) throws Exception {
	scrollToTask(element);
	global.assertEquals(element.getText(), "Change request pending");
    }

    private void scrollToTask(WebElement element) {
	webActions.scrollIntoViewByJS(element, "");
    }

    public void clickCloseButton() {
	webActions.clickBYJS(btn_Close, "Close Button");
    }

    public void clickOKButton() {
	webActions.clickBYJS(btn_OK, "OK Button");
    }

    public void clickYesButtonInDialog() throws Exception {
	webActions.waitAndCickBYJS(btn_DialogYes, "Yes Button");
    }

    public void clickSaveButton() {
	webActions.clickBYJS(btn_Save, "Save button");
    }

    public void resumeCreatedApplication() {
	try {
	    webActions.waitUntilPresentAndDisplayed(lbl_ReturnToTask,
		    "Do you want to return to the application editor");
	    clickYesButtonInDialog();
	    webActions.waitUntilPresentAndDisplayed(lbl_ApplicationEditor, "Application Editor");
	    report.reportPass("Resume Created Application");
	} catch (Exception e) {
	    report.reportHardFail(e, "Resume Created Application Failed");
	}
    }

    @Override
    protected ExpectedCondition getPageLoadCondition() {
	// TODO Auto-generated method stub
	return ExpectedConditions.visibilityOf(page);
    }
}