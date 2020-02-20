package com.tab.af.web.pages.EBank;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.tab.af.web.pages.BasePage;

import junit.framework.Assert;

public class HomePage extends BasePage {
	@FindBy(xpath = "//span[text()='Access Groups']")
	private WebElement lbl_AccessGroups;
	@FindBy(xpath = "//span[text()='Accounting']")
	private WebElement lbl_Accounting;
	@FindBy(xpath = "//span[text()='Journal Entry']")
	private WebElement lbl_JournalEntry;
	@FindBy(xpath = "//span[text()='Journal Batch']")
	private WebElement lbl_JournalBatch;
	@FindBy(xpath = "//span[text()='Batch Transaction History']")
	private WebElement lbl_BatchTransactionHistory;
	@FindBy(xpath = "//span[text()='Template Management']")
	private WebElement lbl_TemplateManagement;
	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement lbl_Maintenance;
	@FindBy(xpath = "//span[text()='Interest Rates']")
	private WebElement lbl_InterestRates;
	@FindBy(xpath = "//span[text()='Entities']")
	private WebElement lbl_Entities;
	@FindBy(xpath = "//div[text()='Entities']")
	private WebElement lbl_EntitiesTabHeader;
	@FindBy(xpath = "//span[@class=\"v-menubar-menuitem-caption\"]")
	private List<WebElement> lbl_OptionsList;
	@FindBy(xpath = "//span[text()='BPM']")
	private WebElement lbl_BPM;
	@FindBy(xpath = "//span[text()='Reports']")
	private WebElement lbl_Reports;
	@FindBy(xpath = "//span[text()='Administration']")
	private WebElement lbl_Administration;
	@FindBy(xpath = "//span[text()='Help']")
	private WebElement lbl_Help;
	@FindBy(xpath = "//span[text()='Users']")
	private WebElement lbl_Users;
	@FindBy(xpath = "//span[text()='Roles']")
	private WebElement lbl_Roles;
	@FindBy(xpath = "//span[text()='Dynamic Attributes']")
	private WebElement lbl_DynamicAttributes;
	@FindBy(xpath = "//span[text()='User Sessions']")
	private WebElement lbl_UserSessions;
	@FindBy(xpath = "//span[text()='Locks']")
	private WebElement lbl_Locks;
	@FindBy(xpath = "//span[text()='External Files']")
	private WebElement lbl_ExternalFiles;
	@FindBy(xpath = "//span[text()='Email History']")
	private WebElement lbl_EmailHistory;
	@FindBy(xpath = "//span[text()='Scheduled Tasks']")
	private WebElement lbl_ScheduledTasks;
	@FindBy(xpath = "//span[text()='Restore Deleted Entities']")
	private WebElement lbl_RestoreDeletedEntities;
	@FindBy(xpath = "//span[text()='Entity Inspector']")
	private WebElement lbl_EntityInspector;
	@FindBy(xpath = "//span[text()='Application Properties']")
	private WebElement lbl_ApplicationProperties;
	@FindBy(xpath = "//span[text()='JMX Console']")
	private WebElement lbl_JMXConsole;
	@FindBy(xpath = "//span[text()='Entity Log']")
	private WebElement lbl_EntityLog;
	@FindBy(xpath = "//span[text()='Server Log']")
	private WebElement lbl_ServerLog;
	@FindBy(xpath = "//span[text()='Screen Profiler']")
	private WebElement lbl_ScreenProfiler;
	@FindBy(xpath = "//span[text()='Performance Statistics']")
	private WebElement lbl_PerformanceStatistics;
	
	
	@FindBy(xpath = "//div[@class='popupContent']/div/span[1]")
	private WebElement sMenu_Reports;
	
	@FindBy(xpath = "//span[text()='Report Groups']")
	private WebElement sMenu_ReportGroups;
	
	@FindBy(xpath = "//span[text()='Run Reports']")
	private WebElement sMenu_RunReports;
	
