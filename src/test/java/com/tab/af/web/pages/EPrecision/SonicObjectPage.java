package com.tab.af.web.pages.EPrecision;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.tab.af.web.pages.BasePage;
import com.tab.af.web.pages.EBank.JournalAccess;

import junit.framework.Assert;

public class SonicObjectPage extends BasePage {
	public SonicObjectPage() {
		PageFactory.initElements(driver, this);
	}

	JournalAccess journal = new JournalAccess();
	@FindBy(xpath = "//div[text()='Cif Entity']")
	private WebElement lbl_CifEntity;
	@FindBy(xpath = "//div[@class=\"v-table-header\"]//div[contains(@class,\"v-table-caption-container\")and text()='Branch']")
	private WebElement lbl_TableHeaderBranch;
	@FindBy(xpath = "//div[@class=\"v-table-header\"]//div[contains(@class,\"v-table-caption-container\")and text()='Internet banking']")
	private WebElement lbl_TableHeaderInternetBanking;
	@FindBy(xpath = "//div[@class=\"v-table-header\"]//div[contains(@class,\"v-table-caption-container\")and text()='Internet banking2']")
	private WebElement lbl_TableHeaderInternetBanking2;
	@FindBy(xpath = "//span[text()='Create']")
	private WebElement btn_Create;
	@FindBy(xpath = "//span[text()='OK']")
	private WebElement btn_OK;
	@FindBy(xpath = "//span[text()='Edit']")
	private WebElement btn_Edit;
	@FindBy(xpath = "//span[text()='Remove']")
	private WebElement btn_Remove;
	@FindBy(xpath = "//span[text()='Search']")
	private WebElement btn_Search;
	@FindBy(xpath = "//span[text()='Add search condition']")
	private WebElement btn_AddSeachCondition;
	@FindBy(xpath = "//div[text()='Branch']//following::input[1]")
	private WebElement txt_Branch;
	@FindBy(xpath = "//div[text()='Internet Banking']//following::input[1]")
	private WebElement txt_InternetBanking;
	@FindBy(xpath = "//div[text()='Internet Banking2']//following::input[1]")
	private WebElement txt_InternetBanking2;
	@FindBy(xpath = "//td[2]//div[@class=\"v-table-cell-wrapper\"]")
	private WebElement lbl_TableColumnOne;
	@FindBy(xpath = "//tr[1]//td[@class=\"v-table-cell-content\"]//div")
	private List<WebElement> lbl_TableNewCreatedEntity;
	@FindBy(xpath = "//span[@class='v-tabsheet-caption-close']")
	private WebElement btn_CloseTab;

	@FindBy(xpath = "//div[contains(@class,'paging')]//div[contains(text(),'row')]")
	private WebElement lbl_RowCount;

	@FindBy(xpath = "//div[text()='Product']")
	private WebElement lbl_Product;

	@FindBy(xpath = "//div[text()='Branch']")
	private WebElement lbl_Branch;

	@FindBy(xpath = "//div[text()='Type']")
	private WebElement lbl_Type;

	@FindBy(xpath = "//div[text()='Status code']")
	private WebElement lbl_StatusCodes;

