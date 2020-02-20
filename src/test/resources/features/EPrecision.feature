@EPrecision @Web @Regression
Feature: EPrecision

  Background: User Has Logged into EPrecision With Valid Credentials
    Given user logged into EPrecision as 'admin' and 'admin'

 
  Scenario: TC_ePrecision_0001
     
    When User is logged in to EPrecision and at HomePage
    Then on Homepage below options should be available
     | Fist Data | Precision | Administration | Help | 
  @Smoke
  Scenario: TC_ePrecision_0002
    Given User is Logged in to EPrecsions
    When User navigates to process Errors
    Then User should be able to see below  options
      | Sent | Account | Card | Error Code | Process | Message | Reviewed |

  @Smoke
  Scenario: TC_ePrecision_0003
    Given User is Logged in to EPrecsions
    When User navigates to End of Day Jobs
    Then User should be able to see All End of Day Jobs options
    
  Scenario: TC_ePrecision_0004
    Given User is Logged in to EPrecsions
    When User navigates to End of Day Jobs and Clicks on All End of Day Jobs options
    Then Relative Message should be displayed to the User
    
    #@TODO
  #Scenario: TC_ePrecision_0005
    #Given User is Logged in to EPrecsions
    #When User navigates to Product Templates Page
    #Then User should be able to Create Edit and Remove a Template
    
    
  Scenario: TC_ePrecision_0006
    Given User is Logged in to EPrecsions
    When User Expands the Precision Tab
    Then Precision Tab should have below options
    |Sonic|Ping|
  @Smoke
  Scenario: TC_ePrecision_0007
    Given User is Logged in to EPrecsions
    When User navigates to Precision
    Then User should be able to see All Precision tab options
   
  Scenario: TC_ePrecision_0008
    Given User is Logged in to EPrecsions
    When user navigates to "Cif Entity" option
    Then User should be able to see below  options on CIF Entity Page
      | Search | Add Search Condition | Create | Edit | Remove | 
  @Smoke  
  Scenario: TC_ePrecision_0009
    Given User is Logged in to EPrecsions
    When user navigates to "Cif Entity" option
    Then user should be able to create Edit  Remove and search for the CIF Entity
      | Branch     | IbFlag | Ib2Flag | newIb2Flag |
      | 1 TAB Bank |      1 |       0 |          1 |

  @Smoke    
  Scenario: TC_ePrecision_010
    Given User is Logged in to EPrecsions
    When user navigates to Ping options
    And user clicks on Ping Sonic button
    Then System up Message Should be Displayed
    
     
    Scenario: TC_ePrecision_0011
    Given User is Logged in to EPrecsions
    When user navigates to "Account Entity" option
    Then Verify all the options from Account Entity page
    Then Click on create button and Create account entity
      | Product                  | Branch Code | Type                         | Status | Call Report   | GLCode         | Statement Type    | Sta Cycle       |Officer Code | Charge Code | ODRICode        | Rebate | FRebate |ECode | WriteOff |
      | Consumer Kasasa Cash     | 1 TAB Bank  | 85 85 Moneycard Checking NOW | New    | 10 BANK OWNED | 600 BANCONTROL | 8888 ARCHIVE ONLY | 2 EOM - IRA/SAV |SYS TAB      | 0 NO CHARGE | 1 OD/NSF CHARGE | 1      | 1       |1    | 0 No Write Off |
    Then Perform search and validate results with "Statement type" user "8888 ARCHIVE ONLY" in schedule task page
   
    
    Scenario: TC_ePrecision_0012
    Given User is Logged in to EPrecsions
    When user navigates to "Sec Cust Entity" option
    Then Verify all the options from Sec Cust Entity page
    
    
    Scenario: TC_ePrecision_0014
    Given User is Logged in to EPrecsions
    When user navigates to "Atm Entities" option
    Then Verify all the options from Atm Entities page
    
    
    Scenario: TC_ePrecision_0015
    Given User is Logged in to EPrecsions
    When user navigates to "Atm Entities" option
    Then Verify all the options from Atm Entities page
    Then Create Atm Entity from atm Entity editor
    Then Edit created Atm Entity and update
    Then Remove Atm entity from the list of Atm Entities
    Then Perform search and validate results with "Issue code" user "0 Default" in schedule task page
   
   
    Scenario: TC_ePrecision_0016
    Given User is Logged in to EPrecsions
    When user expands Maintenance options List
    Then Verify all the options from maintenance sub options
    
     
    Scenario: TC_ePrecision_0017
    Given User is Logged in to EPrecsions
    When user navigates to Ping options
    Then user Should be able to See Ping Options
    
    
    Scenario: TC_ePrecision_0018
    Given User is Logged in to EPrecsions
    When user navigates to Ping options
    Then user Should be able to See Ping Options
    When user clicks on Ping Sonic button
    Then System up Message Should be Displayed
    
    Scenario: TC_ePrecision_0019
    Given User is Logged in to EPrecsions
    When user navigates to Ping options
    Then user Should be able to See Ping Options
    When user clicks on Test Account Inquiry button
    Then Sonic enquiry Message Should be Displayed
    
     
    Scenario: TC_ePrecision_0020
    Given User is Logged in to EPrecsions
    When user navigates to Ping options
    Then user Should be able to See Ping Options
    When user clicks on Test Accurate date button
    Then Test Accurate Message Should be Displayed
    
     
    Scenario: TC_ePrecision_0021
    Given User is Logged in to EPrecsions
    When user navigates to Ping options
    Then user Should be able to See Ping Options
    When user clicks on Direct Query Precision button
    Then Direct Query Precision Message Should be Displayed
    
     
    Scenario: TC_ePrecision_0022
    Given User is Logged in to EPrecsions
    When user navigates to maintenance and sub option "Branches"
    Then Click on create and create new branch editor
    Then Click on edit and update branch editor
    Then Click on remove and remove the created branch
    Then Perform search and validate results with "Description" user "Description" in Branch browser page