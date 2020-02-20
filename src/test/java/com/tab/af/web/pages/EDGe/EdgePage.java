package com.tab.af.web.pages.EDGe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.tab.af.testbase.TestBase;
import com.tab.af.web.pages.BasePage;

public class EdgePage extends BasePage {
    public EdgePage() {
	PageFactory.initElements(driver, this);
    }

    long fileDownloadTimeOut = Long.parseLong(TestBase.props.get("file.Download.Timeout").toString());
    @FindBy(xpath = "//span[@class='v-tabsheet-caption-close']")
    private WebElement btn_CloseTab;
    @FindBy(xpath = "//span[text()='AR']")
    private WebElement mnu_AR;
    @FindBy(xpath = "//span[text()='NOA Management']//following::span[2]")
    private WebElement mnu_NOAManagement;
    @FindBy(xpath = "//span[text()='Invoices']")
    private WebElement mnu_Invoices;
    @FindBy(xpath = "//span[text()='Factorsoft']//following::span[2]")
    private WebElement mnu_Factorsoft;
    @FindBy(xpath = "//span[text()='NOA Clients']")
    private WebElement smnu_NOAClients;
    @FindBy(xpath = "//span[text()='NOA Queues']")
    private WebElement smnu_NOAQueues;
    @FindBy(xpath = "//span[text()='NOA Templates']")
    private WebElement smnu_NOATemplates;
    @FindBy(xpath = "//span[text()='NOA Files']")
    private WebElement smnu_NOAFiles;
    @FindBy(xpath = "//span[text()='Add search condition']")
    private WebElement btn_AddSeachCondition;
    @FindBy(xpath = "//div[text() = 'Company']//following::input[1]")
    private WebElement txt_Company;
    @FindBy(xpath = "//div[text() = 'Lockbox']//following::input[1]")
    private WebElement txt_LockBox;
    @FindBy(xpath = "//div[text() = 'Type']//following::input[1]")
    private WebElement txt_Type;
    @FindBy(xpath = "//div[text() = 'Ban Control']//following::input[1]")
    private WebElement txt_BanControl;
    @FindBy(xpath = "//span[text() = 'Submit']")
    private WebElement btn_Submit;
    @FindBy(xpath = "//span[text() = 'Clear All']")
    private WebElement btn_ClearAll;
    @FindBy(xpath = "//span[text() = 'Search']")
    private WebElement btn_Search;
    @FindBy(xpath = "//span[text() = 'Create']")
    private WebElement btn_Create;
    @FindBy(xpath = "//span[text() = 'Edit']/..//parent::div")
    private WebElement btn_Edit;
    @FindBy(xpath = "//span[text() = 'Quick NOA']")
    private WebElement btn_QuickNOA;
    @FindBy(xpath = "//span[text() = 'Mass NOA']")
    private WebElement btn_MassNOA;
    @FindBy(xpath = "//span[text() = 'Release NOA']//..//parent::div")
    private WebElement btn_ReleaseNOA;
    @FindBy(xpath = "//span[text() = 'Add to set']")
    private WebElement btn_AddToSet;
    @FindBy(xpath = "//table[@class='v-table-table']/tbody/tr[1]")
    private WebElement tbl_FirstRow;
    @FindBy(xpath = "//span[text()='Cancel']")
    private WebElement btn_Cancel;
    @FindBy(xpath = "//div[text()='Cover Letter']//following::input[1]")
    private WebElement txt_CoverLetter;
    @FindBy(xpath = "//div[text()='Statement Document']//following::input[1]")
    private WebElement txt_StatementDocument;
    @FindBy(xpath = "//div[text()='Verification Document']//following::input[1]")
    private WebElement txt_VerificationDocument;
    @FindBy(xpath = "//div[text()='Account Id']//following::input[1]")
    private WebElement txt_AcctId;
    @FindBy(xpath = "//div[text()='Remittence Email']//following::input[1]")
    private WebElement txt_RemittenceEmail;
    @FindBy(xpath = "//div[text()='Status']//following::input[1]")
    private WebElement txt_Status;
    @FindBy(xpath = "//div[text()='Invoice Over Age']//following::input[1]")
    private WebElement txt_InvoiceOverAge;
    @FindBy(xpath = "//div[text()='Lockbox Id']//following::input[1]")
    private WebElement txt_LockboxId;
    @FindBy(xpath = "//span[text()='OK']")
    private WebElement btn_OK;
    @FindBy(xpath = "(//span[text()='OK'])[2]")
    private WebElement btn_EntityDocumentVersionEditorOk;
    @FindBy(xpath = "//div[text()='Client']//following::input[1]")
    private WebElement txt_Client;
    @FindBy(xpath = "//div[text()='Debtor']//following::input[1]")
    private WebElement txt_Debtor;
    @FindBy(xpath = "//label[text()='Statement Document']//preceding::input[1]")
    private WebElement chk_StatDocument;
    @FindBy(xpath = "//label[text()='Verification Document']//preceding::input[1]")
    private WebElement chk_VerifDocument;
    @FindBy(xpath = "//label[text()='Cover Letter']//preceding::input[1]")
    private WebElement chk_CoverLetter;
    @FindBy(xpath = "//label[text()='NOA Agreement']//preceding::input[1]")
    private WebElement chk_NOAAgreement;
    @FindBy(xpath = "//label[text()='Override Debtor']//preceding::input[1]")
    private WebElement chk_OverrideDebtor;
    @FindBy(xpath = "//div[text()='Debtor']//following::div[3]")
    private WebElement btn_Debtor;
    @FindBy(xpath = "//div[@class='popupContent']//table/tbody/tr[2]/td")
    private WebElement opt_DebtorValue;
    @FindBy(xpath = "(//div[text()='Type']//following::input)[1]")
    private WebElement txt_ReleaseType;
    @FindBy(xpath = "//h1[contains(text(),'Quick NOA record')]")
    private WebElement msg_QuickNOA;
    @FindBy(xpath = "//h1[contains(text(),'Mass NOA record')]")
    private WebElement msg_MassNOA;
    @FindBy(xpath = "//h1[contains(text(),'Release NOA record')]")
    private WebElement msg_ReleaseNOA;
    @FindBy(xpath = "//label[text()='General Release']//preceding::input[1]")
    private WebElement chk_GeneralRelease;
    @FindBy(xpath = "//div[text() = 'Method']//following::input[1]")
    private WebElement txt_Method;
    @FindBy(xpath = "//span[text()='Yes']")
    private WebElement btn_Yes;
    @FindBy(xpath = "//span[text()='Set']//following::input[1]")
    private WebElement txt_Set;
    @FindBy(xpath = "//span[text()='Create new']")
    private WebElement btn_CreateNew;
    @FindBy(xpath = "//span[text()='Insert']")
    private WebElement btn_Insert;
    @FindBy(xpath = "//span[text()='Folder Name']//following::input[1]")
    private WebElement txt_FolderName;
    @FindBy(xpath = "//div[text()='Name']//following::input[3]")
    private WebElement txt_TemplateName;
    @FindBy(xpath = "//span[text()='Screen Caption']//following::input[1]")
    private WebElement txt_ScreenCaption;
    @FindBy(xpath = "//span[text()='Parent Folder']//following::input[1]")
    private WebElement txt_ParentFolder;
    @FindBy(xpath = "//span[text()='Order No']//following::input[1]")
    private WebElement txt_OrderNumber;
    @FindBy(xpath = "//span[text()='Clear Date']")
    private WebElement btn_Cleardate;
    @FindBy(xpath = "//span[text()='View']")
    private WebElement btn_View;
    @FindBy(xpath = "//span[text()='Resend']")
    private WebElement btn_Resend;
    @FindBy(xpath = "//span[text()='Mailed']")
    private WebElement btn_Mailed;
    @FindBy(xpath = "//span[text()='Success']")
    private WebElement btn_Success;
    @FindBy(xpath = "//span[text()='Failed']")
    private WebElement btn_Failed;
    @FindBy(xpath = "//span[text()='Remove']/..//parent::div")
    private WebElement btn_Remove;
    @FindBy(xpath = "//div[text()='Start Date']//following::input[1]")
    private WebElement txt_StartDate;
    @FindBy(xpath = "//div[text()='End Date']//following::input[1]")
    private WebElement txt_EndDate;
    @FindBy(xpath = "//div[text()='NOA Status']//following::input[1]")
    private WebElement txt_NOAStatus;
    @FindBy(xpath = "//div[text()='NOA Type']//following::input[1]")
    private WebElement txt_NOAType;
    @FindBy(xpath = "//span[text()='Excel']")
    private WebElement btn_Excel;
    @FindBy(xpath = "//span[text()='Selected rows']")
    private WebElement btn_SelectedRows;
    @FindBy(xpath = "//span[text() = 'View File']")
    private WebElement btn_ViewFile;
    @FindBy(xpath = "//div[text() = 'Document Type']//following::input[@type='text']")
    private WebElement txt_DocumentType;
    @FindBy(xpath = "(//span[text()='Create'])[2]")
    private WebElement btn_CreateDocumentVersion;
    @FindBy(xpath = "//span[text()='Html']//following::textarea")
    private WebElement txt_HTMLTextBox;
    @FindBy(xpath = "//div[@class='v-slot v-slot-c-paging-status']//child::div[contains(text(),'row')]")
    private WebElement lbl_RowsCount;

