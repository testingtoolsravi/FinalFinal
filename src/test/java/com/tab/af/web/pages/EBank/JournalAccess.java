package com.tab.af.web.pages.EBank;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.tab.af.testbase.TestBase;
import com.tab.af.web.pages.BasePage;

public class JournalAccess extends BasePage {
    public JournalAccess() {
	PageFactory.initElements(driver, this);
    }

    private final long fileDownloadTimeOut = Long.parseLong(TestBase.props.get("file.Download.Timeout").toString());
    @FindBy(xpath = "//span[text()='Accounting']")
    private WebElement lbl_Accounting;
    @FindBy(xpath = "//span[text()='Journal Entry']")
    private WebElement lbl_JournalEntry;
    @FindBy(xpath = "//span[text()='=']")
    private WebElement lbl_EqualsSearchCondition;
    @FindBy(xpath = "//span[(text()='contains'or text()='=') and @class='v-button-caption']")
    private WebElement btn_ContainsSearch;
    @FindBy(xpath = "//span[text()='Add search condition']")
    private WebElement btn_AddSearchConditon;
    @FindBy(xpath = "//span[text()='Search']")
    private WebElement btn_Search;
    @FindBy(xpath = "//span[text()='Edit']")
    private WebElement btn_Edit;
    @FindBy(xpath = "//span[text()='Remove']")
    private WebElement btn_Remove;
    @FindBy(xpath = "//span[text()='Create']")
    private WebElement btn_Create;
    @FindBy(xpath = "//span[text()='Excel']")
    private WebElement btn_Excel;
    @FindBy(xpath = "//div[text()='Journal Batch']")
    private WebElement btn_JournalBatch;
    @FindBy(xpath = "//span[text()='Selected rows']")
    private WebElement btn_Selectedrows;
    //
    @FindBy(xpath = "//span[text()='Add']")
    private WebElement btn_Add;
    @FindBy(xpath = "//span[text()='Cancel']")
    private WebElement btn_Cancel;
    @FindBy(xpath = "//span[text()='Submit']")
    private WebElement btn_Submit;
    @FindBy(xpath = "//span[text()='Create Template']")
    private WebElement btn_CreateTemplate;
    @FindBy(xpath = "//div[text()='Debit Total']")
    private WebElement lbl_DebitTotal;
    @FindBy(xpath = "//div[text()='Credit Total']")
    private WebElement lbl_CreditTotal;
    @FindBy(xpath = "//div[text()='Offset Amount']")
    private WebElement lbl_OffsetAmount;
    @FindBy(xpath = "//div[text()='Decision Description']")
    private WebElement lbl_DecisionDescription;
    @FindBy(xpath = "//table[@class='v-table-table']/tbody/tr/td[1]//input")
    private WebElement txt_Account;
    @FindBy(xpath = "//table[@class='v-table-table']/tbody/tr/td[2]//input")
    private WebElement txt_AccountName;
    @FindBy(xpath = "//table[@class='v-table-table']/tbody/tr[2]/td[2]//input")
    private WebElement txt_creditAccountName;
    @FindBy(xpath = "//table[@class='v-table-table']/tbody/tr/td[4]//input")
    private WebElement txt_Selector;
    @FindBy(xpath = "//table[@class='v-table-table']/tbody/tr/td[6]//input")
    private WebElement txt_Amount;
    @FindBy(xpath = "//table[@class='v-table-table']/tbody/tr/td[6]//input")
    private WebElement txt_Template_Desc;
    @FindBy(xpath = "//table[@class='v-table-table']/tbody/tr/td[8]//input")
    private WebElement txt_Description;
    @FindBy(xpath = "//table[@class='v-table-table']/tbody/tr[2]/td[1]//input")
    private WebElement txt_Accoun_Credit;
    @FindBy(xpath = "//table[@class='v-table-table']/tbody/tr[2]/td[4]//input")
    private WebElement txt_Selector_Credit;
    @FindBy(xpath = "//table[@class='v-table-table']/tbody/tr[2]/td[6]//input")
    private WebElement txt_Amount_Credit;
    @FindBy(xpath = "//table[@class='v-table-table']/tbody/tr[2]/td[8]//input")
    private WebElement txt_Description_Credit;
    @FindBy(xpath = "//div[text()='Template Name']//following::input[1]")
    private WebElement txt_TemplateName;
    @FindBy(xpath = "//span[text()='OK']//preceding::input[1]")
    private WebElement txt_Description_Screen;
    @FindBy(xpath = "//span[text()=text()= 'Submit']//preceding::textarea")
    private WebElement txt_Description_Template;
    @FindBy(xpath = "//span[text()='OK']")
    private WebElement btn_OK;
    @FindBy(xpath = "//div[text()='Journal Batch']//following::span[1]")
    private WebElement btn_CloseTab;
    @FindBy(xpath = "//table[@class='v-table-table']/tbody/tr[2]/td[1]/div")
    private WebElement tbl_FirstRecord;
    @FindBy(xpath = "//span[text()='=' ]//following::input[1]")
    private WebElement txt_SearchFilter;
    @FindBy(xpath = "//tr//td[2]")
    private List<WebElement> lbl_CreateBy;
    @FindBy(xpath = "//div[text()='Template Name']")
    private WebElement lbl_TemplateName;
    @FindBy(xpath = "//span[text()='File is not selected']")
    private WebElement lbl_FileUpload;