	@FindBy(xpath = "//span[text()='Show Charts']")
	private WebElement sMenu_ShowCharts;
	
	@FindBy(xpath = "//span[text()='Show Tables']")
	private WebElement sMenu_ShowTables;
	
	@FindBy(xpath = "//span[text()='Show Pivot Tables']")
	private WebElement sMenu_PivotTables;
	
	@FindBy(xpath = "//span[text()='Process Models']")
	private WebElement sMenu_ProcessModels;
	
	@FindBy(xpath = "//span[text()='Process Definitions']")
	private WebElement sMenu_ProcessDefinitions;
	
	@FindBy(xpath = "//span[text()='Process Instances']")
	private WebElement sMenu_ProcessInstances;
	
	@FindBy(xpath = "//span[text()='Process Tasks']")
	private WebElement sMenu_ProcessTasks;
	
	@FindBy(xpath = "//span[text()='Attachment Types']")
	private WebElement sMenu_AttachmentTypes;
	
	@FindBy(xpath = "//span[text()='Model Elements Editor']")
	private WebElement sMenu_ModelElementsEditor;
	
	
	
    
	
	@Override
	protected ExpectedCondition getPageLoadCondition() {
		return ExpectedConditions.visibilityOf(lbl_Accounting);
	}

	public AccessGroups openAccessGroups() {
		try {

			webActions.WaitAndClickAction(lbl_Accounting, "Accounting tab");
			webActions.WaitAndClickAction(lbl_JournalEntry, "Journal Entry");
			webActions.WaitAndClickAction(lbl_AccessGroups, "Access Groups");

			report.reportPass("Open access Groups");
		} catch (Exception e) {
			report.reportHardFail(e,"Open access Groups");
		}

		return (AccessGroups) base(AccessGroups.class);
	}

	public BatchTransactionHistory openBatchTransactionHistory() {
		try {
			webActions.WaitAndClickAction(lbl_Accounting, "Accounting tab");
			webActions.WaitAndClickAction(lbl_JournalEntry, "Journal Entry");
			webActions.WaitAndClickAction(lbl_BatchTransactionHistory, "Batch Transaction History");
			report.reportPass("Batch Transaction History");
		} catch (Exception e) {
			report.reportHardFail(e,"Batch Transaction History");
		}
		return (BatchTransactionHistory) base(BatchTransactionHistory.class);
	}

	public JournalAccess openJournalAccess() {
		try {
			webActions.WaitAndClickAction(lbl_Accounting, "Accounting tab");
			webActions.WaitAndClickAction(lbl_JournalEntry, "Journal Entry");
			webActions.WaitAndClickAction(lbl_JournalBatch, "Journal Batch");
			report.reportPass("journal Access");
		} catch (Exception e) {
			report.reportHardFail(e,"journal Access");
		}
		return (JournalAccess) base(JournalAccess.class);
	}

	public void verifyAvailableTabs() {
		try {
			Assert.assertEquals(6, lbl_OptionsList.size());

			report.reportPass("All Otions Displayed");

		} catch (Exception e) {
			report.reportHardFail(e,"All Otions Displayed");
		}
	}

	public TemplateManagement openTemplateManagement() {
		try {
			webActions.WaitAndClickAction(lbl_Accounting, "Accounting tab");
			webActions.WaitAndClickAction(lbl_JournalEntry, "Journal Entry");
			webActions.WaitAndClickAction(lbl_TemplateManagement, "Template Management");
			report.reportPass(" Template Management");
		} catch (Exception e) {
			report.reportHardFail(e," Template Management");
		}
		return (TemplateManagement) base(TemplateManagement.class);
	}

	public InterestRates openInterestRates() {
		try {
			webActions.WaitAndClickAction(lbl_Maintenance, "Open Interest Rates");
			webActions.WaitAndClickAction(lbl_InterestRates, "Interest Rates");

			report.reportPass("Open Interest Rates");
		} catch (Exception e) {
			report.reportHardFail(e,"Open Interest Rates");
		}

		return (InterestRates) base(InterestRates.class);
	}

