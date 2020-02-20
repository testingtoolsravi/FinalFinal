package com.tab.af.web.pages.OnBoarding;

import org.joda.time.DateTime;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.json.JsonException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.tab.af.web.pages.BasePage;

public class LoanTasks extends BasePage {
    private Commons common = new Commons();
    @FindBy(xpath = "//span[text()=\"Application process\"]")
    private WebElement lbl_ApplicationProcess;
    @FindBy(xpath = "//span[text()='Perform']/..//parent::div")
    private WebElement btn_Perform;
    @FindBy(xpath = "//*[contains(text(),'Do you want to return to the application editor')]")
    private WebElement lbl_ReturnToTask;
    @FindBy(xpath = "//div[contains(text(),'Application Editor')]")
    private WebElement lbl_ApplicationEditor;
    @FindBy(xpath = "//div[text()='Check-In Loan Package']")
    private WebElement lbl_CheckInLoanPackage;
    @FindBy(xpath = "//div[text()='Check-In Loan Package']//following::td[1]")
    private WebElement lbl_CheckInLoanPackageState;
    @FindBy(xpath = "//div[text()='Compile Credit Summary']")
    private WebElement lbl_CompileCreditSummary;
    @FindBy(xpath = "//div[text()='Compile Credit Summary']//following::td[1]")
    private WebElement lbl_CompileCreditSummaryState;
    @FindBy(xpath = "//div[text()='8821 & Tax Guard Report']")
    private WebElement lbl_TaxGuardReport8821;
    @FindBy(xpath = "//div[text()='8821 & Tax Guard Report']//following::td[1]")
    private WebElement lbl_TaxGuardReport8821TaskState;
    @FindBy(xpath = "//div[text()='Legals Preparation']")
    private WebElement lbl_LegalsPeparation;
    @FindBy(xpath = "//div[text()='Legals Preparation']//following::td[1]")
    private WebElement lbl_LegalsPeparationTaskState;
    @FindBy(xpath = "//div[text()='TMS Discovery and Setup']")
    private WebElement lbl_TMSDiscoveryAndSetup;
    @FindBy(xpath = "//div[text()='TMS Discovery and Setup']//following::td[1]")
    private WebElement lbl_TMSDiscoveryAndSetupTaskState;
    @FindBy(xpath = "//div[text()='TMS Onboarding']")
    private WebElement lbl_TMSOnBoarding;
    @FindBy(xpath = "//div[text()='TMS Onboarding']//following::td[1]")
    private WebElement llbl_TMSOnBoardingTaskState;
    @FindBy(xpath = "//div[text()='Legal Docs Execution']")
    private WebElement lbl_LegalDocsExecution;
    @FindBy(xpath = "//div[text()='Legal Docs Execution']//following::td[1]")
    private WebElement lbl_LegalDocsExecutionTaskState;
    @FindBy(xpath = "//div[text()='Legal Documents']")
    private WebElement lbl_LegalDocuments;
    @FindBy(xpath = "//div[text()='Legal Documents']//following::td[1]")
    private WebElement lbl_LegalDocumentsTaskState;
    @FindBy(xpath = "//div[text()='Loan Account Setup']")
    private WebElement lbl_LoanAccountSetup;
    @FindBy(xpath = "//div[text()='Loan Account Setup']//following::td[1]")
    private WebElement lbl_LoanAccountSetupTaskState;
    @FindBy(xpath = "//div[text()='Prefunding Legal Review']")
    private WebElement lbl_PrefundingLegalReview;
    @FindBy(xpath = "//div[text()='Prefunding Legal Review']//following::td[1]")
    private WebElement lbl_PrefundingLegalReviewTaskState;
    @FindBy(xpath = "//div[text()='Prefunding Legal Review']")
    private WebElement lbl_PrefundingReview;
    @FindBy(xpath = "//div[text()='Prefunding Legal Review']//following::td[1]")
    private WebElement lbl_PrefundingReviewTaskState;
    @FindBy(xpath = "//div[text()='Decline review']")
    private WebElement lbl_DeclineReview;
    @FindBy(xpath = "//div[text()='Decline review']//following::td[1]")
    private WebElement lbl_DeclineReviewTaskState;
    @FindBy(xpath = "(//div[text()='Funding'])[2]")
    private WebElement lbl_Funding;
    @FindBy(xpath = "(//div[text()='Funding'])[2]//following::td[1]")
    private WebElement lbl_FundingTaskState;
    @FindBy(xpath = "//div[text()='Standard exception task']")
    private WebElement lbl_StandardExceptionTask;
    @FindBy(xpath = "//div[text()='Collateral Valuation']")
    private WebElement lbl_CollateralValuation;
    @FindBy(xpath = "//div[text()='Collateral Valuation']//following::td[1]")
    private WebElement lbl_CollateralValuationTaskState;
    @FindBy(xpath = "//div[text()='Scoring']")
    private WebElement lbl_ScoringTask;
    @FindBy(xpath = "//td[2]//div[text()='Scoring']//following::td[1]")
    private WebElement lbl_ScoringTaskState;
    @FindBy(xpath = "//div[text()='Attach Signed Application and Term Sheet']")
    private WebElement lbl_AttachSignedApplicationAndTermSheetTask;
    @FindBy(xpath = "//div[text()='Attach Signed Application and Term Sheet']//following::td[1]")
    private WebElement lbl_AttachSignedApplicationAndTermSheetTaskState;
    @FindBy(xpath = "//div[text()='Generate Verification Letter']")
    private WebElement lbl_GenerateVerificationLetterTask;
    @FindBy(xpath = "//div[text()='Generate Verification Letter']//following::td[1]")
    private WebElement lbl_GenerateVerificationLetterTaskState;
    @FindBy(xpath = "//div[text()='Approve (1)']")
    private WebElement lbl_ApproveOne;
    @FindBy(xpath = "//div[text()='Approve (1)']//following::td[1]")
    private WebElement lbl_ApproveOneTaskState;
    @FindBy(xpath = "//div[text()='Approve (2)']")
    private WebElement lbl_ApproveTwo;
    @FindBy(xpath = "//div[text()='Approve (2)']//following::td[1]")
    private WebElement lbl_ApproveTwoTaskState;
    @FindBy(xpath = "//div[text()='A/R Verification']")
    private WebElement lbl_ARVerification;
    @FindBy(xpath = "//div[text()='A/R Verification']//following::td[1]")
    private WebElement lbl_ARVerificationTaskState;
    @FindBy(xpath = "//div[text()='Background Searches / UCC Filings']")
    private WebElement lbl_BackGroundSearchsUCCFilingsTask;
    @FindBy(xpath = "//div[text()='Background Searches / UCC Filings']//following::td[1]")
    private WebElement lbl_BackGroundSearchsUCCFilingsTaskState;
    @FindBy(xpath = "//div[text()='Debtor Credit Review']")
    private WebElement lbl_DebtorCreditReview;
    @FindBy(xpath = "//div[text()='Debtor Credit Review']//following::td[1]")
    private WebElement lbl_DebtorCreditReviewTaskState;
    @FindBy(xpath = "//div[text()='Approve Task']")
    private WebElement lbl_ApproveTask;
    @FindBy(xpath = "//div[text()='Approve Task']//following::td[1]")
    private WebElement lbl_ApproveTaskState;
    @FindBy(xpath = "//div[text()='Standard exception task']//following::td[1]")
    private WebElement lbl_StandardExceptionTaskState;
    @FindBy(xpath = "//div[text()='SME Approval']")
    private WebElement lbl_SMEApproval;
    @FindBy(xpath = "//div[text()='SME Approval']//following::td[1]")
    private WebElement lbl_SMEApprovalTaskState;
    @FindBy(xpath = "//div[text()='Send Approve Letter']")
    private WebElement lbl_SendApproveLetter;
    @FindBy(xpath = "//div[text()='Send Approve Letter']//following::td[1]")
    private WebElement lbl_SendApproveLetterState;
    @FindBy(xpath = "//div[text()='Equipment Checklist']")
    private WebElement lbl_EquipmentChecklist;
    @FindBy(xpath = "//div[text()='Equipment Checklist']//following::td[1]")
    private WebElement lbl_EquipmentChecklistState;
    @FindBy(xpath = "//div[text()='SME Funding']")
    private WebElement lbl_SMEFunding;
    @FindBy(xpath = "//div[text()='SME Funding']//following::td[1]")
    private WebElement lbl_SMEFundingState;
    @FindBy(xpath = "//div[text()='SME Credit Analyst Approval']")
    private WebElement lbl_SMECreditAnalystApproval;
    @FindBy(xpath = "//div[text()='SME Credit Analyst Approval']//following::td[1]")
    private WebElement lbl_SMECreditAnalystApprovalState;
    @FindBy(xpath = "//div[text()='Senior SME Credit Analyst Approval']")
    private WebElement lbl_SeniorSMEFCreditAnalystApproval;
    @FindBy(xpath = "//div[text()='Senior SME Credit Analyst Approval']//following::td[1]")
    private WebElement lbl_SeniorCreditAnalystApprovalState;
    @FindBy(xpath = "//div[text()='Assign Underwriter']")
    private WebElement lbl_AssignUnderwriter;
    @FindBy(xpath = "//div[text()='Assign Underwriter']//following::td[1]")
    private WebElement lbl_AssignUnderwriterState;
    @FindBy(xpath = "//span[text()='Begin Work']")
    private WebElement btn_BeginWork;
    @FindBy(xpath = "//div[text()='Operating Accounts']//following::input[1]")
    private WebElement drp_OperatingAccounts;
    @FindBy(xpath = "//div[text()='38 Operating Account']//following::input[1]")
    private WebElement drp_38OperatingAccount;
    @FindBy(xpath = "//div[@role='button']//following::span[text()='Approve']")
    private WebElement btn_Approve;
    @FindBy(xpath = "//span[text()='Begin Review']")
    private WebElement btn_BeginReview;
    @FindBy(xpath = "//span[text()='Complete']")
    private WebElement btn_Complete;
    @FindBy(xpath = "//div[text()='Confirm Complete Task']")
    private WebElement lbl_ConfirmCompleteTask;
    @FindBy(xpath = "//h1[text()='At least one letter should be generated']")
    private WebElement lbl_AtLeastOneLetterShouldBeGenerated;
    @FindBy(xpath = "//span[text()='Finish process']")
    private WebElement btn_FinishProcess;
    @FindBy(xpath = "//label[text()='No Exception']//following::span[text()='Add'][1]")
    private WebElement btn_AddException;
    @FindBy(xpath = "//div[text()='Business Exception Templates']")
    private WebElement lbl_BusinessExceptionTemplates;
    @FindBy(xpath = "//div[@cuba-id='businessExceptionTemplatesTable']//tr[2]//td[2]//div")
    private WebElement lbl_SecondException;
    @FindBy(xpath = "//div[text()='Business Exception Templates']//following::span[text()='Create']")
    private WebElement btn_CreateException;
    @FindBy(xpath = "(//div[text()='Exception name']//following::input[1])[2]")
    private WebElement txt_ExceptionName;
    @FindBy(xpath = "//span[text()='Generate Letter']")
    private WebElement btn_GenerateLetter;
    @FindBy(xpath = "//h1[text()='Letters were successfully generated']")
    private WebElement lbl_LettersGeneratedSuccessfullyMessage;
    @FindBy(xpath = "//span[text()='Dealership name']//following::input[1]")
    private WebElement txt_DealershipName;
    @FindBy(xpath = "//span[text()='Dealer contact']//following::input[1]")
    private WebElement txt_Dealercontact;
    @FindBy(xpath = "//span[text()='Dealer phone']//following::input[1]")
    private WebElement txt_Dealerphone;
    @FindBy(xpath = "//span[text()='Dealer email']//following::input[1]")
    private WebElement txt_DealerEmail;
    @FindBy(xpath = "//div[text()='Title work']//following::input[1]")
    private WebElement txt_Titlework;
    @FindBy(xpath = "//div[text()='Payment Type']//following::input[1]")
    private WebElement txt_PaymentType;
    @FindBy(xpath = "(//div[text()='Team']//following::input[@type=\"text\"])[1]")
    private WebElement txt_Team;
    @FindBy(xpath = "//div[text()='Team Designation']//following::input[1]")
    private WebElement txt_TeamDesignation;
    @FindBy(xpath = "//div[text()='Dealer name']//following::input[1]")
    private WebElement txt_DealerName;
    @FindBy(xpath = "//div[text()='Phone number']//following::input[1]")
    private WebElement txt_DealerPhoneNumber;
    @FindBy(xpath = "//div[text()='Email address']//following::input[1]")
    private WebElement txt_DealerEmailAddress;
    @FindBy(xpath = "//div[text()='Date opened']//following::input[1]")
    private WebElement txt_DateOpened;
    @FindBy(xpath = "//div[text()='First payment date']//following::input[1]")
    private WebElement txt_FirstPaymentDate;
    @FindBy(xpath = "//div[text()='Payment amount']//following::input[1]")
    private WebElement txt_PaymentAmount;
    @FindBy(xpath = "//div[text()='Maturity date']//following::input[1]")
    private WebElement txt_MaturityDate;
    @FindBy(xpath = "//span[text()='=']//following::input[1]")
    private WebElement txt_SearchFilter;
    @FindBy(xpath = "//span[text()='Search']")
    private WebElement btn_Search;
    @FindBy(xpath = "//div[text()='TAB Bank']")
    private WebElement lbl_TabBank;
    @FindBy(xpath = "//span[text()='Assigned groups']//following::span[text()='Add']")
    private WebElement btn_AddGroups;
    @FindBy(xpath = "//div[text()='Application Task']")
    private WebElement lbl_ApplicationTask;
    @FindBy(xpath = "//span[text()='Add search condition']")
    private WebElement btn_AddSearchCondition;
    @FindBy(xpath = "//div[text()='Add condition']")
    private WebElement lbl_AddCondition;
    @FindBy(xpath = "//div[text()='OLD_TAB Bank']")
    private WebElement lbl_OlbTabBank;
    @FindBy(xpath = "//span[text()='Start Scoring Process']//parent::span//parent::div")
    private WebElement btn_StartScoringProcess;
    @FindBy(xpath = "//span[text()='Request providers']//parent::span//parent::div")
    private WebElement btn_RequestProviders;
    @FindBy(xpath = "(//div[text()='State']//following::input[@type=\"text\"])[1]")
    private WebElement txt_TaskState;
    @FindBy(xpath = "//div[text()='Start scoring process for application?']")
    private WebElement lbl_StartScoringProcessForApplication;
    @FindBy(xpath = "//div[text()='Response received']")
    private WebElement lbl_ResponseReceived;
    @FindBy(xpath = "//div[text()='Response received']")
    private WebElement lbl_ResponseReceivedApproved;
    @FindBy(xpath = "//span[text()='Start']")
    private WebElement btn_Start;
    @FindBy(xpath = "//div[@cuba-id=\"companiesTable_composition\"]//table[@class='v-table-table']//tr[1]//td[@class='v-table-cell-content']//div")
    private WebElement lbl_TableRow;
    @FindBy(xpath = "//span[text()='Select']//..//parent::div")
    private WebElement btn_Select;
    @FindBy(xpath = "//div[text()='CalculationResult']")
    private WebElement lbl_CalculationResult;
    @FindBy(xpath = "//span[text()='OK']")
    private WebElement btn_OK;
    @FindBy(xpath = "//span[text()='Add to set']")
    private WebElement btn_AddToSet;
    @FindBy(xpath = "//span[text()='Add to set']")
    private WebElement tbl_CompaniesTable;
    @FindBy(xpath = "//span[text()='View']/..//parent::div")
    private WebElement btn_View;
    @FindBy(xpath = "//label[text()='Tax Guard sent for Approval']")
    private WebElement chk_TaxGuardSentForApproval;
    @FindBy(xpath = "//label[text()='8821 Received & Tax Guard Ordered']")
    private WebElement chk_8821ReceivedAndTaxGuardOrderes;
    @FindBy(xpath = "//label[text()='Tax Guard Approved']")
    private WebElement chk_TaxGuardApproved;
    @FindBy(xpath = "//label[text()='8821 Created & Sent']")
    private WebElement chk_8821CreatedAndSent;
    @FindBy(xpath = "//label[text()='Attachments Saved']")
    private WebElement chk_AttachmentsSaved;
    @FindBy(xpath = "//div[text()='Initial Funding Amount']//following::input[1]")
    private WebElement txt_InitialFundingAmount;
    @FindBy(xpath = "//div[text()='First Fund Date']//following::input[1]")
    private WebElement txt_FirstFundDate;
    @FindBy(xpath = "//div[text()='Stucky Account']//following::input[1]")
    private WebElement txt_StuckyAccount;
    @FindBy(xpath = "//div[text()='Lock Box']//following::input[1]")
    private WebElement txt_LockBox;
    @FindBy(xpath = "//div[text()='Operating Accounts']//following::input[1]")
    private WebElement txt_OperatingAccounts;
    @FindBy(xpath = "//div[text()='FS Account']//following::input[1]")
    private WebElement txt_FSAccount;
    @FindBy(xpath = "//div[text()='Term Loan Account']//following::input[1]")
    private WebElement txt_TermLoanAccount;
    @FindBy(xpath = "//div[text()='Operating Account']//following::input[1]")
    private WebElement txt_OperatingAccount;
    @FindBy(xpath = "//div[text()='38 Operating Account']//following::input[1]")
    private WebElement txt_38OperatingAccounts;
    @FindBy(xpath = "//h1[text()='Application saved.']")
    private WebElement lbl_ApplicationSaved;
    @FindBy(xpath = "//label[text()='Fully Executed Docs Received']")
    private WebElement chk_FullyExecutedDocsReceived;
    @FindBy(xpath = "//label[text()='Legals Sent']")
    private WebElement chk_LegalsSent;