    public void verifyNOAClientsPageOptions() {
	try {
	    webActions.waitForVisibility(txt_Company, "Company");
	    webActions.assertDisplayed(txt_Company, "Company");
	    webActions.assertDisplayed(txt_LockBox, "LockBox");
	    webActions.assertDisplayed(btn_Submit, "Submit");
	    webActions.assertDisplayed(txt_Type, "Type");
	    webActions.assertDisplayed(txt_BanControl, "BanControl");
	    webActions.assertDisplayed(btn_Submit, "Submit");
	    webActions.assertDisplayed(btn_ClearAll, "ClearAll");
	    webActions.assertDisplayed(btn_Search, "Search");
	    webActions.assertDisplayed(btn_Create, "Create");
	    webActions.assertDisplayed(btn_Edit, "Edit");
	    webActions.assertDisplayed(btn_QuickNOA, "QuickNOA");
	    webActions.assertDisplayed(btn_MassNOA, "MassNOA");
	    webActions.assertDisplayed(btn_ReleaseNOA, "ReleaseNOA");
	    webActions.assertDisplayed(btn_AddToSet, "AddToSet");
	    report.reportPass("All Options are Displayed from NOA Clients page");
	} catch (Exception e) {
	    report.reportHardFail(e, "All Options not Displayed from NOA Clients page");
	}
    }