    public void verifyOptions() {
	try {
	    webActions.waitUntilPresentAndDisplayed(btn_Search, "Search button");
	    Assert.assertEquals(true, btn_Search.isDisplayed());
	    Assert.assertEquals(true, btn_Create.isDisplayed());
	    Assert.assertEquals(true, btn_Edit.isDisplayed());
	    Assert.assertEquals(true, btn_Remove.isDisplayed());
	    Assert.assertEquals(true, btn_AddSearchConditon.isDisplayed());
	    Assert.assertEquals(true, btn_Excel.isDisplayed());
	    report.reportPass("All Options Displayed");
	} catch (Exception e) {
	    report.reportHardFail(e, "All Options Displayed");
	}
    }

    public void verifyTemplateOptions() {
	try {
	    webActions.clickBYJS(btn_Create, "create Button");
	    webActions.waitForVisibility(btn_Add, "Add button");
	    Assert.assertEquals(true, btn_Add.isDisplayed());
	    Assert.assertEquals(true, btn_Cancel.isDisplayed());
	    Assert.assertEquals(true, btn_Submit.isDisplayed());
	    Assert.assertEquals(true, btn_Remove.isDisplayed());
	    Assert.assertEquals(true, btn_CreateTemplate.isDisplayed());
	    Assert.assertEquals(true, lbl_DebitTotal.isDisplayed());
	    Assert.assertEquals(true, lbl_CreditTotal.isDisplayed());
	    Assert.assertEquals(true, lbl_DecisionDescription.isDisplayed());
	    Assert.assertEquals(true, lbl_OffsetAmount.isDisplayed());
	    report.reportPass("All Options are Displayed from create template page");
	} catch (Exception e) {
	    report.reportHardFail(e, "All Options not Displayed from create template page");
	}
    }

    public void verifyJournalTemplateOptions() {
	try {
	    webActions.clickBYJS(btn_Create, "create Button");
	    webActions.waitForVisibility(btn_Add, "Add button");
	    Assert.assertEquals(true, btn_Add.isDisplayed());
	    Assert.assertEquals(true, btn_Cancel.isDisplayed());
	    Assert.assertEquals(true, btn_Submit.isDisplayed());
	    Assert.assertEquals(true, btn_Remove.isDisplayed());
	    Assert.assertEquals(true, lbl_TemplateName.isDisplayed());
	    Assert.assertEquals(true, lbl_FileUpload.isDisplayed());
	    report.reportPass("All Options are Displayed from Journal Template page");
	} catch (Exception e) {
	    report.reportHardFail(e, "All Options not Displayed from Journal Template page");
	}
    }

