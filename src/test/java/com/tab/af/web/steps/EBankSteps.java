package com.tab.af.web.steps;

import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;

import com.tab.af.web.pages.EBank.AccessGroups;
import com.tab.af.web.pages.EBank.BatchTransactionHistory;
import com.tab.af.web.pages.EBank.HomePage;
import com.tab.af.web.pages.EBank.InterestRates;
import com.tab.af.web.pages.EBank.JournalAccess;
import com.tab.af.web.pages.EBank.Login;
import com.tab.af.web.pages.EBank.Reports;
import com.tab.af.web.pages.EBank.ScheduledTasks;
import com.tab.af.web.pages.EBank.ServerLog;
import com.tab.af.web.pages.EBank.TemplateManagement;
import com.tab.af.web.pages.EBank.Users;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class EBankSteps {
    Login login = new Login();
    AccessGroups access = new AccessGroups();
    JournalAccess journal = new JournalAccess();
    TemplateManagement template = new TemplateManagement();
    BatchTransactionHistory batch = new BatchTransactionHistory();
    HomePage home = new HomePage();
    InterestRates interest = new InterestRates();
    ScheduledTasks scheduledTask = new ScheduledTasks();
    Users user = new Users();
    Reports report = new Reports();
    ServerLog serverLog = new ServerLog();

    @Given("user logged into EBank as {string} and {string}")
    public void user_logged_into_EBank_as_and(String userName, String password) {
	home = login.login(userName, password);
    }

    @Given("User is Logged in and All options are Displayed")
    public void user_is_Logged_in_and_All_options_are_Displayed() {
	home.verifyAvailableTabs();
    }

    @When("User navigates to Acess Group and create a new Access Group")
    public void user_navigates_to_Acess_Group_and_create_a_new_Access_Group(DataTable table) {
	access = home.openAccessGroups();
	List<Map<String, String>> data = table.asMaps(String.class, String.class);
	access.createAccessGroup(data.get(0).get("userAccessGroup"), data.get(0).get("accountAccessType"),
		data.get(0).get("accountNumber"), data.get(0).get("branch"), data.get(0).get("type"));
    }

    @Then("Access group should be created Successfully")
    public void access_group_should_be_created_Successfully() {
	access.validateAccessGroupCreatedSuccesfully();
    }

    @Then("user should be able to edit search download and remove actions Successfully")
    public void user_should_be_able_to_edit_search_download_and_remove_actions_Successfully() {
	access.editAccessGroup("Anonymous [anonymous]");
	 
	access.validateSearch();
	access.removeAccessGroup();
    }

    @When("User navigates to Journal Batch")
    public void user_navigates_to_Journal_Batch() {
	journal = home.openJournalAccess();
    }

    @Then("On Journal Batch screen search create edit remove addsearchcondtion and excel options should be displayed")
    public void on_Journal_Batch_screen_search_create_edit_remove_addsearchcondtion_and_excel_options_should_be_displayed() {
	journal.verifyOptions();
    }

    @When("User navigates to Template Management")
    public void user_navigates_to_Template_Management() {
	template = home.openTemplateManagement();
    }

    @Then("On Template Management screen create edit remove Excel search and addsearchcondtion options should be displayed")
    public void on_Template_Management_screen_create_edit_remove_Excel_search_and_addsearchcondtion_options_should_be_displayed() {
	template.verifyOptions();
    }

    @When("User navigates to Batch Transaction History")
    public void user_navigates_to_Batch_Transaction_History() {
	batch = home.openBatchTransactionHistory();
    }

    @Then("User should be able to Download Excel Data and perform search")
    public void user_should_be_able_to_Download_Excel_Data_and_perform_search() {
	batch.downloadExcel();
	batch.verifyOptions();
	batch.validateSearch("Account", "1011169");
    }

    @When("User create a Interest with Active Status")
    public void user_create_a_Interest_with_Active_Status() {
	interest = home.openInterestRates();
	interest.createInterestRate("365 Checking CONSUMER", "1", "Active", "2", "10");
    }

    @Then("Active Status not allowed Warning should be Displayed")
    public void active_Status_not_allowed_Warning_should_be_Displayed() {
	interest.interestStatePendingWarning();
    }

    @When("user changes Status to Pending")
    public void user_changes_Status_to_Pending() {
	interest.changeRateStatusandSave("Pending");
    }

    @Then("Interest should be saved")
    public void interest_should_be_saved() {
    }

    @When("users update any Interest data")
    public void users_update_any_Interest_data() {
	interest.updateEffectiveDateandSave(DateTime.now().plusDays(10).toString("MM/dd/yyyy"));
    }

    @Then("changes should be updated")
    public void changes_should_be_updated() {
	interest.validateDateUpdated(DateTime.now().plusDays(10).toString("MM/dd/yyyy"));
    }

    @Then("user should be able to seach for the Interest Rate")
    public void user_should_be_able_to_seach_for_the_Interest_Rate() {
	interest.validateSearch("Product desc", "365 Checking CONSUMER");
    }

    @When("user changes status to Active After Saving")
    public void user_changes_status_to_Active_After_Saving() {
	interest.changeRateStatusandSave("Active");
    }

    @Then("Same user cannot change Status warning Should be Displayed")
    public void same_user_cannot_change_Status_warning_Should_be_Displayed() {
	interest.interestMustbeChangedByOtherUserWarning();
    }

    @When("user logsin with Other User and changes Status to Active")
    public void user_logsin_with_Other_User_and_changes_Status_to_Active() {
	login.logOut();
	login.login("admin", "admin");
	home.openInterestRates();
    }

    @Then("Product should be saved with Active Status")
    public void product_should_be_saved_with_Active_Status() {
	interest.selectInterestRateByBalance();
	interest.changeRateStatusandSave("Active");
    }

    @Then("Below Tabs should be available to the user")
    public void below_Tabs_should_be_available_to_the_user(DataTable dataTable) {
	home.validateAdminHomePageTabs();
    }

    @Then("Below Accounting Tab should be Journal Entry Tab")
    public void below_Accounting_Tab_should_be_Journal_Entry_Tab() {
	home.openAccounting();
	home.openJournalEntry();
    }

    @Then("Below Journal Entry Tab Should be below Options")
    public void below_Journal_Entry_Tab_Should_be_below_Options(io.cucumber.datatable.DataTable dataTable) {
	home.validateJournalEntryOptions();
    }

    @When("User navigates to Access Groups")
    public void user_navigates_to_Access_Groups() {
	access = home.openAccessGroups();
    }

    @Then("Access Groups Page should have below Options")
    public void access_Groups_Page_should_have_below_Options(io.cucumber.datatable.DataTable dataTable) {
	access.validateAccessGroupOptions();
    }

    @Then("On Batch Transaction page bel should be displayed")
    public void on_Batch_Transaction_page_bel_should_be_displayed(io.cucumber.datatable.DataTable dataTable) {
	batch.validateBatchTransactionHistoryOptions();
    }

    @When("User Expands Maintenance Option")
    public void user_Expands_Maintenance_Option() {
	home.openMaintenance();
    }

    @Then("In Maintenance tab below options should be displayed")
    public void in_Maintenance_tab_below_options_should_be_displayed(io.cucumber.datatable.DataTable dataTable) {
	home.validateMaintenanceOptions();
    }

    @When("User Navigates to Entities Page")
    public void user_Navigates_to_Entities_Page() {
	home.openEntities();
    }

    @Then("Application should navigate to Entities Page")
    public void application_should_navigate_to_Entities_Page() {
	home.validateEntitiesPageLoaded();
    }

    @When("User Navigates to Interest Rates Page")
    public void user_Navigates_to_Interest_Rates_Page() {
	interest = home.openInterestRates();
    }

    @Then("Interest Rates Page should have below options")
    public void interest_Rates_Page_should_have_below_options(io.cucumber.datatable.DataTable dataTable) {
	interest.validatePageOptions();
    }

    @When("User Expands Administration Tab")
    public void user_Expands_Administration_Tab() {
	home.clickAdministrationTab();
    }

    @Then("Administration Tab should have below options")
    public void administration_Tab_should_have_below_options(io.cucumber.datatable.DataTable dataTable) {
	home.validateAdminHomePageTabs();
    }

    @When("User Navigates to Scheduled Tasks")
    public void user_Navigates_to_Scheduled_Tasks() {
	scheduledTask = home.openScheduledTasks();
    }

    @Then("Scheduled tasks Page should have below options")
    public void scheduled_tasks_Page_should_have_below_options(io.cucumber.datatable.DataTable dataTable) {
	scheduledTask.validateScheduledTaskPageOptions();
    }

    @Then("Click on create button and Verify options from create new batch page")
    public void click_on_create_button_and_Verify_options_from_create_new_batch_page() {
	journal.verifyTemplateOptions();
    }

    @Then("Click on Add button to add template details")
    public void click_on_Add_button_to_add_template_details() {
	journal.clickAddButton();
    }

    @Then("Enter Account number as {string} in to debit Account field")
    public void enter_Account_number_as_in_to_debit_Account_field(String accountNumber) {
	journal.enterDebitAcctNumber(accountNumber);
    }

    @Then("Enter Selector as {string} in to debit selector field")
    public void enter_Selector_as_in_to_debit_selector_field(String selector) {
	journal.enterDebitSelector(selector);
    }

    @Then("Enter Amount as {string} in to debit amount field")
    public void enter_Amount_as_in_to_debit_amount_field(String amount) {
	journal.enterDebitAmount(amount);
    }

    @Then("Enter Description as {string} in to debit description field")
    public void enter_Description_as_in_to_debit_description_field(String string) {
	journal.enterDebitDescription(string);
    }

    @Then("Enter Account number as {string} in to credit Account field")
    public void enter_Account_number_as_in_to_credit_Account_field(String accountNumber) {
	journal.enterCreditAcctNumber(accountNumber);
    }

    @Then("Enter Selector as {string} in to credit selector field")
    public void enter_Selector_as_in_to_credit_selector_field(String string) {
	journal.enterCreditSelector(string);
    }

    @Then("Enter Amount as {string} in to credit amount field")
    public void enter_Amount_as_in_to_credit_amount_field(String string) {
	journal.enterCreditAmount(string);
    }

    @Then("Enter Description as {string} in to credit description field")
    public void enter_Description_as_in_to_credit_description_field(String string) {
	journal.enterCreditDescription(string);
    }

    @Then("Click on Create template button")
    public void click_on_Create_template_button() {
	journal.clickCreateTemplate();
    }

    @Then("Enter {string} in to template name field")
    public void enter_in_to_template_name_field(String string) {
	journal.enterTamplateName(string);
    }

    @Then("Enter {string} in to description field")
    public void enter_in_to_description_field(String string) {
	journal.enterDescr(string);
    }

    @Then("Enter {string} in to description field in tamplate management page")
    public void enter_in_to_description_field_in_tamplate_management_page(String string) {
	journal.enterDescrInTemplate(string);
    }

    @Then("Click on OK button to create template")
    public void click_on_OK_button_to_create_template() {
	journal.clickOkButton();
    }

    @Then("Click on submit button")
    public void click_on_submit_button() {
	journal.clickSubmitButton();
    }

    @Then("Select and edit record Enter new amount {string} values and click on submit button")
    public void select_and_edit_record_Enter_new_amount_values_and_click_on_submit_button(String string) {
	journal.editRecord(string);
    }

    @Then("Select and edit record Enter new description {string} values and click on submit button")
    public void select_and_edit_record_Enter_new_description_values_and_click_on_submit_button(String string) {
	journal.editTemplateRecord(string);
    }

    @Then("Select template and click on remove and remove template")
    public void select_template_and_click_on_remove_and_remove_template() {
	journal.removeRecord();
    }

    @Then("Perform search and validate results with {string} user {string}")
    public void perform_search_and_validate_results_with_user(String criteria, String value) {
	journal.verifySearch(criteria, value);
    }

    @Then("Perform search and validate results with {string} user {string} in schedule task page")
    public void perform_search_and_validate_results_with_user_in_schedule_task_page(String criteria, String value) {
	scheduledTask.verifySearch(criteria, value);
    }

    @Then("Click on create button to verify options from Journal template page")
    public void click_on_create_button_to_verify_options_from_Journal_template_page() {
	template.verifyJournalTemplateOptions();
    }

    @Then("Click on Create button and verify all options from page")
    public void click_on_Create_button_and_verify_all_options_from_page() {
	scheduledTask.validateCreateScheduledTaskPageOptions();
    }

    @Then("Fill all the data {string} and user {string} and corn {string} and des {string} create schedule task")
    public void fill_all_the_data_and_user_and_corn_and_des_create_schedule_task(String classValue, String user,
	    String corn, String description) {
	scheduledTask.createTask(classValue, user, corn, description);
    }

    @Then("Click on edit and update {string} description field value")
    public void click_on_edit_and_update_description_field_value(String string) {
	scheduledTask.editScheduleTask(string);
    }

    @Then("Verify execution hostory of created task")
    public void verify_execution_hostory_of_created_task() {
	scheduledTask.verifyExecutionHistory();
    }

    @When("User Navigates to Users Page")
    public void user_Navigates_to_Users_Page() {
	user = home.openUsersPage();
    }

    @Then("User Navigates to Server Log page")
    public void user_Navigates_to_Server_Log_page() {
	serverLog = home.openServerLogPage();
    }

    @Then("Verify all the options from users page")
    public void verify_all_the_options_from_users_page() {
	user.verifyAllOptions();
    }

    @Then("Verify all the options from Server Log Page")
    public void verify_all_the_options_from_Server_Log_Page() {
	serverLog.verifyOptionsServerLogPage();
    }

    @Then("Toggle between the View and Options Fields")
    public void toggle_between_the_View_and_Options_Fields() {
	serverLog.toggle();
    }

    @Then("Go to Options and verify options from page")
    public void go_to_Options_and_verify_options_from_page() {
	serverLog.verifyOptionsTabOptions();
    }

    @Then("Go to View and verify options from page")
    public void go_to_View_and_verify_options_from_page() {
	serverLog.verifyViewOptions();
    }

    @Then("Download log file by selecting fromat {string}")
    public void download_log_file_by_selecting_fromat(String string) {
	serverLog.downLoadLog(string);
    }

    @When("User Navigates to Reports page")
    public void user_Navigates_to_Reports_page() {
	report = home.openReportsPage();
	report.closePage(); // need to remove this line in future while coding page actions
    }

    @When("User Navigates to report groups page")
    public void user_Navigates_to_report_groups_page() {
	report = home.openReportGroupsPage();
	report.closePage(); // need to remove this line in future while coding page actions
    }

    @When("User Navigates to runreports page")
    public void user_Navigates_to_runreports_page() {
	report = home.openRunReportsPage();
	report.closePage(); // need to remove this line in future while coding page actions
    }

    @When("User Navigates to show charts page")
    public void user_Navigates_to_show_charts_page() {
	report = home.openShowChartsPage();
	report.closePage(); // need to remove this line in future while coding page actions
    }

    @When("User Navigates to show tables page")
    public void user_Navigates_to_show_tables_page() {
	report = home.openShowtablesPage();
	report.closePage(); // need to remove this line in future while coding page actions
    }

    @When("User Navigates to show pivot tables page")
    public void user_Navigates_to_show_pivot_tables_page() {
	report = home.openPivotTablesPage();
	report.closePage(); // need to remove this line in future while coding page actions
    }

    @When("User Navigates to Process Models page")
    public void user_Navigates_to_Process_Models_page() {
	report = home.openProcessModelsPage();
	report.closePage();
    }

    @When("User Navigates to Process Definitions page")
    public void user_Navigates_to_Process_Definitions_page() {
	report = home.openProcessDefinitionsPage();
	report.closePage();
    }

    @When("User Navigates to Process Instances page")
    public void user_Navigates_to_Process_Instances_page() {
	report = home.openProcessInstancesPage();
	report.closePage();
    }

    @When("User Navigates to Process Tasks page")
    public void user_Navigates_to_Process_Tasks_page() {
	report = home.openProcessTasksPage();
	report.closePage();
    }

    @When("User Navigates to Attachment Types page")
    public void user_Navigates_to_Attachment_Types_page() {
	report = home.openAttachmentTypesPage();
	report.closePage();
    }

    @When("User Navigates to Model Elements Editor page")
    public void user_Navigates_to_Model_Elements_Editor_page() {
	report = home.openModelElementsPage();
	report.closePage();
    }
}