    public void verifyNOAClientsEditPageOptions() {
	try {
	    webActions.clickBYJS(btn_Edit, "Edit Button");
	    webActions.waitForVisibility(txt_LockboxId, "Lock Box Id");
	    webActions.assertDisplayed(txt_LockboxId, "LockboxId");
	    webActions.assertDisplayed(txt_InvoiceOverAge, "InvoiceOverAge");
	    webActions.assertDisplayed(txt_Status, "Status");
	    webActions.assertDisplayed(txt_RemittenceEmail, "_RemittenceEmail");
	    webActions.assertDisplayed(txt_AcctId, "AcctId");
	    webActions.assertDisplayed(txt_VerificationDocument, "VerificationDocument");
	    webActions.assertDisplayed(txt_StatementDocument, "StatementDocument");
	    webActions.assertDisplayed(txt_CoverLetter, "CoverLetter");
	    webActions.assertDisplayed(btn_Cancel, "Cancel");
	    webActions.assertDisplayed(btn_OK, "OK");
	    report.reportPass("All Options are Displayed from NOA Clients edit page");
	} catch (Exception e) {
	    report.reportHardFail(e, "All Options not Displayed from NOA Clients edit page");
	}
    }

    public void selectRecord() {
	try {
	    webActions.waitUntilPresentAndDisplayed(tbl_FirstRow, "Table");
	    webActions.clickAction(tbl_FirstRow, "Edit Button");
	    webActions.waitUntilEnabledCubaButton(btn_Edit, "Edit Button");
	    webActions.clickAction(tbl_FirstRow, "Edit Button");
	    report.reportPass("Selected first record from the table");
	} catch (Exception e) {
	    report.reportHardFail(e, "Failed to select record from the table");
	}
    }

