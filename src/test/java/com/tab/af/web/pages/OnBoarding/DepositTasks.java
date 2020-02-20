package com.tab.af.web.pages.OnBoarding;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.tab.af.utilities.OnBoardApplicants;
import com.tab.af.web.pages.BasePage;

public class DepositTasks extends BasePage {
    private Commons common = new Commons();
    @FindBy(xpath = "//span[text()=\"Application process\"]")
    private WebElement lbl_ApplicationProcess;
    @FindBy(xpath = "//div[contains(text(),'Application Editor')]")
    private WebElement lbl_ApplicationEditor;
    @FindBy(xpath = "//div[text()='Application Product Selection']")
    private WebElement lbl_ApplicationProductSelection;
    @FindBy(xpath = "//span[text()='Application process']//following::tr//td[@class=\"v-table-header-cell\"]//div[text()]")
    private List<WebElement> lbl_ApplicationProcessHeader;
    @FindBy(xpath = "//div[text()=\"Application Verification\"]")
    private WebElement lbl_ApplicationVerification;
    @FindBy(xpath = "//span[text()='Begin Work']")
    private WebElement btn_BeginWork;
    @FindBy(xpath = "//span[text()='Complete']")
    private WebElement btn_Complete;
    @FindBy(xpath = "//span[text()='Manager Review']//..//parent::div")
    private WebElement btn_ManagerReview;
    @FindBy(xpath = "//div[contains(text(),'approve (Verification Task)')]")
    private WebElement lbl_ApproveVerificationTask;
    @FindBy(xpath = "(//span[text()='Precise Id Validation']//parent::span//parent::div[@role='button'])[1]")
    private WebElement btn_PeformPreciseID;
    @FindBy(xpath = "(//span[text()='Perform']//../parent::div[@role=\"button\"])[1]")
    private WebElement btn_PerformSocure;
    @FindBy(xpath = "//span[text()='KYC']")
    private WebElement lbl_KYC;
    @FindBy(xpath = "//span[text()='Resubmit']")
    private WebElement btn_ReSubmit;
    @FindBy(xpath = "//div[text()='New Precise ID inquiry']")
    private WebElement lbl_NewPreciseIDInquiry;
    @FindBy(xpath = "//span[text()='Send request']")
    private WebElement btn_SendRequest;
    @FindBy(xpath = "//div[@role=\"button\"]//following::span[text()='OK']")
    private WebElement btn_OK;
    @FindBy(xpath = "//span[text()='Decline']")
    private WebElement btn_Decline;
    @FindBy(xpath = "//div[@role='button']//following::span[text()='Approve']")
    private WebElement btn_Approve;
    @FindBy(xpath = "//div[text()='KIQ']")
    private WebElement lbl_KIQ;
    @FindBy(xpath = "//div[text()='Number of questions']")
    private WebElement lbl_NumberofQuestions;
    @FindBy(xpath = "//label[text()='NONE OF THE ABOVE/DOES NOT APPLY']")
    private List<WebElement> lbl_NoneofTheAbove;
    @FindBy(xpath = "//div[@cuba-id=\"WebGroupBox\"]//following::textarea[@cuba-id=\"WebResizableTextArea\"]")
    private List<WebElement> lbl_QuestionList;
    @FindBy(xpath = "//span[text()='Send KIQ answers']")
    private WebElement btn_SendKIQAnswers;
    @FindBy(xpath = "//div[text()='Change request']")
    private WebElement lbl_ChangeRequest;
    @FindBy(xpath = "//div[text()='DOA welcome email']")
    private WebElement lbl_DOAWelcomeEMail;
    @FindBy(xpath = "//div[text()='DOA welcome email']//following::div[1]")
    private WebElement lbl_DOAWelcomeEMailTaskState;
    @FindBy(xpath = "//div[text()='DOA Funding']")
    private WebElement lbl_DOAFunding;
    @FindBy(xpath = "//div[text()='DOA Funding']//following::div[1]")
    private WebElement lbl_DOAFundingTaskState;
    @FindBy(xpath = "//div[contains(text(),'Non-FCRA Decline E-Mail')]")
    private WebElement lbl_NONFCRADeclinEmail;
    @FindBy(xpath = "//span[text()='Request status']")
    private WebElement lbl_RequestStatus;
    @FindBy(xpath = "//span[text()='Cancel']")
    private WebElement btn_Cancel;
    @FindBy(xpath = "//div[text()='Application Verification']//following::td[1]")
    private WebElement lbl_ApplicationVerificationState;
    @FindBy(xpath = "//div[contains(text(),'approve (Verification Task)')]//following::td[1]")
    private WebElement lbl_ApproveVerificationState;
    @FindBy(xpath = "//div[contains(text(),'welcome email')]//following::td[1]")
    private WebElement lbl_WelcomeEmailState;
    @FindBy(xpath = "//span[text()='Save & Close']")
    private WebElement btn_SaveAndClose;
    @FindBy(xpath = "//span[text()='Save']/..//parent::div[@role=\"button\"]")
    private WebElement btn_Save;
    @FindBy(xpath = "//h1[text()='Application saved.']")
    private WebElement lbl_ApplicationSaved;
    @FindBy(xpath = "//span[text()='View']//..//parent::div[@role=\"button\"]")
    private WebElement btn_ViewTask;
    @FindBy(xpath = "//div[contains(text(),'accounts create')]")
    private WebElement lbl_ApplicantAccountCreatedTask;
    @FindBy(xpath = "//span[contains(text(),'Customer ID')]")
    private WebElement lbl_ExecutionLogResult;
    @FindBy(xpath = "//div[text()='View Task Screen']")
    private WebElement lbl_ViewTaskScren;
    @FindBy(xpath = "//span[text()='Execution log']//following::textarea")
    private WebElement txt_AccountDetailsTextArea;
    @FindBy(xpath = "//div[@aria-label=\"close button\"]")
    private WebElement btn_ClosePopUp;
    @FindBy(xpath = "//div[text()='Description']//following::textarea")
    private WebElement txt_AccountDetailsDescription;
    @FindBy(xpath = "//div[contains(text(),'Customer Verification/QA')]")
    private WebElement lbl_CustomerVerificationQA;
    @FindBy(xpath = "//div[text()='Customer Verification/QA']//following::td[1]")
    private WebElement lbl_CustomerVerificationQAState;
    @FindBy(xpath = "//div[contains(text(),'Decision')]")
    private WebElement lbl_Decision;
    @FindBy(xpath = "//div[text()='Manager Review']")
    private WebElement lbl_ManagerReview;
    @FindBy(xpath = "//div[text()='Manager Review']//following::td[1]")
    private WebElement lbl_ManagerReviewTaskState;
    @FindBy(xpath = "//div[text()='Decision']//following::td[1]")
    private WebElement lbl_DecisionState;
    @FindBy(xpath = "//div[contains(text(),'CIF/Account Creation')]")
    private WebElement lbl_CIFAccountCreation;
    @FindBy(xpath = "//div[text()='CIF/Account Creation']//following::td[1]")
    private WebElement lbl_CIFAccountCreationState;
    @FindBy(xpath = "//div[contains(text(),'Send Welcome E-Mail')]")
    private WebElement lbl_SendWelcomeEMail;
    @FindBy(xpath = "//div[text()='Send Welcome E-Mail']//following::td[1]")
    private WebElement lbl_SendWelcomeEMailState;
    @FindBy(xpath = "//span[text()='Generate Letter']")
    private WebElement btn_GenerateLetter;
    @FindBy(xpath = "//td[2]//div[contains(text(),'Funding')]")
    private WebElement lbl_Funding;
    @FindBy(xpath = "(//div[text()='Funding']//following::td[2])[1]")
    private WebElement lbl_FundingState;
    @FindBy(xpath = "//*[contains(text(),'Do you want to return to the application editor')]")
    private WebElement lbl_ReturnToTask;
    @FindBy(xpath = "//h1[text()='Letters were successfully generated']")
    private WebElement lbl_LettersGeneratedMessage;
    @FindBy(xpath = "(//tr//child::input)[1]")
    private WebElement txt_ApplicantStatus;
    @FindBy(xpath = "//span[text()='Create Precision Accounts']")
    private WebElement btn_CreatePrecisionAccounts;
    @FindBy(xpath = "//div[text()='Accounts created']")
    private WebElement lbl_AccountsCreated;
    @FindBy(xpath = "//span[text()='Addresses']")
    private WebElement lbl_Addresses;
    private String drp_ApplicantStatus = "//following::input[@autocomplete='nope'][1]";