    public void clickAddButton() {
	try {
	    webActions.waitForVisibility(btn_Add, "Add Button");
	    webActions.clickBYJS(btn_Add, "Add Button");
	    Thread.sleep(1000);
	    report.reportPass("Clicked on Add button");
	} catch (Exception e) {
	    report.reportHardFail(e, "Failed to click on add button");
	}
    }

    public void enterDebitAcctNumber(String accountNumber) {
	try {
	    webActions.waitForVisibility(txt_Account, "Account Number");
	    webActions.SendKeysByCharAuto(txt_Account, accountNumber, "Account Number");
	    for (int i = 0; i <= 20; i++) {
		Thread.sleep(1000);
		String value = webActions.getAttributeValue(txt_AccountName, "class", "Account name");
		if (value.equals(
			"v-textfield v-widget v-readonly v-has-width v-has-height v-textfield-readonly c-disabled-or-readonly")) {
		    break;
		}
	    }
	    Thread.sleep(2000);
	} catch (Exception e) {
	    report.reportHardFail(e, "Fail to enter account number");
	}
    }

    public void enterDebitSelector(String selector) {
	try {
	    webActions.clickBYJS(txt_Selector, "Selector");
	    webActions.SendKeysByCharAuto(txt_Selector, selector, "Selector");
	    Thread.sleep(1000);
	} catch (Exception e) {
	    report.reportHardFail(e, "Fail to enter selector value ");
	}
    }

    public void enterDebitAmount(String amount) {
	try {
	    webActions.waitAndCickBYJS(txt_Amount, "Amount");
	    webActions.sendKeysByChar(txt_Amount, amount, "Amount");
	    webActions.waitForJSandJQueryToLoad();
	} catch (Exception e) {
	    report.reportHardFail(e, "Fail to enter amount value ");
	}
    }

    public void enterDebitDescription(String description) {
	try {
	    webActions.waitAndCickBYJS(txt_Description, "description");
	    webActions.sendKeysByChar(txt_Description, description, "Description");
	    report.reportPass("Entered debit information");
	} catch (Exception e) {
	    report.reportHardFail(e, "Fail to enter description value ");
	}
    }

    public void enterCreditAcctNumber(String accountNumber) {
	try {
	    webActions.waitForVisibility(txt_Accoun_Credit, "Account Number");
	    webActions.SendKeysByCharAuto(txt_Accoun_Credit, accountNumber, "Account number");
	    for (int i = 0; i <= 20; i++) {
		Thread.sleep(1000);
		String value = webActions.getAttributeValue(txt_creditAccountName, "class", "Account name");
		if (value.equals(
			"v-textfield v-widget v-readonly v-has-width v-has-height v-textfield-readonly c-disabled-or-readonly")) {
		    break;
		}
		Thread.sleep(1000);
	    }
	} catch (Exception e) {
	    report.reportHardFail(e, "Fail to enter account number value ");
	}
    }

    public void enterCreditSelector(String selector) {
	try {
	    webActions.clickBYJS(txt_Selector_Credit, "Selector");
	    webActions.SendKeysByCharAuto(txt_Selector_Credit, selector, "Selector");
	    Thread.sleep(1000);
	} catch (Exception e) {
	    report.reportHardFail(e, "Fail to enter selector value ");
	}
    }

    public void enterCreditAmount(String amount) {
	try {
	    webActions.waitAndSendKeysByChar(txt_Amount_Credit, amount, "Amount");
	} catch (Exception e) {
	    report.reportHardFail(e, "Fail to enter amount value ");
	}
    }