    public void updateEmail() {
	try {
	    String ramdomNum = faker.number().digits(4);
	    String updatedEmail = "Email" + ramdomNum + "@tabbank.com";
	    getTestDataMap().put("updatedEmail", updatedEmail);
	    webActions.clearByJS(txt_RemittenceEmail, "Email");
	    webActions.waitAndSendKeysByChar(txt_RemittenceEmail, updatedEmail, "Updated Email");
	    webActions.clickBYJS(btn_OK, "OKs");
	    webActions.waitUntilPresentAndDisplayed(btn_Create, "Create");
	    report.reportPass("Updated email successfully");
	} catch (Exception e) {
	    report.reportHardFail(e, "Failed to Update email id");
	}
    }

    public void verifyUpdatedEmail() {
	try {
	    webActions.clickBYJS(btn_Edit, "Edit Button");
	    webActions.waitForVisibility(txt_LockboxId, "Lock Box Id");
	    String emailId = webActions.getValue(txt_RemittenceEmail, "Remittance Email");
	    String updatedEmail = getTestDataMap().get("updatedEmail").toString();
	    if (emailId.equalsIgnoreCase(updatedEmail)) {
		report.reportPass("Updated email verified successfully and updated email is " + emailId);
	    }
	} catch (Exception e) {
	    report.reportHardFail(e, "Failed to Verify updated email id");
	}
    }

    public void verifyQuickNOAOptions() {
	try {
	    webActions.clickBYJS(btn_QuickNOA, "Qucik NOA");
	    webActions.waitUntilPresentAndDisplayed(txt_Client, "Client Option");
	    webActions.assertDisplayed(txt_Client, "Client Option");
	    webActions.assertDisplayed(txt_Debtor, "Debtor Option");
	    webActions.assertDisplayed(chk_StatDocument, "Stat Document");
	    webActions.assertDisplayed(chk_VerifDocument, "Verify Document");
	    webActions.assertDisplayed(chk_CoverLetter, "Cover Letter");
	    webActions.assertDisplayed(chk_NOAAgreement, "NOA Agrement");
	    webActions.assertDisplayed(chk_OverrideDebtor, "Override Debtor");
	    webActions.assertDisplayed(btn_Cancel, "Cancel");
	    webActions.assertDisplayed(btn_OK, "OK");
	    report.reportPass("All Options are Displayed from Quick NOA window");
	} catch (Exception e) {
	    report.reportHardFail(e, "All Options not Displayed from Quick NOA ");
	}
    }

    public void updateQuickNOAOptions() {
	try {
	    webActions.clickBYJS(btn_QuickNOA, "Qucik NOA");
	    webActions.waitAndCickBYJS(btn_Debtor, "Debtor button");
	    webActions.waitAndCickBYJS(opt_DebtorValue, "Debtor Value");
	    webActions.clickBYJS(chk_VerifDocument, "Verify document check box");
	    webActions.clickBYJS(btn_OK, "OK button");
	    webActions.waitForVisibility(msg_QuickNOA, "Message");
	    webActions.assertDisplayed(msg_QuickNOA, "Qucik noa");
	    report.reportPass("Updated Quick NOA and created and displayed Quick NOA record added to Noa Queue.  ");
	} catch (Exception e) {
	    report.reportHardFail(e, "Failed to create Quick NOA ");
	}
    }