    @Override
    protected ExpectedCondition getPageLoadCondition() {
	return ExpectedConditions.visibilityOf(lbl_ApplicationProcess);
    }

    public void checkInLoanPackage() {
	try {
	    common.addAssignedGroup(lbl_CheckInLoanPackage, "Check in Loan Package");
	    common.performAndBeginWork();
	    webActions.waitAndCickBYJS(btn_Complete, "Complete");
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_CheckInLoanPackage, "Application Verification");
	    common.assertTaskStatusDone(lbl_CheckInLoanPackageState);
	    report.reportPass("Check in Loan Package Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Check in Loan Package Task Failed");
	}
    }

    public void holdCheckInLoanPackage() {
	try {
	    common.addAssignedGroup(lbl_CheckInLoanPackage, "Check in Loan Package");
	    common.performAndBeginWork();
	    common.clickOnHoldTask();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_CheckInLoanPackage, "Application Verification");
	    common.assertTaskStatusOnHold(lbl_CheckInLoanPackageState);
	    report.reportPass("Check in Loan Package Task On Hold");
	} catch (Exception e) {
	    report.reportHardFail(e, "Check in Loan Package Task On Hold Failed");
	}
    }

    public void checkInLoanPackageLargeTicketFactoring() {
	try {
	    common.addAssignedGroup(lbl_CheckInLoanPackage, "Check in Loan Package");
	    common.performAndBeginWork();
	    webActions.clickBYJS(btn_GenerateLetter, "Generate Letter");
	    webActions.waitUntilPresentAndDisplayed(lbl_LettersGeneratedSuccessfullyMessage,
		    "Letter Generated Succsessfully");
	    webActions.waitAndCickBYJS(btn_Complete, "Complete");
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_CheckInLoanPackage, "Application Verification");
	    common.assertTaskStatusDone(lbl_CheckInLoanPackageState);
	    report.reportPass("Check in Loan Package Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Check in Loan Package Task Failed");
	}
    }

    public void completeCompileSmallTicketCreditSummary() {
	try {
	    common.focusTask(lbl_CompileCreditSummary, "Compile Credit Summary");
	    common.performAndBeginWork();
	    webActions.clickBYJS(btn_StartScoringProcess, "Start Scoring process");
	    webActions.waitUntilPresentAndDisplayed(lbl_StartScoringProcessForApplication,
		    "StartScoringProcessForApplication");
	    webActions.clickBYJS(btn_Start, "Start");
	    webActions.waitUntilPresentAndDisplayed(btn_AddToSet, "Add To Set");
	    selectMatchScore(lbl_TableRow, "Match Score Table Row");
	    webActions.waitUntilPresentAndDisplayed(lbl_CalculationResult, "Cal Result");
	    webActions.clickByJSAndWaitUntilNotPresent(btn_OK, "ok");
	    webActions.waitAndCickBYJS(btn_Complete, "Complete");
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_CompileCreditSummary, "Compile Credit Summary Task State");
	    common.assertTaskStatusDone(lbl_CompileCreditSummaryState);
	    report.reportPass("Compile Credit Summary Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Compile Credit Summary Task Failed");
	}
    }

    public void compileCreditSummary() {
	try {
	    common.addAssignedGroup(lbl_CompileCreditSummary, "Compile Credits Summary");
	    common.performAndBeginWork();
	    webActions.waitAndCickBYJS(btn_Complete, "Complete");
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_CompileCreditSummary, "Application Verification");
	    common.assertTaskStatusDone(lbl_CompileCreditSummaryState);
	    report.reportPass("Compile Credit Summary Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Compile Credit Summary Task Failed");
	}
    }

    public void holdCompileCreditSummary() {
	try {
	    common.focusTask(lbl_CompileCreditSummary, "Compile Credit Summary Package");
	    common.performAndBeginWork();
	    common.clickOnHoldTask();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_CompileCreditSummary, "Application Verification");
	    common.assertTaskStatusOnHold(lbl_CompileCreditSummaryState);
	    report.reportPass("Hold Credit Summary Task On Hold");
	} catch (Exception e) {
	    report.reportHardFail(e, "Hold Credit Summary Task on Hold Failed");
	}
    }

    public void declineCompileCreditSummary() {
	try {
	    common.focusTask(lbl_CompileCreditSummary, "Compile Credit Summary Package");
	    common.performAndBeginWork();
	    common.clickDeclineTask();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_CompileCreditSummary, "Application Verification");
	    common.assertTaskStatusDeclined(lbl_CompileCreditSummaryState);
	    report.reportPass("Decline Credit Summary Task On Hold");
	} catch (Exception e) {
	    report.reportHardFail(e, "Decline Credit Summary Task on Hold Failed");
	}
    }

    public void collateralValuation() {
	try {
	    common.focusTask(lbl_CollateralValuation, "Collaeral Valuation");
	    common.performAndBeginWork();
	    webActions.waitAndCickBYJS(btn_Complete, "Complete");
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_CollateralValuation, "Collateral Valuation Task ");
	    common.assertTaskStatusDone(lbl_CollateralValuationTaskState);
	    report.reportPass("Collateral Valuation  Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Collateral Valuation Task Failed");
	}
    }

    public void holdCollateralValuation() {
	try {
	    common.focusTask(lbl_CollateralValuation, "Collaeral Valuation");
	    common.performAndBeginWork();
	    common.clickOnHoldTask();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_CollateralValuation, "Collateral Valuation Task ");
	    common.assertTaskStatusOnHold(lbl_CollateralValuationTaskState);
	    report.reportPass("Hold Collateral Valuation  Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Hold Collateral Valuation Task Failed");
	}
    }

    public void largeTicketscoringTask() {
	try {
	    common.addAssignedGroup(lbl_ScoringTask, "Scoring Tasks");
	    common.performAndBeginWork();
	    webActions.clickBYJS(btn_StartScoringProcess, "Start Scoring process");
	    webActions.waitUntilPresentAndDisplayed(lbl_StartScoringProcessForApplication,
		    "StartScoringProcessForApplication");
	    webActions.clickBYJS(btn_Start, "Start");
	    webActions.waitUntilPresentAndDisplayed(btn_AddToSet, "Add To Set");
	    selectMatchScore(lbl_TableRow, "Match Score Table Row");
	    webActions.waitUntilPresentAndDisplayed(lbl_CalculationResult, "Cal Result");
	    webActions.clickByJSAndWaitUntilNotPresent(btn_OK, "ok");
	    webActions.waitAndCickBYJS(btn_Complete, "Complete");
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_ScoringTask, "Collateral Valuation Task ");
	    common.assertTaskStatusDone(lbl_ScoringTaskState);
	    report.reportPass("Scoring Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Scoring Task Failed");
	}
    }

    public void approveTask() {
	try {
	    common.addAssignedGroup(lbl_ApproveTask, "Approve Task");
	    common.performAndBeginWork();
	    webActions.waitAndCickBYJS(btn_Approve, "Approve");
	    common.clickYesButtonInDialog();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_ApproveTask, "Approve Task");
	    common.assertTaskStatusDone(lbl_ApproveTaskState);
	    report.reportPass("Approve Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Approve Task Failed");
	}
    }

    public void declineApproveTask() {
	try {
	    common.addAssignedGroup(lbl_ApproveTask, "Approve Task");
	    common.performAndBeginWork();
	    common.clickDeclineTask();
	    common.clickYesButtonInDialog();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_ApproveTask, "Approve Task");
	    common.assertTaskStatusDeclined(lbl_ApproveTaskState);
	    report.reportPass("Approve Task Declined");
	} catch (Exception e) {
	    report.reportHardFail(e, "Approve Task Declined Failed");
	}
    }

    public void denyApproveTask() {
	try {
	    common.addAssignedGroup(lbl_ApproveTask, "Approve Task");
	    common.performAndBeginWork();
	    common.clickDenyTask();
	    common.clickYesButtonInDialog();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_ApproveTask, "Approve Task");
	    common.assertTaskStatusDenied(lbl_ApproveTaskState);
	    report.reportPass("Approve Task Deny");
	} catch (Exception e) {
	    report.reportHardFail(e, "Approve Task Deny Failed");
	}
    }

    public void standardException() {
	try {
	    common.addAssignedGroup(lbl_StandardExceptionTask, "Standard exception");
	    common.performAndBeginWork();
	    webActions.waitAndCickBYJS(btn_AddException, "Add Exception");
	    webActions.waitUntilPresentAndDisplayed(lbl_BusinessExceptionTemplates, "Business Exception Templates");
	    /**
	     * In case Exception are not Present for the Task Creating a New one
	     */
	    try {
		webActions.doubleClick(lbl_SecondException, "Second Exception");
	    } catch (JsonException e) {
		webActions.clickBYJS(btn_CreateException, "Create Exception");
		webActions.waitAndSendKeysByChar(txt_ExceptionName, faker.lorem().characters(8), "Exception Name");
		webActions.clickByJSAndWaitUntilNotPresent(btn_OK, "OK");
		webActions.waitUntilEnabledAndCickBYJS(btn_Select, "Select");
		webActions.waitUntilNotPresent(btn_Select, "Select");
	    }
	    webActions.waitUntilNotPresent(lbl_SecondException, "Second Exception");
	    webActions.waitAndCickBYJS(btn_Complete, "Complete");
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_StandardExceptionTask, "Standard Exception");
	    common.assertTaskStatusDone(lbl_StandardExceptionTaskState);
	    report.reportPass("Standard exception Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Standard exception Task Failed");
	}
    }

    public void holdStandardException() {
	try {
	    common.addAssignedGroup(lbl_StandardExceptionTask, "Standard exception");
	    common.performAndBeginWork();
	    common.clickOnHoldTask();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_StandardExceptionTask, "Standard Exception");
	    common.assertTaskStatusOnHold(lbl_StandardExceptionTaskState);
	    report.reportPass("Hold Standard exception Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Hold Standard exception Task Failed");
	}
    }

    public void smeApproval() {
	try {
	    common.focusTask(lbl_SMEApproval, "SME Approval");
	    common.performAndBeginWork();
	    webActions.waitAndCickBYJS(btn_Approve, "Approve");
	    common.clickYesButtonInDialog();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_SMEApproval, "Application Verification");
	    common.assertTaskStatusDone(lbl_SMEApprovalTaskState);
	    report.reportPass("SME Approval Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "SME Approval Task Failed");
	}
    }

    public void sendApproveLetter() {
	try {
	    common.focusTask(lbl_SendApproveLetter, "Send Approve Letter");
	    common.performAndBeginWork();
	    webActions.waitUntilPresentAndDisplayed(btn_GenerateLetter, "Generate Letter");
	    webActions.clearByJS(txt_Team, "Team");
	    webActions.SendKeysByCharAuto(txt_Team, "blueteam.sme@tabbank.com", "Team");
	    webActions.clearByJS(txt_TeamDesignation, "Designation");
	    webActions.waitAndSendKeysByCharAuto(txt_TeamDesignation, "Blue", "TeamDesignation");
	    webActions.clickBYJS(btn_GenerateLetter, "Generate Letter");
	    webActions.waitUntilPresentAndDisplayed(lbl_LettersGeneratedSuccessfullyMessage,
		    "Letter Generated Succsessfully");
	    webActions.scrollIntoViewByJS(btn_Complete, "Complete");
	    webActions.waitAndCickBYJS(btn_Complete, "Complete");
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_SendApproveLetter, "Application Verification");
	    common.assertTaskStatusDone(lbl_SendApproveLetterState);
	    report.reportPass("Send Approve Letter Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Send Approve Letter Task Failed");
	}
    }

    public void holdSendApproveLetter() {
	try {
	    common.focusTask(lbl_SendApproveLetter, "Send Approve Letter");
	    common.performAndBeginWork();
	    common.clickOnHoldTask();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_SendApproveLetter, "Application Verification");
	    common.assertTaskStatusOnHold(lbl_SendApproveLetterState);
	    report.reportPass("Hold Send Approve Letter Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Hold Send Approve Letter Task Failed");
	}
    }

    public void assertSendApproveLetterErrorMessage() {
	try {
	    common.focusTask(lbl_SendApproveLetter, "Send Approve Letter");
	    common.performAndBeginWork();
	    webActions.waitAndCickBYJS(btn_Complete, "Complete");
	    webActions.waitUntilPresentAndDisplayed(lbl_AtLeastOneLetterShouldBeGenerated,
		    "At least one letter should be generated Warning");
	    global.assertEquals(lbl_AtLeastOneLetterShouldBeGenerated.getText(),
		    "At least one letter should be generated");
	    report.reportPass("Generate Letter Error");
	} catch (Exception e) {
	    report.reportHardFail(e, "Generate Letter Error Failed");
	}
    }

    public void holdSendApproveLetterTask() {
	try {
	    common.focusTask(lbl_SendApproveLetter, "Send Approve Letter");
	    common.performAndBeginWork();
	    common.clickOnHoldTask();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_SendApproveLetter, "Application Verification");
	    common.assertTaskStatusOnHold(lbl_SendApproveLetterState);
	    report.reportPass("Send Approve Letter Task On Hold");
	} catch (Exception e) {
	    report.reportHardFail(e, "Send Approve Letter Task On Hold Failed");
	}
    }

    public void equipmentCheckList() {
	try {
	    common.focusTask(lbl_EquipmentChecklistState, "Check in Loan Package");
	    common.performAndBeginWork();
	    webActions.sendKeysByChar(txt_DealershipName, faker.funnyName().name(), "DealerShip Name");
	    webActions.sendKeysByChar(txt_Dealercontact, faker.internet().emailAddress(), "Dealer Contact");
	    webActions.clearAndSendKeysByChar(txt_Dealerphone, faker.phoneNumber().cellPhone(), "Dealer Phone");
	    webActions.sendKeysByChar(txt_DealerEmail, faker.internet().emailAddress(), "Dealer email");
	    webActions.waitAndSendKeysByCharAuto(txt_Titlework, "Dealer", "Title Work");
	    webActions.waitAndSendKeysByCharAuto(txt_PaymentType, "ACH", "Payment Type");
	    webActions.waitAndSendKeysByCharAuto(txt_DealerName, "Northland Credit Corporation", "DealerName");
	    webActions.waitAndSendKeysByCharAuto(txt_DealerPhoneNumber,
		    "(123)116-7793 <Matt Day> (Work Phone - Primary Phone)", "DealerPhoneNumber");
	    webActions.waitAndSendKeysByCharAuto(txt_DealerEmailAddress,
		    "custabcd@anyotherplace.com <Matt Day> (Email - Primary Email)", "DealerEmailAddress");
	    webActions.sendKeysByChar(txt_DateOpened, DateTime.now().toString("MMddyyyy"), "Date opened");
	    webActions.sendKeysByChar(txt_FirstPaymentDate, DateTime.now().toString("MMddyyyy"), "First Payment Date");
	    webActions.sendKeysByChar(txt_PaymentAmount, faker.random().nextInt(500, 600).toString(), "Payment Amount");
	    webActions.sendKeysByChar(txt_MaturityDate, DateTime.now().plusYears(1).toString("MMddyyyy"),
		    "Maturity Date");
	    if (getTestDataMap().get("SelectedProduct") != null ? getTestDataMap().get("SelectedProduct").toString()
		    .equalsIgnoreCase("Commercial Large Ticket Equipment") : false) {
		webActions.waitAndSendKeysByCharAuto(txt_TeamDesignation, "Blue", "TeamDesignation");
	    }
	    webActions.scrollIntoViewByJS(btn_Complete, "Complete");
	    webActions.waitAndCickBYJS(btn_Complete, "Complete");
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_EquipmentChecklistState, "Application Verification");
	    common.assertTaskStatusDone(lbl_EquipmentChecklistState);
	    report.reportPass("Equipment ChecklistTask");
	} catch (Exception e) {
	    report.reportHardFail(e, "Equipment Checklist Task Failed");
	}
    }

    public void holdEquipmentCheckList() {
	try {
	    common.focusTask(lbl_EquipmentChecklistState, "Check in Loan Package");
	    common.performAndBeginWork();
	    common.clickOnHoldTask();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_EquipmentChecklistState, "Application Verification");
	    common.assertTaskStatusOnHold(lbl_EquipmentChecklistState);
	    report.reportPass("Equipment ChecklistTask");
	} catch (Exception e) {
	    report.reportHardFail(e, "Equipment Checklist Task Failed");
	}
    }

    public void smeFunding() {
	try {
	    common.focusTask(lbl_SMEFunding, "Check in Loan Package");
	    common.performAndBeginWork();
	    webActions.waitAndCickBYJS(btn_FinishProcess, "Complete");
	    common.clickYesButtonInDialog();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_SMEFunding, "Application Verification");
	    common.assertTaskStatusDone(lbl_SMEFundingState);
	    report.reportPass("SME Funding Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "SME Funding Task Failed");
	}
    }

    public void holdSMEFunding() {
	try {
	    common.focusTask(lbl_SMEFunding, "Check in Loan Package");
	    common.performAndBeginWork();
	    common.clickOnHoldTask();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_SMEFunding, "Application Verification");
	    common.assertTaskStatusOnHold(lbl_SMEFundingState);
	    report.reportPass("SME Funding Task on Hold");
	} catch (Exception e) {
	    report.reportHardFail(e, "SME Funding Task on Hold Failed");
	}
    }

    public void smeCreditAnalystApproval() {
	try {
	    common.addAssignedGroup(lbl_SMECreditAnalystApproval, "Check in Loan Package");
	    common.performAndBeginWork();
	    webActions.waitAndCickBYJS(btn_Approve, "Approve");
	    common.clickYesButtonInDialog();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_SMECreditAnalystApproval, "Application Verification");
	    common.assertTaskStatusDone(lbl_SMECreditAnalystApprovalState);
	    report.reportPass("SME Credit Analyst Approval Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "SME Credit Analyst Approval Task Failed");
	}
    }

    public void declineSMECreditAnalystApproval() {
	try {
	    common.addAssignedGroup(lbl_SMECreditAnalystApproval, "Check in Loan Package");
	    common.performAndBeginWork();
	    common.clickDeclineTask();
	    common.clickYesButtonInDialog();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_SMECreditAnalystApproval, "Application Verification");
	    common.assertTaskStatusDeclined(lbl_SMECreditAnalystApprovalState);
	    report.reportPass("Decline SME Credit Analyst Approval Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Decline SME Credit Analyst Approval Task Failed");
	}
    }

    public void seniorSMECreditAnalystApproval() {
	try {
	    common.selectTask(lbl_SeniorCreditAnalystApprovalState, "Check in Loan Package");
	    common.performAndBeginWork();
	    webActions.waitAndCickBYJS(btn_Approve, "Approve");
	    common.clickYesButtonInDialog();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_SeniorCreditAnalystApprovalState, "Application Verification");
	    common.assertTaskStatusDone(lbl_SeniorCreditAnalystApprovalState);
	    report.reportPass("Senior SME Credit Analyst Approval Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Senior SME Credit Analyst Approval Task Failed");
	}
    }

    private void selectMatchScore(WebElement element, String elementName) throws Exception {
	int iteration = 0;
	do {
	    try {
		webActions.doubleClick(element, elementName);
		Thread.sleep(8000);
		iteration++;
	    } catch (Exception e) {
		break;
	    }
	} while (iteration < 3);
    }

    public void assignUnderWriterTask() {
	try {
	    common.addAssignedGroup(lbl_AssignUnderwriter, "Assign Underwriter");
	    common.performAndBeginWork();
	    webActions.waitAndCickBYJS(btn_Complete, "Complete");
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_AssignUnderwriter, "Assign Underwriter");
	    common.assertTaskStatusDone(lbl_AssignUnderwriterState);
	    report.reportPass("Assign UnderWriter Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Assign UnderWriter Task Failed");
	}
    }

    public void onHoldAssignUnderWriterTask() {
	try {
	    common.addAssignedGroup(lbl_AssignUnderwriter, "Assign Underwriter");
	    common.performAndBeginWork();
	    common.clickOnHoldTask();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_AssignUnderwriter, "Assign Underwriter");
	    common.assertTaskStatusOnHold(lbl_AssignUnderwriterState);
	    report.reportPass("Assign UnderWriter Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Assign UnderWriter Task Failed");
	}
    }

    public void scoringTask() {
	try {
	    common.addAssignedGroup(lbl_ScoringTask, "Scoring Task");
	    common.performAndBeginWork();
//			webActions.clickBYJS(btn_RequestProviders, "Request Providers");
//			webActions.waitUntilDisplayed(lbl_ResponseReceived, "Response Received");
////			global.assertStringEquals(lbl_ResponseReceivedApproved.getText(), "Approved");
////			webActions.clickByJSAndWaitUntilNotPresent(btn_OK, "ok"); 
////			
//			webActions.waitUntilDisplayed(btn_AddToSet, "Add To Set");
//			selectMatchScore(lbl_TableRow, "Match Score Table Row");
//			webActions.clickBYJS(btn_OK, "ok");
//			webActions.waitUntilNotPresent(btn_OK, "ok");
	    webActions.waitAndCickBYJS(btn_Complete, "Complete");
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_ScoringTask, "Scoring Task");
	    common.assertTaskStatusDone(lbl_ScoringTaskState);
	    report.reportPass("Scoring Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Scoring Task Failed");
	}
    }

    public void holdScoringTask() {
	try {
	    common.addAssignedGroup(lbl_ScoringTask, "Scoring Task");
	    common.performAndBeginWork();
	    common.clickOnHoldTask();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_ScoringTask, "Scoring Task");
	    common.assertTaskStatusOnHold(lbl_ScoringTaskState);
	    report.reportPass("Scoring Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Scoring Task Failed");
	}
    }

    public void declineScoringTask() {
	try {
	    common.addAssignedGroup(lbl_ScoringTask, "Scoring Task");
	    common.performAndBeginWork();
	    common.clickDeclineTask();
	    common.clickYesButtonInDialog();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_ScoringTask, "Scoring Task");
	    common.assertTaskStatusDeclined(lbl_ScoringTaskState);
	    report.reportPass("Scoring Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Scoring Task Failed");
	}
    }

    public void backgroundSearchesUCCFilingsTaskTask() {
	try {
	    common.addAssignedGroup(lbl_BackGroundSearchsUCCFilingsTask, "BackGround Searchs UCC Filings Task");
	    common.performAndBeginWork();
	    webActions.waitAndCickBYJS(btn_Complete, "Complete");
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_BackGroundSearchsUCCFilingsTask, "BackGround Searchs UCC Filings Task");
	    common.assertTaskStatusDone(lbl_BackGroundSearchsUCCFilingsTaskState);
	    report.reportPass("BackGround Searchs UCC Filings Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "BackGround Searchs UCC Filing Task Failed");
	}
    }

    public void holdBackgroundSearchesUCCFilingsTaskTask() {
	try {
	    common.addAssignedGroup(lbl_BackGroundSearchsUCCFilingsTask, "BackGround Searchs UCC Filings Task");
	    common.performAndBeginWork();
	    common.clickOnHoldTask();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_BackGroundSearchsUCCFilingsTask, "BackGround Searchs UCC Filings Task");
	    common.assertTaskStatusOnHold(lbl_BackGroundSearchsUCCFilingsTaskState);
	    report.reportPass("BackGround Searchs UCC Filings Task On Hold");
	} catch (Exception e) {
	    report.reportHardFail(e, "BackGround Searchs UCC Filing Task On Hold Failed");
	}
    }

    public void DebtorCreditReviewTask() {
	try {
	    common.addAssignedGroup(lbl_DebtorCreditReview, "Debtor Credit Review");
	    common.performAndBeginWork();
	    webActions.waitAndCickBYJS(btn_Complete, "Complete");
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_DebtorCreditReview, "Debtor Credit Review");
	    common.assertTaskStatusDone(lbl_DebtorCreditReviewTaskState);
	    report.reportPass("Debtor Credit Review Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Debtor Credit Review Task Failed");
	}
    }

    public void holdDebtorCreditReviewTask() {
	try {
	    common.addAssignedGroup(lbl_DebtorCreditReview, "Debtor Credit Review");
	    common.performAndBeginWork();
	    common.clickOnHoldTask();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_DebtorCreditReview, "Debtor Credit Review");
	    global.assertEquals(lbl_DebtorCreditReviewTaskState.getText(), "On hold");
	    report.reportPass("Debtor Credit Review Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Debtor Credit Review Task Failed");
	}
    }

    public void TaxGuardReport8821() {
	try {
	    common.addAssignedGroup(lbl_TaxGuardReport8821, "Tax Guard Report 8821");
	    common.performAndBeginWork();
	    webActions.clickBYJS(chk_TaxGuardSentForApproval, "Tax Guard sent for Approval");
	    webActions.clickBYJS(chk_8821ReceivedAndTaxGuardOrderes, "8821 Received & Tax Guard Ordered");
	    webActions.clickBYJS(chk_TaxGuardApproved, "Tax Guard Approved");
	    webActions.clickBYJS(chk_8821CreatedAndSent, "8821 Created & Sent");
	    webActions.clickBYJS(chk_AttachmentsSaved, "Attachments Saved");
	    webActions.waitUntilPresentAndDisplayed(lbl_ConfirmCompleteTask, "Confirm Complete Task");
	    common.clickYesButtonInDialog();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_TaxGuardReport8821, "Check in Loan Package");
	    common.assertTaskStatusDone(lbl_TaxGuardReport8821TaskState);
	    report.reportPass("TaxGuard Report 8821 Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "TaxGuard Report 8821 Task Failed");
	}
    }

    public void holdTaxGuardReport8821() {
	try {
	    common.addAssignedGroup(lbl_TaxGuardReport8821, "Tax Guard Report 8821");
	    common.performAndBeginWork();
	    common.clickOnHoldTask();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_TaxGuardReport8821, "Check in Loan Package");
	    common.assertTaskStatusOnHold(lbl_TaxGuardReport8821TaskState);
	    report.reportPass("TaxGuard Report 8821 Task On Hold");
	} catch (Exception e) {
	    report.reportHardFail(e, "TaxGuard Report 8821 Task On Hold Failed");
	}
    }

    public void tmsDiscoveryAndSetup() {
	try {
	    addAccountSection();
	    common.addAssignedGroup(lbl_TMSDiscoveryAndSetup, "TMS Discovery and Setup");
	    common.performAndBeginWork();
	    webActions.waitAndCickBYJS(btn_Complete, "Complete");
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_TMSDiscoveryAndSetup, "TMS Discovery and Setup ");
	    common.assertTaskStatusDone(lbl_TMSDiscoveryAndSetupTaskState);
	    report.reportPass("TMS Discovery and Setup Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "TMS Discovery and Setup Task Failed");
	}
    }

    public void holdTMSDiscoveryAndSetup() {
	try {
	    addAccountSection();
	    common.addAssignedGroup(lbl_TMSDiscoveryAndSetup, "TMS Discovery and Setup");
	    common.performAndBeginWork();
	    common.clickOnHoldTask();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_TMSDiscoveryAndSetup, "TMS Discovery and Setup ");
	    common.assertTaskStatusOnHold(lbl_TMSDiscoveryAndSetupTaskState);
	    report.reportPass("Hold TMS Discovery and Setup Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Hold TMS Discovery and Setup Task Failed");
	}
    }

    private void addAccountSection() {
	try {
	    webActions.scrollIntoViewByJS(txt_InitialFundingAmount, "Initial Funding Amount");
	    webActions.sendKeysByChar(txt_InitialFundingAmount, faker.number().numberBetween(100, 500) + "",
		    "Initial Funding Amount");
	    webActions.sendKeysByChar(txt_FirstFundDate, DateTime.now().toString("MMddyyyy"), "First Fund Date");
	    if (getTestDataMap().get("SelectedProduct").toString()
		    .equalsIgnoreCase("Commercial Large Ticket Factoring")) {
		webActions.sendKeysByCharWithWait(txt_FSAccount, faker.lorem().characters(6) + "", "FS Account");
		webActions.sendKeysByCharWithWait(txt_TermLoanAccount, faker.number().numberBetween(100, 500) + "",
			"Term Loan Amount");
		webActions.sendKeysByCharWithWait(txt_OperatingAccount, faker.number().numberBetween(100, 500) + "",
			"Operating Account");
		webActions.sendKeysByCharWithWait(txt_OperatingAccount, Keys.TAB + "", "Operating Account");
	    } else {
		webActions.sendKeysByCharWithWait(txt_StuckyAccount, "1", "Stucky Account");
		webActions.sendKeysByCharWithWait(txt_LockBox, "1", "Lock Box");
		webActions.sendKeysByCharWithWait(txt_OperatingAccounts, "1", "Operating Accounts");
		webActions.sendKeysByCharWithWait(txt_38OperatingAccounts, "1", "38 Operating Account");
		webActions.sendKeysByCharWithWait(txt_38OperatingAccounts, "1", "38 Operating Account");
		webActions.sendKeysByCharWithWait(txt_38OperatingAccounts, Keys.TAB + "", "38 Operating Account");
	    }
	    common.clickSaveButton();
	    webActions.waitUntilPresentAndDisplayed(lbl_ApplicationSaved, "Application Saved Label");
	    report.reportPass("Add Account Section Saved");
	} catch (Exception e) {
	    report.reportHardFail(e, "Add Account Section Saved Failed");
	}
    }

    public void legalsPrepration() {
	try {
	    common.addAssignedGroup(lbl_LegalsPeparation, "Legals preparation");
	    common.performAndBeginWork();
	    webActions.waitAndCickBYJS(btn_Complete, "Complete");
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_LegalsPeparation, "TMS Discovery and Setup ");
	    common.assertTaskStatusDone(lbl_LegalsPeparationTaskState);
	    report.reportPass("Legals preparation Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Legals preparation Task Failed");
	}
    }

    public void legalDocsExecution() {
	try {
	    common.addAssignedGroup(lbl_LegalDocsExecution, "Legal Docs Execution");
	    common.performAndBeginWork();
	    webActions.clickBYJS(chk_FullyExecutedDocsReceived, "Fully Executed Docs Received");
	    webActions.clickBYJS(chk_LegalsSent, "Legals Sent");
	    common.clickYesButtonInDialog();
	    // webActions.waitAndCickBYJS(btn_Complete, "Complete");
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_LegalDocsExecution, "Legal Docs Execution");
	    common.assertTaskStatusDone(lbl_LegalDocsExecutionTaskState);
	    report.reportPass("Legal Docs Execution Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Legal Docs Execution Task Failed");
	}
    }

    public void legalDocuments() {
	try {
	    common.addAssignedGroup(lbl_LegalDocuments, "Documents");
	    common.performAndBeginWork();
	    webActions.waitAndCickBYJS(btn_Complete, "Complete");
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_LegalDocuments, "Legal Docs Execution");
	    common.assertTaskStatusDone(lbl_LegalDocumentsTaskState);
	    report.reportPass("Legal Documents Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Legal Documents Task Failed");
	}
    }

    public void loanAccountSetup() {
	try {
	    common.addAssignedGroup(lbl_LoanAccountSetup, "Loan Account Setup");
	    common.performAndBeginWork();
	    webActions.waitAndCickBYJS(btn_Complete, "Complete");
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_LoanAccountSetup, "Loan Account Setup");
	    common.assertTaskStatusDone(lbl_LoanAccountSetupTaskState);
	    report.reportPass("Loan Account Setup Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Loan Account Setup Task Failed");
	}
    }

    public void prefundingLegalReview() {
	try {
	    common.addAssignedGroup(lbl_PrefundingLegalReview, "Prefunding Legal Review");
	    common.performAndBeginWork();
	    webActions.waitAndCickBYJS(btn_Complete, "Complete");
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_PrefundingLegalReview, "Prefunding Legal Review");
	    common.assertTaskStatusDone(lbl_PrefundingLegalReviewTaskState);
	    report.reportPass("Prefunding Legal Review Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Prefunding Legal Review Task Failed");
	}
    }

    public void holdPrefundingLegalReview() {
	try {
	    common.addAssignedGroup(lbl_PrefundingLegalReview, "Prefunding Legal Review");
	    common.performAndBeginWork();
	    common.clickOnHoldTask();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_PrefundingLegalReview, "Prefunding Legal Review");
	    common.assertTaskStatusOnHold(lbl_PrefundingLegalReviewTaskState);
	    report.reportPass("Hold Prefunding Legal Review Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Hold Prefunding Legal Review Task Failed");
	}
    }

    public void fundingTask() {
	try {
	    common.addAssignedGroup(lbl_Funding, "Funding");
	    common.performAndBeginWork();
	    webActions.waitAndCickBYJS(btn_FinishProcess, "Finish process");
	    common.clickYesButtonInDialog();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_Funding, "Funding");
	    common.assertTaskStatusDone(lbl_FundingTaskState);
	    report.reportPass("Funding Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Funding Task Failed");
	}
    }

    public void tmsOnBoarding() {
	try {
	    common.addAssignedGroup(lbl_TMSOnBoarding, "TMS OnBoarding");
	    common.performAndBeginWork();
	    webActions.waitAndCickBYJS(btn_Complete, "Complete");
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_TMSOnBoarding, "TMS OnBoarding");
	    common.assertTaskStatusDone(llbl_TMSOnBoardingTaskState);
	    report.reportPass("TMS OnBoarding Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "TMS OnBoarding Task Failed");
	}
    }

    public void attachSignedApplicationAndTermSheetTask() {
	try {
	    common.addAssignedGroup(lbl_AttachSignedApplicationAndTermSheetTask,
		    "Attach Signed Application and Term Sheet Task");
	    common.performAndBeginWork();
	    webActions.waitAndCickBYJS(btn_Complete, "Complete");
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_AttachSignedApplicationAndTermSheetTask,
		    "Attach Signed Application and Term Sheet Task");
	    common.assertTaskStatusDone(lbl_AttachSignedApplicationAndTermSheetTaskState);
	    report.reportPass("Attach Signed Application and Term Sheet Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Attach Signed Application and Term Sheet Task Failed");
	}
    }

    public void generateVerificationLetter() {
	try {
	    common.addAssignedGroup(lbl_GenerateVerificationLetterTask, "Generate Verification Letter");
	    common.performAndBeginWork();
	    webActions.clickBYJS(btn_GenerateLetter, "Generate Letter");
	    webActions.waitUntilPresentAndDisplayed(lbl_LettersGeneratedSuccessfullyMessage,
		    "Letters Generated Successfully");
	    webActions.waitAndCickBYJS(btn_Complete, "Complete");
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_GenerateVerificationLetterTask, "Generate Verification Letter Task");
	    common.assertTaskStatusDone(lbl_GenerateVerificationLetterTaskState);
	    report.reportPass("Generate Verification Letter Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Generate Verification Letter Task Failed");
	}
    }

    public void approveOneTask() {
	try {
	    webActions.waitUntilPresent(lbl_ApproveOne, "Approve (1)");
	    common.addAssignedGroup(lbl_ApproveOne, "Approve (1)");
	    common.performAndBeginWork();
	    webActions.waitAndCickBYJS(btn_Approve, "Approve");
	    common.clickYesButtonInDialog();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_ApproveOne, "Approve (1) Task");
	    common.assertTaskStatusDone(lbl_ApproveOneTaskState);
	    report.reportPass("Approve (1) Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Approve (1) Task Failed");
	}
    }

    public void declineApproveOneTask() {
	try {
	    common.addAssignedGroup(lbl_ApproveOne, "Approve (1)");
	    common.performAndBeginWork();
	    common.clickDeclineTask();
	    common.clickYesButtonInDialog();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_ApproveOne, "Approve (1) Task");
	    common.assertTaskStatusDeclined(lbl_ApproveOneTaskState);
	    report.reportPass("Decline Approve (1) Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Decline Approve (1) Task Failed");
	}
    }

    public void denyApproveOneTask() {
	try {
	    common.addAssignedGroup(lbl_ApproveOne, "Approve (1)");
	    common.performAndBeginWork();
	    common.clickDenyTask();
	    common.clickYesButtonInDialog();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_ApproveOne, "Approve (1) Task");
	    common.assertTaskStatusDenied(lbl_ApproveOneTaskState);
	    report.reportPass("Deny Approve (1) Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Deny Approve (1) Task Failed");
	}
    }

    public void approveTwoTask() {
	try {
	    common.addAssignedGroup(lbl_ApproveTwo, "Approve (2)");
	    common.performAndBeginWork();
	    webActions.waitAndCickBYJS(btn_Approve, "Approve");
	    common.clickYesButtonInDialog();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_ApproveTwo, "Approve (2) Task");
	    common.assertTaskStatusDone(lbl_ApproveTwoTaskState);
	    report.reportPass("Approve (2) Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Approve (2) Task Failed");
	}
    }

    public void declineApproveTwoTask() {
	try {
	    common.performAndBeginWork();
	    common.clickDeclineTask();
	    common.clickYesButtonInDialog();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_ApproveTwo, "Approve (2) Task");
	    common.assertTaskStatusDeclined(lbl_ApproveTwoTaskState);
	    report.reportPass("Decline Approve (2) Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Decline Approve (2) Task Failed");
	}
    }

    public void denyApproveTwoTask() {
	try {
	    common.performAndBeginWork();
	    common.clickDenyTask();
	    common.clickYesButtonInDialog();
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_ApproveTwo, "Approve (2) Task");
	    common.assertTaskStatusDenied(lbl_ApproveTwoTaskState);
	    report.reportPass("Deny Approve (2) Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Deny Approve (2) Task Failed");
	}
    }

    public void arVerification() {
	try {
	    common.addAssignedGroup(lbl_ARVerification, "A/R Verification");
	    common.performAndBeginWork();
	    webActions.waitAndCickBYJS(btn_Complete, "Complete");
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_ARVerification, "A/R Verification Task");
	    common.assertTaskStatusDone(lbl_ARVerificationTaskState);
	    report.reportPass("A/R Verification Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "A/R Verification Task Failed");
	}
    }

    public void prefundingReview() {
	try {
	    common.addAssignedGroup(lbl_PrefundingReview, "Prefunding  Review");
	    common.performAndBeginWork();
	    webActions.waitAndCickBYJS(btn_Complete, "Complete");
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_PrefundingReview, "Prefunding  Review");
	    common.assertTaskStatusDone(lbl_PrefundingReviewTaskState);
	    report.reportPass("Prefunding  Review Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Prefunding  Review Task Failed");
	}
    }

    public void assertDeclineReviewTaskGenerated() {
	try {
	    webActions.scrollIntoViewByJS(lbl_DeclineReview, "Decline Review");
	    global.assertEquals(lbl_DeclineReview.isDisplayed(), true);
	    report.reportPass("Prefunding  Review Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Prefunding  Review Task Failed");
	}
    }

    public void declineReview() {
	try {
	    common.addAssignedGroup(lbl_DeclineReview, "Decline  Review");
	    common.performAndBeginWork();
	    webActions.waitAndCickBYJS(btn_Complete, "Complete");
	    common.resumeCreatedApplication();
	    common.focusTask(lbl_PrefundingReview, "Prefunding  Review");
	    common.assertTaskStatusDone(lbl_PrefundingReviewTaskState);
	    report.reportPass("Prefunding  Review Task");
	} catch (Exception e) {
	    report.reportHardFail(e, "Prefunding  Review Task Failed");
	}
    }
}