    @Override
    protected ExpectedCondition getPageLoadCondition() {
	return ExpectedConditions.visibilityOf(lbl_ApplicationProcess);
    }

    public void completeSingleConsumerDepositTasks() {
	completeApplicationVerificationTask();
	completeApproveVerificationTask(OnBoardApplicants.Applicant1);
	// completeDOAWelcomeMailTask();
	// completeDOAFundingTask();
    }

    public void completeCommercialDepositTasks() {
	completeApplicationVerificationTask();
	completeCustomerVerificationQATask();
	completeDecisionTask();
	completeCIFAccountCreationTask();
	completeSendWelcomeEmailTask();
	completeFundingTask();
    }

    public void completeApplicationVerificationTask() {
	try {
	    common.addAssignedGroup(lbl_ApplicationVerification, "Application Verification");
	    common.performAndBeginWork();
	    webActions.waitAndCickBYJS(btn_Complete, "Complete");
	    common.resumeCreatedApplication();
	    common.selectTask(lbl_ApplicationVerification, "Application Verification");
	    common.assertTaskStatusDone(lbl_ApplicationVerificationState);
	    report.reportPass("Complete Task:  Application Verification");
	} catch (Exception e) {
	    report.reportHardFail(e, "Complete Task: Application Verification Failed");
	}
    }

