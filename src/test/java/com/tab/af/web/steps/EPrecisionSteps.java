package com.tab.af.web.steps;

import java.util.List;
import java.util.Map;

import com.tab.af.web.pages.EPrecision.SonicObjectPage;
import com.tab.af.web.pages.EPrecision.EndOfDayJobs;
import com.tab.af.web.pages.EPrecision.HomePage;
import com.tab.af.web.pages.EPrecision.Login;
import com.tab.af.web.pages.EPrecision.Ping;
import com.tab.af.web.pages.EPrecision.Precision;
import com.tab.af.web.pages.EPrecision.ProcessErrors;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class EPrecisionSteps {

	Login login = new Login();
	HomePage home = new HomePage();
	ProcessErrors process = new ProcessErrors();
	EndOfDayJobs endOfDayJobs = new EndOfDayJobs();
	Precision precision = new Precision();
	SonicObjectPage sonicEntity=new SonicObjectPage();
	Ping ping= new Ping();

	@Given("user logged into EPrecision as {string} and {string}")
	public void user_logged_into_EPrecision_as_and(String userName, String password) {
		home = login.login(userName, password);
	}

	@When("User navigates to process Errors")
	public void user_navigates_to_process_Errors() {
		process = home.navigateToProcessErros();
	}

	@Given("User is Logged in to EPrecsions")
	public void user_is_Logged_in_to_EPrecsions() {
		////
	}

	@Then("User should be able to see below  options")
	public void user_should_be_able_to_see_below_options(io.cucumber.datatable.DataTable dataTable) {
		process.validateProcessErrosScreenOptions(dataTable);
	}

	@When("User navigates to End of Day Jobs")
	public void user_navigates_to_End_of_Day_Jobs() {
		endOfDayJobs = home.navigateToEndOfDayJobs();
	}

	@Then("User should be able to see All End of Day Jobs options")
	public void user_should_be_able_to_see_All_End_of_Day_Jobs_options() {
		endOfDayJobs.validateEndofDaysPageOptions();
	}

	@When("User navigates to Precision")
	public void user_navigates_to_Precision() {
		precision = home.navigateToPrecisionOptions();
	}

	@Then("User should be able to see All Precision tab options")
	public void user_should_be_able_to_see_All_Precision_tab_options() {
		precision.validatePrecisionDropDownOptions();
	}
	 
	
	@When("user navigates to {string} option")
	public void user_navigates_to_option(String string) {
		sonicEntity=   home.navigateToCifEntity(string);
	}
	
	

	@Then("user should be able to create Edit  Remove and search for the CIF Entity")
	public void user_should_be_able_to_create_Edit_Remove_and_search_for_the_CIF_Entity(DataTable table) {
		List<Map<String,String>> map=table.asMaps();
		sonicEntity.createCIFEntity(map.get(0).get("IbFlag"), map.get(0).get("Ib2Flag"), map.get(0).get("Branch"));
		sonicEntity.editCIFEntity(map.get(0).get("newIb2Flag"));
		sonicEntity.removeCIFEntity();
	}
	@When("user navigates to Ping options")
	public void user_navigates_to_Ping_options() {
	     ping =home.navigateToPingSystem();
	}

	@Then("user Should be able to See Ping Options")
	public void user_Should_be_able_to_See_Ping_Options() {
	  ping.validateOptions();
	}

	@When("user clicks on Ping Sonic button")
	public void user_clicks_on_Ping_Sonic_button() {
	   ping.clickPingSonicButton();
	}

	@Then("System up Message Should be Displayed")
	public void system_up_Message_Should_be_Displayed() {
	    ping.validateSonicPingSystemUpMessage();
	}
	@When("User is logged in to EPrecision and at HomePage")
	public void user_is_logged_in_to_EPrecision_and_at_HomePage() {
	    home.assertPage();
	}

	@Then("on Homepage below options should be available")
	public void on_Homepage_below_options_should_be_available(io.cucumber.datatable.DataTable dataTable) {
	    home.assertHomePageOptions();
	}

	@When("User navigates to End of Day Jobs and Clicks on All End of Day Jobs options")
	public void user_navigates_to_End_of_Day_Jobs_and_Clicks_on_All_End_of_Day_Jobs_options() {
	   endOfDayJobs=home.navigateToEndOfDayJobs();
	}

	@Then("Relative Message should be displayed to the User")
	public void relative_Message_should_be_displayed_to_the_User() {
	  endOfDayJobs.validateMessagesForAllOptions();
	}
	@When("User Expands the Precision Tab")
	public void user_Expands_the_Precision_Tab() {
	    home.clickPrecisionOption();
	}

	@Then("Precision Tab should have below options")
	public void precision_Tab_should_have_below_options(io.cucumber.datatable.DataTable dataTable) {
	     home.validatePrecisionTabOption();
	}

	@Then("User should be able to see below  options on CIF Entity Page")
	public void user_should_be_able_to_see_below_options_on_CIF_Entity_Page(io.cucumber.datatable.DataTable dataTable) {
		sonicEntity.validateCIFEntityPageOptions();
	}
	
	@Then("Verify all the options from Account Entity page")
	public void verify_all_the_options_from_Account_Entity_page() {
		sonicEntity.verifyAccountEntity();
	}

	@Then("Click on create button and Create account entity")
	public void click_on_create_button_and_Create_account_entity(DataTable accountEntity) {
		//List<String> selectValues = accountEntity.asList(String.class);
		List<Map<String,String>> selectValues =  accountEntity.asMaps(String.class, String.class);
		sonicEntity.createlEntity(selectValues);

	}

	@Then("Verify all the options from Sec Cust Entity page")
	public void verify_all_the_options_from_Sec_Cust_Entity_page() {
		sonicEntity.verifySecCustEntityOptions();
	}
	
	@Then("Verify all the options from Atm Entities page")
	public void verify_all_the_options_from_Atm_Entities_page() {
		sonicEntity.verifyATMEntitiesOptions();
	}
	@Then("Create Atm Entity from atm Entity editor")
	public void create_Atm_Entity_from_atm_Entity_editor() {
		sonicEntity.createAtmEntity();
	}
	
	@Then("Edit created Atm Entity and update")
	public void edit_created_Atm_Entity_and_update() {
		sonicEntity.editAtmEntity();
	}

	@Then("Remove Atm entity from the list of Atm Entities")
	public void remove_Atm_entity_from_the_list_of_Atm_Entities() {
		sonicEntity.removeAtmEntity();
	}
	
	@When("user navigates to maintenance and sub option {string}")
	public void user_navigates_to_maintenance_and_sub_option(String string) {
		sonicEntity=   home.navigateToMaintenance(string);
	}
	@When("user expands Maintenance options List")
	public void user_expands_Maintenance_options_List() {
	   home.openMaintenanceOptions();
	}

	@Then("Verify all the options from maintenance sub options")
	public void verify_all_the_options_from_maintenance_sub_options() {
		home.verifyMaintaenanceOptions();
	}
	
	@When("user clicks on Test Account Inquiry button")
	public void user_clicks_on_Test_Account_Inquiry_button() {
	   ping.clickTestAccountInquiryButton();
	}

	@Then("Sonic enquiry Message Should be Displayed")
	public void sonic_enquiry_Message_Should_be_Displayed() {
		ping.validateSonicEnquiryMessage();
	}
	
	@When("user clicks on Test Accurate date button")
	public void user_clicks_on_Test_Accurate_date_button() {
		ping.clickTestAccurateDateButton();
	}

	@Then("Test Accurate Message Should be Displayed")
	public void test_Accurate_Message_Should_be_Displayed() {
		ping.validateTestAccurateMessage();
	}
	
	@When("user clicks on Direct Query Precision button")
	public void user_clicks_on_Direct_Query_Precision_button() {
		ping.clickDirectQueryPrecisionButton();
	}

	@Then("Direct Query Precision Message Should be Displayed")
	public void direct_Query_Precision_Message_Should_be_Displayed() {
		ping.validateDirectQueryPrecisionMessage();
	}
	
	@Then("Click on create and create new branch editor")
	public void click_on_create_and_create_new_branch_editor() {
		sonicEntity.createNewBranch();
	}

	@Then("Click on edit and update branch editor")
	public void click_on_edit_and_update_branch_editor() {
		sonicEntity.updateBranch();
	}

	@Then("Click on remove and remove the created branch")
	public void click_on_remove_and_remove_the_created_branch() {
		sonicEntity.removeNewBranch();
	}

	@Then("Perform search and validate results with {string} user {string} in Branch browser page")
	public void perform_search_and_validate_results_with_user_in_Branch_browser_page(String string, String string2) {
		sonicEntity.searchNewBranch(string,string);
	}

	

	

}