    public void verifyMassNOAOptions() {
	try {
	    webActions.clickBYJS(btn_MassNOA, "Mass NOA");
	    webActions.waitUntilPresentAndDisplayed(txt_Client, "Client");
	    webActions.assertDisplayed(txt_Client, "Client");
	    webActions.assertDisplayed(txt_Debtor, "Debtor");
	    webActions.assertDisplayed(chk_StatDocument, "Stat Document");
	    webActions.assertDisplayed(chk_VerifDocument, "Verification document");
	    webActions.assertDisplayed(chk_CoverLetter, "Cover leter");
	    webActions.assertDisplayed(chk_NOAAgreement, "NOA Agreement");
	    webActions.assertDisplayed(btn_Cancel, "Cancel");
	    webActions.assertDisplayed(btn_OK, "OK");
	    report.reportPass("All Options are Displayed from Mass NOA window");
	} catch (Exception e) {
	    report.reportHardFail(e, "All Options not Displayed from Mass NOA ");
	}
    }

    public void updateMassNOAOptions() {
	try {
	    webActions.clickBYJS(btn_MassNOA, "Mass NOA");
	    webActions.waitAndCickBYJS(btn_Debtor, "Debtor button");
	    webActions.waitAndCickBYJS(opt_DebtorValue, "Debtor Value");
	    webActions.clickBYJS(chk_VerifDocument, "Verify document check box");
	    webActions.clickBYJS(btn_OK, "OK button");
	    webActions.waitForVisibility(msg_MassNOA, "Message");
	    webActions.assertDisplayed(msg_MassNOA, "Mass NOA");
	    report.reportPass("Updated Mass NOA and created and displayed Mass NOA record added to Noa Queue.  ");
	} catch (Exception e) {
	    report.reportHardFail(e, "Failed to create Mass NOA ");
	}
    }

    public void verifyReleaseNOAOptions() {
	try {
	    webActions.clickBYJS(btn_ReleaseNOA, "Release NOA");
	    webActions.waitUntilPresentAndDisplayed(txt_Client, "Client");
	    webActions.assertDisplayed(txt_Client, "Client");
	    webActions.assertDisplayed(txt_Debtor, "Debtor");
	    webActions.assertDisplayed(chk_GeneralRelease, "General Release");
	    webActions.assertDisplayed(txt_Method, "method");
	    webActions.assertDisplayed(chk_OverrideDebtor, "Override Debtor");
	    webActions.assertDisplayed(btn_Cancel, "Cancel");
	    webActions.assertDisplayed(btn_OK, "OK");
	    report.reportPass("All Options are Displayed from Release NOA window");
	} catch (Exception e) {
	    report.reportHardFail(e, "All Options not Displayed from Release NOA ");
	}
    }

    public void updateReleaseNOAOptions() {
	try {
	    webActions.waitUntilEnabledAndCickBYJS(btn_ReleaseNOA, "Release NOA");
	    webActions.waitAndCickBYJS(btn_Debtor, "Debtor button");
	    webActions.waitAndCickBYJS(opt_DebtorValue, "Debtor Value");
	    webActions.clickBYJS(btn_OK, "OK button");
	    webActions.waitForVisibility(btn_Yes, "Yes button");
	    webActions.clickBYJS(btn_Yes, "Yes button");
	    webActions.waitForVisibility(msg_ReleaseNOA, "Message");
	    webActions.assertDisplayed(msg_ReleaseNOA, "");
	    report.reportPass("Updated Mass NOA and created and displayed Release NOA record added to Noa Queue.  ");
	} catch (Exception e) {
	    report.reportHardFail(e, "Failed to create Release NOA ");
	}
    }