    public void holdApplicationVerificationTask() {
	try {
	    common.addAssignedGroup(lbl_ApplicationVerification, "Application Verification");
	    common.performAndBeginWork();
	    common.clickOnHoldTask();
	    common.resumeCreatedApplication();
	    common.selectTask(lbl_ApplicationVerification, "Application Verification");
	    common.assertTaskStatusOnHold(lbl_ApplicationVerificationState);
	    report.reportPass("Hold Task:  Application Verification");
	} catch (Exception e) {
	    report.reportHardFail(e, "Hold Task: Application Verification Failed");
	}
    }

    public void completeCustomerVerificationQATask() {
	try {
	    common.addAssignedGroup(lbl_CustomerVerificationQA, " Customer Verification QA");
	    common.performAndBeginWork();
	    webActions.waitAndCickBYJS(btn_Complete, "Complete");
	    common.resumeCreatedApplication();
	    common.assertTaskStatusDone(lbl_CustomerVerificationQAState);
	    report.reportPass("Complete Task: Customer Verification QA");
	} catch (Exception e) {
	    report.reportHardFail(e, "Complete Task: Customer Verification QA");
	}
    }

    public void holdCustomerVerificationQATask() {
	try {
	    common.addAssignedGroup(lbl_CustomerVerificationQA, " Customer Verification QA");
	    common.performAndBeginWork();
	    common.clickOnHoldTask();
	    common.resumeCreatedApplication();
	    common.assertTaskStatusOnHold(lbl_CustomerVerificationQAState);
	    report.reportPass("Hold Task: Customer Verification QA");
	} catch (Exception e) {
	    report.reportHardFail(e, "Hold Task: Customer Verification QA");
	}
    }

    public void completeDecisionTask() {
	try {
	    common.addAssignedGroup(lbl_Decision, "Decision");
	    common.performAndBeginReview();
	    webActions.waitAndCickBYJS(btn_Approve, "Approve");
	    common.clickYesButtonInDialog();
	    common.resumeCreatedApplication();
	    common.assertTaskStatusDone(lbl_DecisionState);
	    report.reportPass("Complete Task: Decision");
	} catch (Exception e) {
	    report.reportHardFail(e, "Complete Task: Decision");
	}
    }

    public void declineDecisionTask() {
	try {
	    common.addAssignedGroup(lbl_Decision, "Decision");
	    common.performAndBeginReview();
	    webActions.waitAndCickBYJS(btn_Decline, "Decline");
	    common.clickYesButtonInDialog();
	    common.resumeCreatedApplication();
	    common.assertTaskStatusDeclined(lbl_DecisionState);
	    report.reportPass("Decline Task: Decision");
	} catch (Exception e) {
	    report.reportHardFail(e, "Decline Task: Decision");
	}
    }

    public void holdDecisionTask() {
	try {
	    common.addAssignedGroup(lbl_Decision, "Decision");
	    common.performAndBeginReview();
	    common.clickOnHoldTask();
	    common.clickYesButtonInDialog();
	    common.resumeCreatedApplication();
	    common.assertTaskStatusOnHold(lbl_DecisionState);
	    report.reportPass("Hold Task: Decision");
	} catch (Exception e) {
	    report.reportHardFail(e, "Hold Task: Decision");
	}
    }

