@EDGe @Web @Regression
Feature: EDGe

  Background: User Has Logged into EPrecision With Valid Credentials
    Given user logged into Edge application

  Scenario: TC_EDGe_0001
    When User is logged in to Edge application and at HomePage
    Then Click on AR menu and "NOA Management" and click on "NOA Clients" sub menu
    Then verify all the option from NOA clients page

  Scenario: TC_EDGe_0002
    When User is logged in to Edge application and at HomePage
    Then Click on AR menu and "NOA Management" and click on "NOA Clients" sub menu
    Then verify all the option from NOA clients page
    Then Select a record from the list
    Then Click on edit and verify the fields

  Scenario: TC_EDGe_0003
    When User is logged in to Edge application and at HomePage
    Then Click on AR menu and "NOA Management" and click on "NOA Clients" sub menu
    Then verify all the option from NOA clients page
    Then Select a record from the list
    Then Click on edit and verify the fields
    Then Update email id from edit page and click on ok button
    Then Open updated record and verify updated value

  Scenario: TC_EDGe_0004
    When User is logged in to Edge application and at HomePage
    Then Click on AR menu and "NOA Management" and click on "NOA Clients" sub menu
    Then verify all the option from NOA clients page
    Then Select a record from the list
    Then Click on Quick NOA adn verify fileds from the quickNOA page

  Scenario: TC_EDGe_0005
    When User is logged in to Edge application and at HomePage
    Then Click on AR menu and "NOA Management" and click on "NOA Clients" sub menu
    Then verify all the option from NOA clients page
    Then Select a record from the list
    Then Click on Quick NOA and enter debtor details and save

  Scenario: TC_EDGe_0006
    When User is logged in to Edge application and at HomePage
    Then Click on AR menu and "NOA Management" and click on "NOA Clients" sub menu
    Then verify all the option from NOA clients page
    Then Select a record from the list
    Then Click on Mass NOA and verify fileds from the Mass NOA page

  Scenario: TC_EDGe_0007
    When User is logged in to Edge application and at HomePage
    Then Click on AR menu and "NOA Management" and click on "NOA Clients" sub menu
    Then verify all the option from NOA clients page
    Then Select a record from the list
    Then Click on Mass NOA and enter debtor details and save

  Scenario: TC_EDGe_0008
    When User is logged in to Edge application and at HomePage
    Then Click on AR menu and "NOA Management" and click on "NOA Clients" sub menu
    Then verify all the option from NOA clients page
    Then Select a record from the list
    Then Click on Release NOA and verify fileds from the Release NOA page

  Scenario: TC_EDGe_0009
    When User is logged in to Edge application and at HomePage
    Then Click on AR menu and "NOA Management" and click on "NOA Clients" sub menu
    Then verify all the option from NOA clients page
    Then Select a record from the list
    Then Click on Release NOA and enter debtor details and save

  Scenario: TC_EDGe_0010
    When User is logged in to Edge application and at HomePage
    Then Click on AR menu and "NOA Management" and click on "NOA Clients" sub menu
    Then verify all the option from NOA clients page
    Then Select a record from the list
    Then Click on Add to set and verify fileds from the Add to set window

  Scenario: TC_EDGe_0011
    When User is logged in to Edge application and at HomePage
    Then Click on AR menu and "NOA Management" and click on "NOA Clients" sub menu
    Then verify all the option from NOA clients page
    Then Select a record from the list
    Then Click on Add to Set and Set new NOA request

  Scenario: TC_EDGe_0012
    When User is logged in to Edge application and at HomePage
    Then Click on AR menu and "NOA Management" and click on "NOA Clients" sub menu
    Then verify all the option from NOA clients page
    Then Search for "Nfe" client type and verify applicant from the results

  Scenario: TC_EDGe_0013
    When User is logged in to Edge application and at HomePage
    Then Click on AR menu and "NOA Management" and click on "NOA Queues" sub menu
    Then verify all the option from NOA Queues page

  Scenario: TC_EDGe_0014
    When User is logged in to Edge application and at HomePage
    Then Click on AR menu and "NOA Management" and click on "NOA Queues" sub menu
    Then Select NOA Client and click on Resend button

  Scenario: TC_EDGe_0015
    When User is logged in to Edge application and at HomePage
    Then Click on AR menu and "NOA Management" and click on "NOA Queues" sub menu
    Then Select NOA Client and click on remove and remove record

  Scenario: TC_EDGe_0016
    When User is logged in to Edge application and at HomePage
    Then Click on AR menu and "NOA Management" and click on "NOA Queues" sub menu
    Then Select NOA Client and click on excel and export record

  Scenario: TC_EDGe_0018
    When User is logged in to Edge application and at HomePage
    Then Click on AR menu and "NOA Management" and click on "NOA Templates" sub menu
    Then Verify all options from NOA Template page

  Scenario: TC_EDGe_0021
    When User is logged in to Edge application and at HomePage
    Then Click on AR menu and "NOA Management" and click on "NOA Templates" sub menu
    Then Select template and click on remove button

  Scenario: TC_EDGe_0022
    When User is logged in to Edge application and at HomePage
    Then Click on AR menu and "NOA Management" and click on "NOA Files" sub menu
    Then Verify all options from NOA Files page

  
  Scenario: TC_EDGe_0023
    When User is logged in to Edge application and at HomePage
    Then Click on AR menu and "NOA Management" and click on "NOA Files" sub menu
    Then Select file and click on edit button