    public void verifyAddToSetOptions() {
	try {
	    webActions.clickBYJS(btn_AddToSet, "Add to set");
	    webActions.waitUntilPresentAndDisplayed(txt_Set, "Set");
	    webActions.assertDisplayed(txt_Set, "Set");
	    webActions.assertDisplayed(btn_CreateNew, "Create New");
	    webActions.assertDisplayed(btn_Insert, "Insert");
	    report.reportPass("All Options are Displayed from Add to set window");
	} catch (Exception e) {
	    report.reportHardFail(e, "All Options not Displayed from Add to set ");
	}
    }

    public void createNewAddToSet() {
	try {
	    webActions.clickBYJS(btn_AddToSet, "Add to set");
	    webActions.waitAndCickBYJS(btn_CreateNew, "Create new Add to set");
	    webActions.waitUntilPresentAndDisplayed(txt_FolderName, "Folder Name");
	    webActions.assertDisplayed(txt_FolderName, "Folder Name");
	    webActions.assertDisplayed(txt_ScreenCaption, "Screen Caption");
	    webActions.assertDisplayed(txt_OrderNumber, "order Number");
	    webActions.assertDisplayed(txt_ParentFolder, "Parent Folder");
	    String ramdomNum = faker.number().digits(4);
	    String folderName = "Folder" + ramdomNum;
	    String orderNum = ramdomNum;
	    webActions.waitAndSendKeysByChar(txt_FolderName, folderName, "Folder Name");
	    webActions.waitAndSendKeysByChar(txt_OrderNumber, orderNum, "Oder Number");
	    webActions.clickBYJS(btn_OK, "OKs");
	    webActions.waitForVisibility(btn_Create, "Create button");
	    report.reportPass("Created new  Add to set successfully");
	} catch (Exception e) {
	    report.reportHardFail(e, "Failed to create new Add to set NOA ");
	}
    }

    public void searchAndVerifyApplicant(String type) {
	try {
	    webActions.SendKeysByCharAuto(txt_Type, type, "Client Type");
	    webActions.clickBYJS(btn_Search, "Search button");
	    webActions.waitForLoadingBarToAppear();
	    webActions.waitForLoadingBarToComplete();
	    webActions.waitUntilPresentAndDisplayed(tbl_FirstRow, "Table");
	    webActions.clickAction(tbl_FirstRow, "First row");
	    webActions.waitUntilEnabled(btn_Edit, "Edit button");
	    webActions.clickBYJS(btn_Edit, "Edit button");
	    webActions.waitForVisibility(txt_RemittenceEmail, "Email");
	    webActions.assertDisplayed(txt_LockboxId, "LockBox id");
	    webActions.assertDisplayed(txt_InvoiceOverAge, "Invoice Over Age");
	    webActions.assertDisplayed(txt_Status, "Status");
	    webActions.assertDisplayed(txt_RemittenceEmail, "Remittence Email");
	    webActions.assertDisplayed(txt_AcctId, "Acct ID");
	    webActions.assertDisplayed(txt_VerificationDocument, "Verification Documnt");
	    webActions.assertDisplayed(txt_StatementDocument, "Statement Document");
	    webActions.assertDisplayed(txt_CoverLetter, "Cover Letter");
	    webActions.assertDisplayed(btn_Cancel, "Cancel");
	    webActions.assertDisplayed(btn_OK, "OK");
	    report.reportPass("All Options are Displayed and verified from Applicant NOA window");
	} catch (Exception e) {
	    report.reportHardFail(e, "Failed to verify from Applicant NOA window ");
	}
    }

    public void verifyOptionsNOAQueues() {
	try {
	    webActions.waitUntilPresentAndDisplayed(txt_Client, "Client");
	    webActions.assertDisplayed(txt_Client, "Client");
	    webActions.assertDisplayed(txt_Debtor, "Debtor");
	    webActions.assertDisplayed(btn_Cleardate, "Cleardate");
	    webActions.assertDisplayed(btn_View, "View");
	    webActions.assertDisplayed(btn_Resend, "Resend");
	    webActions.assertDisplayed(btn_Mailed, "Mailed");
	    webActions.assertDisplayed(btn_Success, "Success");
	    webActions.assertDisplayed(btn_Failed, "Failed");
	    webActions.assertDisplayed(btn_Remove, "Remove");
	    webActions.assertDisplayed(txt_StartDate, "StartDate");
	    webActions.assertDisplayed(txt_EndDate, "EndDate");
	    webActions.assertDisplayed(txt_NOAStatus, "NOAStatus");
	    webActions.assertDisplayed(txt_NOAType, "NOAType");
	    webActions.assertDisplayed(btn_Excel, "Excel");
	    report.reportPass("All Options are Displayed from NOA Queues page ");
	} catch (Exception e) {
	    report.reportHardFail(e, "All Options not Displayed from NOA Queues page");
	}
    }