    public void managerReviewDecisionTask() {
	try {
	    common.addAssignedGroup(lbl_Decision, "Decision");
	    common.performAndBeginReview();
	    webActions.waitAndCickBYJS(btn_ManagerReview, "Manager Review");
	    common.clickYesButtonInDialog();
	    common.resumeCreatedApplication();
	    common.assertTaskStatusEscalate(lbl_DecisionState);
	    report.reportPass("Manage Review Task: Decision");
	} catch (Exception e) {
	    report.reportHardFail(e, "Manage Review Task: Decision");
	}
    }

    public void completeManagerReviewTask() {
	try {
	    common.addAssignedGroup(lbl_ManagerReview, "Manager Review");
	    common.performAndBeginWork();
	    webActions.waitAndCickBYJS(btn_Approve, "Approve");
	    common.clickYesButtonInDialog();
	    common.resumeCreatedApplication();
	    common.assertTaskStatusDone(lbl_ManagerReviewTaskState);
	    report.reportPass("Complete Manage Review Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Complete Manage Review Task");
	}
    }

    public void completeCIFAccountCreationTask() {
	try {
	    Map<String, String> map = getTestDataMap();
	    String name = map.get("FIRST NAME") + " " + map.get("LAST NAME");
	    common.addAssignedGroup(lbl_CIFAccountCreation, "CIF Account Creation");
	    common.performAndBeginWork();
	    WebElement mainApplicant = webActions.findWebElementByText(name);
	    webActions.clickAction(mainApplicant, "Main Applicant");
	    webActions.clearByJS(webActions.findBy(By.xpath("//*[text()='" + name + "']" + drp_ApplicantStatus)),
		    "Clear Application Status");
	    WebElement applicantStatus = webActions
		    .findBy(By.xpath("//*[text()='" + name + "']" + drp_ApplicantStatus));
	    webActions.SendKeysByCharAuto(applicantStatus, "Approved", "Application Status");
	    /**
	     * Automation Specific Issue Edit Page is Opening
	     */
	    try {
		boolean pageLoad = webActions.waitForVisibility(lbl_Addresses, "Address Label ", 10).isDisplayed();
		if (pageLoad) {
		    webActions.clickBYJS(btn_Cancel, "Cancel Button");
		    webActions.waitUntilPresentAndDisplayed(btn_CreatePrecisionAccounts, "Create Precision Accounts");
		}
	    } catch (TimeoutException e) {
	    }
	    /**
	     * 
	     */
	    webActions.clickBYJS(btn_Save, "Save button");
	    webActions.waitUntilPresentAndDisplayed(lbl_ApplicationSaved, "Application Saved Message");
	    webActions.clickBYJS(btn_CreatePrecisionAccounts, "Create Precision Accounts");
	    webActions.waitUntilPresentAndDisplayed(lbl_AccountsCreated, "Account Created Message");
	    webActions.clickBYJS(btn_OK, "OK Button");
	    webActions.waitAndCickBYJS(btn_Complete, "Complete");
	    common.resumeCreatedApplication();
	    common.assertTaskStatusDone(lbl_CIFAccountCreationState);
	    report.reportPass("Complete Task: CIFaccountCreation");
	} catch (Exception e) {
	    report.reportHardFail(e, "Complete Task: CIFaccountCreation");
	}
    }

    public void holdCIFAccountCreationTask() {
	try {
	    common.addAssignedGroup(lbl_CIFAccountCreation, "CIF Account Creation");
	    common.performAndBeginWork();
	    common.clickOnHoldTask();
	    common.resumeCreatedApplication();
	    common.assertTaskStatusOnHold(lbl_CIFAccountCreationState);
	    report.reportPass("Hold Task: CIF Account Creation");
	} catch (Exception e) {
	    report.reportHardFail(e, "Hold Task: CIF Account Creation");
	}
    }

    public void denyCIFAccountCreationTask() {
	try {
	    common.addAssignedGroup(lbl_CIFAccountCreation, "CIF Account Creation");
	    common.performAndBeginWork();
	    common.clickDenyTask();
	    common.resumeCreatedApplication();
	    common.assertTaskStatusDenied(lbl_CIFAccountCreationState);
	    report.reportPass("Deny Task: CIF Account Creation");
	} catch (Exception e) {
	    report.reportHardFail(e, "Deny Task: CIF Account Creation");
	}
    }

