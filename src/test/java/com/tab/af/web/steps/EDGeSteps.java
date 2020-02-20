package com.tab.af.web.steps;

import com.tab.af.web.pages.EDGe.EdgeHomePage;
import com.tab.af.web.pages.EDGe.EdgePage;
import com.tab.af.web.pages.EDGe.LogIn;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EDGeSteps {
    LogIn login = new LogIn();
    EdgePage edgePage = new EdgePage();
    EdgeHomePage homePage = new EdgeHomePage();

    @Given("user logged into Edge application")
    public void user_logged_into_Edge_application() {
	homePage = login.loginToApplication();
    }

    @When("User is logged in to Edge application and at HomePage")
    public void user_is_logged_in_to_Edge_application_and_at_HomePage() {
	homePage = homePage.verifyHomePage();
    }

    @Then("Click on AR menu and {string} and click on {string} sub menu")
    public void click_on_AR_menu_and_and_click_on_sub_menu(String menu, String subMenu) {
	edgePage = homePage.openARMenu(menu, subMenu);
    }

    @Then("verify all the option from NOA clients page")
    public void verify_all_the_option_from_NOA_clients_page() {
	edgePage.verifyNOAClientsPageOptions();
    }

    @Then("Select a record from the list")
    public void select_a_record_from_the_list() {
	edgePage.selectRecord();
    }

    @Then("Click on edit and verify the fields")
    public void click_on_edit_and_verify_the_fields() {
	edgePage.verifyNOAClientsEditPageOptions();
    }

    @Then("Update email id from edit page and click on ok button")
    public void update_email_id_from_edit_page_and_click_on_ok_button() {
	edgePage.updateEmail();
    }

    @Then("Open updated record and verify updated value")
    public void open_updated_record_and_verify_updated_value() {
	edgePage.verifyUpdatedEmail();
    }

    @Then("Click on Quick NOA adn verify fileds from the quickNOA page")
    public void click_on_Quick_NOA_adn_verify_fileds_from_the_quickNOA_page() {
	edgePage.verifyQuickNOAOptions();
    }

    @Then("Click on Quick NOA and enter debtor details and save")
    public void click_on_Quick_NOA_and_enter_debtor_details_and_save() {
	edgePage.updateQuickNOAOptions();
    }

    @Then("Click on Mass NOA and verify fileds from the Mass NOA page")
    public void click_on_Mass_NOA_and_verify_fileds_from_the_Mass_NOA_page() {
	edgePage.verifyMassNOAOptions();
    }

    @Then("Click on Mass NOA and enter debtor details and save")
    public void click_on_Mass_NOA_and_enter_debtor_details_and_save() {
	edgePage.updateMassNOAOptions();
    }

    @Then("Click on Release NOA and verify fileds from the Release NOA page")
    public void click_on_Release_NOA_and_verify_fileds_from_the_Release_NOA_page() {
	edgePage.verifyReleaseNOAOptions();
    }

    @Then("Click on Release NOA and enter debtor details and save")
    public void click_on_Release_NOA_and_enter_debtor_details_and_save() {
	edgePage.updateReleaseNOAOptions();
    }

    @Then("Click on Add to set and verify fileds from the Add to set window")
    public void click_on_Add_to_set_and_verify_fileds_from_the_Add_to_set_window() {
	edgePage.verifyAddToSetOptions();
    }

    @Then("Click on Add to Set and Set new NOA request")
    public void click_on_Add_to_Set_and_Set_new_NOA_request() {
	edgePage.createNewAddToSet();
    }

    @Then("Search for {string} client type and verify applicant from the results")
    public void search_for_client_type_and_verify_applicant_from_the_results(String string) {
	edgePage.searchAndVerifyApplicant(string);
    }

    @Then("verify all the option from NOA Queues page")
    public void verify_all_the_option_from_NOA_Queues_page() {
	edgePage.verifyOptionsNOAQueues();
    }

    @Then("Select NOA Client and click on Resend button")
    public void select_NOA_Client_and_click_on_Resend_button() {
	edgePage.resendNOAClient();
    }

    @Then("Select NOA Client and click on remove and remove record")
    public void select_NOA_Client_and_click_on_remove_and_remove_record() {
	edgePage.removeNOAClient();
    }

    @Then("Select NOA Client and click on excel and export record")
    public void select_NOA_Client_and_click_on_excel_and_export_record() {
	edgePage.excelNOAClient();
    }

    @Then("Verify all options from NOA Template page")
    public void verify_all_options_from_NOA_Template_page() {
	edgePage.verifyOptionsNOATemplate();
    }

    @Then("Select template and click on remove button")
    public void select_template_and_click_on_remove_button() {
	edgePage.removeNOATemplate();
    }

    @Then("Verify all options from NOA Files page")
    public void verify_all_options_from_NOA_Files_page() {
	edgePage.verifyOptionsNOAFiles();
    }

    @Then("Select file and click on edit button")
    public void select_file_and_click_on_edit_button() {
	edgePage.editNOAFile();
    }
}