	//
	@FindBy(xpath = "//div[text()='Product']//following::input[1]")
	private WebElement txt_Product;
	@FindBy(xpath = "//div[text()='Branch']//following::input[1]")
	private WebElement txt_Branch_Code;
	@FindBy(xpath = "//div[text()='Type']//following::input[1]")
	private WebElement txt_Type;
	@FindBy(xpath = "//div[text()='Status']//following::input[1]")
	private WebElement txt_Status;
	@FindBy(xpath = "//div[text()='Call Report']//following::input[1]")
	private WebElement txt_Callreport;
	@FindBy(xpath = "//div[text()='GL Code']//following::input[1]")
	private WebElement txt_GLCode;
	@FindBy(xpath = "//div[text()='Statement Type']//following::input[1]")
	private WebElement txt_StatementType;
	@FindBy(xpath = "//div[text()='Statement Cycle']//following::input[1]")
	private WebElement txt_StatementCycle;
	@FindBy(xpath = "//div[text()='Officer Code']//following::input[1]")
	private WebElement txt_OfficerCode;
	@FindBy(xpath = "//div[text()='Service Charge Code']//following::input[1]")
	private WebElement txt_ChargeCode;
	@FindBy(xpath = "//div[text()='Dda ODRI Code']//following::input[1]")
	private WebElement txt_ODRICode;
	@FindBy(xpath = "//div[text()='Rebate percent']//following::input[1]")
	private WebElement txt_RebatePercent;
	@FindBy(xpath = "//div[text()='Fuel rebate']//following::input[1]")
	private WebElement txt_Fuelrebate;
	@FindBy(xpath = "//div[text()='DDA Earnings code']//following::input[1]")
	private WebElement txt_EarningCode;
	@FindBy(xpath = "//div[text()='Write off']//following::input[1]")
	private WebElement txt_WriteOff;
	@FindBy(xpath = "//div[text()='Customer Type']")
	private WebElement lbl_CustomerType;
	@FindBy(xpath = "//div[text()='Own type']")
	private WebElement lbl_OwnType;

	@FindBy(xpath = "//div[text()='Iso code']//following::span[2]")
	private WebElement btn_IsoCode;
	@FindBy(xpath = "//div[text()='Atm Type']//following::span[2]")
	private WebElement btn_AtmType;
	@FindBy(xpath = "//div[text()='Type Code']//following::span[2]")
	private WebElement btn_TypeCode;
	@FindBy(xpath = "//div[text()='Branch']//following::span[2]")
	private WebElement btn_Branch;
	@FindBy(xpath = "//div[text()='Issue code']//following::span[2]")
	private WebElement btn_IssueCode;
	@FindBy(xpath = "//div[text()='Card order status']//following::span[2]")
	private WebElement btn_CardOrderStatus;
	@FindBy(xpath = "//div[text()='Date expires']//following::span[2]")
	private WebElement btn_DateExpires;

	@FindBy(xpath = "//table[@class='v-table-table']/tbody/tr[1]")
	private WebElement tbl_FirstRow;

	@FindBy(xpath = "//span[text()='System Information']//following::span[2]")
	private WebElement lbl_SelectRightClick;

	@FindBy(xpath = "//span[text()='Select']")
	private WebElement btn_Select;
	@FindBy(xpath = "//span[text()='Branches']")
	private WebElement opt_Branches;
	@FindBy(xpath = "//span[text()='Call Reports']")
	private WebElement opt_CallReports;
	@FindBy(xpath = "//span[text()='Dda ODRI Charges']")
	private WebElement opt_ODRICharges;
	@FindBy(xpath = "//span[text()='GL Codes']")
	private WebElement opt_GLCodes;
	@FindBy(xpath = "//span[text()='Officer Codes']")
	private WebElement opt_OfficerCodes;
	@FindBy(xpath = "//span[text()='Relationship Codes']")
	private WebElement opt_RelationShipCodes;
	@FindBy(xpath = "//span[text()='Service Charge Codes']")
	private WebElement opt_SChargeCodes;
	@FindBy(xpath = "//span[text()='Statement Cycles']")
	private WebElement opt_StatCycles;
	@FindBy(xpath = "//span[text()='Statement Types']")
	private WebElement opt_StatTypes;
	@FindBy(xpath = "//span[text()='Types']")
	private WebElement opt_Types;
	@FindBy(xpath = "//span[text()='Own Types']")
	private WebElement opt_OwnTypes;
	@FindBy(xpath = "//span[text()='Write Offs']")
	private WebElement opt_WriteOff;
	@FindBy(xpath = "//span[text()='Card']")
	private WebElement opt_Card;
	@FindBy(xpath = "//span[text()='CD']")
	private WebElement opt_CD;
	@FindBy(xpath = "//div[text()='Code']//following::input[1]")
	private WebElement txt_Code;
	@FindBy(xpath = "//div[text()='Description']//following::input[1]")
	private WebElement txt_Description;
	@FindBy(xpath = "//table[@class='v-table-table']/tbody/tr/td[3]")
	private List<WebElement> lbl_CreateBy;