    public void completeSendWelcomeEmailTask() {
	try {
	    common.addAssignedGroup(lbl_SendWelcomeEMail, "weclome mail");
	    common.performAndBeginWork();
	    webActions.waitUntilPresentAndDisplayed(btn_Complete, "complete button");
	    webActions.waitUntilPresentAndDisplayed(btn_GenerateLetter, "Generate Letter");
	    webActions.clickBYJS(btn_GenerateLetter, "Generate Letter");
	    webActions.waitUntilPresentAndDisplayed(lbl_LettersGeneratedMessage, "Letter Generated Succsessfully");
	    webActions.waitAndCickBYJS(btn_Complete, "Complete");
	    common.resumeCreatedApplication();
	    common.assertTaskStatusDone(lbl_SendWelcomeEMailState);
	    report.reportPass("Complete Task: Send Welcome Email");
	} catch (Exception e) {
	    report.reportHardFail(e, "Complete Task: Send Welcome Email Failed");
	}
    }

    public void holdSendWelcomeEmailTask() {
	try {
	    common.addAssignedGroup(lbl_SendWelcomeEMail, "weclome mail");
	    common.performAndBeginWork();
	    common.clickOnHoldTask();
	    common.resumeCreatedApplication();
	    common.assertTaskStatusOnHold(lbl_SendWelcomeEMailState);
	    report.reportPass("Hold Task: Send Welcome Email");
	} catch (Exception e) {
	    report.reportHardFail(e, "Hold Task: Send Welcome Email Failed");
	}
    }

    public void completeFundingTask() {
	try {
	    common.addAssignedGroup(lbl_Funding, "Funding");
	    common.performAndBeginWork();
	    webActions.waitAndCickBYJS(btn_Complete, "Complete");
	    common.resumeCreatedApplication();
	    webActions.waitUntilPresentAndDisplayed(lbl_ApplicationEditor, "Application Editor");
	    common.assertTaskStatusDone(lbl_FundingState);
	    report.reportPass("Complete Task: Funding");
	} catch (Exception e) {
	    report.reportHardFail(e, "Complete Task: Funding");
	}
    }

    public void holdFundingTask() {
	try {
	    common.addAssignedGroup(lbl_Funding, "Funding");
	    common.performAndBeginWork();
	    common.clickOnHoldTask();
	    common.resumeCreatedApplication();
	    webActions.waitUntilPresentAndDisplayed(lbl_ApplicationEditor, "Application Editor");
	    common.assertTaskStatusDone(lbl_FundingState);
	    report.reportPass("Hold Task: Funding");
	} catch (Exception e) {
	    report.reportHardFail(e, "Hold Task: Funding");
	}
    }

    public void completeApproveVerificationTask(OnBoardApplicants applicantNo) {
	try {
	    Map<String, String> map = getApplicant(applicantNo);
	    String name = map.get("FIRST NAME") + " " + map.get("LAST NAME");
	    WebElement task = webActions
		    .findWebElementByContainsText("Applicant [" + name + "] approve (Verification Task)");
	    common.addAssignedGroup(task, "Approve Precise ID " + name);
	    common.performAndContinueWork();
	    webActions.waitUntilEnabledAndCickBYJS(btn_PeformPreciseID, "Perform Precise ID");
	    completeKIQQuestions(map);
	    common.clickCloseButton();
	    webActions.waitAndCickBYJS(btn_PerformSocure, "Perform Socure");
	    webActions.waitUntilPresentAndDisplayed(lbl_KYC, "KYC");
	    common.clickOKButton();
	    webActions.waitAndCickBYJS(btn_Approve, "Approve Work");
	    common.clickYesButtonInDialog();
	    common.resumeCreatedApplication();
	    task = webActions.findWebElementByContainsText("Applicant [" + name + "] approve (Verification Task)");
	    common.selectTask(task, "Approve Precise ID " + name);
	    WebElement taskState = webActions.findBy(By.xpath(
		    "//*[contains(text(),'Applicant [" + name + "] approve (Verification Task)')]//following::td[1]"));
	    common.assertTaskStatusDone(taskState);
	    report.reportPass("Complete Task: Approve Precise ID");
	} catch (Exception e) {
	    report.reportHardFail(e, "Complete Task: Approve Precise ID");
	}
    }

    public void denyApproveVerificationTask(OnBoardApplicants applicantNo) {
	try {
	    Map<String, String> map = getApplicant(applicantNo);
	    String name = map.get("FIRST NAME") + " " + map.get("LAST NAME");
	    WebElement task = webActions
		    .findWebElementByContainsText("Applicant [" + name + "] approve (Verification Task)");
	    common.addAssignedGroup(task, "Approve Precise ID " + name);
	    common.performAndContinueWork();
	    common.clickDenyTask();
	    common.clickYesButtonInDialog();
	    common.resumeCreatedApplication();
	    report.reportPass("Deny Task: Approve Precise ID");
	} catch (Exception e) {
	    report.reportHardFail(e, "Deny Task: Approve Precise ID");
	}
    }

