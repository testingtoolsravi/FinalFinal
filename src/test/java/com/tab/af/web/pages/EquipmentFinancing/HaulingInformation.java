package com.tab.af.web.pages.EquipmentFinancing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.tab.af.web.pages.BasePage;

public class HaulingInformation extends BasePage {
    @FindBy(xpath = "//body")
    private WebElement page;
    String txt_truckToHaulFor = "paper-input[id='truckToHaulFor']";
    String txt_ContactPerson = "paper-input[id='contact']";
    String txt_ContactPersonPhone = "paper-input[id='phone']";
    String rBtn_isNewLease = "radio-group[id='isNewLease']>paper-radio-button[id='_option']";
    String txt_Address = "address-info[id='_haulingReferenceAddress']>paper-input[id='addressText']";
    String txt_City = "address-info[id='_haulingReferenceAddress']>paper-input[id='cityText']";
    String drp_State = "address-info[id='_haulingReferenceAddress']>paper-autocomplete[id='_stateDD']>paper-input[id='autocompleteInput']";
    String txt_ZIP = "address-info[id='_haulingReferenceAddress']>paper-input[id='zipText']";
    String txt_MonthlyGrossIncome = "paper-input[id='monthlyGrossIncome']";
    String txt_YearsWithCompany = "paper-input[id='experience']";
    String txt_CommodityHauled = "paper-input[id='commodityHauled']";
    String btn_Next = "paper-button[id='_nextButton']";

    @Override
    protected ExpectedCondition getPageLoadCondition() {
	return ExpectedConditions.visibilityOf(page);
    }

    public Equipment fillHaulingReference(String newLease, String monthlyGrossIncome) {
	try {
	    shadow.waitAndSendKeys(txt_truckToHaulFor, faker.company().name(), "Truck to haul for");
	    shadow.selectRadioButonByLabel(rBtn_isNewLease, newLease, "New Lease");
	    shadow.sendKeys(txt_ContactPerson, faker.name().fullName(), "Contact Person");
	    shadow.sendKeys(txt_ContactPersonPhone, faker.phoneNumber().cellPhone(), "Contact Person Phone");
	    shadow.sendKeys(txt_Address, faker.address().streetAddress(), "Address");
	    shadow.sendKeys(txt_City, faker.address().city(), "City");
	    shadow.sendKeystoAuto(drp_State, faker.address().state(), "State");
	    shadow.sendKeys(txt_ZIP, faker.address().zipCode(), "ZIP");
	    shadow.sendKeys(txt_MonthlyGrossIncome, monthlyGrossIncome, "Monthly Gross Income");
	    shadow.sendKeys(txt_YearsWithCompany, faker.random().nextInt(1, 15).toString(), "Years with Company");
	    shadow.sendKeys(txt_CommodityHauled, faker.lorem().characters(10), "Commodity Hauled");
	    shadow.click(btn_Next, "Next");
	    report.reportPass("Fill Hauling Reference");
	} catch (Exception e) {
	    report.reportHardFail(e, "Fill Hauling Reference");
	}
	return (Equipment) base(Equipment.class);
    }
}