	public void validateAdminHomePageTabs() {
		try {
			webActions.assertDisplayed(lbl_BPM, "BPM");
			webActions.assertDisplayed(lbl_Reports, "Reports");
			webActions.assertDisplayed(lbl_Accounting, "Accounting");
			webActions.assertDisplayed(lbl_Maintenance, "Maintenance");
			webActions.assertDisplayed(lbl_Administration, "Administration");
			webActions.assertDisplayed(lbl_Help, "Help");
			report.reportPass("Validate EBank HomePage Tabs");
		} catch (Exception e) {
			report.reportHardFail(e,"Validate EBank HomePage Tabs");
		}

	}

	public void openAccounting() {
		try {

			webActions.WaitAndClickAction(lbl_Accounting, "Accounting");
			report.reportPass("Open Accounting");
		} catch (Exception e) {
			report.reportHardFail(e,"Open Accounting");
		}
	}

	public void openJournalEntry() {
		try {

			webActions.WaitAndClickAction(lbl_JournalEntry, "Journal Entry");
			report.reportPass("Journal Entry");
		} catch (Exception e) {
			report.reportHardFail(e,"Journal Entry");
		}
	}
	
	public void validateJournalEntryOptions() {
		try {

			webActions.assertDisplayed(lbl_AccessGroups, "Access Groups");
			webActions.assertDisplayed(lbl_JournalBatch, "Journal Batch");
			webActions.assertDisplayed(lbl_TemplateManagement, "Template Management");
			webActions.assertDisplayed(lbl_BatchTransactionHistory, "Batch Transaction History"); 
			report.reportPass("Journal Entry Options");
		} catch (Exception e) {
			report.reportHardFail(e,"Journal Entry Options");
		}
	}
	public void openMaintenance() {
		try {

			webActions.clickAction(lbl_Maintenance, "Maintenance");
			report.reportPass("Maintenance");
		} catch (Exception e) {
			report.reportHardFail(e,"Maintenance");
		}
	}
	public void validateMaintenanceOptions() {
		try {

			webActions.assertDisplayed(lbl_InterestRates, "Interest Rates");
			webActions.assertDisplayed(lbl_Entities, "Entities"); 
			report.reportPass("Maintenenace Options");
		} catch (Exception e) {
			report.reportHardFail(e,"Maintenenace Options");
		}
	}
	public void openEntities() {
		try {
			webActions.clickAction(lbl_Maintenance, "Maintenance");
			webActions.clickAction(lbl_Entities, "Entities");
			report.reportPass("Entities");
		} catch (Exception e) {
			report.reportHardFail(e,"Entities");
		}
	}
	public void validateEntitiesPageLoaded() {
		try {
              webActions.waitForJSandJQueryToLoad();
			webActions.assertDisplayed(lbl_EntitiesTabHeader, "Entities Tab Header");
			report.reportPass("Entities Tab Header");
		} catch (Exception e) {
			report.reportHardFail(e,"Entities Tab Header");
		}
	}
	public void clickAdministrationTab() {
		try {
			webActions.clickAction(lbl_Administration, "Administration"); 
			report.reportPass("Administration Tab");
		} catch (Exception e) {
			report.reportHardFail(e,"Administration Tab");
		}
	}
	