    public void assertChangeRequestTaskGenerated() {
	try {
	    global.assertEquals(lbl_ChangeRequest.isDisplayed(), true);
	    report.reportPass("Change Request Task Generated");
	} catch (Exception e) {
	    report.reportHardFail(e, "Change Request Task Generated");
	}
    }

    public void resubmitPreciseIDRequest(OnBoardApplicants applicantNo) {
	try {
	    Map<String, String> map = getApplicant(applicantNo);
	    String name = map.get("FIRST NAME") + " " + map.get("LAST NAME");
	    WebElement task = webActions
		    .findWebElementByContainsText("Applicant [" + name + "] approve (Verification Task)");
	    common.addAssignedGroup(task, "Approve Precise ID " + name);
	    common.performAndContinueWork();
	    webActions.waitUntilEnabledAndCickBYJS(btn_PeformPreciseID, "Perform Precise ID");
	    webActions.waitAndCickBYJS(btn_ReSubmit, "ReSubmit");
	    webActions.waitUntilPresentAndDisplayed(lbl_NewPreciseIDInquiry, "New precise ID Inquiry");
	    webActions.clickBYJS(btn_SendRequest, "Send request");
	    completeKIQQuestions(map);
	    common.clickCloseButton();
	    webActions.waitAndCickBYJS(btn_Approve, "Approve Work");
	    common.clickYesButtonInDialog();
	    common.resumeCreatedApplication();
	    task = webActions.findWebElementByContainsText("Applicant [" + name + "] approve (Verification Task)");
	    common.selectTask(task, "Approve Precise ID " + name);
	    WebElement taskState = webActions.findBy(By.xpath(
		    "//*[contains(text(),'Applicant [" + name + "] approve (Verification Task)')]//following::td[1]"));
	    common.assertTaskStatusDone(taskState);
	    report.reportPass("Resubmit Precised and Complete Task: Approve Precise ID");
	} catch (Exception e) {
	    report.reportHardFail(e, "Resubmit Precised and Complete Task: Approve Precise ID");
	}
    }

    public void declineApproveVerificationTask(OnBoardApplicants applicantNo) {
	try {
	    Map<String, String> map = getApplicant(applicantNo);
	    String name = map.get("FIRST NAME") + " " + map.get("LAST NAME");
	    WebElement task = webActions
		    .findWebElementByContainsText("Applicant [" + name + "] approve (Verification Task)");
	    common.addAssignedGroup(task, "Approve Precise ID " + name);
	    common.performAndContinueWork();
	    webActions.waitAndCickBYJS(btn_Decline, "Decline Task");
	    common.clickYesButtonInDialog();
	    common.resumeCreatedApplication();
	    task = webActions.findWebElementByContainsText("Applicant [" + name + "] approve (Verification Task)");
	    common.selectTask(task, "Approve Precise ID " + name);
	    WebElement taskState = webActions.findBy(By.xpath(
		    "//*[contains(text(),'Applicant [" + name + "] approve (Verification Task)')]//following::td[1]"));
	    common.assertTaskStatusDeclined(taskState);
	    report.reportPass("Decline Task: Approve Precise ID");
	} catch (Exception e) {
	    report.reportHardFail(e, "Decline Task: Approve Precise ID");
	}
    }

    public void holdApproveVerificationTask(OnBoardApplicants applicantNo) {
	try {
	    Map<String, String> map = getApplicant(applicantNo);
	    String name = map.get("FIRST NAME") + " " + map.get("LAST NAME");
	    WebElement task = webActions
		    .findWebElementByContainsText("Applicant [" + name + "] approve (Verification Task)");
	    common.addAssignedGroup(task, "Approve Precise ID " + name);
	    common.performAndContinueWork();
	    common.clickOnHoldTask();
	    common.clickYesButtonInDialog();
	    common.resumeCreatedApplication();
	    task = webActions.findWebElementByContainsText("Applicant [" + name + "] approve (Verification Task)");
	    common.selectTask(task, "Approve Precise ID " + name);
	    WebElement taskState = webActions.findBy(By.xpath(
		    "//*[contains(text(),'Applicant [" + name + "] approve (Verification Task)')]//following::td[1]"));
	    common.assertTaskStatusOnHold(taskState);
	    report.reportPass("Hold Task: Approve Precise ID");
	} catch (Exception e) {
	    report.reportHardFail(e, "Hold Task: Approve Precise ID");
	}
    }