	public void validateCIfEntityOptionsTable() {
		try {
			Assert.assertEquals(true, lbl_TableHeaderBranch.isDisplayed());
			Assert.assertEquals(true, lbl_TableHeaderInternetBanking.isDisplayed());
			Assert.assertEquals(true, lbl_TableHeaderInternetBanking2.isDisplayed());
			report.reportPass("Table Headers Displayed");

		} catch (Exception e) {
			report.reportHardFail(e, "Table Headers Displayed");
		}
	}

	public void createCIFEntity(String iBFlag, String iB2Flag, String branchName) {
		try {
			webActions.clickBYJS(btn_Create, "Create");
			webActions.waitAndSendKeysByCharAuto(txt_Branch, branchName, "Branch");
			webActions.waitAndSendKeysByChar(txt_InternetBanking, iBFlag, "Internet Banking");
			webActions.waitAndSendKeysByChar(txt_InternetBanking2, iB2Flag, "Internet Banking2");

			webActions.clickBYJS(btn_OK, "OK");
			webActions.waitForClickAbility(lbl_TableColumnOne, "Wait for Table to Load");
			Assert.assertEquals(lbl_TableNewCreatedEntity.get(0).getText(), branchName);
			Assert.assertEquals(lbl_TableNewCreatedEntity.get(1).getText(), iBFlag);
			Assert.assertEquals(lbl_TableNewCreatedEntity.get(2).getText(), iB2Flag);
			report.reportPass("Create CIF Entity");
		} catch (Exception e) {
			report.reportHardFail(e, "Create CIF Entity");
		}
	}

	public void editCIFEntity(String iB2Flag) {
		try {
			webActions.waitAndCickBYJS(btn_Edit, "Edit Button");
			webActions.waitUntilPresentAndDisplayed(txt_InternetBanking2, "Internet Banking 2");
			webActions.clearByJS(txt_InternetBanking2, "Internet Banking 2");
			webActions.waitAndSendKeysByChar(txt_InternetBanking2, iB2Flag, "Internet Banking2");
			webActions.clickBYJS(btn_OK, "OKs");
			webActions.waitUntilPresentAndDisplayed(btn_Create, "Create");
			Assert.assertEquals(lbl_TableNewCreatedEntity.get(2).getText(), iB2Flag);
			report.reportPass("Edit CIF Entity");
		} catch (Exception e) {
			report.reportHardFail(e, "Edit CIF Entity");
		}
	}

	public void removeCIFEntity() {
		try {
			String oldCount = lbl_RowCount.getText().split(" ")[0];
			webActions.clickBYJS(btn_Remove, "Remove Button");
			webActions.waitAndCickBYJS(btn_OK, "OK");
			webActions.waitUntilNotPresent(btn_OK, "OK");
			Thread.sleep(5000);
			String newCount = lbl_RowCount.getText().split(" ")[0];
			Assert.assertEquals(Integer.parseInt(oldCount) - 1, Integer.parseInt(newCount));
			report.reportPass("Remove CIF Entity");
		} catch (Exception e) {
			report.reportHardFail(e, "Remove CIF Entity");
		}
	}

	public void validateCIFEntityPageOptions() {
		try {
			webActions.assertDisplayed(btn_Create, "Create");
			webActions.assertDisplayed(btn_Edit, "Edit");
			webActions.assertDisplayed(btn_Remove, "Remove");
			webActions.assertDisplayed(btn_Search, "Search");
			webActions.assertDisplayed(btn_AddSeachCondition, "Add Search Condition");
			report.reportPass("Validate CIF Entity Page Options");

		} catch (Exception e) {
			report.reportHardFail(e, "Validate CIF Entity Page Options");
		}
	}