	public void validateAdministrationTabOptions() {
		try {

			webActions.assertDisplayed(lbl_Users, "users");
			webActions.assertDisplayed(lbl_AccessGroups, "Access Groups"); 
			webActions.assertDisplayed(lbl_Roles, "Roles");
			webActions.assertDisplayed(lbl_DynamicAttributes, "Dynamic Attribute");
			webActions.assertDisplayed(lbl_UserSessions, "User Sessions");
			webActions.assertDisplayed(lbl_Locks, "Locks");
			webActions.assertDisplayed(lbl_ExternalFiles, "External Files");
			webActions.assertDisplayed(lbl_EmailHistory, "Email History");
			webActions.assertDisplayed(lbl_ScheduledTasks, "Scheduled Tasks");
			webActions.assertDisplayed(lbl_RestoreDeletedEntities, "Restore Deleted Entities");
			webActions.assertDisplayed(lbl_EntityInspector, "Entity Inspector");
			webActions.assertDisplayed(lbl_ApplicationProperties, "Application Properties");
			webActions.assertDisplayed(lbl_JMXConsole, "JMX Console");
			webActions.assertDisplayed(lbl_EntityLog, "Entity Log");
			webActions.assertDisplayed(lbl_ServerLog, "Server Log");
			webActions.assertDisplayed(lbl_ScreenProfiler, "Screen Profiler");
			webActions.assertDisplayed(lbl_PerformanceStatistics, "Performance Statistics");
			report.reportPass("Maintenenace Options");
		} catch (Exception e) {
			report.reportHardFail(e,"Maintenenace Options");
		}
	}
	public ScheduledTasks openScheduledTasks() {
		try {

			webActions.WaitAndClickAction(lbl_Administration, "Administration Tab");
			webActions.WaitAndClickAction(lbl_ScheduledTasks, "Scheduled Tasks"); 
			report.reportPass("Open Scheduled Tasks");
		} catch (Exception e) {
			report.reportHardFail(e,"Open Scheduled Tasks");
		}

		return (ScheduledTasks) base(ScheduledTasks.class);
	}
	
	public Users openUsersPage() {
		try {

			webActions.WaitAndClickAction(lbl_Administration, "Administration Tab");
			webActions.WaitAndClickAction(lbl_Users, "Users option"); 
			report.reportPass("Opened users page successfully");
		} catch (Exception e) {
			report.reportHardFail(e,"Fail to open users");
		}

		return (Users) base(Users.class);
	}
	
	public ServerLog openServerLogPage() {
		try {

			webActions.WaitAndClickAction(lbl_Administration, "Administration Tab");
			webActions.WaitAndClickAction(lbl_ServerLog, "Server Log option"); 
			report.reportPass("Opened Server log page successfully");
		} catch (Exception e) {
			report.reportHardFail(e,"Fail to open server log");
		}

		return (ServerLog) base(ServerLog.class);
	}
	
	public Reports openReportsPage() {
		try {

			webActions.WaitAndClickAction(lbl_Reports, "Reports Tab");
			webActions.WaitAndClickAction(sMenu_Reports, "Reports sub menu option"); 
			report.reportPass("Opened Reports page successfully");
		} catch (Exception e) {
			report.reportHardFail(e,"Fail to open Reports page");
		}

		return (Reports) base(Reports.class);
	}
	
	public Reports openReportGroupsPage() {
		try {

			webActions.WaitAndClickAction(lbl_Reports, "Reports Tab");
			webActions.WaitAndClickAction(sMenu_ReportGroups, "Reports groups sub menu option"); 
			report.reportPass("Opened Report Groups page successfully");
		} catch (Exception e) {
			report.reportHardFail(e,"Fail to open Report Groups page");
		}

		return (Reports) base(Reports.class);
	}
	
	public Reports openRunReportsPage() {
		try {

			webActions.WaitAndClickAction(lbl_Reports, "Reports Tab");
			webActions.WaitAndClickAction(sMenu_RunReports, "Run reports sub menu option"); 
			report.reportPass("Opened Run reports page successfully");
		} catch (Exception e) {
			report.reportHardFail(e,"Fail to open Run reports page");
		}

		return (Reports) base(Reports.class);
	}
	
	public Reports openShowChartsPage() {
		try {

			webActions.WaitAndClickAction(lbl_Reports, "Reports Tab");
			webActions.WaitAndClickAction(sMenu_ShowCharts, "Show charts sub menu option"); 
			report.reportPass("Opened Show charts page successfully");
		} catch (Exception e) {
			report.reportHardFail(e,"Fail to open Show charts page");
		}

		return (Reports) base(Reports.class);
	}
	