    public void completeDOAWelcomeMailTask() {
	try {
	    common.selectTask(lbl_DOAWelcomeEMail, "DOA welcome mail");
	    // assignGroup();
//			webActions.click(btn_SaveAndClose, "Save and Close");
//			common.resumeCreatedApplication();
//			webActions.waitUntilDisplayed(lbl_DOAWelcomeEMail, "DOA Welcome EMail");
//			webActions.scrollIntoViewByJS(lbl_DOAWelcomeEMail, "DOA Welcome EMail");
	    common.assertTaskStatusDone(lbl_DOAWelcomeEMailTaskState);
	    report.reportPass("Complete Task: DOA Welcome Email");
	} catch (Exception e) {
	    report.reportHardFail(e, "Complete Task: DOA Welcome Email Failed");
	}
    }

    public void completeDOAFundingTask() {
	try {
	    common.selectTask(lbl_DOAFunding, "DOA  Funding");
//			assignGroup();
//			webActions.click(btn_SaveAndClose, "Save and Close");
//			common.resumeCreatedApplication();
//			webActions.waitUntilDisplayed(lbl_DOAWelcomeEMail, "DOA Welcome EMail");
//			webActions.scrollIntoViewByJS(lbl_DOAWelcomeEMail, "DOA Welcome EMail");
	    common.assertTaskStatusDone(lbl_DOAFundingTaskState);
	    report.reportPass("Complete Task: DOA Funding");
	} catch (Exception e) {
	    report.reportHardFail(e, "Complete Task: DOA Funding Failed");
	}
    }

    public void completeNonFCRADeclineTask() {
	try {
	    common.addAssignedGroup(lbl_NONFCRADeclinEmail, "DOA Welcome EMail");
	    common.clickPerformButton();
	    common.assertTaskStatusDone(lbl_ApproveVerificationState);
	    report.reportPass("Complete Task: Welcome Email");
	} catch (Exception e) {
	    report.reportHardFail(e, "Complete Task: Welcome Email Failed");
	}
    }

    public void verifyAccountCreated(OnBoardApplicants applicantNo) {
	try {
	    Map<String, String> map = getApplicant(applicantNo);
	    String name = map.get("FIRST NAME") + " " + map.get("LAST NAME");
	    WebElement task = webActions.findWebElementByContainsText("Applicant [" + name + "] accounts create");
	    common.focusTask(task, "Applicant Acount Created Task");
	    webActions.waitUntilEnabledAndCickBYJS(btn_ViewTask, "View Task");
	    webActions.waitUntilPresentAndDisplayed(lbl_ExecutionLogResult, "Execution Log Result");
	    webActions.doubleClick(lbl_ExecutionLogResult, "Execution Log Result");
	    webActions.waitUntilPresentAndDisplayed(txt_AccountDetailsTextArea, "Account Details");
	    String[] lines = txt_AccountDetailsTextArea.getAttribute("value").split("\n");
	    String accNum = "";
	    if (applicantNo.name().equalsIgnoreCase("Applicant1")) {
		accNum = lines[4];
	    } else {
		for (int i = 0; i < lines.length; i++) {
		    if (lines[i].contains(map.get("LAST NAME"))) {
			accNum = lines[i + 1];
			break;
		    }
		}
	    }
	    boolean accountCreated = StringUtils.isNumeric(accNum.replace("Account Num ", "").trim());
	    Assert.assertTrue(accountCreated);
	    report.reportPass("Account Created successfully for: " + applicantNo);
	    webActions.clickBYJS(btn_ClosePopUp, "Close Account Create Popup");
	    webActions.waitUntilNotPresent(btn_ClosePopUp, "Close Account Create Popup");
	} catch (Exception e) {
	    report.reportHardFail(e, "Account creation failed for: " + applicantNo);
	}
    }

    public void verifyCIFAccountCreated() {
	try {
	    common.focusTask(lbl_CIFAccountCreation, "CIF  Account Created Task");
	    webActions.clickBYJS(btn_ViewTask, "View Task");
	    webActions.waitUntilPresentAndDisplayed(lbl_ViewTaskScren, "View Task Screen");
	    webActions.waitUntilPresentAndDisplayed(txt_AccountDetailsDescription, "Account Details");
	    Assert.assertTrue(txt_AccountDetailsDescription.getAttribute("value").contains("Account Num "));
	    report.reportPass("Account Created successfully");
	} catch (Exception e) {
	    report.reportHardFail(e, "Account creation failed");
	}
    }