	public void verifyAccountEntity() {
		try {
			webActions.waitUntilPresentAndDisplayed(btn_Create, "Create button");
			webActions.clickBYJS(btn_Create, "Create Button");
			webActions.waitUntilPresentAndDisplayed(txt_Product, "Product");
			Assert.assertEquals(true, txt_Product.isDisplayed());
			Assert.assertEquals(true, txt_Branch_Code.isDisplayed());
			Assert.assertEquals(true, txt_Type.isDisplayed());
			Assert.assertEquals(true, txt_Status.isDisplayed());
			Assert.assertEquals(true, txt_Callreport.isDisplayed());
			Assert.assertEquals(true, txt_GLCode.isDisplayed());
			Assert.assertEquals(true, txt_StatementType.isDisplayed());
			Assert.assertEquals(true, txt_StatementCycle.isDisplayed());
			Assert.assertEquals(true, txt_OfficerCode.isDisplayed());
			Assert.assertEquals(true, txt_ChargeCode.isDisplayed());
			Assert.assertEquals(true, txt_ODRICode.isDisplayed());
			Assert.assertEquals(true, txt_RebatePercent.isDisplayed());
			Assert.assertEquals(true, txt_Fuelrebate.isDisplayed());
			Assert.assertEquals(true, txt_EarningCode.isDisplayed());
			Assert.assertEquals(true, txt_WriteOff.isDisplayed());
			report.reportPass("Verified all the options from Account entity creation page successfully");
		} catch (Exception e) {
			report.reportHardFail(e, "Fail to validate all the options from Account entity creation page ");
		}

	}

	public void createlEntity(List<Map<String, String>> selectValues) {
		try {
			webActions.SendKeysByCharAuto(txt_Product, selectValues.get(0).get("Product"), "Filling data");
			webActions.SendKeysByCharAuto(txt_Branch_Code, selectValues.get(0).get("Branch Code"), "Filling data");
			webActions.SendKeysByCharAuto(txt_Type, selectValues.get(0).get("Type"), "Filling data");
			webActions.SendKeysByCharAuto(txt_Status, selectValues.get(0).get("Status"), "Filling data");
			webActions.SendKeysByCharAuto(txt_Callreport, selectValues.get(0).get("Call Report"), "Filling data");
			webActions.SendKeysByCharAuto(txt_GLCode, selectValues.get(0).get("GLCode"), "Filling data");
			webActions.SendKeysByCharAuto(txt_StatementType, selectValues.get(0).get("Statement Type"), "Filling data");
			webActions.SendKeysByCharAuto(txt_StatementCycle, selectValues.get(0).get("Sta Cycle"), "Filling data");
			webActions.SendKeysByCharAuto(txt_OfficerCode, selectValues.get(0).get("Officer Code"), "Filling data");
			webActions.SendKeysByCharAuto(txt_ChargeCode, selectValues.get(0).get("Charge Code"), "Filling data");
			webActions.SendKeysByCharAuto(txt_ODRICode, selectValues.get(0).get("ODRICode"), "Filling data");
			webActions.sendKeysByChar(txt_RebatePercent, selectValues.get(0).get("Rebate"), "Filling data");
			webActions.sendKeysByChar(txt_Fuelrebate, selectValues.get(0).get("FRebate"), "Filling data");
			webActions.sendKeysByChar(txt_EarningCode, selectValues.get(0).get("ECode"), "Filling data");
			webActions.SendKeysByCharAuto(txt_WriteOff, selectValues.get(0).get("WriteOff"), "Filling data");
			webActions.clickBYJS(btn_OK, "OK Button");
			webActions.waitUntilPresentAndDisplayed(btn_Create, "Create button");
			report.reportPass("Created Account Entity successfully");
		} catch (Exception e) {
			report.reportHardFail(e, "Fail to create account entity ");
		}
	}