	public Reports openShowtablesPage() {
		try {

			webActions.WaitAndClickAction(lbl_Reports, "Reports Tab");
			webActions.WaitAndClickAction(sMenu_ShowTables, "Show Tables sub menu option"); 
			report.reportPass("Opened Show Tables page successfully");
		} catch (Exception e) {
			report.reportHardFail(e,"Fail to open Show Tables page");
		}

		return (Reports) base(Reports.class);
	}
	
	public Reports openPivotTablesPage() {
		try {

			webActions.WaitAndClickAction(lbl_Reports, "Reports Tab");
			webActions.WaitAndClickAction(sMenu_PivotTables, "Show Pivot Tables sub menu option"); 
			report.reportPass("Opened Show Pivot Tables page successfully");
		} catch (Exception e) {
			report.reportHardFail(e,"Fail to open Show Pivot Tables page");
		}

		return (Reports) base(Reports.class);
	}
	
	public Reports openProcessModelsPage() {
		try {

			webActions.WaitAndClickAction(lbl_BPM, "BPM Tab");
			webActions.WaitAndClickAction(sMenu_ProcessModels, "Process models sub menu option"); 
			report.reportPass("Opened Process models page successfully");
		} catch (Exception e) {
			report.reportHardFail(e,"Fail to open process models page");
		}

		return (Reports) base(Reports.class);
	}
	
	public Reports openModelElementsPage() {
		try {

			webActions.WaitAndClickAction(lbl_BPM, "BPM Tab");
			webActions.WaitAndClickAction(sMenu_ModelElementsEditor, "Model ElementsEditor sub menu option"); 
			report.reportPass("Opened ModelElementsEditor page successfully");
		} catch (Exception e) {
			report.reportHardFail(e,"Fail to open ModelElementsEditor page");
		}

		return (Reports) base(Reports.class);
	}
	
	public Reports openProcessDefinitionsPage() {
		try {

			webActions.WaitAndClickAction(lbl_BPM, "BPM Tab");
			webActions.WaitAndClickAction(sMenu_ProcessDefinitions, "ProcessDefinitions sub menu option"); 
			report.reportPass("Opened ProcessDefinitions page successfully");
		} catch (Exception e) {
			report.reportHardFail(e,"Fail to open ProcessDefinitions page");
		}

		return (Reports) base(Reports.class);
	}
	
	public Reports openProcessInstancesPage() {
		try {

			webActions.WaitAndClickAction(lbl_BPM, "BPM Tab");
			webActions.WaitAndClickAction(sMenu_ProcessInstances, "ProcessInstances sub menu option"); 
			report.reportPass("Opened ProcessInstances page successfully");
		} catch (Exception e) {
			report.reportHardFail(e,"Fail to open ProcessInstances page");
		}

		return (Reports) base(Reports.class);
	}
	
	public Reports openProcessTasksPage() {
		try {

			webActions.WaitAndClickAction(lbl_BPM, "BPM Tab");
			webActions.WaitAndClickAction(sMenu_ProcessTasks, "ProcessTasks sub menu option"); 
			report.reportPass("Opened ProcessTasks page successfully");
		} catch (Exception e) {
			report.reportHardFail(e,"Fail to open ProcessTasks page");
		}

		return (Reports) base(Reports.class);
	}
	
	public Reports openAttachmentTypesPage() {
		try {

			webActions.WaitAndClickAction(lbl_BPM, "BPM Tab");
			webActions.WaitAndClickAction(sMenu_AttachmentTypes, "AttachmentTypes sub menu option"); 
			report.reportPass("Opened AttachmentTypes page successfully");
		} catch (Exception e) {
			report.reportHardFail(e,"Fail to open AttachmentTypes page");
		}

		return (Reports) base(Reports.class);
	}
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
