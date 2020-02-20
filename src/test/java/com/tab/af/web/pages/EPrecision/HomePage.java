package com.tab.af.web.pages.EPrecision;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.tab.af.web.pages.BasePage;

public class HomePage extends BasePage {
	@FindBy(xpath = "//span[text()='Sonic']//following::span[@class=\"v-menubar-submenu-indicator-icon\"][1]//span")
	private WebElement lbl_Sonic;
	@FindBy(xpath = "//span[text()='First Data']")
	private WebElement lbl_FirstData;
	@FindBy(xpath = "//span[text()='Process Errors']")
	private WebElement lbl_ProcessErrors;
	@FindBy(xpath = "//span[text()='End Of Day Jobs']")
	private WebElement lbl_EndOfDayJobJobs;
	@FindBy(xpath = "//span[text()='Precision']")
	private WebElement lbl_Precision;
	@FindBy(xpath = "//span[text()='Administration']")
	private WebElement lbl_Administration;
	@FindBy(xpath = "//span[text()='Help']")
	private WebElement lbl_Help;
	@FindBy(xpath = "//span[text()='Object']//following::span[@class=\"v-menubar-submenu-indicator-icon\"][1]//span")
	private WebElement lbl_Object;
	@FindBy(xpath = "//span[text()='Cif Entity']")
	private WebElement lbl_CifEntity;
	@FindBy(xpath = "//span[text()='Account Entity']")
	private WebElement lbl_AccountEntity;
	@FindBy(xpath = "//span[text()='Sec Cust Entity']")
	private WebElement lbl_SecCustEntity;
	@FindBy(xpath = "//span[text()='Atm Entities']")
	private WebElement lbl_AtmEntities;
	@FindBy(xpath = "//span[text()='Maintenance']//following::span[2]")
	private WebElement lbl_Maintenance;

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

	@FindBy(xpath = "//span[text()='Ping']")
	private WebElement lbl_Ping;

	@Override
	protected ExpectedCondition getPageLoadCondition() {

		return ExpectedConditions.visibilityOf(lbl_FirstData);
	}

	public ProcessErrors navigateToProcessErros() {
		try {
			webActions.clickAction(lbl_FirstData, "lbl_FirstData");
			webActions.clickAction(lbl_ProcessErrors, "Process Errors");
			report.reportPass("Process Errors");
		} catch (Exception e) {
			report.reportHardFail(e, "Process Errors");
		}
		return (ProcessErrors) base(ProcessErrors.class);
	}

	public EndOfDayJobs navigateToEndOfDayJobs() {
		try {
			webActions.clickAction(lbl_FirstData, "lbl_FirstData");
			webActions.clickAction(lbl_EndOfDayJobJobs, "Process Errors");
			report.reportPass("End Of Day Jobs");
		} catch (Exception e) {
			report.reportHardFail(e, "End Of Day Jobs");
		}
		return (EndOfDayJobs) base(EndOfDayJobs.class);
	}

	public Precision navigateToPrecisionOptions() {
		try {
			webActions.clickAction(lbl_Precision, "Precision");
			report.reportPass("Precision");
		} catch (Exception e) {
			report.reportHardFail(e, "Precision");
		}
		return (Precision) base(Precision.class);
	}

	public SonicObjectPage navigateToCifEntity(String entity) {
		try {

			webActions.clickAction(lbl_Precision, "Precision");

			webActions.clickAction(lbl_Sonic, "Sonic");

			webActions.clickAction(lbl_Object, "Object");
			if (entity.equalsIgnoreCase("Cif Entity")) {
				webActions.clickAction(lbl_CifEntity, "CIF Entity");
				report.reportPass("Clicked on CIF Entity successfully");
			} else if (entity.equalsIgnoreCase("Account Entity")) {
				webActions.clickAction(lbl_AccountEntity, "Account Entity");
				report.reportPass("Clicked on Account Entity successfully");
			} else if (entity.equalsIgnoreCase("Sec Cust Entity")) {
				webActions.clickAction(lbl_SecCustEntity, "Sec Cust Entity");
				report.reportPass("Clicked on Sec Cust Entity successfully");
			} else if (entity.equalsIgnoreCase("Atm Entities")) {
				webActions.clickAction(lbl_AtmEntities, "Atm Entities");
				report.reportPass("Clicked on Atm Entities successfully");
			}

		} catch (Exception e) {
			report.reportHardFail(e, "Failed to click on Object entity");
		}
		return (SonicObjectPage) base(SonicObjectPage.class);
	}