	public void verifySecCustEntityOptions() {
		try {
			webActions.waitUntilPresentAndDisplayed(btn_Create, "Create button");
			webActions.assertDisplayed(btn_Create, "Create");
			webActions.assertDisplayed(btn_Edit, "Edit");
			webActions.assertDisplayed(btn_Remove, "Remove");
			webActions.assertDisplayed(btn_Search, "Search");
			webActions.assertDisplayed(btn_AddSeachCondition, "Add Search Condition");
			webActions.assertDisplayed(lbl_CustomerType, "Customer Type");
			webActions.assertDisplayed(lbl_OwnType, "Own Type");
			report.reportPass("Verified all the options from Sec Cus entity page successfully");
		} catch (Exception e) {
			report.reportHardFail(e, "Fail to validate all the options from Sec Cus entity page ");
		}
	}

	public void verifyATMEntitiesOptions() {
		try {
			webActions.waitUntilPresentAndDisplayed(btn_Create, "Create button");
			webActions.assertDisplayed(btn_Create, "Create");
			webActions.assertDisplayed(btn_Edit, "Edit");
			webActions.assertDisplayed(btn_Remove, "Remove");
			webActions.assertDisplayed(btn_Search, "Search");
			webActions.assertDisplayed(btn_AddSeachCondition, "Add Search Condition");
			report.reportPass("Verified all the options from ATM Entities page successfully");
		} catch (Exception e) {
			report.reportHardFail(e, "Fail to validate all the options from ATM Entities page ");
		}
	}

	public void createAtmEntity() {
		try {
			webActions.clickBYJS(btn_Create, "Create Button");
			webActions.waitUntilPresentAndDisplayed(txt_Product, "Product");
			webActions.clickBYJS(btn_IsoCode, "ISOCode Button");
			Thread.sleep(1000);
			webActions.waitUntilPresentAndDisplayed(tbl_FirstRow, "Table");
			webActions.rightClickAction(tbl_FirstRow, "First row");
			webActions.clickBYJS(lbl_SelectRightClick, "Select Button");
			Thread.sleep(1000);
			webActions.clickBYJS(btn_AtmType, "ISOCode Button");
			webActions.waitUntilPresentAndDisplayed(tbl_FirstRow, "Table");
			webActions.rightClickAction(tbl_FirstRow, "First row");
			webActions.clickBYJS(lbl_SelectRightClick, "Select Button");
			Thread.sleep(1000);
			webActions.clickBYJS(btn_TypeCode, "ISOCode Button");
			webActions.waitUntilPresentAndDisplayed(tbl_FirstRow, "Table");
			webActions.rightClickAction(tbl_FirstRow, "First row");
			webActions.clickBYJS(lbl_SelectRightClick, "Select Button");
			Thread.sleep(1000);
			webActions.clickBYJS(btn_Branch, "ISOCode Button");
			webActions.waitUntilPresentAndDisplayed(tbl_FirstRow, "Table");
			webActions.rightClickAction(tbl_FirstRow, "First row");
			webActions.clickBYJS(lbl_SelectRightClick, "Select Button");
			Thread.sleep(1000);
			webActions.clickBYJS(btn_IssueCode, "ISOCode Button");
			webActions.waitUntilPresentAndDisplayed(tbl_FirstRow, "Table");
			webActions.rightClickAction(tbl_FirstRow, "First row");
			webActions.clickBYJS(lbl_SelectRightClick, "Select Button");
			Thread.sleep(1000);
			webActions.sendKeysByChar(txt_Product, "Consumer 3 Month CD", "Filling data");
			webActions.clickBYJS(btn_OK, "OK Button");
			webActions.waitUntilPresentAndDisplayed(btn_Edit, "Create Button");
			report.reportPass("Verified all the options from ATM Entities create page and created successfully");
		} catch (Exception e) {
			report.reportHardFail(e, "Fail to validate create ATM Entitie");
		}
	}