    public void resendNOAClient() {
	try {
	    webActions.waitUntilPresentAndDisplayed(tbl_FirstRow, "Table");
	    webActions.rightClickAction(tbl_FirstRow, "First row");
	    webActions.waitAndCickBYJS(btn_Resend, "Resend button");
	    report.reportPass("Clicked on resend button successfully");
	} catch (Exception e) {
	    report.reportHardFail(e, "Failed to click on resend button");
	}
    }

    public void removeNOAClient() {
	try {
	    webActions.waitUntilPresentAndDisplayed(tbl_FirstRow, "Table");
	    webActions.clickAction(tbl_FirstRow, "First row");
	    webActions.waitUntilEnabledAndCickBYJS(btn_Remove, "Remove button");
	    webActions.waitUntilPresentAndDisplayed(btn_OK, "OK Button");
	    webActions.clickBYJS(btn_OK, "OK button");
	    report.reportPass("Clicked on remove button successfully");
	} catch (Exception e) {
	    report.reportHardFail(e, "Failed to click on remove button");
	}
    }

    public void excelNOAClient() {
	try {
	    webActions.waitUntilPresentAndDisplayed(tbl_FirstRow, "Table");
	    webActions.rightClickAction(tbl_FirstRow, "First row");
	    webActions.waitAndCickBYJS(btn_Excel, "Excel button");
	    webActions.waitUntilPresentAndDisplayed(btn_SelectedRows, "Selected rows Button");
	    webActions.clickBYJS(btn_SelectedRows, "Selected rows button");
	    Thread.sleep(fileDownloadTimeOut);
	    if (!global.isFileDownloaded("NOA Queue.xls")) {
		throw new Exception("Download Failed");
	    }
	    report.reportPass("Clicked on excel and verified downloaded file successfully");
	} catch (Exception e) {
	    report.reportHardFail(e, "Failed to Clicked on excel and verified downloaded file");
	}
    }

    public void verifyOptionsNOATemplate() {
	try {
	    webActions.waitForVisibility(btn_Create, "Create button");
	    webActions.assertDisplayed(btn_Create, "Create button");
	    webActions.assertDisplayed(btn_Edit, "Edit");
	    webActions.assertDisplayed(btn_Search, "Search");
	    webActions.assertDisplayed(btn_Remove, "Remvoe");
	    webActions.assertDisplayed(btn_AddToSet, "Add to Set");
	    webActions.assertDisplayed(btn_AddSeachCondition, "Add Search Condition");
	    report.reportPass("All Options are Displayed from NOA Template page ");
	} catch (Exception e) {
	    report.reportHardFail(e, "All Options not Displayed from NOA Template page");
	}
    }

