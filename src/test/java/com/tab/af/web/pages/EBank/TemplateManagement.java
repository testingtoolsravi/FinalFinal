package com.tab.af.web.pages.EBank;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.tab.af.web.pages.BasePage;

public class TemplateManagement extends BasePage {
	
	public TemplateManagement() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//span[text()='Accounting']")
	private WebElement lbl_Accounting;  
	@FindBy(xpath = "//span[text()='Add search condition']")
	private WebElement btn_AddSearchConditon;
	@FindBy(xpath = "//span[text()='Search']")
	private WebElement btn_Search;
	@FindBy(xpath = "//span[text()='Edit']")
	private WebElement btn_Edit;
	@FindBy(xpath = "//span[text()='Export Access Group Data']")
	private WebElement btn_ExportAccessGroupData;
	@FindBy(xpath = "//span[text()='Remove']")
	private WebElement btn_Remove;
	@FindBy(xpath = "//span[text()='Create']")
	private WebElement btn_Create;
	@FindBy(xpath = "//span[text()='Excel']")
	private WebElement btn_Excel;
	@FindBy(xpath = "//div[text()='Journal Template']")
	private WebElement lbl_JournalTemplate;
	
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
	
	@FindBy(xpath = "//table[@class='v-table-table']/tbody/tr/td[4]//input")
	private WebElement txt_Selector;
	
	@FindBy(xpath = "//table[@class='v-table-table']/tbody/tr/td[6]//input")
	private WebElement txt_Amount;
	
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
	
	@FindBy(xpath = "//span[text()='OK']")
	private WebElement btn_OK;
	
	@FindBy(xpath = "//div[text()='Journal Batch']//following::span[1]")
	private WebElement btn_CloseTab;
	
	@FindBy(xpath = "//table[@class='v-table-table']/tbody/tr[2]/td[1]/div")
	private WebElement tbl_FirstRecord;
		
	@FindBy(xpath = "//span[text()='contains']//following::input[1]")
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
			Assert.assertEquals(true,  btn_Search.isDisplayed());
			Assert.assertEquals(true,  btn_Create.isDisplayed());
			Assert.assertEquals(true,  btn_Edit.isDisplayed());
			Assert.assertEquals(true,  btn_Remove.isDisplayed());
			Assert.assertEquals(true,  btn_AddSearchConditon.isDisplayed());
			Assert.assertEquals(true,  btn_Excel.isDisplayed());
			report.reportPass("All Options Displayed");

		} catch (Exception e) {
			report.reportHardFail(e,"All Options Displayed");
		}
	}
	
	public void verifyJournalTemplateOptions() {
		try {
			webActions.clickBYJS(btn_Create, "create Button");
			webActions.waitForVisibility(btn_Add, "Add button");
			Assert.assertEquals(true,  btn_Add.isDisplayed());
			Assert.assertEquals(true,  btn_Cancel.isDisplayed());
			Assert.assertEquals(true,  btn_Submit.isDisplayed());
			Assert.assertEquals(true,  btn_Remove.isDisplayed());
			Assert.assertEquals(true, lbl_TemplateName.isDisplayed());
			Assert.assertEquals(true, lbl_FileUpload.isDisplayed());
			report.reportPass("All Options are Displayed from Journal Template page");
			
		} catch (Exception e) {
			report.reportHardFail(e,"All Options not Displayed from Journal Template page");
		}
	}
	

	@Override
	protected ExpectedCondition getPageLoadCondition() {
		// TODO Auto-generated method stub
		return ExpectedConditions.visibilityOf(lbl_JournalTemplate);
	}
}