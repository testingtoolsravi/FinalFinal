package com.tab.af.web.pages.EDGe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.tab.af.web.pages.BasePage;

public class EdgeHomePage extends BasePage{
	
	public EdgeHomePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text()='Experian']")
	private WebElement tab_Experian;
	
	@FindBy(xpath = "//span[text()='Help']")
	private WebElement tab_Help;
	
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
	
	public EdgeHomePage verifyHomePage() {
		try {
			webActions.assertDisplayed(tab_Help, "Help Tab"); 
			report.reportPass("User logged in successfully and displayed home page");
		} catch (Exception e) {
			report.reportHardFail(e,"Failed to logged in to the application");
		}
		return (EdgeHomePage) base(EdgeHomePage.class);
	}
	
	
	public EdgePage openARMenu(String menu, String subMenu) {
		try {

			webActions.clickAction(mnu_AR, "AR");
			if (menu.equalsIgnoreCase("NOA Management")) {
				webActions.clickAction(mnu_NOAManagement, "NOA Management");
				report.reportPass("Clicked on NOA Management successfully");
				if(subMenu.equalsIgnoreCase("NOA Clients")) {
					webActions.clickAction(smnu_NOAClients, "NOA Clients");
					report.reportPass("Clicked on NOA Clients successfully");
				}else if(subMenu.equalsIgnoreCase("NOA Queues")) {
					webActions.clickAction(smnu_NOAQueues, "NOA Queues");
					report.reportPass("Clicked on NOA Queues successfully");
				}else if(subMenu.equalsIgnoreCase("NOA Templates")) {
					webActions.clickAction(smnu_NOATemplates, "NOA Templates");
					report.reportPass("Clicked on NOA Templates successfully");
				}else if(subMenu.equalsIgnoreCase("NOA Files")) {
					webActions.clickAction(smnu_NOAFiles, "NOA Files");
					report.reportPass("Clicked on NOA Files successfully");
				} 
			} else if (menu.equalsIgnoreCase("Invoices")) {
				webActions.clickAction(mnu_Invoices, "Invoices");
				report.reportPass("Clicked on Invoices successfully");
			} else if (menu.equalsIgnoreCase("Factorsoft")) {
				webActions.clickAction(mnu_Factorsoft, "Factorsoft");
				report.reportPass("Clicked on Factorsoft successfully");
			}

		} catch (Exception e) {
			report.reportHardFail(e,"Failed to click on Miantenance ");
		}
		return (EdgePage) base(EdgePage.class);
		
	}
	
	
	

	@Override
	protected ExpectedCondition getPageLoadCondition() {
		// TODO Auto-generated method stub
		return ExpectedConditions.visibilityOf(tab_Experian);
	}

}
