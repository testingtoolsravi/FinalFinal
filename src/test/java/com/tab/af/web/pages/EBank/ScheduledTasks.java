package com.tab.af.web.pages.EBank;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.tab.af.web.pages.BasePage;

public class ScheduledTasks extends BasePage {
    public ScheduledTasks() {
	PageFactory.initElements(driver, this);
    }

    JournalAccess journal = new JournalAccess();
    @FindBy(xpath = "//div[text()='Scheduled Tasks']")
    private WebElement lbl_ScheduledTasks;
    @FindBy(xpath = "//span[text()='Edit']")
    private WebElement btn_Edit;
    @FindBy(xpath = "//span[text()='Add search condition']")
    private WebElement btn_AddSearchConditon;
    @FindBy(xpath = "//span[text()='Search']")
    private WebElement btn_Search;
    @FindBy(xpath = "//span[text()='Create']")
    private WebElement btn_Create;
    @FindBy(xpath = "//span[text()='Activate']")
    private WebElement btn_Activate;
    @FindBy(xpath = "//span[text()='Remove']")
    private WebElement btn_Remove;
    @FindBy(xpath = "//span[text()='Execution history']")
    private WebElement btn_ExecutionHistory;
    @FindBy(xpath = "//span[text()='=']//following::input[1]")
    private WebElement txt_SearchFilter;
    ///
    @FindBy(xpath = "//label[text()='Bean']//preceding::input")
    private WebElement radio_Bean;
    @FindBy(xpath = "//label[text()='Class']//preceding::input[1]")
    private WebElement radio_Class;
    @FindBy(xpath = "//label[text()='Script']//preceding::input[1]")
    private WebElement radio_Script;
    @FindBy(xpath = "//div[text()='Bean Name']//following::input[1]")
    private WebElement txt_BeanName;
    @FindBy(xpath = "//div[text()='Class Name']//following::input[1]")
    private WebElement txt_ClassName;
    @FindBy(xpath = "//div[text()='Method Name']//following::input[1]")
    private WebElement txt_MethodName;
    @FindBy(xpath = "//div[text()='User Name']//following::input[1]")
    private WebElement txt_UserName;
    @FindBy(xpath = "//div[text()='Singleton']//following::input[1]")
    private WebElement chk_SingleTon;
    @FindBy(xpath = "//label[text()='Cron']//preceding::input[1]")
    private WebElement txt_Cron;
    @FindBy(xpath = "//label[text()='Period']//preceding::input[1]")
    private WebElement txt_Period;
    @FindBy(xpath = "//label[text()='Fixed Delay']//preceding::input[1]")
    private WebElement txt_FixedDelay;
    @FindBy(xpath = "//div[text()='Period, sec']//following::input[1]")
    private WebElement txt_PeriodSec;
    @FindBy(xpath = "//div[text()='Cron Expression']//following::input[1]")
    private WebElement txt_CronExpression;
    @FindBy(xpath = "//div[text()='Start Date']//following::input[1]")
    private WebElement txt_StartDate;
    @FindBy(xpath = "//div[text()='Timeout, sec']//following::input[1]")
    private WebElement txt_TimeOut;
    @FindBy(xpath = "//div[text()='Time Frame, sec']//following::input[1]")
    private WebElement txt_TimeFrame;
    @FindBy(xpath = "//div[text()='Start Delay, sec']//following::input[1]")
    private WebElement txt_StartDelay;
    @FindBy(xpath = "//div[text()='Permitted Servers']//following::textarea")
    private WebElement txt_PermittedServices;
    @FindBy(xpath = "//div[text()='Log start']//following::input[1]")
    private WebElement txt_LogStart;
    @FindBy(xpath = "//div[text()='Log finish']//following::input[1]")
    private WebElement txt_LogFinish;
    @FindBy(xpath = "//div[text()='Description']//following::textarea")
    private WebElement txt_Description;
    @FindBy(xpath = "//span[text()='OK']")
    private WebElement btn_OK;
    @FindBy(xpath = "//span[text()='Cancel']")
    private WebElement btn_Cancel;
    @FindBy(xpath = "//span[text()='Refresh']")
    private WebElement btn_Refresh;
    @FindBy(xpath = "//table[@class='v-table-table']")
    private WebElement tbl_ScheduleExecution;
    @FindBy(xpath = "//tr//td[7]")
    private List<WebElement> lbl_CreateBy;
    @FindBy(xpath = "//div[@class='v-menubar-submenu v-widget c-main-menu v-menubar-submenu-c-main-menu v-has-width']/span/span[1]")
    private List<WebElement> subMenu_BPM;