    public void enterCreditDescription(String description) {
	try {
	    webActions.waitAndSendKeysByChar(txt_Description_Credit, description, "Description");
	    report.reportPass("Entered credit information successfully");
	} catch (Exception e) {
	    report.reportHardFail(e, "Fail to enter description value ");
	}
    }

    public void clickCreateTemplate() {
	try {
	    webActions.clickBYJS(btn_CreateTemplate, "Create Template Button");
	} catch (Exception e) {
	    report.reportHardFail(e, "Fail to click on Create Template Button ");
	}
    }

    public void enterTamplateName(String templateName) {
	try {
	    String xt = faker.number().digits(8);
	    webActions.waitForVisibility(txt_TemplateName, "Template Name");
	    webActions.sendKeysByChar(txt_TemplateName, templateName + xt, "Template Name");
	    report.reportPass("Entered template name successfully");
	} catch (Exception e) {
	    report.reportHardFail(e, "Fail to enter TemplateName value ");
	}
    }

    public void enterDescr(String description) {
	try {
	    webActions.sendKeysByChar(txt_Description_Screen, description, "Description");
	} catch (Exception e) {
	    report.reportHardFail(e, "Fail to enter description value ");
	}
    }

    public void enterDescrInTemplate(String description) {
	try {
	    webActions.sendKeysByChar(txt_Description_Template, description, "Description");
	} catch (Exception e) {
	    report.reportHardFail(e, "Fail to enter description value ");
	}
    }

    public void clickOkButton() {
	try {
	    webActions.clickBYJS(btn_OK, "OK Button");
	} catch (Exception e) {
	    report.reportHardFail(e, "Fail to click on OK Button ");
	}
    }

    public void clickSubmitButton() {
	try {
	    webActions.clickBYJS(btn_Submit, "Submit button");
	    webActions.waitForVisibility(btn_Create, "Create button");
	    report.reportPass("Clicked in submit button successfully");
	} catch (Exception e) {
	    report.reportHardFail(e, "Fail to click on submit Button ");
	}
    }

    public void editRecord(String amount) {
	try {
	    webActions.clickBYJS(btn_Edit, "Edit button");
	    webActions.waitForVisibility(txt_Amount, "Amount");
	    webActions.clearAndSendKeysByChar(txt_Amount, amount, "Amount");
	    webActions.clearAndSendKeysByChar(txt_Amount_Credit, amount, "Amount");
	    webActions.clickBYJS(btn_Submit, "Submit button");
	    webActions.waitForVisibility(btn_Remove, "Remove Button");
	    report.reportPass("Record edited successfully");
	} catch (Exception e) {
	    report.reportHardFail(e, "Fail to edit first record ");
	}
    }

    public void editTemplateRecord(String amount) {
	try {
	    webActions.clickBYJS(btn_Edit, "Edit button");
	    webActions.waitForVisibility(txt_Description_Template, "Amount");
	    webActions.clearAndSendKeysByChar(txt_Description_Template, amount, "Description");
	    webActions.clickBYJS(btn_Submit, "Submit button");
	    report.reportPass("Record edited successfully");
	} catch (Exception e) {
	    report.reportHardFail(e, "Fail to edit first record ");
	}
    }

    public void removeRecord() {
	try {
	    webActions.waitForVisibility(btn_Remove, "Remove button");
	    webActions.clickBYJS(btn_Remove, "Remove button");
	    webActions.waitForVisibility(btn_OK, "OK button");
	    clickOkButton();
	    report.reportPass("Record edited successfully");
	} catch (Exception e) {
	    report.reportHardFail(e, "Fail to edit first record ");
	}
    }

    public void verifySearch(String column, String value) {
	try {
	    addSearchCondtion(column, value);
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

    @Override
    protected ExpectedCondition getPageLoadCondition() {
	// TODO Auto-generated method stub
	return ExpectedConditions.visibilityOf(btn_JournalBatch);
    }
}