    public void completeKIQQuestions(Map<String, String> map) {
	try {
	    webActions.waitAndClick(lbl_KIQ, "KIQ Tab");
	    webActions.waitUntilPresentAndDisplayed(lbl_NumberofQuestions, "Number of Questions");
	    Map<String, Set<String>> kiqMap = global.getKIQKeyMap();
	    for (int itr = 0; itr < lbl_QuestionList.size(); itr++) {
		String questionText = lbl_QuestionList.get(itr).getAttribute("value");
		Set<String> keySet = kiqMap.get(questionText);
		if (questionText.contains("Based on our records, you previously lived on")) {
		    keySet = kiqMap.get(
			    "Based on our records, you previously lived on. Please choose the city where this street is located.");
		}
		if (questionText.contains("From the list below, what is the area code for phone number ending in")) {
		    keySet = kiqMap.get("From the list below, what is the area code for phone number ending in");
		}
		boolean found = false;
		boolean keyState = false;
		for (String key : keySet) {
		    if (questionText.contains("Select the vehicle you purchased or leased prior to")) {
			String[] vehicleKeys = key.split("\\+");
			if (map.get(vehicleKeys[0].trim()).isEmpty() || map.get(vehicleKeys[1].trim()).isEmpty()) {
			    keyState = true;
			} else {
			    keyState = false;
			    break;
			}
		    } else {
			if (map.get(key).trim().isEmpty() || map.get(key).equalsIgnoreCase("NONE OF THE ABOVE")) {
			    keyState = true;
			} else {
			    keyState = false;
			    break;
			}
		    }
		}
		if (keyState) {
		    WebElement noneOfAbove = webActions.findBy(
			    By.xpath("(//label[text()='NONE OF THE ABOVE/DOES NOT APPLY']//preceding-sibling::input)["
				    + (itr + 1) + "]"));
		    webActions.clickBYJS(noneOfAbove, "None Of the Above");
		    continue;
		}
		for (String key : keySet) {
		    if (found) {
			break;
		    }
		    String possibleAnswer = map.get(key);
		    if (questionText.contains("Select the vehicle you purchased or leased prior to")) {
			String[] vehicleKeys = key.split("\\+");
			String make = map.get(vehicleKeys[0].trim());
			String model = map.get(vehicleKeys[1].trim());
			possibleAnswer = make + " " + model;
		    }
		    if (questionText.contains("what is the area code for phone number ending in")) {
			possibleAnswer = map.get(key).substring(0, 3);
		    }
		    if (possibleAnswer.trim().isEmpty()) {
			continue;
		    }
		    List<WebElement> answerList = lbl_QuestionList.get(itr).findElements(
			    By.xpath("//following::div[@cuba-id=\"outWalletAnswer" + (itr + 1) + "\"]//label"));
		    for (WebElement element : answerList) {
			String answer = element.getText().replaceAll("[^a-zA-Z0-9 -]", "");
			if (questionText.contains("dollar range")) {
			    try {
				String[] range = answer.replace("$", "").split("-");
				int lowerRange = Integer.parseInt(range[0].trim());
				int upperRange = Integer.parseInt(range[1].trim());
				int value = Integer.parseInt(possibleAnswer.trim());
				if (value >= lowerRange && value <= upperRange) {
				    // WebElement chkBox = webActions.findWebElementByText(answer);
				    webActions.clickBYJS(element, answer);
				    found = true;
				    break;
				}
			    } catch (NumberFormatException e) {
				continue;
			    }
			}
			if (answer.contains(possibleAnswer)) {
			    found = true;
			    WebElement chkBox = webActions.findWebElementByText(answer);
			    webActions.clickBYJS(chkBox, answer);
			    break;
			}
		    }
		}
		if (!found) {
		    WebElement noneOfAbove = webActions.findBy(
			    By.xpath("(//label[text()='NONE OF THE ABOVE/DOES NOT APPLY']//preceding-sibling::input)["
				    + (itr + 1) + "]"));
		    webActions.clickBYJS(noneOfAbove, "None Of the Above");
		}
	    }
	    webActions.clickBYJS(btn_SendKIQAnswers, "Send KIQ Answers");
	    webActions.waitUntilPresentAndDisplayed(lbl_RequestStatus, "Request Status");
	    report.reportPass("KIQ Selected SuccessFully");
	} catch (Exception e) {
	    report.reportHardFail(e, "KIQ Selected SuccessFully");
	}
    }
}