    public void removeNOATemplate() {
	try {
	    webActions.waitUntilPresentAndDisplayed(btn_Create, "Create");
	    String originalCount = webActions.getText(lbl_RowsCount, "Rows Count");
	    int noOfRows = Integer.parseInt(originalCount.replaceAll("[A-Za-z]", "").trim());
	    if (noOfRows == 0) {
		createNOATemplate();
		webActions.waitUntilPresentAndDisplayed(tbl_FirstRow, "Table First Row");
		originalCount = webActions.getText(lbl_RowsCount, "Rows Count");
	    }
	    webActions.clickAction(tbl_FirstRow, "First row");
	    webActions.waitUntilEnabledAndCickBYJS(btn_Remove, "Remove button");
	    webActions.waitUntilPresentAndDisplayed(btn_OK, "OK Button");
	    webActions.clickBYJS(btn_OK, "OK button");
	    webActions.waitforTextToChange(lbl_RowsCount, "Rows Count", originalCount);
	    int newRowCount = Integer
		    .parseInt(webActions.getText(lbl_RowsCount, "Rows Count").replaceAll("[A-Za-z]", "").trim());
	    global.assertEquals(newRowCount + 1, Integer.parseInt(originalCount.replaceAll("[A-Za-z]", "").trim()));
	    report.reportPass("Clicked on remove button successfully");
	} catch (Exception e) {
	    report.reportHardFail(e, "Failed to click on remove button");
	}
    }

    public void createNOATemplate() {
	try {
	    webActions.clickBYJS(btn_Create, "Create button");
	    webActions.waitAndSendKeysByCharAuto(txt_DocumentType, "Cover Letter", "Document Type");
	    webActions.sendKeysByChar(txt_TemplateName, faker.lorem().characters(6), "Template Name");
	    webActions.clickBYJS(btn_CreateDocumentVersion, "Create Document Version");
	    webActions
		    .waitAndSendKeysByChar(
			    txt_HTMLTextBox, "<!DOCTYPE html>\r\n" + "<html>\r\n" + "<body>\r\n" + "<p>\r\n"
				    + "This paragraph\r\n" + "</p>\r\n" + "</body>\r\n" + "</html>\r\n" + "",
			    "HTML Textbox");
	    webActions.clickBYJS(btn_EntityDocumentVersionEditorOk, "Ok button");
	    webActions.waitUntilNotPresent(txt_HTMLTextBox, "HTML Textbox");
	    webActions.clickBYJS(btn_OK, "Ok button");
	    report.reportPass("Create NOA Template successfully");
	} catch (Exception e) {
	    report.reportHardFail(e, "Failed to Create NOA Template successfully");
	}
    }

    public void verifyOptionsNOAFiles() {
	try {
	    webActions.waitForVisibility(btn_Search, "Search button");
	    webActions.waitUntilPresentAndDisplayed(btn_ViewFile, "View File");
	    webActions.assertDisplayed(btn_ViewFile, "View File");
	    webActions.assertDisplayed(btn_Edit, "Edit");
	    webActions.assertDisplayed(btn_Search, "Search");
	    webActions.assertDisplayed(btn_Remove, "Remove");
	    webActions.assertDisplayed(btn_AddToSet, "Add to Set");
	    webActions.assertDisplayed(btn_AddSeachCondition, "Add Search Condtion");
	    report.reportPass("All Options are Displayed from NOA Files page ");
	} catch (Exception e) {
	    report.reportHardFail(e, "All Options not Displayed from NOA Files page");
	}
    }

    public void editNOAFile() {
	try {
	    webActions.waitUntilPresentAndDisplayed(tbl_FirstRow, "Table");
	    webActions.clickAction(tbl_FirstRow, "First row");
	    webActions.waitUntilEnabledAndCickBYJS(btn_Edit, "Edit button");
	    webActions.waitUntilPresentAndDisplayed(btn_OK, "OK Button");
	    webActions.assertDisplayed(txt_DocumentType, "Document Type");
	    webActions.assertDisplayed(btn_OK, "OK");
	    webActions.assertDisplayed(btn_Cancel, "Cancel");
	    webActions.clickBYJS(btn_OK, "OK button");
	    webActions.waitUntilPresentAndDisplayed(btn_Edit, "Edit button");
	    report.reportPass("Clicked on edit button and edited successfully");
	} catch (Exception e) {
	    report.reportHardFail(e, "Failed to click on edit button and edit file");
	}
    }

    @Override
    protected ExpectedCondition getPageLoadCondition() {
	// TODO Auto-generated method stub
	return ExpectedConditions.visibilityOf(btn_CloseTab);
    }
}