	public void editAtmEntity() {
		try {
			webActions.clickBYJS(btn_Edit, "Edit Button");
			webActions.waitUntilPresentAndDisplayed(txt_Product, "Product");
			webActions.clickBYJS(btn_CardOrderStatus, "Card Order Button");
			webActions.waitUntilPresentAndDisplayed(tbl_FirstRow, "Table");
			webActions.rightClickAction(tbl_FirstRow, "First row");
			webActions.clickBYJS(lbl_SelectRightClick, "Select Button");
			Thread.sleep(1000);
			webActions.clickBYJS(btn_DateExpires, "Date expires Button");
			webActions.waitUntilPresentAndDisplayed(tbl_FirstRow, "Table");
			webActions.rightClickAction(tbl_FirstRow, "First row");
			webActions.clickBYJS(lbl_SelectRightClick, "Select Button");
			Thread.sleep(1000);
			webActions.clickBYJS(btn_OK, "OK Button");
			webActions.waitUntilPresentAndDisplayed(btn_Remove, "Create Button");
			report.reportPass("Edited ATM Entitie successfully");

		} catch (Exception e) {
			report.reportHardFail(e, "Fail to edit ATM Entitie");
		}
	}

	public void removeAtmEntity() {
		try {
			webActions.clickBYJS(btn_Remove, "Remove Button");
			webActions.waitAndCickBYJS(btn_OK, "OK");
			webActions.waitUntilNotPresent(btn_OK, "OK");
			Thread.sleep(5000);
			report.reportPass("Removed ATM Entity successfully");

		} catch (Exception e) {
			report.reportHardFail(e, "Fail to remove ATM Entitie");
		}
	}

	

	public void createNewBranch() {
		try {
			webActions.waitUntilPresentAndDisplayed(btn_Create, "Create button");
			webActions.clickBYJS(btn_Create, "Create Button");
			webActions.waitUntilPresentAndDisplayed(txt_Code, "Code");
			webActions.sendKeysByChar(txt_Code, "1", "Filling data");
			webActions.sendKeysByChar(txt_Description, "Description", "Filling data");
			webActions.clickBYJS(btn_OK, "OK Button");
			webActions.waitUntilPresentAndDisplayed(btn_Edit, "Edit Button");
			report.reportPass("Verified all the options from New branch and created new branch successfully");
		} catch (Exception e) {
			report.reportHardFail(e, "Fail to validate New branch creation");
		}
	}

	public void updateBranch() {
		try {
			webActions.clickBYJS(btn_Edit, "Edit Button");
			webActions.waitUntilPresentAndDisplayed(txt_Description, "description field ");
			webActions.clearAndSendKeysByChar(txt_Description, "Description updated", "Filling data");
			webActions.clickBYJS(btn_OK, "OK Button");
			webActions.waitUntilPresentAndDisplayed(btn_Remove, "Remove Button");
			report.reportPass("New branch updated successfully");

		} catch (Exception e) {
			report.reportHardFail(e, "Fail to edit New branch");
		}
	}

	public void removeNewBranch() {
		try {
			webActions.clickBYJS(btn_Remove, "Remove Button");
			webActions.waitAndCickBYJS(btn_OK, "OK");
			webActions.waitUntilNotPresent(btn_OK, "OK");
			Thread.sleep(1000);
			report.reportPass("Removed new branch successfully");

		} catch (Exception e) {
			report.reportHardFail(e, "Fail to remove New branch");
		}
	}

	public void searchNewBranch(String column, String value) {

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

	@Override
	protected ExpectedCondition getPageLoadCondition() {
		// TODO Auto-generated method stub
		return ExpectedConditions.visibilityOf(btn_CloseTab);
	}
}