	public SonicObjectPage navigateToMaintenance(String entity) {
		try {

			webActions.clickAction(lbl_Precision, "Precision");

			webActions.clickAction(lbl_Sonic, "Sonic");

			webActions.clickAction(lbl_Maintenance, "Maintenance");
			if (entity.equalsIgnoreCase("maintenance")) {
				report.reportPass("Clicked on Maintenance successfully");
			} else if (entity.equalsIgnoreCase("Branches")) {
				webActions.clickAction(opt_Branches, "Branches");
				report.reportPass("Clicked on Branches successfully");
			} else if (entity.equalsIgnoreCase("Call Reports")) {
				webActions.clickAction(opt_CallReports, "Call Reports");
				report.reportPass("Clicked on Call Reports successfully");
			} else if (entity.equalsIgnoreCase("Dda ODRI Charges")) {
				webActions.clickAction(opt_ODRICharges, "Dda ODRI Charges");
				report.reportPass("Clicked on Dda ODRI Charges successfully");
			}

		} catch (Exception e) {
			report.reportHardFail(e, "Failed to click on Miantenance ");
		}
		return (SonicObjectPage) base(SonicObjectPage.class);
	}

	public void openMaintenanceOptions() {
		try {

			webActions.clickAction(lbl_Precision, "Precision");

			webActions.clickAction(lbl_Sonic, "Sonic");

			webActions.clickAction(lbl_Maintenance, "Maintenance");
			report.reportPass("Clicked on Maintenance successfully");
		} catch (Exception e) {
			report.reportHardFail(e, "Failed to click on Miantenance ");
		}

	}

	public Ping navigateToPingSystem() {
		try {

			webActions.clickAction(lbl_Precision, "Precision");
			webActions.WaitAndClickAction(lbl_Ping, "Ping");
			report.reportPass("PING System");
		} catch (Exception e) {
			report.reportHardFail(e, "PING System");
		}
		return (Ping) base(Ping.class);
	}

	public void assertPage() {
		try {

			webActions.assertDisplayed(lbl_FirstData, "First Data");
			report.reportPass("Assert Home Page");
		} catch (Exception e) {
			report.reportHardFail(e, "Assert Home Page");
		}

	}

	public void assertHomePageOptions() {
		try {

			webActions.assertDisplayed(lbl_FirstData, "First Data");
			webActions.assertDisplayed(lbl_Administration, "Administration");
			webActions.assertDisplayed(lbl_Precision, "First Data");
			webActions.assertDisplayed(lbl_Help, "Help");
			report.reportPass("Assert Home Page");
		} catch (Exception e) {
			report.reportHardFail(e, "Assert Home Page");
		}

	}

	public void clickPrecisionOption() {
		try {

			webActions.clickAction(lbl_Precision, "Precision Option");
			report.reportPass("Click Precision Option");
		} catch (Exception e) {
			report.reportHardFail(e, "Assert Home PageClick Precision Option");
		}

	}

	public void verifyMaintaenanceOptions() {
		try {
			webActions.waitUntilPresentAndDisplayed(opt_Branches, "Branches");
			webActions.assertDisplayed(opt_Branches, "Branches");
			webActions.assertDisplayed(opt_ODRICharges, "ODRI Charges");
			webActions.assertDisplayed(opt_GLCodes, "GL codes");
			webActions.assertDisplayed(opt_OfficerCodes, "Officer Codes");
			webActions.assertDisplayed(opt_RelationShipCodes, "Relationship codes");
			webActions.assertDisplayed(opt_SChargeCodes, "Service charge codes");
			webActions.assertDisplayed(opt_StatCycles, "Statement cycles");
			webActions.assertDisplayed(opt_StatTypes, "Statement Types");
			webActions.assertDisplayed(opt_Types, "Types");
			webActions.assertDisplayed(opt_OwnTypes, "Own Types");
			webActions.assertDisplayed(opt_WriteOff, "Write off");
			webActions.assertDisplayed(opt_Card, "Card");
			webActions.assertDisplayed(opt_CD, "CD");
			report.reportPass("Verified maintenance options successfully");

		} catch (Exception e) {
			report.reportHardFail(e, "Fail to verify maintenance options");
		}
	}

	public void validatePrecisionTabOption() {
		try {

			webActions.assertDisplayed(lbl_Sonic, "Sonic Option");
			webActions.assertDisplayed(lbl_Ping, "Ping Option");
			report.reportPass("Precision Tab Option");
		} catch (Exception e) {
			report.reportHardFail(e, "Precision Tab Option");
		}

	}
}