    public void validateScheduledTaskPageOptions() {
	try {
	    webActions.assertDisplayed(btn_Search, "Search Button");
	    webActions.assertDisplayed(btn_AddSearchConditon, "Add Search Condtion Button");
	    webActions.assertDisplayed(btn_Create, "Create Button");
	    webActions.assertDisplayed(btn_Activate, "Activate Button");
	    webActions.assertDisplayed(btn_Edit, "Edit Button");
	    webActions.assertDisplayed(btn_Remove, "Remove Button");
	    webActions.assertDisplayed(btn_ExecutionHistory, "Execution History Button");
	    report.reportPass("Validate Scheduled Task Page Options");
	} catch (Exception e) {
	    report.reportHardFail(e, "Validate Scheduled Task Page Options");
	}
    }

    public void validateCreateScheduledTaskPageOptions() {
	try {
	    webActions.clickBYJS(btn_Create, "create Button");
	    webActions.waitForVisibility(txt_BeanName, "Bean Name text field");
	    webActions.assertDisplayed(radio_Bean, "Bean Radio Button");
	    webActions.assertDisplayed(radio_Class, "Class Radio Button");
	    webActions.assertDisplayed(radio_Script, "Script Radio Button");
	    webActions.assertDisplayed(txt_BeanName, "Bean Name text field");
	    webActions.assertDisplayed(txt_MethodName, "Method Name");
	    webActions.assertDisplayed(txt_UserName, "User Name");
	    webActions.assertDisplayed(chk_SingleTon, "Single ton check box");
	    webActions.assertDisplayed(txt_Cron, "Cron");
	    webActions.assertDisplayed(txt_Period, "Period");
	    webActions.assertDisplayed(txt_FixedDelay, "Fixed delay");
	    webActions.assertDisplayed(txt_PeriodSec, "Period sec");
	    webActions.assertDisplayed(txt_StartDate, "Start Date");
	    webActions.assertDisplayed(txt_TimeOut, "TimeOut");
	    webActions.assertDisplayed(txt_TimeFrame, "Time Frame");
	    webActions.assertDisplayed(txt_StartDelay, "Start delay");
	    webActions.assertDisplayed(txt_PermittedServices, "Permitted services");
	    webActions.assertDisplayed(txt_LogStart, "Log Start");
	    webActions.assertDisplayed(txt_LogFinish, "Log Finish");
	    webActions.assertDisplayed(txt_Description, "Description");
	    report.reportPass("Validate Scheduled Task creation Page Options");
	} catch (Exception e) {
	    report.reportHardFail(e, "Fail to Validate Scheduled Task creation Page Options");
	}
    }

    public void verifySearch(String column, String value) {
	try {
	    journal.addSearchCondtion(column, value);
	    webActions.waitForJSandJQueryToLoad();
	    Thread.sleep(5000);
	    for (WebElement ac : lbl_CreateBy) {
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

    public void createTask(String classValue, String user, String corn, String description) {
	try {
	    webActions.waitForVisibility(txt_BeanName, "Bean Name text field");
	    webActions.clickBYJS(radio_Class, "Class Radio Button");
	    webActions.waitForVisibility(txt_ClassName, "Class Name text field");
	    webActions.sendKeysByChar(txt_ClassName, classValue, "Class value");
	    webActions.sendKeysByChar(txt_UserName, user, "user value");
	    webActions.clickBYJS(txt_Cron, "Cron Radio Button");
	    webActions.waitForVisibility(txt_CronExpression, "Cron expression text field");
	    webActions.sendKeysByChar(txt_CronExpression, corn, "corn value");
	    webActions.sendKeysByChar(txt_Description, description, "description value");
	    webActions.clickBYJS(btn_OK, "OK Button");
	    webActions.waitForVisibility(btn_Create, "Create button");
	    report.reportPass("Scheduled task created successfully");
	} catch (Exception e) {
	    report.reportHardFail(e, "Failed to create scheduled task");
	}
    }

    public void editScheduleTask(String description) {
	try {
	    webActions.clickBYJS(btn_Edit, "Edit Button");
	    webActions.waitForVisibility(txt_Description, "Description text field");
	    webActions.sendKeysByChar(txt_Description, description, "Updated description value");
	    webActions.clickBYJS(btn_OK, "OK Button");
	    webActions.waitForVisibility(btn_Create, "Create button");
	    report.reportPass("Scheduled task Updated successfully");
	} catch (Exception e) {
	    report.reportHardFail(e, "Failed to Update scheduled task");
	}
    }

    public void verifyExecutionHistory() {
	try {
	    webActions.clickBYJS(btn_ExecutionHistory, "ExecutionHistory Button");
	    webActions.waitForVisibility(tbl_ScheduleExecution, "Refresh button");
	    webActions.assertDisplayed(tbl_ScheduleExecution, "Scheduled Execution table");
	    report.reportPass("Scheduled execution history verified successfully");
	} catch (Exception e) {
	    report.reportHardFail(e, "Failed to verify Scheduled execution history");
	}
    }

    @Override
    protected ExpectedCondition getPageLoadCondition() {
	// TODO Auto-generated method stub
	return ExpectedConditions.visibilityOf(lbl_ScheduledTasks);
    }
}