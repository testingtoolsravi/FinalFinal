package com.tab.af.web.steps;

import java.util.List;
import java.util.Map;

import com.tab.af.utilities.OnBoardApplicants;
import com.tab.af.web.pages.OnBoarding.ApplicationCreation;
import com.tab.af.web.pages.OnBoarding.ApplicationEditor;
import com.tab.af.web.pages.OnBoarding.ApplicationsHome;
import com.tab.af.web.pages.OnBoarding.DepositTasks;
import com.tab.af.web.pages.OnBoarding.LoanTasks;
import com.tab.af.web.pages.OnBoarding.Login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class OnboardingSteps {

    Login login = new Login();
    ApplicationsHome home = new ApplicationsHome();;
    ApplicationCreation app = new ApplicationCreation();
    DepositTasks depositTask = new DepositTasks();
    LoanTasks loanTask = new LoanTasks();
    ApplicationEditor appEditor = new ApplicationEditor();

    @Given("user logged into Onboarding")
    public void user_logged_into_Onboarding() {

	home = login.loginToApplication();
    }

    @Given("User is Starting to create a Product")
    public void user_is_Starting_to_create_a_Product() {

	app = home.openApplications();
    }

    @Given("User is on Applications Page")
    public void user_is_on_Applications_Page() {
	app = home.openApplications();
    }

    @When("user creates a Deposit product with specfications and Clicks create")
    public void user_creates_a_Deposit_product_with_specfications_and_Clicks_create(DataTable dataTable) {
	List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	app.createDepositProduct(data.get(0).get("ProductLine"), data.get(0).get("ProductType"),
		data.get(0).get("CustomerType"), data.get(0).get("ProductName"));

    }

    @When("user creates a Loan product with specifications and Clicks create")
    public void user_creates_a_Loan_product_with_specifications_and_Clicks_create(
	    io.cucumber.datatable.DataTable dataTable) {
	List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	app.createLoanProduct(data.get(0).get("ProductLine"), data.get(0).get("ProductType"),
		data.get(0).get("CustomerType"), data.get(0).get("ProductName"));
    }

    @When("Fills the Details for the Individual Information")
    public void fills_the_Details_for_the_Individual_Information() {
	app.fillIndividualBasicandDrivingInfo();
	app.fillPhysicalAddressDetails();
	app.selectMailingAddessSameAsPhysical();
	app.fillPhonesInfo();
	appEditor = app.startDepositProcess();

    }

    @When("Fills the Details for the Legal Entity")
    public void fills_the_Details_for_the_Legal_Entity(DataTable dataTable) {
	List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	app.fillLegalEntityInfo(data.get(0).get("LegalEntity"));
	app.fillPhysicalAddressDetails();
	app.selectMailingAddessSameAsPhysical();
	app.fillPhonesInfo();
	appEditor = app.startDepositProcess();
    }

    @When("Fills the Details for the Loans Legal Entity")
    public void fills_the_Details_for_the_Loans_Legal_Entity(io.cucumber.datatable.DataTable dataTable)
	    throws Exception {
	List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	app.fillLegalEntityInfo(data.get(0).get("LegalEntity"));
	app.fillPhysicalAddressDetails();
	app.selectMailingAddessSameAsPhysical();
	app.fillPhonesInfo();

    }

    @Then("Product should be added in OnBoarding results Table")
    public void product_should_be_added_in_OnBoarding_results_Table() {

	appEditor.selectcreatedDepositApplication();
	depositTask = appEditor.openDepositProduct();

    }

    @Then("Entity details should be saved")
    public void entity_details_should_be_saved() {
	app.assertEntityInfoSaved();

    }

    @When("User fills opportunity ,collateral and Equipment Info and starts Process")
    public void user_fills_opportunity_collateral_and_Equipment_Info_and_starts_Process(
	    io.cucumber.datatable.DataTable dataTable) {

	List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	app.fillOpportunityInfo(data.get(0).get("BusinessType"), data.get(0).get("Amount"));
	app.fillEquipmentInfo();
	app.addLoanIndividualInfo();
	app.updateLoanIndividualGuarantor();
	appEditor = app.startLoanProcess();

    }

    @When("User fills opportunity ,collateral  and starts Process")
    public void user_fills_opportunity_collateral_and_starts_Process(io.cucumber.datatable.DataTable dataTable) {

	List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	app.fillOpportunityInfo(data.get(0).get("BusinessType"), data.get(0).get("Amount"));
	app.addLoanIndividualInfo();
	app.updateLoanIndividualGuarantor();
	appEditor = app.startLoanProcess();
    }

    @Then("user should be able to Start the Process")
    public void user_should_be_able_to_Start_the_Process() {
	appEditor.selectcreatedLoanApplication();
	loanTask = appEditor.openLoanProduct();
    }

    @Then("User should be able to Complete Verifications and Create account")
    public void user_should_be_able_to_Complete_Verifications_and_Create_account() {

	depositTask.completeSingleConsumerDepositTasks();
	depositTask.verifyAccountCreated(OnBoardApplicants.Applicant1);
    }

    @Then("User should be able to Complete commercial Verifications and Create account")
    public void user_should_be_able_to_Complete_commercial_Verifications_and_Create_account() {
	depositTask.completeCommercialDepositTasks();
	depositTask.verifyCIFAccountCreated();
    }

    @Then("User should be able to Complete consumer COD Verifications and Create account")
    public void User_should_be_able_to_Complete_consumer_COD_Verifications_and_Create_account() {

	depositTask.completeApplicationVerificationTask();
	depositTask.completeCustomerVerificationQATask();
	depositTask.completeDecisionTask();
	depositTask.completeCIFAccountCreationTask();
	depositTask.completeSendWelcomeEmailTask();
	depositTask.completeFundingTask();
    }

    @Then("User should be able to Complete commercial COD Verifications and Create account")
    public void user_should_be_able_to_Complete_commercial_COD_Verifications_and_Create_account() {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeCustomerVerificationQATask();
	depositTask.completeDecisionTask();
	depositTask.completeCIFAccountCreationTask();
	depositTask.completeSendWelcomeEmailTask();
	depositTask.completeFundingTask();

    }

    @Then("User should be able to Complete commercial Savings Verifications and Create account")
    public void user_should_be_able_to_Complete_commercial_Savings_Verifications_and_Create_account() {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeCustomerVerificationQATask();
	depositTask.completeDecisionTask();
	depositTask.completeCIFAccountCreationTask();
	depositTask.completeSendWelcomeEmailTask();
	depositTask.completeFundingTask();
    }

    @Then("Complete the tasks generated for Small Ticket Loan")
    public void complete_the_tasks_generated_for_Small_Ticket_Loan() {

	loanTask.checkInLoanPackage();
	loanTask.completeCompileSmallTicketCreditSummary();
	loanTask.standardException();
	loanTask.smeCreditAnalystApproval();
	loanTask.sendApproveLetter();
	loanTask.equipmentCheckList();
	loanTask.smeFunding();
    }

    @When("user completes the task generated for Large Ticket Loan")
    public void user_completes_the_task_generated_for_Large_Ticket_Loan() {
	loanTask.checkInLoanPackage();
	loanTask.compileCreditSummary();
	loanTask.collateralValuation();
	loanTask.largeTicketscoringTask();
	loanTask.standardException();
	loanTask.equipmentCheckList();
	loanTask.approveTask();
	loanTask.sendApproveLetter();
	loanTask.smeFunding();

    }

    @When("Fills the Details for the Joint Applicant")
    public void fills_the_Details_for_the_Joint_Applicant() {
	app.fillIndividualBasicandDrivingInfo();
	app.fillPhysicalAddressDetails();
	app.selectMailingAddessSameAsPhysical();
	app.fillPhonesInfo();
	app.createApplicant();
	app.addSecondDepositJointHolder();
	appEditor = app.startDepositProcess();

    }

    @Then("User should be able to Complete Joint Applicant Verifications and Create account")
    public void user_should_be_able_to_Complete_Joint_Applicant_Verifications_and_Create_account() {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeApproveVerificationTask(OnBoardApplicants.Applicant1);
	depositTask.completeApproveVerificationTask(OnBoardApplicants.Applicant2);
	depositTask.verifyAccountCreated(OnBoardApplicants.Applicant1);
	depositTask.verifyAccountCreated(OnBoardApplicants.Applicant2);
    }

    @When("Fills the Details for the Joint Legal Entity")
    public void fills_the_Details_for_the_Joint_Legal_Entity(io.cucumber.datatable.DataTable dataTable) {
	List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	app.fillLegalEntityInfo(data.get(0).get("LegalEntity"));
	app.fillPhysicalAddressDetails();
	app.selectMailingAddessSameAsPhysical();
	app.fillPhonesInfo();
	app.addLegalEntity(data.get(1).get("LegalEntity"));
	app.secondLegalEntityInfo(data.get(1).get("LegalEntity"));
	appEditor = app.startDepositProcess();
    }

    @When("user completes the task generated for ABL Loan")
    public void user_completes_the_task_generated_for_ABL_Loan() {
	loanTask.checkInLoanPackage();
	loanTask.scoringTask();
	loanTask.backgroundSearchesUCCFilingsTaskTask();
	loanTask.DebtorCreditReviewTask();
	loanTask.assignUnderWriterTask();
	loanTask.compileCreditSummary();
	loanTask.TaxGuardReport8821();
	loanTask.legalsPrepration();
	loanTask.tmsDiscoveryAndSetup();
	loanTask.standardException();
	loanTask.approveTask();
	loanTask.legalDocsExecution();
	loanTask.loanAccountSetup();
	loanTask.prefundingLegalReview();
	loanTask.fundingTask();
    }

    @When("user completes the task generated for Participation Loan")
    public void user_completes_the_task_generated_for_Participation_Loan() {
	loanTask.checkInLoanPackage();
	loanTask.scoringTask();
	loanTask.backgroundSearchesUCCFilingsTaskTask();
	loanTask.assignUnderWriterTask();
	loanTask.compileCreditSummary();
	loanTask.TaxGuardReport8821();
	loanTask.legalsPrepration();
	loanTask.tmsOnBoarding();
	loanTask.standardException();
	loanTask.approveTask();
	loanTask.legalDocsExecution();
	loanTask.loanAccountSetup();
	loanTask.prefundingLegalReview();
	loanTask.fundingTask();
    }

    @When("user completes the task generated for Rediscount Loan")
    public void user_completes_the_task_generated_for_Rediscount_Loan() {
	loanTask.checkInLoanPackage();
	loanTask.scoringTask();
	loanTask.backgroundSearchesUCCFilingsTaskTask();
	loanTask.assignUnderWriterTask();
	loanTask.compileCreditSummary();
	loanTask.TaxGuardReport8821();
	loanTask.legalsPrepration();
	loanTask.tmsOnBoarding();
	loanTask.standardException();
	loanTask.approveTask();
	loanTask.legalDocsExecution();
	loanTask.loanAccountSetup();
	loanTask.prefundingLegalReview();
	loanTask.fundingTask();
    }

    @When("user completes the task generated for Small Ticket Factoring Loan")
    public void user_completes_the_task_generated_for_Small_Ticket_Factoring_Loan() {
	loanTask.attachSignedApplicationAndTermSheetTask();
	loanTask.generateVerificationLetter();
	loanTask.backgroundSearchesUCCFilingsTaskTask();
	loanTask.scoringTask();
	loanTask.DebtorCreditReviewTask();
	loanTask.TaxGuardReport8821();
	loanTask.standardException();
	loanTask.approveOneTask();
	home.logOut();
	login.loginAsAdmin();
	home.openApplications();
	appEditor.selectcreatedLoanApplication();
	loanTask.approveTwoTask();
	loanTask.arVerification();
	loanTask.tmsOnBoarding();
	loanTask.legalsPrepration();
	loanTask.legalDocsExecution();
	loanTask.loanAccountSetup();
	loanTask.prefundingReview();
	loanTask.fundingTask();
    }

    @When("user completes the task generated for Large Ticket Factoring Loan")
    public void user_completes_the_task_generated_for_Large_Ticket_Factoring_Loan() {

	loanTask.checkInLoanPackage();
	loanTask.scoringTask();
	loanTask.DebtorCreditReviewTask();
	loanTask.backgroundSearchesUCCFilingsTaskTask();
	loanTask.arVerification();
	loanTask.compileCreditSummary();
	loanTask.TaxGuardReport8821();
	loanTask.legalsPrepration();
	loanTask.tmsDiscoveryAndSetup();
	loanTask.standardException();
	loanTask.approveTask();
	loanTask.legalDocsExecution();
	loanTask.loanAccountSetup();
	loanTask.prefundingLegalReview();
	loanTask.fundingTask();

    }

    @When("user adds Indiviudal Info Starts the Loan Process")
    public void user_adds_Indiviudal_Info_Starts_the_Loan_Process() {
	app.addLoanIndividualInfo();
	app.updateLoanIndividualGuarantor();
	appEditor = app.startLoanProcess();
	appEditor.selectcreatedLoanApplication();
	loanTask = appEditor.openLoanProduct();
    }

    @Then("user completes the task generated for Smart Loan")
    public void user_completes_the_task_generated_for_Smart_Loan() {
	loanTask.backgroundSearchesUCCFilingsTaskTask();
	loanTask.scoringTask();
	loanTask.compileCreditSummary();
	loanTask.standardException();
	home.logOut();
	login.loginAsAdmin();
	home.openApplications();
	appEditor.selectcreatedLoanApplication();
	appEditor.openCreatedProductUnderApplication();
	loanTask.approveOneTask();
	loanTask.legalDocuments();
	loanTask.fundingTask();
    }

    @When("Fills Individual Info and starts the process")
    public void fills_Individual_Info_and_starts_the_process() {
	app.fillIndividualBasicandDrivingInfo();
	app.fillPhysicalAddressDetails();
	app.selectMailingAddessSameAsPhysical();
	app.fillPhonesInfo();
	appEditor = app.startDepositProcess();
    }

    @Then("User should be Able to Decline the Application from HomePage")
    public void user_should_be_Able_to_Decline_the_Application_from_HomePage() {
	appEditor.declineDepositApplication();
    }

    @Then("User should be Able to WithDraw the Application from HomePage")
    public void user_should_be_Able_to_WithDraw_the_Application_from_HomePage() {
	appEditor.withDrawDepositApplication();
    }

    @When("user Starts process for Declined Application from HomePage")
    public void user_Starts_process_for_Declined_Application_from_HomePage() {
	home.openApplications();
	appEditor.startDepositProcessFromHomePage();
	depositTask = appEditor.openDepositProduct();
    }

    @Then("User should be able to complete the Deposit tasks")
    public void user_should_be_able_to_complete_the_Deposit_tasks() {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeApproveVerificationTask(OnBoardApplicants.Applicant1);
	depositTask.completeDOAWelcomeMailTask();
	depositTask.completeDOAFundingTask();
	depositTask.verifyAccountCreated(OnBoardApplicants.Applicant1);
    }

    @Then("User should be able to Request and Send KIQ Questions")
    public void user_should_be_able_to_Request_and_Send_KIQ_Questions() {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeApproveVerificationTask(OnBoardApplicants.Applicant1);
    }

    @When("User Declines the Loan Application from HomePage")
    public void user_Declines_the_Loan_Application_from_HomePage() {
	home.openApplications();
	appEditor.declineLoanApplication();

	loanTask = appEditor.openLoanProduct();
    }

    @Then("User should be able to Restart process for Declined Application from HomePage")
    public void user_should_be_able_to_Restart_process_for_Declined_Application_from_HomePage() {
	complete_the_tasks_generated_for_Small_Ticket_Loan();
    }

    @When("User navigates to Applications homepage")
    public void user_navigates_to_Applications_homepage() {
	home.openApplications();
    }

    @Then("User should be Able to WithDraw the Loan Application from HomePage")
    public void user_should_be_Able_to_WithDraw_the_Loan_Application_from_HomePage() {
	appEditor.withDrawLoanApplication();
    }

    @Then("User should be able to get the Decline Review task generated for Small Ticket Loan")
    public void user_should_be_able_to_get_the_Decline_Review_task_generated_for_Small_Ticket_Loan() {
	loanTask.assertDeclineReviewTaskGenerated();
    }

    @When("User puts the Compile Credit Summary task in Hold State")
    public void user_puts_the_Compile_Credit_Summary_task_in_Hold_State() {
	loanTask.checkInLoanPackage();
    }

    @Then("the State of Compile Credit Summary task should be in Hold")
    public void the_State_of_Compile_Credit_Summary_task_should_be_in_Hold() {
	loanTask.holdCompileCreditSummary();
    }

    @Then("Complete compile Credit Summary task for the Small Ticket Equipment Loan")
    public void complete_compile_Credit_Summary_task_for_the_Small_Ticket_Equipment_Loan() {
	loanTask.checkInLoanPackage();
	loanTask.completeCompileSmallTicketCreditSummary();
    }

    @Then("User should be able to Generate letter for the Equipment Loan product")
    public void user_should_be_able_to_Generate_letter_for_the_Equipment_Loan_product() {
	loanTask.checkInLoanPackage();
	loanTask.completeCompileSmallTicketCreditSummary();
	loanTask.standardException();
	loanTask.smeCreditAnalystApproval();
	loanTask.sendApproveLetter();
    }

    @Then("User should be able to Put the Generate letter Task On Hold for the Equipment Loan product")
    public void user_should_be_able_to_Put_the_Generate_letter_Task_On_Hold_for_the_Equipment_Loan_product() {
	loanTask.checkInLoanPackage();
	loanTask.completeCompileSmallTicketCreditSummary();
	loanTask.standardException();
	loanTask.smeCreditAnalystApproval();
	loanTask.holdSendApproveLetterTask();
    }

    @When("User tries to Complete Generate Leter task without Generating Letters")
    public void user_tries_to_Complete_Generate_Leter_task_without_Generating_Letters() {
	loanTask.checkInLoanPackage();
	loanTask.completeCompileSmallTicketCreditSummary();
	loanTask.standardException();
	loanTask.smeCreditAnalystApproval();

    }

    @Then("Error message Should be Displayed")
    public void error_message_Should_be_Displayed() {
	loanTask.assertSendApproveLetterErrorMessage();
    }

    @Then("Validate Generate Button Function in Legal documents Task for Large Ticket Loan")
    public void validate_Generate_Button_Function_in_Legal_documents_Task_for_Large_Ticket_Loan() {
	loanTask.checkInLoanPackage();
	loanTask.compileCreditSummary();
	loanTask.collateralValuation();
	loanTask.largeTicketscoringTask();
	loanTask.standardException();
	loanTask.equipmentCheckList();
    }

    @Then("User should be able to put SME Funding Task on Hold for Large Ticket Loan")
    public void user_should_be_able_to_put_SME_Funding_Task_on_Hold_for_Large_Ticket_Loan() {
	loanTask.checkInLoanPackage();
	loanTask.compileCreditSummary();
	loanTask.collateralValuation();
	loanTask.largeTicketscoringTask();
	loanTask.standardException();
	loanTask.equipmentCheckList();
	loanTask.approveTask();
	loanTask.sendApproveLetter();
	loanTask.holdSMEFunding();
    }

    @Then("user should be able to complete Check In Loan Package task for Large Ticket Factoring Loan")
    public void user_should_be_able_to_complete_Check_In_Loan_Package_task_for_Large_Ticket_Factoring_Loan() {
	loanTask.checkInLoanPackageLargeTicketFactoring();
    }

    @Then("user should be able to complete AR Verification task for Large Ticket Factoring Loan")
    public void user_should_be_able_to_complete_AR_Verification_task_for_Large_Ticket_Factoring_Loan() {
	loanTask.checkInLoanPackageLargeTicketFactoring();
	loanTask.scoringTask();
	loanTask.DebtorCreditReviewTask();
	loanTask.backgroundSearchesUCCFilingsTaskTask();
	loanTask.arVerification();
    }

    @Then("user should be able to put On Hold Debtor Credit Review task for Small Ticket Factoring Loan")
    public void user_should_be_able_to_put_On_Hold_Debtor_Credit_Review_task_for_Small_Ticket_Factoring_Loan() {
	loanTask.attachSignedApplicationAndTermSheetTask();
	loanTask.generateVerificationLetter();
	loanTask.backgroundSearchesUCCFilingsTaskTask();
	loanTask.scoringTask();
	loanTask.holdDebtorCreditReviewTask();
    }

    @Then("user should be able to Validate Request Providers Functionlaity in Scoring task for Small Ticket Factoring Loan")
    public void user_should_be_able_to_Validate_Request_Providers_Functionlaity_in_Scoring_task_for_Small_Ticket_Factoring_Loan() {
	loanTask.attachSignedApplicationAndTermSheetTask();
	loanTask.generateVerificationLetter();
	loanTask.backgroundSearchesUCCFilingsTaskTask();
	loanTask.scoringTask();
    }

    @Then("user should be able to Decline  Scoring task for Small Ticket Factoring Loan")
    public void user_should_be_able_to_Decline_Scoring_task_for_Small_Ticket_Factoring_Loan() {
	loanTask.attachSignedApplicationAndTermSheetTask();
	loanTask.generateVerificationLetter();
	loanTask.backgroundSearchesUCCFilingsTaskTask();
	loanTask.declineScoringTask();
    }

    @Then("user should be able to complete Loan Setup task for Large Ticket Factoring Loan")
    public void user_should_be_able_to_complete_Loan_Setup_task_for_Large_Ticket_Factoring_Loan() {
	loanTask.checkInLoanPackageLargeTicketFactoring();
	loanTask.scoringTask();
	loanTask.DebtorCreditReviewTask();
	loanTask.backgroundSearchesUCCFilingsTaskTask();
	loanTask.arVerification();
	loanTask.compileCreditSummary();
	loanTask.TaxGuardReport8821();
	loanTask.legalsPrepration();
	loanTask.tmsDiscoveryAndSetup();
	loanTask.standardException();
	loanTask.approveTask();
	loanTask.legalDocsExecution();
	loanTask.loanAccountSetup();
    }

    @Then("user should be able to Complete PreFunding Legal Review  task for Small Ticket Factoring Loan")
    public void user_should_be_able_to_Complete_PreFunding_Legal_Review_task_for_Small_Ticket_Factoring_Loan() {
	loanTask.attachSignedApplicationAndTermSheetTask();
	loanTask.generateVerificationLetter();
	loanTask.backgroundSearchesUCCFilingsTaskTask();
	loanTask.scoringTask();
	loanTask.DebtorCreditReviewTask();
	loanTask.TaxGuardReport8821();
	loanTask.standardException();
	loanTask.approveOneTask();
	home.logOut();
	login.loginAsAdmin();
	home.openApplications();
	appEditor.selectcreatedLoanApplication();
	appEditor.openCreatedProductUnderApplication();
	loanTask.approveTwoTask();
	loanTask.arVerification();
	loanTask.tmsOnBoarding();
	loanTask.legalsPrepration();
	loanTask.legalDocsExecution();
	loanTask.loanAccountSetup();
	loanTask.prefundingReview();
    }

    @Then("user Should be able to put On Hold Assign Underwriter task generated for ABL Loan")
    public void user_Should_be_able_to_put_On_Hold_Assign_Underwriter_task_generated_for_ABL_Loan() {
	loanTask.checkInLoanPackage();
	loanTask.scoringTask();
	loanTask.backgroundSearchesUCCFilingsTaskTask();
	loanTask.DebtorCreditReviewTask();
	loanTask.onHoldAssignUnderWriterTask();
    }

    @Then("user Should be able to put Check in Loan Package task generated on hold for ABL Loan")
    public void user_Should_be_able_to_put_Check_in_Loan_Package_task_generated_on_hold_for_ABL_Loan() {
	loanTask.holdCheckInLoanPackage();
    }

    @Then("user should be able to Validate Request Providers Functionlaity in Scoring task for ABL Loan")
    public void user_should_be_able_to_Validate_Request_Providers_Functionlaity_in_Scoring_task_for_ABL_Loan() {
	loanTask.checkInLoanPackage();
	loanTask.scoringTask();
    }

    @Then("user Should be able to put On Hold BackGround Searches UCC Filings task generated for ABL Loan")
    public void user_Should_be_able_to_put_On_Hold_BackGround_Searches_UCC_Filings_task_generated_for_ABL_Loan() {
	loanTask.checkInLoanPackage();
	loanTask.scoringTask();
	loanTask.holdBackgroundSearchesUCCFilingsTaskTask();
    }

    @Then("user Should be able to put On Hold {int} and Tax Guard Report task generated for ABL Loan")
    public void user_Should_be_able_to_put_On_Hold_and_Tax_Guard_Report_task_generated_for_ABL_Loan(Integer int1) {
	loanTask.checkInLoanPackage();
	loanTask.scoringTask();
	loanTask.backgroundSearchesUCCFilingsTaskTask();
	loanTask.assignUnderWriterTask();
	loanTask.compileCreditSummary();
	loanTask.holdTaxGuardReport8821();

    }

    @Then("user Should be able to Decline Approve task generated for ABL Loan")
    public void user_Should_be_able_to_Decline_Approve_task_generated_for_ABL_Loan() {
	loanTask.checkInLoanPackage();
	loanTask.scoringTask();
	loanTask.backgroundSearchesUCCFilingsTaskTask();
	loanTask.DebtorCreditReviewTask();
	loanTask.assignUnderWriterTask();
	loanTask.compileCreditSummary();
	loanTask.TaxGuardReport8821();
	loanTask.legalsPrepration();
	loanTask.tmsDiscoveryAndSetup();
	loanTask.standardException();
	loanTask.declineApproveTask();
    }

    @Then("User should be able to get the Decline Review task generated for ABL Loan")
    public void user_should_be_able_to_get_the_Decline_Review_task_generated_for_ABL_Loan() {
	loanTask.assertDeclineReviewTaskGenerated();
    }

    @Then("User should be able to get the Decline Review task generated for Smart Loan")
    public void user_should_be_able_to_get_the_Decline_Review_task_generated_for_Smart_Loan() {
	loanTask.assertDeclineReviewTaskGenerated();
    }

    @Then("User should be able to able to Decline Approve Precise ID Task for Consumer Money market Product")
    public void user_should_be_able_to_able_to_Decline_Approve_Precise_ID_Task_for_Consumer_Money_market_Product() {
	depositTask.completeApplicationVerificationTask();
	depositTask.declineApproveVerificationTask(OnBoardApplicants.Applicant1);
    }

    @Then("User should be able to able to Put on Hold Approve Precise ID Task for Consumer Money market Product")
    public void user_should_be_able_to_able_to_Put_on_Hold_Approve_Precise_ID_Task_for_Consumer_Money_market_Product() {
	depositTask.completeApplicationVerificationTask();
	depositTask.holdApproveVerificationTask(OnBoardApplicants.Applicant1);
    }

    @Then("User should be able to able to Put on Hold Application Verification Task for Consumer Money market Product")
    public void user_should_be_able_to_able_to_Put_on_Hold_Application_Verification_Task_for_Consumer_Money_market_Product() {
	depositTask.holdApplicationVerificationTask();
    }

    @Then("User should be able to able to Put on Hold Application Verification Task for Commercial Money Market Product")
    public void user_should_be_able_to_able_to_Put_on_Hold_Application_Verification_Task_for_Commercial_Money_Market_Product() {
	depositTask.holdApplicationVerificationTask();
    }

    @Then("User should be able to able to Decline Decision Task for Commercial Money Market Product")
    public void user_should_be_able_to_able_to_Decline_Decision_Task_for_Commercial_Money_Market_Product() {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeCustomerVerificationQATask();
	depositTask.declineDecisionTask();
    }

    @Then("User should be able to able to Decline Approve Precise ID Task for Consumer {int} Checking Product")
    public void user_should_be_able_to_able_to_Decline_Approve_Precise_ID_Task_for_Consumer_Checking_Product(
	    Integer int1) {
	depositTask.completeApplicationVerificationTask();
	depositTask.declineApproveVerificationTask(OnBoardApplicants.Applicant1);
    }

    @Then("User should be able to able to Decline Approve Precise ID Task for Consumer TAB Chrome Checking Product")
    public void user_should_be_able_to_able_to_Decline_Approve_Precise_ID_Task_for_Consumer_TAB_Chrome_Checking_Product() {
	depositTask.completeApplicationVerificationTask();
	depositTask.declineApproveVerificationTask(OnBoardApplicants.Applicant1);
    }

    @Then("User should be able to able to Decline Approve Precise ID Task for Consumer High Yield Checking Product")
    public void user_should_be_able_to_able_to_Decline_Approve_Precise_ID_Task_for_Consumer_High_Yield_Checking_Product() {
	depositTask.completeApplicationVerificationTask();
	depositTask.declineApproveVerificationTask(OnBoardApplicants.Applicant1);
    }

    @Then("User should be able to able to Decline Approve Precise ID Task for Consumer Kasasa Saver Checking Product")
    public void user_should_be_able_to_able_to_Decline_Approve_Precise_ID_Task_for_Consumer_Kasasa_Saver_Checking_Product() {
	depositTask.completeApplicationVerificationTask();
	depositTask.declineApproveVerificationTask(OnBoardApplicants.Applicant1);
    }

    @Then("User should be able to able to Decline Approve Precise ID Task for Consumer Kasasa Cash Product")
    public void user_should_be_able_to_able_to_Decline_Approve_Precise_ID_Task_for_Consumer_Kasasa_Cash_Product() {
	depositTask.completeApplicationVerificationTask();
	depositTask.declineApproveVerificationTask(OnBoardApplicants.Applicant1);
    }

    @Then("User should be able to Decline Decision task for Commercial Business Checking")
    public void user_should_be_able_to_Decline_Decision_task_for_Commercial_Business_Checking() {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeCustomerVerificationQATask();
	depositTask.declineDecisionTask();
    }

    @Then("User should be able to Put On hold Decision task for Commercial Business Checking")
    public void user_should_be_able_to_Put_On_hold_Decision_task_for_Commercial_Business_Checking() {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeCustomerVerificationQATask();
	depositTask.holdDecisionTask();
    }

    @When("User Puts Decision task on Manager Review for Commercial Business Checking")
    public void user_Puts_Decision_task_on_Manager_Review_for_Commercial_Business_Checking() {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeCustomerVerificationQATask();
	depositTask.managerReviewDecisionTask();
    }

    @Then("Manager Review Task should be generated and user should be able to complete it")
    public void manager_Review_Task_should_be_generated_and_user_should_be_able_to_complete_it() {
	depositTask.completeManagerReviewTask();
    }

    @Then("User should be able to Decline Decision task for Commercial Business Advantage Prepaid")
    public void user_should_be_able_to_Decline_Decision_task_for_Commercial_Business_Advantage_Prepaid() {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeCustomerVerificationQATask();
	depositTask.declineDecisionTask();
    }

    @When("User Puts Decision task on Manager Review for Commercial Business Advantage Prepaid")
    public void user_Puts_Decision_task_on_Manager_Review_for_Commercial_Business_Advantage_Prepaid() {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeCustomerVerificationQATask();
	depositTask.managerReviewDecisionTask();
    }

    @Then("User should be able to Decline Decision task for Consumer_{int} Month CD")
    public void user_should_be_able_to_Decline_Decision_task_for_Consumer__Month_CD(Integer int1) {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeCustomerVerificationQATask();
	depositTask.declineDecisionTask();
    }

    @When("User Puts Decision task on Manager Review for Consumer_{int} Month CD")
    public void user_Puts_Decision_task_on_Manager_Review_for_Consumer__Month_CD(Integer int1) {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeCustomerVerificationQATask();
	depositTask.managerReviewDecisionTask();
    }

    @Then("User should be able to Decline Decision task for Commercial Business Savings")
    public void user_should_be_able_to_Decline_Decision_task_for_Commercial_Business_Savings() {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeCustomerVerificationQATask();
	depositTask.declineDecisionTask();
    }

    @When("User Puts Decision task on Manager Review for Commercial Business Savings")
    public void user_Puts_Decision_task_on_Manager_Review_for_Commercial_Business_Savings() {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeCustomerVerificationQATask();
	depositTask.managerReviewDecisionTask();
    }

    @Then("user should be able to decline Approve One task for Small Ticket Factoring Loan")
    public void user_should_be_able_to_decline_Approve_One_task_for_Small_Ticket_Factoring_Loan() {
	loanTask.attachSignedApplicationAndTermSheetTask();
	loanTask.generateVerificationLetter();
	loanTask.backgroundSearchesUCCFilingsTaskTask();
	loanTask.scoringTask();
	loanTask.DebtorCreditReviewTask();
	loanTask.TaxGuardReport8821();
	loanTask.standardException();
	loanTask.approveOneTask();
	home.logOut();
	login.loginAsAdmin();
	home.openApplications();
	appEditor.selectcreatedLoanApplication();
	appEditor.openCreatedProductUnderApplication();
	loanTask.declineApproveTwoTask();
    }

    @Then("user should be able to decline Scoring task for Large Ticket Factoring Loan")
    public void user_should_be_able_to_decline_Scoring_task_for_Large_Ticket_Factoring_Loan() {
	loanTask.checkInLoanPackageLargeTicketFactoring();
	loanTask.declineScoringTask();
    }

    @Then("user should be able to Deny Approve task for Large Ticket Factoring Loan")
    public void user_should_be_able_to_Deny_Approve_task_for_Large_Ticket_Factoring_Loan() {
	loanTask.checkInLoanPackageLargeTicketFactoring();
	loanTask.scoringTask();
	loanTask.DebtorCreditReviewTask();
	loanTask.backgroundSearchesUCCFilingsTaskTask();
	loanTask.arVerification();
	loanTask.compileCreditSummary();
	loanTask.TaxGuardReport8821();
	loanTask.legalsPrepration();
	loanTask.tmsDiscoveryAndSetup();
	loanTask.standardException();
	loanTask.denyApproveTask();
    }

    @When("user adds Indiviudal and CoBorrower Info Starts the Loan Process")
    public void user_adds_Indiviudal_and_CoBorrower_Info_Starts_the_Loan_Process() {
	app.addLoanIndividualInfo();
	app.updateLoanIndividualGuarantor();
	app.addLegalEntity("Individual");
	app.addSecondLoanCoBorrower();

	appEditor = app.startLoanProcess();
	appEditor.selectcreatedLoanApplication();
	loanTask = appEditor.openLoanProduct();
    }

    @When("User fills opportunity ,Individual,CoBorrower,collateral")
    public void user_fills_opportunity_Individual_CoBorrower_collateral(io.cucumber.datatable.DataTable dataTable) {
	List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	app.fillOpportunityInfo(data.get(0).get("BusinessType"), data.get(0).get("Amount"));
	app.addLoanIndividualInfo();
	app.updateLoanIndividualGuarantor();
	app.addLegalEntity("Individual");
	app.addSecondLoanCoBorrower();
	appEditor = app.startLoanProcess();

    }

    @When("User fills opportunity ,CoBorrower,collateral and Equipment Info and starts Process")
    public void user_fills_opportunity_CoBorrower_collateral_and_Equipment_Info_and_starts_Process(
	    io.cucumber.datatable.DataTable dataTable) {
	List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	app.fillOpportunityInfo(data.get(0).get("BusinessType"), data.get(0).get("Amount"));
	app.fillEquipmentInfo();
	app.addLoanIndividualInfo();
	app.updateLoanIndividualGuarantor();
	app.addLegalEntity("Individual");
	app.addSecondLoanCoBorrower();
	appEditor = app.startLoanProcess();
    }

    @When("User Resubmits Precise ID Request for Applicant in Approve  Verification Task")
    public void user_Resubmits_Precise_ID_Request_for_Applicant_in_Approve_Verification_Task() {
	depositTask.completeApplicationVerificationTask();
    }

    @Then("User should be able to reanswer KIQ question and complete the Task")
    public void user_should_be_able_to_reanswer_KIQ_question_and_complete_the_Task() {
	depositTask.resubmitPreciseIDRequest(OnBoardApplicants.Applicant1);
    }

    @Then("User should be able to Reopen Applicant Accounts Create Task for consumer High yield Savings product")
    public void user_should_be_able_to_Reopen_Applicant_Accounts_Create_Task_for_consumer_High_yield_Savings_product() {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeApproveVerificationTask(OnBoardApplicants.Applicant1);
    }

    @Then("User should be able to Reopen Applicant Accounts Create Task for Consumer Premium Savings product")
    public void user_should_be_able_to_Reopen_Applicant_Accounts_Create_Task_for_Consumer_Premium_Savings_product() {
	// Write code here that turns the phrase above into concrete actions
	throw new cucumber.api.PendingException();
    }

    @When("User Application Verification Task and Starts Approve Verification task")
    public void user_Application_Verification_Task_and_Starts_Approve_Verification_task() {
	depositTask.completeApplicationVerificationTask();
    }

    @Then("User should be able to deny Approve Verification task and change Request Task Should be Generated")
    public void user_should_be_able_to_deny_Approve_Verification_task_and_change_Request_Task_Should_be_Generated() {
	depositTask.denyApproveVerificationTask(OnBoardApplicants.Applicant1);
	depositTask.assertChangeRequestTaskGenerated();
    }

    @Then("User should be able to Put On hold Approve Verification task and change Request Task Should be Generated")
    public void user_should_be_able_to_Put_On_hold_Approve_Verification_task_and_change_Request_Task_Should_be_Generated() {
	// Write code here that turns the phrase above into concrete actions
	depositTask.holdApproveVerificationTask(OnBoardApplicants.Applicant1);
    }

    @Then("User should be able to  Put on Hold Decision task for Commercial Money Market Product")
    public void user_should_be_able_to_Put_on_Hold_Decision_task_for_Commercial_Money_Market_Product() {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeCustomerVerificationQATask();
	depositTask.holdDecisionTask();
    }

    @When("User Puts Decision task on Manager Review for Commercial Money Market")
    public void user_Puts_Decision_task_on_Manager_Review_for_Commercial_Money_Market() {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeCustomerVerificationQATask();
	depositTask.managerReviewDecisionTask();
    }

    @Then("User should be able to  Put on Hold Customer Verification QA task for Commercial Money Market Product")
    public void user_should_be_able_to_Put_on_Hold_Customer_Verification_QA_task_for_Commercial_Money_Market_Product() {
	depositTask.completeApplicationVerificationTask();
	depositTask.holdCustomerVerificationQATask();
    }

    @Then("User should be able to  Put on Hold Application Verification task for Commercial Business Checking")
    public void user_should_be_able_to_Put_on_Hold_Application_Verification_task_for_Commercial_Business_Checking() {
	depositTask.holdApplicationVerificationTask();
    }

    @Then("User should be able to Put on Hold Customer Verification QA task for Commercial Business Checking")
    public void user_should_be_able_to_Put_on_Hold_Customer_Verification_QA_task_for_Commercial_Business_Checking() {
	depositTask.completeApplicationVerificationTask();
	depositTask.holdCustomerVerificationQATask();
    }

    @Then("User should be able to Put on Hold CIF Account Creation task for Commercial Business Checking")
    public void user_should_be_able_to_Put_on_Hold_CIF_Account_Creation_task_for_Commercial_Business_Checking() {

	depositTask.completeApplicationVerificationTask();
	depositTask.completeCustomerVerificationQATask();
	depositTask.completeDecisionTask();
	depositTask.holdCIFAccountCreationTask();
    }

    @Then("User should be able to Put on Hold Send Welcome Email task for Commercial Business Checking")
    public void user_should_be_able_to_Put_on_Hold_Send_Welcome_Email_task_for_Commercial_Business_Checking() {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeCustomerVerificationQATask();
	depositTask.completeDecisionTask();
	depositTask.completeCIFAccountCreationTask();
	depositTask.holdSendWelcomeEmailTask();
    }

    @Then("User should be able to Put on Hold Application Verification task for Commercial Business Advantage Prepaid")
    public void user_should_be_able_to_Put_on_Hold_Application_Verification_task_for_Commercial_Business_Advantage_Prepaid() {
	depositTask.holdApplicationVerificationTask();
    }

    @Then("User should be able to Put on Customer Verification QA task for Commercial Business Advantage Prepaid")
    public void user_should_be_able_to_Put_on_Customer_Verification_QA_task_for_Commercial_Business_Advantage_Prepaid() {
	depositTask.completeApplicationVerificationTask();
	depositTask.holdCustomerVerificationQATask();
    }

    @Then("User should be able to Put on Decison task for Commercial Business Advantage Prepaid")
    public void user_should_be_able_to_Put_on_Decison_task_for_Commercial_Business_Advantage_Prepaid() {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeCustomerVerificationQATask();
	depositTask.holdDecisionTask();
    }

    @Then("User should be able to Put on Hold CIF Account Creation task for Commercial Business Advantage Prepaid")
    public void user_should_be_able_to_Put_on_Hold_CIF_Account_Creation_task_for_Commercial_Business_Advantage_Prepaid() {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeCustomerVerificationQATask();
	depositTask.completeDecisionTask();
	depositTask.holdCIFAccountCreationTask();
    }

    @Then("User should be able to Put on Hold Send Welcome Email task for Commercial Business Advantage Prepaid")
    public void user_should_be_able_to_Put_on_Hold_Send_Welcome_Email_task_for_Commercial_Business_Advantage_Prepaid() {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeCustomerVerificationQATask();
	depositTask.completeDecisionTask();
	depositTask.completeCIFAccountCreationTask();
	depositTask.holdSendWelcomeEmailTask();
    }

    @Then("User should be able to Decline Decision task for Commercial_{int} Month CD")
    public void user_should_be_able_to_Decline_Decision_task_for_Commercial__Month_CD(Integer int1) {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeCustomerVerificationQATask();
	depositTask.declineDecisionTask();
    }

    @When("User Puts Decision task on Manager Review for Commercial_{int} Month CD")
    public void user_Puts_Decision_task_on_Manager_Review_for_Commercial__Month_CD(Integer int1) {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeCustomerVerificationQATask();
	depositTask.managerReviewDecisionTask();
    }

    @Then("User should be able to decline SME Approval task for Small Ticket Loan")
    public void user_should_be_able_to_decline_SME_Approval_task_for_Small_Ticket_Loan() {
	loanTask.checkInLoanPackage();
	loanTask.completeCompileSmallTicketCreditSummary();
	loanTask.standardException();
	loanTask.declineSMECreditAnalystApproval();
    }

    @When("user should be able to decline Scoring task for Large Ticket Loan")
    public void user_should_be_able_to_decline_Scoring_task_for_Large_Ticket_Loan() {
	loanTask.checkInLoanPackage();
	loanTask.compileCreditSummary();
	loanTask.collateralValuation();
	loanTask.declineScoringTask();
    }

    @When("user should be able to decline Approve task for Large Ticket Loan")
    public void user_should_be_able_to_decline_Approve_task_for_Large_Ticket_Loan() {
	loanTask.checkInLoanPackage();
	loanTask.compileCreditSummary();
	loanTask.collateralValuation();
	loanTask.largeTicketscoringTask();
	loanTask.standardException();
	loanTask.equipmentCheckList();
	loanTask.declineApproveTask();
    }

    @Then("User should be able to Deny Approve Verification task for Consumer {int} Checking Product")
    public void user_should_be_able_to_Deny_Approve_Verification_task_for_Consumer_Checking_Product(Integer int1) {
	depositTask.completeApplicationVerificationTask();
	depositTask.denyApproveVerificationTask(OnBoardApplicants.Applicant1);
    }

    @Then("User should be able to Put On Hold Approve Verification task for Consumer {int} Checking Product")
    public void user_should_be_able_to_Put_On_Hold_Approve_Verification_task_for_Consumer_Checking_Product(
	    Integer int1) {
	depositTask.completeApplicationVerificationTask();
	depositTask.holdApproveVerificationTask(OnBoardApplicants.Applicant1);
    }

    @Then("User should be able to Put On Hold DOA Welcome EMail task for Consumer {int} Checking Product")
    public void user_should_be_able_to_Put_On_Hold_DOA_Welcome_EMail_task_for_Consumer_Checking_Product(Integer int1) {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeApproveVerificationTask(OnBoardApplicants.Applicant1);
	depositTask.holdSendWelcomeEmailTask();
    }

    @Then("User should be able to Put On Hold Application Verification task for Consumer {int} Checking Product")
    public void user_should_be_able_to_Put_On_Hold_Application_Verification_task_for_Consumer_Checking_Product(
	    Integer int1) {
	depositTask.holdApplicationVerificationTask();
    }

    @Then("User should be able to Deny Approve Verification task for Consumer TAB Chrome Checking")
    public void user_should_be_able_to_Deny_Approve_Verification_task_for_Consumer_TAB_Chrome_Checking() {
	depositTask.completeApplicationVerificationTask();
	depositTask.denyApproveVerificationTask(OnBoardApplicants.Applicant1);
    }

    @Then("User should be able to Decline Approve Verification task for Consumer TAB Chrome Checking")
    public void user_should_be_able_to_Decline_Approve_Verification_task_for_Consumer_TAB_Chrome_Checking() {
	depositTask.completeApplicationVerificationTask();
	depositTask.declineApproveVerificationTask(OnBoardApplicants.Applicant1);
    }

    @Then("User should be able to Put On Hold DOA Funding task for Consumer {int} Checking Product")
    public void user_should_be_able_to_Put_On_Hold_DOA_Funding_task_for_Consumer_Checking_Product(Integer int1) {
	depositTask.completeApplicationVerificationTask();
	depositTask.declineApproveVerificationTask(OnBoardApplicants.Applicant1);
	depositTask.completeDOAWelcomeMailTask();
	depositTask.completeDOAFundingTask();
    }

    @Then("User should be able to Put On Hold Application Verification task for Consumer TAB Chrome Checking Product")
    public void user_should_be_able_to_Put_On_Hold_Application_Verification_task_for_Consumer_TAB_Chrome_Checking_Product() {
	depositTask.holdApplicationVerificationTask();
    }

    @Then("User should be able to Decline Verification task for Consumer TAB Chrome Checking Product")
    public void user_should_be_able_to_Decline_Verification_task_for_Consumer_TAB_Chrome_Checking_Product() {
	depositTask.completeApplicationVerificationTask();
	depositTask.declineApproveVerificationTask(OnBoardApplicants.Applicant1);
    }

    @Then("User should be able to Put on Hold Approve Verification task for Consumer TAB Chrome Checking Product")
    public void user_should_be_able_to_Put_on_Hold_Approve_Verification_task_for_Consumer_TAB_Chrome_Checking_Product() {
	depositTask.completeApplicationVerificationTask();
	depositTask.holdApproveVerificationTask(OnBoardApplicants.Applicant1);
    }

    @Then("User should be able to Put On Hold Application Verification task for Consumer High Yield Checking Product")
    public void user_should_be_able_to_Put_On_Hold_Application_Verification_task_for_Consumer_High_Yield_Checking_Product() {
	depositTask.holdApplicationVerificationTask();
    }

    @Then("User should be able to Put On Hold Approve Verification task for Consumer High Yield Checking Product")
    public void user_should_be_able_to_Put_On_Hold_Approve_Verification_task_for_Consumer_High_Yield_Checking_Product() {
	depositTask.completeApplicationVerificationTask();
	depositTask.holdApproveVerificationTask(OnBoardApplicants.Applicant1);
    }

    @Then("User should be able to Deny Approve Verification task for Consumer Kasasa Cash")
    public void user_should_be_able_to_Deny_Approve_Verification_task_for_Consumer_Kasasa_Cash() {
	depositTask.completeApplicationVerificationTask();
	depositTask.denyApproveVerificationTask(OnBoardApplicants.Applicant1);
    }

    @Then("User should be able to Put on Hold Approve Verification task for Consumer Kasasa Cash")
    public void user_should_be_able_to_Put_on_Hold_Approve_Verification_task_for_Consumer_Kasasa_Cash() {

	depositTask.completeApplicationVerificationTask();
	depositTask.holdApproveVerificationTask(OnBoardApplicants.Applicant1);
    }

    @Then("User should be able to Put On Hold Application Verification task for Consumer Kasasa Cash Product")
    public void user_should_be_able_to_Put_On_Hold_Application_Verification_task_for_Consumer_Kasasa_Cash_Product() {
	depositTask.holdApplicationVerificationTask();
    }

    @Then("User should be able to Deny Approve Verification task for Consumer Kasasa Saver Product")
    public void user_should_be_able_to_Deny_Approve_Verification_task_for_Consumer_Kasasa_Saver_Product() {
	depositTask.completeApplicationVerificationTask();
	depositTask.denyApproveVerificationTask(OnBoardApplicants.Applicant1);
    }

    @Then("User should be able to Put On Hold Approve Verification task for Consumer Kasasa Saver Product")
    public void user_should_be_able_to_Put_On_Hold_Approve_Verification_task_for_Consumer_Kasasa_Saver_Product() {
	depositTask.completeApplicationVerificationTask();
	depositTask.holdApproveVerificationTask(OnBoardApplicants.Applicant1);
    }

    @Then("User should be able to Put On Hold Application Verification task for Consumer Kasasa Saver Product")
    public void user_should_be_able_to_Put_On_Hold_Application_Verification_task_for_Consumer_Kasasa_Saver_Product() {
	depositTask.holdApplicationVerificationTask();
    }

    @Then("User should be able to put on Hold CIF Account Creations task for Commercial Money Market")
    public void user_should_be_able_to_put_on_Hold_CIF_Account_Creations_task_for_Commercial_Money_Market() {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeCustomerVerificationQATask();
	depositTask.completeDecisionTask();
	depositTask.holdCIFAccountCreationTask();
    }

    @Then("User should be able to put on Hold Send Welcome EMail task for Commercial Money Market")
    public void user_should_be_able_to_put_on_Hold_Send_Welcome_EMail_task_for_Commercial_Money_Market() {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeCustomerVerificationQATask();
	depositTask.completeDecisionTask();
	depositTask.completeCIFAccountCreationTask();
	depositTask.holdSendWelcomeEmailTask();
    }

    @Then("User should be able to Deny Approve Verification task for Consumer High Yield Checking Product")
    public void user_should_be_able_to_Deny_Approve_Verification_task_for_Consumer_High_Yield_Checking_Product() {
	depositTask.completeApplicationVerificationTask();
	depositTask.denyApproveVerificationTask(OnBoardApplicants.Applicant1);
    }

    @Then("User should be able to put on Hold Decision task for Commercial Business Advantage Prepaid")
    public void user_should_be_able_to_put_on_Hold_Decision_task_for_Commercial_Business_Advantage_Prepaid() {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeCustomerVerificationQATask();
	depositTask.holdDecisionTask();
    }

    @Then("User should be able to Deny CIF Account Creation task for Commercial Business Advantage Prepaid")
    public void user_should_be_able_to_Deny_CIF_Account_Creation_task_for_Commercial_Business_Advantage_Prepaid() {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeCustomerVerificationQATask();
	depositTask.completeDecisionTask();
	depositTask.denyCIFAccountCreationTask();
    }

    @Then("User should be able to Decline Approve Verification task for Consumer High Yield Savings Product")
    public void user_should_be_able_to_Decline_Approve_Verification_task_for_Consumer_High_Yield_Savings_Product() {
	depositTask.completeApplicationVerificationTask();
	depositTask.declineApproveVerificationTask(OnBoardApplicants.Applicant1);
    }

    @Then("User should be able to Deny Approve Verification task for Consumer High Yield Savings Product")
    public void user_should_be_able_to_Deny_Approve_Verification_task_for_Consumer_High_Yield_Savings_Product() {
	depositTask.completeApplicationVerificationTask();
	depositTask.denyApproveVerificationTask(OnBoardApplicants.Applicant1);
    }

    @Then("User should be able to Decline Approve Verification task for Consumer Premium Savings Product")
    public void user_should_be_able_to_Decline_Approve_Verification_task_for_Consumer_Premium_Savings_Product() {
	depositTask.completeApplicationVerificationTask();
	depositTask.declineApproveVerificationTask(OnBoardApplicants.Applicant1);
    }

    @Then("User should be able to Deny Approve Verification task for Consumer Premium Savings Product")
    public void user_should_be_able_to_Deny_Approve_Verification_task_for_Consumer_Premium_Savings_Product() {
	depositTask.completeApplicationVerificationTask();
	depositTask.denyApproveVerificationTask(OnBoardApplicants.Applicant1);
    }

    @Then("User should be able to Decline Approve task for Commercial Large Ticket Equipment Loan")
    public void user_should_be_able_to_Decline_Approve_task_for_Commercial_Large_Ticket_Equipment_Loan() {
	loanTask.checkInLoanPackage();
	loanTask.compileCreditSummary();
	loanTask.collateralValuation();
	loanTask.largeTicketscoringTask();
	loanTask.standardException();
	loanTask.equipmentCheckList();
	loanTask.declineApproveTask();
    }

    @Then("User should be able to Deny Approve task for Commercial Large Ticket Equipment Loan")
    public void user_should_be_able_to_Deny_Approve_task_for_Commercial_Large_Ticket_Equipment_Loan() {
	loanTask.checkInLoanPackage();
	loanTask.compileCreditSummary();
	loanTask.collateralValuation();
	loanTask.largeTicketscoringTask();
	loanTask.standardException();
	loanTask.equipmentCheckList();
	loanTask.denyApproveTask();
    }

    @Then("User should be able to Decline Approve One task for Commercial Small Ticket Factoring Loan")
    public void user_should_be_able_to_Decline_Approve_One_task_for_Commercial_Small_Ticket_Factoring_Loan() {
	loanTask.attachSignedApplicationAndTermSheetTask();
	loanTask.generateVerificationLetter();
	loanTask.backgroundSearchesUCCFilingsTaskTask();
	loanTask.scoringTask();
	loanTask.DebtorCreditReviewTask();
	loanTask.TaxGuardReport8821();
	loanTask.standardException();
	loanTask.declineApproveOneTask();
    }

    @Then("User should be able to Deny Approve One task for Commercial Small Ticket Factoring Loan")
    public void user_should_be_able_to_Deny_Approve_One_task_for_Commercial_Small_Ticket_Factoring_Loan() {
	loanTask.generateVerificationLetter();
	loanTask.backgroundSearchesUCCFilingsTaskTask();
	loanTask.scoringTask();
	loanTask.DebtorCreditReviewTask();
	loanTask.TaxGuardReport8821();
	loanTask.standardException();
	loanTask.denyApproveOneTask();
    }

    @Then("Second User should be able to Deny Approve Two task for Commercial Small Ticket Factoring Loan")
    public void second_User_should_be_able_to_Deny_Approve_Two_task_for_Commercial_Small_Ticket_Factoring_Loan() {
	loanTask.attachSignedApplicationAndTermSheetTask();
	loanTask.generateVerificationLetter();
	loanTask.backgroundSearchesUCCFilingsTaskTask();
	loanTask.scoringTask();
	loanTask.DebtorCreditReviewTask();
	loanTask.TaxGuardReport8821();
	loanTask.standardException();
	loanTask.approveOneTask();
	home.logOut();
	login.loginAsAdmin();
	home.openApplications();
	appEditor.selectcreatedLoanApplication();
	loanTask.denyApproveTwoTask();
    }

    @Then("User should be able to put on hold Compile Credit Summary task for Large Ticket Factoring Loan")
    public void user_should_be_able_to_put_on_hold_Compile_Credit_Summary_task_for_Large_Ticket_Factoring_Loan() {
	loanTask.checkInLoanPackage();
	loanTask.scoringTask();
	loanTask.DebtorCreditReviewTask();
	loanTask.backgroundSearchesUCCFilingsTaskTask();
	loanTask.arVerification();
	loanTask.holdCompileCreditSummary();
    }

    @Then("User should be able to put on hold {int} and Tax Guard Report task for Large Ticket Factoring Loan")
    public void user_should_be_able_to_put_on_hold_and_Tax_Guard_Report_task_for_Large_Ticket_Factoring_Loan(
	    Integer int1) {
	loanTask.checkInLoanPackage();
	loanTask.scoringTask();
	loanTask.DebtorCreditReviewTask();
	loanTask.backgroundSearchesUCCFilingsTaskTask();
	loanTask.arVerification();
	loanTask.compileCreditSummary();
	loanTask.holdTaxGuardReport8821();
    }

    @Then("User should be able to put on hold TMS Discovery and Setup task for Large Ticket Factoring Loan")
    public void user_should_be_able_to_put_on_hold_TMS_Discovery_and_Setup_task_for_Large_Ticket_Factoring_Loan() {
	loanTask.checkInLoanPackage();
	loanTask.scoringTask();
	loanTask.DebtorCreditReviewTask();
	loanTask.backgroundSearchesUCCFilingsTaskTask();
	loanTask.arVerification();
	loanTask.compileCreditSummary();
	loanTask.TaxGuardReport8821();
	loanTask.legalsPrepration();
	loanTask.holdTMSDiscoveryAndSetup();
    }

    @Then("User should be able to Decline Approve task for Large Ticket Factoring Loan")
    public void user_should_be_able_to_Decline_Approve_task_for_Large_Ticket_Factoring_Loan() {
	loanTask.checkInLoanPackage();
	loanTask.scoringTask();
	loanTask.DebtorCreditReviewTask();
	loanTask.backgroundSearchesUCCFilingsTaskTask();
	loanTask.arVerification();
	loanTask.compileCreditSummary();
	loanTask.TaxGuardReport8821();
	loanTask.legalsPrepration();
	loanTask.tmsDiscoveryAndSetup();
	loanTask.standardException();
	loanTask.declineApproveTask();
    }

    @Then("User should be able to put on hold Prefunding Legal Review task for Large Ticket Factoring Loan")
    public void user_should_be_able_to_put_on_hold_Prefunding_Legal_Review_task_for_Large_Ticket_Factoring_Loan() {
	loanTask.checkInLoanPackage();
	loanTask.scoringTask();
	loanTask.DebtorCreditReviewTask();
	loanTask.backgroundSearchesUCCFilingsTaskTask();
	loanTask.arVerification();
	loanTask.compileCreditSummary();
	loanTask.TaxGuardReport8821();
	loanTask.legalsPrepration();
	loanTask.tmsDiscoveryAndSetup();
	loanTask.standardException();
	loanTask.approveTask();
	loanTask.legalDocsExecution();
	loanTask.loanAccountSetup();
	loanTask.holdPrefundingLegalReview();
    }

    @Then("User should be able to Request KIQ questions for Customer opening a savings Account")
    public void user_should_be_able_to_Request_KIQ_questions_for_Customer_opening_a_savings_Account() {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeApproveVerificationTask(OnBoardApplicants.Applicant1);
    }

    @Then("User should be able to decline Compile Credit Summary task for Small Ticket Equipment")
    public void user_should_be_able_to_decline_Compile_Credit_Summary_task_for_Small_Ticket_Equipment() {
	loanTask.checkInLoanPackage();
	loanTask.compileCreditSummary();
    }

    @Then("User should be able to Put on Hold Customer Verification QA task for Consumer {int} Month CD")
    public void user_should_be_able_to_Put_on_Hold_Customer_Verification_QA_task_for_Consumer_Month_CD(Integer int1) {
	depositTask.completeApplicationVerificationTask();
	depositTask.holdCustomerVerificationQATask();
    }

    @Then("User should be able to Put on Hold Send Welcome Email task for Consumer {int} Month CD")
    public void user_should_be_able_to_Put_on_Hold_Send_Welcome_Email_task_for_Consumer_Month_CD(Integer int1) {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeCustomerVerificationQATask();
	depositTask.completeDecisionTask();
	depositTask.completeCIFAccountCreationTask();
	depositTask.holdSendWelcomeEmailTask();
    }

    @Then("User should be able to Put on Hold Funding task for Consumer {int} Month CD")
    public void user_should_be_able_to_Put_on_Hold_Funding_task_for_Consumer_Month_CD(Integer int1) {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeCustomerVerificationQATask();
	depositTask.completeDecisionTask();
	depositTask.completeCIFAccountCreationTask();
	depositTask.completeSendWelcomeEmailTask();
	depositTask.holdFundingTask();
    }

    @Then("User should be able to Put On hold Application Verification task for Consumer Premium Savings")
    public void user_should_be_able_to_Put_On_hold_Application_Verification_task_for_Consumer_Premium_Savings() {
	depositTask.holdApplicationVerificationTask();
    }

    @Then("User should be able to Put on Hold Customer verification Task for Commercial Business Savings")
    public void user_should_be_able_to_Put_on_Hold_Customer_verification_Task_for_Commercial_Business_Savings() {
	depositTask.completeApplicationVerificationTask();
	depositTask.holdCustomerVerificationQATask();
    }

    @Then("User should be able to Put on Hold CIF Account Creation Task for Commercial Business Savings")
    public void user_should_be_able_to_Put_on_Hold_CIF_Account_Creation_Task_for_Commercial_Business_Savings() {

	depositTask.completeApplicationVerificationTask();
	depositTask.completeCustomerVerificationQATask();
	depositTask.completeDecisionTask();
	depositTask.holdCIFAccountCreationTask();
    }

    @Then("User should be able to Put on Hold CIF Funding Task for Commercial Business Savings")
    public void user_should_be_able_to_Put_on_Hold_CIF_Funding_Task_for_Commercial_Business_Savings() {
	depositTask.completeApplicationVerificationTask();
	depositTask.completeCustomerVerificationQATask();
	depositTask.completeDecisionTask();
	depositTask.completeCIFAccountCreationTask();
	depositTask.completeSendWelcomeEmailTask();
	depositTask.holdFundingTask();
    }

    @Then("User should be able to Put on Hold Standard Exception task for Commercial small ticket equipment")
    public void user_should_be_able_to_Put_on_Hold_Standard_Exception_task_for_Commercial_small_ticket_equipment() {
	loanTask.checkInLoanPackage();
	loanTask.completeCompileSmallTicketCreditSummary();
	loanTask.holdStandardException();
    }

    @Then("User should be able to Put on Hold Equipment Checklist task for Commercial small ticket equipment")
    public void user_should_be_able_to_Put_on_Hold_Equipment_Checklist_task_for_Commercial_small_ticket_equipment() {
	loanTask.checkInLoanPackage();
	loanTask.completeCompileSmallTicketCreditSummary();
	loanTask.standardException();
	loanTask.smeCreditAnalystApproval();
	loanTask.sendApproveLetter();
	loanTask.holdEquipmentCheckList();
    }

    @Then("Use should be able to put on hold Check In Loan Package Task for Commercial Large Ticket Equipment")
    public void use_should_be_able_to_put_on_hold_Check_In_Loan_Package_Task_for_Commercial_Large_Ticket_Equipment() {
	loanTask.holdCheckInLoanPackage();
    }

    @Then("Use should be able to put on hold Complie Credit Summary Task for Commercial Large Ticket Equipment")
    public void use_should_be_able_to_put_on_hold_Complie_Credit_Summary_Task_for_Commercial_Large_Ticket_Equipment() {
	loanTask.checkInLoanPackage();
	loanTask.holdCompileCreditSummary();
    }

    @Then("Use should be able to put on hold Collateral Valuation Task for Commercial Large Ticket Equipment")
    public void use_should_be_able_to_put_on_hold_Collateral_Valuation_Task_for_Commercial_Large_Ticket_Equipment() {
	loanTask.checkInLoanPackage();
	loanTask.compileCreditSummary();
	loanTask.holdCollateralValuation();
    }

    @Then("Use should be able to put on hold Scoring Task for Commercial Large Ticket Equipment")
    public void use_should_be_able_to_put_on_hold_Scoring_Task_for_Commercial_Large_Ticket_Equipment() {
	loanTask.checkInLoanPackage();
	loanTask.compileCreditSummary();
	loanTask.collateralValuation();
	loanTask.holdScoringTask();
    }

    @Then("Use should be able to put on hold Standard Exception Task for Commercial Large Ticket Equipment")
    public void use_should_be_able_to_put_on_hold_Standard_Exception_Task_for_Commercial_Large_Ticket_Equipment() {
	loanTask.checkInLoanPackage();
	loanTask.compileCreditSummary();
	loanTask.collateralValuation();
	loanTask.largeTicketscoringTask();
	loanTask.holdStandardException();
    }

    @Then("Use should be able to put on hold Send Approve Letter Task for Commercial Large Ticket Equipment")
    public void use_should_be_able_to_put_on_hold_Send_Approve_Letter_Task_for_Commercial_Large_Ticket_Equipment() {
	loanTask.checkInLoanPackage();
	loanTask.compileCreditSummary();
	loanTask.collateralValuation();
	loanTask.largeTicketscoringTask();
	loanTask.standardException();
	loanTask.equipmentCheckList();
	loanTask.approveTask();
	loanTask.holdSendApproveLetter();
    }

    @Then("Use should be able to put on hold Equipment CheckList Task for Commercial Large Ticket Equipment")
    public void use_should_be_able_to_put_on_hold_Equipment_CheckList_Task_for_Commercial_Large_Ticket_Equipment() {
	loanTask.checkInLoanPackage();
	loanTask.compileCreditSummary();
	loanTask.collateralValuation();
	loanTask.largeTicketscoringTask();
	loanTask.standardException();
	loanTask.holdEquipmentCheckList();
    }

    @Then("Use should be able to put on hold Scoring Task for Commercial Small Ticket Factoring")
    public void use_should_be_able_to_put_on_hold_Scoring_Task_for_Commercial_Small_Ticket_Factoring() {
	loanTask.attachSignedApplicationAndTermSheetTask();
	loanTask.generateVerificationLetter();
	loanTask.backgroundSearchesUCCFilingsTaskTask();
	loanTask.holdScoringTask();
    }

    @Then("Use should be able to put on hold Check In Loan Package Task for Commercial Large Ticket Factoring Loan")
    public void use_should_be_able_to_put_on_hold_Check_In_Loan_Package_Task_for_Commercial_Large_Ticket_Factoring_Loan() {
	loanTask.holdCheckInLoanPackage();
    }

}
