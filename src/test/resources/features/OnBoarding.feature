@OnBoarding @Web @Regression
Feature: Onboarding

  Background: User Has Logged into OnBoarding With Valid Credentials
    Given user logged into Onboarding

  @ONBRD1225 @Smoke @Deposit @REG_ONBRD_1225_TC_0001   
  Scenario: REG_ONBRD_1225_TC_0001
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType          | CustomerType | ProductName                   |
      | Deposit     | Money Market Account | Consumer     | Consumer Money Market Account |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete Verifications and Create account

  @ONBRD1225 @Smoke @Deposit @REG_ONBRD_1225_TC_0002   
  Scenario: REG_ONBRD_1225_TC_0002
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType          | CustomerType | ProductName             |
      | Deposit     | Money Market Account | Commercial   | Commercial Money Market |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete commercial Verifications and Create account

  @ONBRD1225 @Smoke @Deposit @REG_ONBRD_1225_TC_0003    
  Scenario: REG_ONBRD_1225_TC_0003
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName          |
      | Deposit     | Checking    | Consumer     | Consumer Kasasa Cash |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete Verifications and Create account

  @ONBRD1225 @Smoke @Deposit @REG_ONBRD_1225_TC_0004    
  Scenario: REG_ONBRD_1225_TC_0004
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName           |
      | Deposit     | Checking    | Consumer     | Consumer Kasasa Saver |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete Verifications and Create account

  @ONBRD1225 @Smoke @Deposit @REG_ONBRD_1225_TC_0005    
  Scenario: REG_ONBRD_1225_TC_0005
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName           |
      | Deposit     | Checking    | Consumer     | Consumer 365 Checking |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete Verifications and Create account

  @ONBRD1225 @Smoke @Deposit @REG_ONBRD_1225_TC_0006    
  Scenario: REG_ONBRD_1225_TC_0006
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                  |
      | Deposit     | Checking    | Consumer     | Consumer TAB Chrome Checking |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete Verifications and Create account

  @ONBRD1225 @Smoke @Deposit @REG_ONBRD_1225_TC_0007    
  Scenario: REG_ONBRD_1225_TC_0007
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                  |
      | Deposit     | Checking    | Consumer     | Consumer High Yield Checking |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete Verifications and Create account

  @ONBRD1225 @Smoke @Deposit @REG_ONBRD_1225_TC_0008   
  Scenario: REG_ONBRD_1225_TC_0008
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                  |
      | Deposit     | Checking    | Commercial   | Commercial Business Checking |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete commercial Verifications and Create account

  @ONBRD1225 @Smoke @Deposit @REG_ONBRD_1225_TC_0009   
  Scenario: REG_ONBRD_1225_TC_0009
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                           |
      | Deposit     | Checking    | Commercial   | Commercial Analyzed Business Checking |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete commercial Verifications and Create account

  @ONBRD1225 @Smoke @Deposit @REG_ONBRD_1225_TC_0010    
  Scenario: REG_ONBRD_1225_TC_0010
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                           |
      | Deposit     | Checking    | Commercial   | Commercial Business Advantage Prepaid |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete commercial Verifications and Create account

  @ONBRD1225 @Smoke @Deposit @REG_ONBRD_1225_TC_0011
  Scenario: REG_ONBRD_1225_TC_0011
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName          |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 12 Month CD |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete consumer COD Verifications and Create account

  @ONBRD1225 @Smoke @Deposit @REG_ONBRD_1225_TC_0012
  Scenario: REG_ONBRD_1225_TC_0012
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName          |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 18 Month CD |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete consumer COD Verifications and Create account

  @ONBRD1225 @Smoke @Deposit @REG_ONBRD_1225_TC_0013
  Scenario: REG_ONBRD_1225_TC_0013
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName          |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 24 Month CD |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete consumer COD Verifications and Create account

  @ONBRD1225 @Smoke @Deposit @REG_ONBRD_1225_TC_0014
  Scenario: REG_ONBRD_1225_TC_0014
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName         |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 3 Month CD |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete consumer COD Verifications and Create account

  @ONBRD1225 @Smoke @Deposit @REG_ONBRD_1225_TC_0015
  Scenario: REG_ONBRD_1225_TC_0015
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName          |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 36 Month CD |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete consumer COD Verifications and Create account

  @ONBRD1225 @Smoke @Deposit @REG_ONBRD_1225_TC_0016
  Scenario: REG_ONBRD_1225_TC_0016
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName          |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 48 Month CD |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete consumer COD Verifications and Create account

  @ONBRD1225 @Smoke @Deposit @REG_ONBRD_1225_TC_0017
  Scenario: REG_ONBRD_1225_TC_0017
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName         |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 6 Month CD |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete consumer COD Verifications and Create account

  @ONBRD1225 @Smoke @Deposit @REG_ONBRD_1225_TC_0018
  Scenario: REG_ONBRD_1225_TC_0018
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName          |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 60 Month CD |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete consumer COD Verifications and Create account

  @ONBRD1225 @Smoke @Deposit @REG_ONBRD_1225_TC_0019
  Scenario: REG_ONBRD_1225_TC_0019
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName         |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 9 Month CD |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete commercial COD Verifications and Create account

  @ONBRD1225 @Smoke @Deposit @REG_ONBRD_1225_TC_0020
  Scenario: REG_ONBRD_1225_TC_0020
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName           |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 9 Month CD |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete commercial COD Verifications and Create account

  @ONBRD1225 @Smoke @Deposit @REG_ONBRD_1225_TC_0021
  Scenario: REG_ONBRD_1225_TC_0021
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName            |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 12 Month CD |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete commercial COD Verifications and Create account

  @ONBRD1225 @Smoke @Deposit @REG_ONBRD_1225_TC_0022
  Scenario: REG_ONBRD_1225_TC_0022
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName            |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 18 Month CD |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete commercial COD Verifications and Create account

  @ONBRD1225 @Smoke @Deposit @REG_ONBRD_1225_TC_0023
  Scenario: REG_ONBRD_1225_TC_0023
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName            |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 24 Month CD |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete commercial COD Verifications and Create account

  @ONBRD1225 @Smoke @Deposit @REG_ONBRD_1225_TC_0024
  Scenario: REG_ONBRD_1225_TC_0024
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName            |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 36 Month CD |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete commercial COD Verifications and Create account

  @ONBRD1225 @Smoke @Deposit @REG_ONBRD_1225_TC_0025
  Scenario: REG_ONBRD_1225_TC_0025
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName           |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 3 Month CD |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete commercial COD Verifications and Create account

  @ONBRD1225 @Smoke @Deposit @REG_ONBRD_1225_TC_0026
  Scenario: REG_ONBRD_1225_TC_0026
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName            |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 48 Month CD |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete commercial COD Verifications and Create account

  @ONBRD1225 @Smoke @Deposit @REG_ONBRD_1225_TC_0027
  Scenario: REG_ONBRD_1225_TC_0027
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName            |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 60 Month CD |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete commercial COD Verifications and Create account

  @ONBRD1225 @Smoke @Deposit @REG_ONBRD_1225_TC_0028
  Scenario: REG_ONBRD_1225_TC_0028
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName           |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 6 Month CD |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete commercial COD Verifications and Create account

  @ONBRD1225 @Smoke @Deposit @REG_ONBRD_1225_TC_0029
  Scenario: REG_ONBRD_1225_TC_0029
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                 |
      | Deposit     | Savings     | Consumer     | Consumer High Yield Savings |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete Verifications and Create account

  @ONBRD1225 @Smoke @Deposit @REG_ONBRD_1225_TC_0030
  Scenario: REG_ONBRD_1225_TC_0030
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName              |
      | Deposit     | Savings     | Consumer     | Consumer Premium Savings |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete Verifications and Create account

  @ONBRD1225 @Smoke @Deposit @REG_ONBRD_1225_TC_0031
  Scenario: REG_ONBRD_1225_TC_0031
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                 |
      | Deposit     | Savings     | Commercial   | Commercial Business Savings |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete commercial Savings Verifications and Create account

  @ONBRD1225 @Smoke @Loan @REG_ONBRD_1225_TC_0032
  Scenario: REG_ONBRD_1225_TC_0032
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       | CDLDrivingYears |
      | Loan        | Equipment   | Commercial   | Commercial Small Ticket Equipment |               2 |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And Complete the tasks generated for Small Ticket Loan

  @ONBRD1225 @Smoke @Loan @REG_ONBRD_1225_TC_0033
  Scenario: REG_ONBRD_1225_TC_0033
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       | CDLDrivingYears |
      | Loan        | Equipment   | Commercial   | Commercial Large Ticket Equipment |               2 |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    When user completes the task generated for Large Ticket Loan

  @ONBRD1225 @Smoke @Loan @REG_ONBRD_1225_TC_0034
  Scenario: REG_ONBRD_1225_TC_0034
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName    |
      | Loan        | ABL         | Commercial   | Commercial ABL |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    When user completes the task generated for ABL Loan

  @Deposit @REG_TC_0035
  Scenario: REG_TC_0035
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType          | CustomerType | ProductName                   |
      | Deposit     | Money Market Account | Consumer     | Consumer Money Market Account |
    And Fills the Details for the Joint Applicant
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete Joint Applicant Verifications and Create account

  @Deposit @REG_TC_0036
  Scenario: REG_TC_0036
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName          |
      | Deposit     | Checking    | Consumer     | Consumer Kasasa Cash |
    And Fills the Details for the Joint Applicant
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete Joint Applicant Verifications and Create account

  @Deposit @REG_TC_0037
  Scenario: REG_TC_0037
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName           |
      | Deposit     | Checking    | Consumer     | Consumer Kasasa Saver |
    And Fills the Details for the Joint Applicant
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete Joint Applicant Verifications and Create account

  @Deposit @REG_TC_0038
  Scenario: REG_TC_0038
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName           |
      | Deposit     | Checking    | Consumer     | Consumer 365 Checking |
    And Fills the Details for the Joint Applicant
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete Joint Applicant Verifications and Create account

  @Deposit @REG_TC_0039
  Scenario: REG_TC_0039
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                  |
      | Deposit     | Checking    | Consumer     | Consumer TAB Chrome Checking |
    And Fills the Details for the Joint Applicant
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete Joint Applicant Verifications and Create account

  @Deposit @REG_TC_0040
  Scenario: REG_TC_0040
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                  |
      | Deposit     | Checking    | Consumer     | Consumer High Yield Checking |
    And Fills the Details for the Joint Applicant
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete Joint Applicant Verifications and Create account

  @Deposit @REG_TC_0041
  Scenario: REG_TC_0041
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType          | CustomerType | ProductName             |
      | Deposit     | Money Market Account | Commercial   | Commercial Money Market |
    And Fills the Details for the Joint Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
      | Individual      |
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete commercial Verifications and Create account

  @Deposit @REG_TC_0042
  Scenario: REG_TC_0042
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                  |
      | Deposit     | Checking    | Commercial   | Commercial Business Checking |
    And Fills the Details for the Joint Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
      | Individual      |
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete commercial Verifications and Create account

  @Deposit @REG_TC_0043
  Scenario: REG_TC_0043
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                           |
      | Deposit     | Checking    | Commercial   | Commercial Analyzed Business Checking |
    And Fills the Details for the Joint Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
      | Individual      |
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete commercial Verifications and Create account

  @Deposit @REG_TC_0044
  Scenario: REG_TC_0044
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                           |
      | Deposit     | Checking    | Commercial   | Commercial Business Advantage Prepaid |
    And Fills the Details for the Joint Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
      | Individual      |
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete commercial Verifications and Create account

  @Deposit @REG_TC_0045
  Scenario: REG_TC_0045
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName          |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 12 Month CD |
    And Fills the Details for the Joint Applicant
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete consumer COD Verifications and Create account

  @Deposit @REG_TC_0046
  Scenario: REG_TC_0046
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName          |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 18 Month CD |
    And Fills the Details for the Joint Applicant
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete consumer COD Verifications and Create account

  @Deposit @REG_TC_0047
  Scenario: REG_TC_0047
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName          |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 24 Month CD |
    And Fills the Details for the Joint Applicant
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete consumer COD Verifications and Create account

  @Deposit @REG_TC_0048
  Scenario: REG_TC_0048
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName         |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 3 Month CD |
    And Fills the Details for the Joint Applicant
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete consumer COD Verifications and Create account

  @Deposit @REG_TC_0049
  Scenario: REG_TC_0049
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName          |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 36 Month CD |
    And Fills the Details for the Joint Applicant
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete consumer COD Verifications and Create account

  @Deposit @REG_TC_0050
  Scenario: REG_TC_0050
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName          |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 48 Month CD |
    And Fills the Details for the Joint Applicant
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete consumer COD Verifications and Create account

  @Deposit @REG_TC_0051  
  Scenario: REG_TC_0051
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName         |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 6 Month CD |
    And Fills the Details for the Joint Applicant
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete consumer COD Verifications and Create account

  @Deposit @REG_TC_0052
  Scenario: REG_TC_0052
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName          |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 60 Month CD |
    And Fills the Details for the Joint Applicant
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete consumer COD Verifications and Create account

  @Deposit @REG_TC_0053
  Scenario: REG_TC_0053
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName         |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 9 Month CD |
    And Fills the Details for the Joint Applicant
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete commercial COD Verifications and Create account

  @Deposit @REG_TC_0054
  Scenario: REG_TC_0054
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName           |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 9 Month CD |
    And Fills the Details for the Joint Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
      | Individual      |
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete commercial COD Verifications and Create account

  @Deposit @REG_TC_0055
  Scenario: REG_TC_0055
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName            |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 12 Month CD |
    And Fills the Details for the Joint Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
      | Individual      |
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete commercial COD Verifications and Create account

  @Deposit @REG_TC_0056
  Scenario: REG_TC_0056
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName            |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 18 Month CD |
    And Fills the Details for the Joint Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
      | Individual      |
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete commercial COD Verifications and Create account

  @Deposit @REG_TC_0057
  Scenario: REG_TC_0057
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName            |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 24 Month CD |
    And Fills the Details for the Joint Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
      | Individual      |
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete commercial COD Verifications and Create account

  @Deposit @REG_TC_0058
  Scenario: REG_TC_0058
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName            |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 36 Month CD |
    And Fills the Details for the Joint Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
      | Individual      |
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete commercial COD Verifications and Create account

  @Deposit @REG_TC_0059
  Scenario: REG_TC_0059
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName           |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 3 Month CD |
    And Fills the Details for the Joint Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
      | Individual      |
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete commercial COD Verifications and Create account

  @Deposit @REG_TC_0060
  Scenario: REG_TC_0060
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName            |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 48 Month CD |
    And Fills the Details for the Joint Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
      | Individual      |
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete commercial COD Verifications and Create account

  @Deposit @REG_TC_0061
  Scenario: REG_TC_0061
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName            |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 60 Month CD |
    And Fills the Details for the Joint Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
      | Individual      |
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete commercial COD Verifications and Create account

  @Deposit @REG_TC_0062
  Scenario: REG_TC_0062
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName           |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 6 Month CD |
    And Fills the Details for the Joint Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
      | Individual      |
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete commercial COD Verifications and Create account

  @Deposit @REG_TC_0063
  Scenario: REG_TC_0063
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                 |
      | Deposit     | Savings     | Consumer     | Consumer High Yield Savings |
    And Fills the Details for the Joint Applicant
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete Joint Applicant Verifications and Create account

  @Deposit @REG_TC_0064
  Scenario: REG_TC_0064
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName              |
      | Deposit     | Savings     | Consumer     | Consumer Premium Savings |
    And Fills the Details for the Joint Applicant
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete Joint Applicant Verifications and Create account

  @Deposit @REG_TC_0065
  Scenario: REG_TC_0065
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                 |
      | Deposit     | Savings     | Commercial   | Commercial Business Savings |
    And Fills the Details for the Joint Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
      | Individual      |
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete commercial Savings Verifications and Create account

  @Loan @REG_TC_0066
  Scenario: REG_TC_0066
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType   | CustomerType | ProductName              |
      | Loan        | Participation | Commercial   | Commercial Participation |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral  and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    When user completes the task generated for Participation Loan

  @Loan @REG_TC_0067
  Scenario: REG_TC_0067
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName           |
      | Loan        | Rediscount  | Commercial   | Commercial Rediscount |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral  and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    When user completes the task generated for Rediscount Loan

  @Loan @REG_TC_0068
  Scenario: REG_TC_0068
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       |
      | Loan        | Factoring   | Commercial   | Commercial Small Ticket Factoring |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral  and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    When user completes the task generated for Small Ticket Factoring Loan

  @Loan @REG_TC_0069
  Scenario: REG_TC_0069
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName           |
      | Loan        | Smart Loan  | Commercial   | Commercial SmartLoans |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When user adds Indiviudal Info Starts the Loan Process
    Then user completes the task generated for Smart Loan

  @Deposit @REG_TC_0070
  Scenario: REG_TC_0070
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType          | CustomerType | ProductName                   |
      | Deposit     | Money Market Account | Consumer     | Consumer Money Market Account |
    And Fills Individual Info and starts the process
    Then User should be Able to Decline the Application from HomePage

  @Deposit @REG_TC_0071
  Scenario: REG_TC_0071
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName          |
      | Deposit     | Checking    | Consumer     | Consumer Kasasa Cash |
    And Fills Individual Info and starts the process
    Then User should be Able to Decline the Application from HomePage

  @Deposit @REG_TC_0072
  Scenario: REG_TC_0072
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName          |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 12 Month CD |
    And Fills Individual Info and starts the process
    Then User should be Able to Decline the Application from HomePage

  @Deposit @REG_TC_0073
  Scenario: REG_TC_0073
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                 |
      | Deposit     | Savings     | Consumer     | Consumer High Yield Savings |
    And Fills Individual Info and starts the process
    Then User should be Able to Decline the Application from HomePage

  @Deposit @REG_TC_0074
  Scenario: REG_TC_0074
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType          | CustomerType | ProductName                   |
      | Deposit     | Money Market Account | Consumer     | Consumer Money Market Account |
    And Fills Individual Info and starts the process
    Then User should be Able to WithDraw the Application from HomePage

  @Deposit @REG_TC_0075
  Scenario: REG_TC_0075
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName          |
      | Deposit     | Checking    | Consumer     | Consumer Kasasa Cash |
    And Fills Individual Info and starts the process
    Then User should be Able to WithDraw the Application from HomePage

  @Deposit @REG_TC_0076
  Scenario: REG_TC_0076
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName          |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 12 Month CD |
    And Fills Individual Info and starts the process
    Then User should be Able to WithDraw the Application from HomePage

  @Deposit @REG_TC_0077
  Scenario: REG_TC_0077
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                 |
      | Deposit     | Savings     | Consumer     | Consumer High Yield Savings |
    And Fills Individual Info and starts the process
    Then User should be Able to WithDraw the Application from HomePage

  @Deposit @REG_TC_0078 @BUG @ONBRD-1900
  Scenario: REG_TC_0078
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType          | CustomerType | ProductName                   |
      | Deposit     | Money Market Account | Consumer     | Consumer Money Market Account |
    And Fills Individual Info and starts the process
    Then User should be Able to Decline the Application from HomePage
    When user Starts process for Declined Application from HomePage
    Then User should be able to complete the Deposit tasks

  @Deposit @REG_TC_0079 @BUG @ONBRD-1900
  Scenario: REG_TC_0079
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName          |
      | Deposit     | Checking    | Consumer     | Consumer Kasasa Cash |
    And Fills Individual Info and starts the process
    Then User should be Able to Decline the Application from HomePage
    When user Starts process for Declined Application from HomePage
    Then User should be able to complete the Deposit tasks

  @Deposit @REG_TC_0080 @BUG @ONBRD-1900
  Scenario: REG_TC_0080
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName          |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 12 Month CD |
    And Fills Individual Info and starts the process
    Then User should be Able to Decline the Application from HomePage
    When user Starts process for Declined Application from HomePage
    Then User should be able to complete the Deposit tasks

  @Deposit @REG_TC_0081 @BUG @ONBRD-1900
  Scenario: REG_TC_0081
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                 |
      | Deposit     | Savings     | Consumer     | Consumer High Yield Savings |
    And Fills Individual Info and starts the process
    Then User should be Able to Decline the Application from HomePage
    When user Starts process for Declined Application from HomePage
    Then User should be able to complete the Deposit tasks

  @Deposit @REG_TC_0082
  Scenario: REG_TC_0082
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                 |
      | Deposit     | Savings     | Consumer     | Consumer High Yield Savings |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Complete Verifications and Create account

  @Loan @REG_TC_0083
  Scenario: REG_TC_0083
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       | CDLDrivingYears |
      | Loan        | Equipment   | Commercial   | Commercial Small Ticket Equipment |               2 |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    When User navigates to Applications homepage
    Then User should be Able to WithDraw the Loan Application from HomePage

  @Loan @REG_TC_0084
  Scenario: REG_TC_0084
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName           |
      | Loan        | Smart Loan  | Commercial   | Commercial SmartLoans |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When user adds Indiviudal Info Starts the Loan Process
    And User navigates to Applications homepage
    Then User should be Able to WithDraw the Loan Application from HomePage

  @Loan @REG_TC_0085
  Scenario: REG_TC_0085
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       |
      | Loan        | Factoring   | Commercial   | Commercial Small Ticket Factoring |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral  and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    When User navigates to Applications homepage
    Then User should be Able to WithDraw the Loan Application from HomePage

  @Loan @REG_TC_0086
  Scenario: REG_TC_0086
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName    |
      | Loan        | ABL         | Commercial   | Commercial ABL |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    When User navigates to Applications homepage
    Then User should be Able to WithDraw the Loan Application from HomePage

  @Loan @REG_TC_0087
  Scenario: REG_TC_0087
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       | CDLDrivingYears |
      | Loan        | Equipment   | Commercial   | Commercial Small Ticket Equipment |               2 |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    When User Declines the Loan Application from HomePage
    Then User should be able to get the Decline Review task generated for Small Ticket Loan

  @Loan @REG_TC_0088
  Scenario: REG_TC_0088
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       | CDLDrivingYears |
      | Loan        | Equipment   | Commercial   | Commercial Small Ticket Equipment |               2 |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    When User puts the Compile Credit Summary task in Hold State
    Then the State of Compile Credit Summary task should be in Hold

  @Loan @REG_TC_0089
  Scenario: REG_TC_0089
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       | CDLDrivingYears |
      | Loan        | Equipment   | Commercial   | Commercial Small Ticket Equipment |               2 |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And Complete compile Credit Summary task for the Small Ticket Equipment Loan

  @Loan @REG_TC_0090 
  Scenario: REG_TC_0090
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       | CDLDrivingYears |
      | Loan        | Equipment   | Commercial   | Commercial Small Ticket Equipment |               2 |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And User should be able to Generate letter for the Equipment Loan product

  @Loan @REG_TC_0091
  Scenario: REG_TC_0091
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       | CDLDrivingYears |
      | Loan        | Equipment   | Commercial   | Commercial Small Ticket Equipment |               2 |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And User should be able to Put the Generate letter Task On Hold for the Equipment Loan product

  @Loan @REG_TC_0092
  Scenario: REG_TC_0092
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       | CDLDrivingYears |
      | Loan        | Equipment   | Commercial   | Commercial Small Ticket Equipment |               2 |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    When User tries to Complete Generate Leter task without Generating Letters
    Then Error message Should be Displayed

  @Loan @REG_TC_0093
  Scenario: REG_TC_0093
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       | CDLDrivingYears |
      | Loan        | Equipment   | Commercial   | Commercial Large Ticket Equipment |               2 |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And Validate Generate Button Function in Legal documents Task for Large Ticket Loan

  @Loan @REG_TC_0094
  Scenario: REG_TC_0094
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       | CDLDrivingYears |
      | Loan        | Equipment   | Commercial   | Commercial Large Ticket Equipment |               2 |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And User should be able to put SME Funding Task on Hold for Large Ticket Loan

  @Loan @REG_TC_0095
  Scenario: REG_TC_0095
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       |
      | Loan        | Factoring   | Commercial   | Commercial Large Ticket Factoring |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral  and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And user completes the task generated for Large Ticket Factoring Loan

  @Loan @REG_TC_0096
  Scenario: REG_TC_0096
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       |
      | Loan        | Factoring   | Commercial   | Commercial Large Ticket Factoring |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral  and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And user should be able to complete Check In Loan Package task for Large Ticket Factoring Loan

  @Loan @REG_TC_0097
  Scenario: REG_TC_0097
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       |
      | Loan        | Factoring   | Commercial   | Commercial Large Ticket Factoring |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral  and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And user should be able to complete AR Verification task for Large Ticket Factoring Loan

  @Loan @REG_TC_0098 
  Scenario: REG_TC_0098
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       |
      | Loan        | Factoring   | Commercial   | Commercial Small Ticket Factoring |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral  and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And user should be able to put On Hold Debtor Credit Review task for Small Ticket Factoring Loan

  @Loan @REG_TC_0099
  Scenario: REG_TC_0099
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       |
      | Loan        | Factoring   | Commercial   | Commercial Small Ticket Factoring |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral  and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And user should be able to Validate Request Providers Functionlaity in Scoring task for Small Ticket Factoring Loan

  @Loan @REG_TC_0100 
  Scenario: REG_TC_0100
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       |
      | Loan        | Factoring   | Commercial   | Commercial Small Ticket Factoring |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral  and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And user should be able to Decline  Scoring task for Small Ticket Factoring Loan

  @Loan @REG_TC_0101
  Scenario: REG_TC_0101
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       |
      | Loan        | Factoring   | Commercial   | Commercial Large Ticket Factoring |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral  and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And user should be able to complete Loan Setup task for Large Ticket Factoring Loan

  @Loan @REG_TC_0102
  Scenario: REG_TC_0102
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       |
      | Loan        | Factoring   | Commercial   | Commercial Small Ticket Factoring |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral  and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And user should be able to Complete PreFunding Legal Review  task for Small Ticket Factoring Loan

  @Loan @REG_TC_0103
  Scenario: REG_TC_0103
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName    |
      | Loan        | ABL         | Commercial   | Commercial ABL |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And user Should be able to put On Hold Assign Underwriter task generated for ABL Loan

  @Loan @REG_TC_0104
  Scenario: REG_TC_0104
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName    |
      | Loan        | ABL         | Commercial   | Commercial ABL |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And user Should be able to put Check in Loan Package task generated on hold for ABL Loan

  @Loan @REG_TC_0105
  Scenario: REG_TC_0105
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName    |
      | Loan        | ABL         | Commercial   | Commercial ABL |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And user should be able to Validate Request Providers Functionlaity in Scoring task for ABL Loan

  @Loan @REG_TC_0106
  Scenario: REG_TC_0106
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName    |
      | Loan        | ABL         | Commercial   | Commercial ABL |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And user Should be able to put On Hold BackGround Searches UCC Filings task generated for ABL Loan

  @Loan @REG_TC_0107
  Scenario: REG_TC_0107
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName    |
      | Loan        | ABL         | Commercial   | Commercial ABL |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And user Should be able to put On Hold 8821 and Tax Guard Report task generated for ABL Loan

  @Loan @REG_TC_0108
  Scenario: REG_TC_0108
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName    |
      | Loan        | ABL         | Commercial   | Commercial ABL |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And user Should be able to Decline Approve task generated for ABL Loan

  @Loan @REG_TC_0109
  Scenario: REG_TC_0109
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       | CDLDrivingYears |
      | Loan        | Equipment   | Commercial   | Commercial Small Ticket Equipment |               2 |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    When User Declines the Loan Application from HomePage
    Then User should be able to get the Decline Review task generated for ABL Loan

  @Loan @REG_TC_0110
  Scenario: REG_TC_0110
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName           |
      | Loan        | Smart Loan  | Commercial   | Commercial SmartLoans |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    When user adds Indiviudal Info Starts the Loan Process
    And User Declines the Loan Application from HomePage
    Then User should be able to get the Decline Review task generated for Smart Loan

  @Deposit @REG_TC_0111 @BUG
  Scenario: REG_TC_0111
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                  |
      | Deposit     | Checking    | Commercial   | Commercial Business Checking |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then User should be Able to Decline the Application from HomePage
    When user Starts process for Declined Application from HomePage
    Then User should be able to Complete commercial Verifications and Create account

  @Deposit @REG_TC_0112 @BUG
  Scenario: REG_TC_0112
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType          | CustomerType | ProductName             |
      | Deposit     | Money Market Account | Commercial   | Commercial Money Market |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then User should be Able to Decline the Application from HomePage
    When user Starts process for Declined Application from HomePage
    Then User should be able to Complete commercial Verifications and Create account

  @Deposit @REG_TC_0113 @BUG
  Scenario: REG_TC_0113
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName           |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 9 Month CD |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then User should be Able to Decline the Application from HomePage
    When user Starts process for Declined Application from HomePage
    Then User should be able to Complete commercial COD Verifications and Create account

  @Deposit @REG_TC_0114 @BUG
  Scenario: REG_TC_0114
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                 |
      | Deposit     | Savings     | Commercial   | Commercial Business Savings |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then User should be Able to Decline the Application from HomePage
    When user Starts process for Declined Application from HomePage
    Then User should be able to Complete commercial Savings Verifications and Create account

  @Deposit @REG_TC_0115
  Scenario: REG_TC_0115
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType          | CustomerType | ProductName                   |
      | Deposit     | Money Market Account | Consumer     | Consumer Money Market Account |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to able to Decline Approve Precise ID Task for Consumer Money market Product

  @Deposit @REG_TC_0116
  Scenario: REG_TC_0116
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType          | CustomerType | ProductName                   |
      | Deposit     | Money Market Account | Consumer     | Consumer Money Market Account |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to able to Put on Hold Approve Precise ID Task for Consumer Money market Product

  @Deposit @REG_TC_0117
  Scenario: REG_TC_0117
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType          | CustomerType | ProductName                   |
      | Deposit     | Money Market Account | Consumer     | Consumer Money Market Account |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to able to Put on Hold Application Verification Task for Consumer Money market Product

  @Deposit @REG_TC_0118
  Scenario: REG_TC_0118
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType          | CustomerType | ProductName             |
      | Deposit     | Money Market Account | Commercial   | Commercial Money Market |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to able to Put on Hold Application Verification Task for Commercial Money Market Product

  @Deposit @REG_TC_0119
  Scenario: REG_TC_0119
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType          | CustomerType | ProductName             |
      | Deposit     | Money Market Account | Commercial   | Commercial Money Market |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to able to Decline Decision Task for Commercial Money Market Product

  @Deposit @REG_TC_0120
  Scenario: REG_TC_0120
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName           |
      | Deposit     | Checking    | Consumer     | Consumer 365 Checking |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to able to Decline Approve Precise ID Task for Consumer 365 Checking Product

  @Deposit @REG_TC_0121
  Scenario: REG_TC_0121
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                  |
      | Deposit     | Checking    | Consumer     | Consumer TAB Chrome Checking |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to able to Decline Approve Precise ID Task for Consumer TAB Chrome Checking Product

  @Deposit @REG_TC_0122
  Scenario: REG_TC_0122
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                  |
      | Deposit     | Checking    | Consumer     | Consumer High Yield Checking |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to able to Decline Approve Precise ID Task for Consumer High Yield Checking Product

  @Deposit @REG_TC_0123
  Scenario: REG_TC_0123
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName           |
      | Deposit     | Checking    | Consumer     | Consumer Kasasa Saver |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to able to Decline Approve Precise ID Task for Consumer Kasasa Saver Checking Product

  @Deposit @REG_TC_0124
  Scenario: REG_TC_0124
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName          |
      | Deposit     | Checking    | Consumer     | Consumer Kasasa Cash |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to able to Decline Approve Precise ID Task for Consumer Kasasa Cash Product

  @Deposit @REG_TC_0125
  Scenario: REG_TC_0125
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                  |
      | Deposit     | Checking    | Commercial   | Commercial Business Checking |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Decline Decision task for Commercial Business Checking

  @Deposit @REG_TC_0126
  Scenario: REG_TC_0126
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                  |
      | Deposit     | Checking    | Commercial   | Commercial Business Checking |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Put On hold Decision task for Commercial Business Checking

  @Deposit @REG_TC_0127
  Scenario: REG_TC_0127
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                  |
      | Deposit     | Checking    | Commercial   | Commercial Business Checking |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    When User Puts Decision task on Manager Review for Commercial Business Checking
    Then Manager Review Task should be generated and user should be able to complete it

  @Deposit @REG_TC_0128
  Scenario: REG_TC_0128
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                           |
      | Deposit     | Checking    | Commercial   | Commercial Business Advantage Prepaid |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Decline Decision task for Commercial Business Advantage Prepaid

  @Deposit @REG_TC_0129
  Scenario: REG_TC_0129
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                           |
      | Deposit     | Checking    | Commercial   | Commercial Business Advantage Prepaid |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    When User Puts Decision task on Manager Review for Commercial Business Advantage Prepaid
    Then Manager Review Task should be generated and user should be able to complete it

  @Deposit @REG_TC_0130
  Scenario: REG_TC_0130
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName         |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 3 Month CD |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Decline Decision task for Consumer_3 Month CD

  @Deposit @REG_TC_0131
  Scenario: REG_TC_0131
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName          |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 12 Month CD |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Decline Decision task for Consumer_12 Month CD

  @Deposit @REG_TC_0132
  Scenario: REG_TC_0132
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName          |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 18 Month CD |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Decline Decision task for Consumer_18 Month CD

  @Deposit @REG_TC_0133
  Scenario: REG_TC_0133
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName          |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 24 Month CD |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Decline Decision task for Consumer_24 Month CD

  @Deposit @REG_TC_0134
  Scenario: REG_TC_0134
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName          |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 36 Month CD |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Decline Decision task for Consumer_36 Month CD

  @Deposit @REG_TC_0135 
  Scenario: REG_TC_0135
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName          |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 36 Month CD |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    When User Puts Decision task on Manager Review for Consumer_36 Month CD
    Then Manager Review Task should be generated and user should be able to complete it

  @Deposit @REG_TC_0136
  Scenario: REG_TC_0136
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName         |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 3 Month CD |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    When User Puts Decision task on Manager Review for Consumer_3 Month CD
    Then Manager Review Task should be generated and user should be able to complete it

  @Deposit @REG_TC_0137
  Scenario: REG_TC_0137
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName          |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 12 Month CD |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    When User Puts Decision task on Manager Review for Consumer_12 Month CD
    Then Manager Review Task should be generated and user should be able to complete it

  @Deposit @REG_TC_0138
  Scenario: REG_TC_0138
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName          |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 18 Month CD |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    When User Puts Decision task on Manager Review for Consumer_18 Month CD
    Then Manager Review Task should be generated and user should be able to complete it

  @Deposit @REG_TC_0139
  Scenario: REG_TC_0139
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName          |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 24 Month CD |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    When User Puts Decision task on Manager Review for Consumer_24 Month CD
    Then Manager Review Task should be generated and user should be able to complete it

  @Deposit @REG_TC_0140
  Scenario: REG_TC_0140
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                 |
      | Deposit     | Savings     | Commercial   | Commercial Business Savings |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Decline Decision task for Commercial Business Savings

  @Deposit @REG_TC_0141
  Scenario: REG_TC_0141
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                 |
      | Deposit     | Savings     | Commercial   | Commercial Business Savings |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    When User Puts Decision task on Manager Review for Commercial Business Savings
    Then Manager Review Task should be generated and user should be able to complete it

  @Loan @REG_TC_0142
  Scenario: REG_TC_0142
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       |
      | Loan        | Factoring   | Commercial   | Commercial Small Ticket Factoring |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral  and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And user should be able to decline Approve One task for Small Ticket Factoring Loan

  @Loan @REG_TC_0143
  Scenario: REG_TC_0143
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       |
      | Loan        | Factoring   | Commercial   | Commercial Large Ticket Factoring |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral  and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And user should be able to decline Scoring task for Large Ticket Factoring Loan

  @Loan @REG_TC_0144
  Scenario: REG_TC_0144
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       |
      | Loan        | Factoring   | Commercial   | Commercial Large Ticket Factoring |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral  and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And user should be able to Deny Approve task for Large Ticket Factoring Loan

  @Loan @REG_TC_0145
  Scenario: REG_TC_0145
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName           |
      | Loan        | Smart Loan  | Commercial   | Commercial SmartLoans |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When user adds Indiviudal and CoBorrower Info Starts the Loan Process
    Then user completes the task generated for Smart Loan

  @Loan @REG_TC_0146
  Scenario: REG_TC_0146
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       |
      | Loan        | Factoring   | Commercial   | Commercial Large Ticket Factoring |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,Individual,CoBorrower,collateral
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And user completes the task generated for Large Ticket Factoring Loan

  @Loan @REG_TC_0147
  Scenario: REG_TC_0147
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       |
      | Loan        | Factoring   | Commercial   | Commercial Small Ticket Factoring |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,Individual,CoBorrower,collateral
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And user completes the task generated for Small Ticket Factoring Loan

  @Loan @REG_TC_0148
  Scenario: REG_TC_0148
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName    |
      | Loan        | ABL         | Commercial   | Commercial ABL |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,CoBorrower,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    When user completes the task generated for ABL Loan

  @Deposit @REG_TC_0149
  Scenario: REG_TC_0149
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType          | CustomerType | ProductName                   |
      | Deposit     | Money Market Account | Consumer     | Consumer Money Market Account |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    When User Resubmits Precise ID Request for Applicant in Approve  Verification Task
    Then User should be able to reanswer KIQ question and complete the Task

  #@Deposit @REG_TC_0150 Functionality Removed
  #Scenario: REG_TC_0150
  #  Given User is Starting to create a Product
  # When user creates a Deposit product with specfications and Clicks create
  #  | ProductLine | ProductType | CustomerType | ProductName                  |
  #  | Deposit     | Checking    | Consumer     | Consumer High Yield Checking |
  # And Fills the Details for the Individual Information
  # Then Product should be added in OnBoarding results Table
  # And User should be able to Reopen Applicant Accounts Create Task for consumer High yield Savings product
  #@Deposit @REG_TC_0151 @TT   Functionality Removed
  #Scenario: REG_TC_0151
  #  Given User is Starting to create a Product
  #  When user creates a Deposit product with specfications and Clicks create
  #   | ProductLine | ProductType | CustomerType | ProductName              |
  #  | Deposit     | Savings     | Consumer     | Consumer Premium Savings |
  # And Fills the Details for the Individual Information
  #Then Product should be added in OnBoarding results Table
  # And User should be able to Reopen Applicant Accounts Create Task for Consumer Premium Savings product
  
  @Deposit @REG_TC_0152
  Scenario: REG_TC_0152
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType          | CustomerType | ProductName                   |
      | Deposit     | Money Market Account | Consumer     | Consumer Money Market Account |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    When User Application Verification Task and Starts Approve Verification task
    Then User should be able to deny Approve Verification task and change Request Task Should be Generated

  @Deposit @REG_TC_0153
  Scenario: REG_TC_0153
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType          | CustomerType | ProductName                   |
      | Deposit     | Money Market Account | Consumer     | Consumer Money Market Account |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    When User Application Verification Task and Starts Approve Verification task
    Then User should be able to Put On hold Approve Verification task and change Request Task Should be Generated

  @Deposit @REG_TC_0154
  Scenario: REG_TC_0154
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType          | CustomerType | ProductName             |
      | Deposit     | Money Market Account | Commercial   | Commercial Money Market |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to  Put on Hold Decision task for Commercial Money Market Product

  @Deposit @REG_TC_0155
  Scenario: REG_TC_0155
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType          | CustomerType | ProductName             |
      | Deposit     | Money Market Account | Commercial   | Commercial Money Market |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    When User Puts Decision task on Manager Review for Commercial Money Market
    Then Manager Review Task should be generated and user should be able to complete it

  @Deposit @REG_TC_0156
  Scenario: REG_TC_0156
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType          | CustomerType | ProductName             |
      | Deposit     | Money Market Account | Commercial   | Commercial Money Market |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to  Put on Hold Customer Verification QA task for Commercial Money Market Product

  @Deposit @REG_TC_0157
  Scenario: REG_TC_0157
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                  |
      | Deposit     | Checking    | Commercial   | Commercial Business Checking |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to  Put on Hold Application Verification task for Commercial Business Checking

  @Deposit @REG_TC_0158
  Scenario: REG_TC_0158
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                  |
      | Deposit     | Checking    | Commercial   | Commercial Business Checking |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Put on Hold Customer Verification QA task for Commercial Business Checking

  @Deposit @REG_TC_0159
  Scenario: REG_TC_0159
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                  |
      | Deposit     | Checking    | Commercial   | Commercial Business Checking |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Put on Hold CIF Account Creation task for Commercial Business Checking

  @Deposit @REG_TC_0160
  Scenario: REG_TC_0160
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                  |
      | Deposit     | Checking    | Commercial   | Commercial Business Checking |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Put on Hold Send Welcome Email task for Commercial Business Checking

  @Deposit @REG_TC_0161
  Scenario: REG_TC_0161
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                           |
      | Deposit     | Checking    | Commercial   | Commercial Business Advantage Prepaid |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Put on Hold Application Verification task for Commercial Business Advantage Prepaid

  @Deposit @REG_TC_0162
  Scenario: REG_TC_0162
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                           |
      | Deposit     | Checking    | Commercial   | Commercial Business Advantage Prepaid |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Put on Customer Verification QA task for Commercial Business Advantage Prepaid

  @Deposit @REG_TC_0163
  Scenario: REG_TC_0163
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                           |
      | Deposit     | Checking    | Commercial   | Commercial Business Advantage Prepaid |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Put on Decison task for Commercial Business Advantage Prepaid

  @Deposit @REG_TC_0164
  Scenario: REG_TC_0164
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                           |
      | Deposit     | Checking    | Commercial   | Commercial Business Advantage Prepaid |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Put on Hold CIF Account Creation task for Commercial Business Advantage Prepaid

  @Deposit @REG_TC_0165
  Scenario: REG_TC_0165
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                           |
      | Deposit     | Checking    | Commercial   | Commercial Business Advantage Prepaid |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Put on Hold Send Welcome Email task for Commercial Business Advantage Prepaid

  @Deposit @REG_TC_0166
  Scenario: REG_TC_0166
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName          |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 48 Month CD |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Decline Decision task for Consumer_48 Month CD

  @Deposit @REG_TC_0167
  Scenario: REG_TC_0167
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName         |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 6 Month CD |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Decline Decision task for Consumer_6 Month CD

  @Deposit @REG_TC_0168
  Scenario: REG_TC_0168
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName          |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 60 Month CD |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Decline Decision task for Consumer_60 Month CD

  @Deposit @REG_TC_0169
  Scenario: REG_TC_0169
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName         |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 9 Month CD |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Decline Decision task for Consumer_9 Month CD

  @Deposit @REG_TC_0170
  Scenario: REG_TC_0170
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName          |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 48 Month CD |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    When User Puts Decision task on Manager Review for Consumer_48 Month CD
    Then Manager Review Task should be generated and user should be able to complete it

  @Deposit @REG_TC_0171
  Scenario: REG_TC_0171
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName         |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 6 Month CD |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    When User Puts Decision task on Manager Review for Consumer_6 Month CD
    Then Manager Review Task should be generated and user should be able to complete it

  @Deposit @REG_TC_0172
  Scenario: REG_TC_0172
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName          |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 60 Month CD |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    When User Puts Decision task on Manager Review for Consumer_60 Month CD
    Then Manager Review Task should be generated and user should be able to complete it

  @Deposit @REG_TC_0173
  Scenario: REG_TC_0173
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName         |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 9 Month CD |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    When User Puts Decision task on Manager Review for Consumer_9 Month CD
    Then Manager Review Task should be generated and user should be able to complete it

  @Deposit @REG_TC_0174
  Scenario: REG_TC_0174
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName           |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 9 Month CD |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Decline Decision task for Commercial_9 Month CD

  @Deposit @REG_TC_0175
  Scenario: REG_TC_0175
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName            |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 12 Month CD |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Decline Decision task for Commercial_12 Month CD

  @Deposit @REG_TC_0176
  Scenario: REG_TC_0176
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName            |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 18 Month CD |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Decline Decision task for Commercial_18 Month CD

  @Deposit @REG_TC_0177
  Scenario: REG_TC_0177
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName            |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 24 Month CD |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Decline Decision task for Commercial_24 Month CD

  @Deposit @REG_TC_0178
  Scenario: REG_TC_0178
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName            |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 36 Month CD |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Decline Decision task for Commercial_36 Month CD

  @Deposit @REG_TC_0179
  Scenario: REG_TC_0179
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName           |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 3 Month CD |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Decline Decision task for Commercial_3 Month CD

  @Deposit @REG_TC_0180
  Scenario: REG_TC_0180
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName            |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 48 Month CD |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Decline Decision task for Commercial_48 Month CD

  @Deposit @REG_TC_0181
  Scenario: REG_TC_0181
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName            |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 60 Month CD |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Decline Decision task for Commercial_60 Month CD

  @Deposit @REG_TC_0182
  Scenario: REG_TC_0182
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName           |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 6 Month CD |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Decline Decision task for Commercial_6 Month CD

  @Deposit @REG_TC_0183
  Scenario: REG_TC_0183
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName           |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 9 Month CD |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    When User Puts Decision task on Manager Review for Commercial_9 Month CD
    Then Manager Review Task should be generated and user should be able to complete it

  @Deposit @REG_TC_0184
  Scenario: REG_TC_0184
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName            |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 12 Month CD |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    When User Puts Decision task on Manager Review for Commercial_12 Month CD
    Then Manager Review Task should be generated and user should be able to complete it

  @Deposit @REG_TC_0185
  Scenario: REG_TC_0185
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName            |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 18 Month CD |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    When User Puts Decision task on Manager Review for Commercial_18 Month CD
    Then Manager Review Task should be generated and user should be able to complete it

  @Deposit @REG_TC_0186  
  Scenario: REG_TC_0186
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName            |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 24 Month CD |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    When User Puts Decision task on Manager Review for Commercial_24 Month CD
    Then Manager Review Task should be generated and user should be able to complete it

  @Deposit @REG_TC_0187
  Scenario: REG_TC_0187
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName            |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 36 Month CD |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    When User Puts Decision task on Manager Review for Commercial_36 Month CD
    Then Manager Review Task should be generated and user should be able to complete it

  @Deposit @REG_TC_0188
  Scenario: REG_TC_0188
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName           |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 3 Month CD |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    When User Puts Decision task on Manager Review for Commercial_3 Month CD
    Then Manager Review Task should be generated and user should be able to complete it

  @Deposit @REG_TC_0189
  Scenario: REG_TC_0189
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName            |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 48 Month CD |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    When User Puts Decision task on Manager Review for Commercial_48 Month CD
    Then Manager Review Task should be generated and user should be able to complete it

  @Deposit @REG_TC_0190
  Scenario: REG_TC_0190
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName            |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 48 Month CD |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    When User Puts Decision task on Manager Review for Commercial_48 Month CD
    Then Manager Review Task should be generated and user should be able to complete it

  @Deposit @REG_TC_0191
  Scenario: REG_TC_0191
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName            |
      | Deposit     | Certificate of Deposit | Commercial   | Commercial 60 Month CD |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    When User Puts Decision task on Manager Review for Commercial_60 Month CD
    Then Manager Review Task should be generated and user should be able to complete it

  @Loan @REG_TC_0192
  Scenario: REG_TC_0192
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       | CDLDrivingYears |
      | Loan        | Equipment   | Commercial   | Commercial Small Ticket Equipment |               2 |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And User should be able to decline SME Approval task for Small Ticket Loan

  @Loan @REG_TC_0193
  Scenario: REG_TC_0193
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       | CDLDrivingYears |
      | Loan        | Equipment   | Commercial   | Commercial Large Ticket Equipment |               2 |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    When user should be able to decline Scoring task for Large Ticket Loan

  @Loan @REG_TC_0194
  Scenario: REG_TC_0194
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       | CDLDrivingYears |
      | Loan        | Equipment   | Commercial   | Commercial Large Ticket Equipment |               2 |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    When user should be able to decline Approve task for Large Ticket Loan

  @Deposit @REG_TC_0195
  Scenario: REG_TC_0195
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName           |
      | Deposit     | Checking    | Consumer     | Consumer 365 Checking |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Deny Approve Verification task for Consumer 365 Checking Product

  @Deposit @REG_TC_0196
  Scenario: REG_TC_0196
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName           |
      | Deposit     | Checking    | Consumer     | Consumer 365 Checking |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Put On Hold Approve Verification task for Consumer 365 Checking Product

  @Deposit @REG_TC_0197
  Scenario: REG_TC_0197
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName           |
      | Deposit     | Checking    | Consumer     | Consumer 365 Checking |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Put On Hold DOA Welcome EMail task for Consumer 365 Checking Product

  @Deposit @REG_TC_0198
  Scenario: REG_TC_0198
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName           |
      | Deposit     | Checking    | Consumer     | Consumer 365 Checking |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Put On Hold Application Verification task for Consumer 365 Checking Product

  @Deposit @REG_TC_0199
  Scenario: REG_TC_0199
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                  |
      | Deposit     | Checking    | Consumer     | Consumer TAB Chrome Checking |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Deny Approve Verification task for Consumer TAB Chrome Checking

  @Deposit @REG_TC_0200
  Scenario: REG_TC_0200
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                  |
      | Deposit     | Checking    | Consumer     | Consumer TAB Chrome Checking |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Put on Hold Approve Verification task for Consumer TAB Chrome Checking Product

  @Deposit @REG_TC_0201
  Scenario: REG_TC_0201
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                  |
      | Deposit     | Checking    | Consumer     | Consumer TAB Chrome Checking |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Put On Hold Application Verification task for Consumer TAB Chrome Checking Product

  @Deposit @REG_TC_0202
  Scenario: REG_TC_0202
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                  |
      | Deposit     | Checking    | Consumer     | Consumer High Yield Checking |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Put On Hold Application Verification task for Consumer High Yield Checking Product

  @Deposit @REG_TC_0203
  Scenario: REG_TC_0203
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                  |
      | Deposit     | Checking    | Consumer     | Consumer High Yield Checking |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Put On Hold Approve Verification task for Consumer High Yield Checking Product

  @Deposit @REG_TC_0204
  Scenario: REG_TC_0204
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName          |
      | Deposit     | Checking    | Consumer     | Consumer Kasasa Cash |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Deny Approve Verification task for Consumer Kasasa Cash

  @Deposit @REG_TC_0205
  Scenario: REG_TC_0205
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName          |
      | Deposit     | Checking    | Consumer     | Consumer Kasasa Cash |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Put on Hold Approve Verification task for Consumer Kasasa Cash

  @Deposit @REG_TC_0206
  Scenario: REG_TC_0206
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName          |
      | Deposit     | Checking    | Consumer     | Consumer Kasasa Cash |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Put On Hold Application Verification task for Consumer Kasasa Cash Product

  @Deposit @REG_TC_0207
  Scenario: REG_TC_0207
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName           |
      | Deposit     | Checking    | Consumer     | Consumer Kasasa Saver |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Deny Approve Verification task for Consumer Kasasa Saver Product

  @Deposit @REG_TC_0208
  Scenario: REG_TC_0208
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName           |
      | Deposit     | Checking    | Consumer     | Consumer Kasasa Saver |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Put On Hold Approve Verification task for Consumer Kasasa Saver Product

  @Deposit @REG_TC_0209
  Scenario: REG_TC_0209
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName           |
      | Deposit     | Checking    | Consumer     | Consumer Kasasa Saver |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Put On Hold Application Verification task for Consumer Kasasa Saver Product

  @Deposit @REG_TC_0210
  Scenario: REG_TC_0210
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType          | CustomerType | ProductName             |
      | Deposit     | Money Market Account | Commercial   | Commercial Money Market |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to put on Hold CIF Account Creations task for Commercial Money Market

  @Deposit @REG_TC_0211
  Scenario: REG_TC_0211
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType          | CustomerType | ProductName             |
      | Deposit     | Money Market Account | Commercial   | Commercial Money Market |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to put on Hold Send Welcome EMail task for Commercial Money Market

  @Deposit @REG_TC_0212
  Scenario: REG_TC_0212
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                  |
      | Deposit     | Checking    | Consumer     | Consumer High Yield Checking |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Deny Approve Verification task for Consumer High Yield Checking Product

  @Deposit @REG_TC_0213
  Scenario: REG_TC_0213
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                           |
      | Deposit     | Checking    | Commercial   | Commercial Business Advantage Prepaid |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to put on Hold Decision task for Commercial Business Advantage Prepaid

  @Deposit @REG_TC_0214
  Scenario: REG_TC_0214
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                 |
      | Deposit     | Savings     | Consumer     | Consumer High Yield Savings |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Decline Approve Verification task for Consumer High Yield Savings Product

  @Deposit @REG_TC_0215
  Scenario: REG_TC_0215
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                 |
      | Deposit     | Savings     | Consumer     | Consumer High Yield Savings |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Deny Approve Verification task for Consumer High Yield Savings Product

  @Deposit @REG_TC_0216
  Scenario: REG_TC_0216
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName              |
      | Deposit     | Savings     | Consumer     | Consumer Premium Savings |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Decline Approve Verification task for Consumer Premium Savings Product

  @Deposit @REG_TC_0217
  Scenario: REG_TC_0217
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName              |
      | Deposit     | Savings     | Consumer     | Consumer Premium Savings |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Deny Approve Verification task for Consumer Premium Savings Product

  @Deposit @REG_TC_0218
  Scenario: REG_TC_0218
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName              |
      | Deposit     | Savings     | Consumer     | Consumer Premium Savings |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Deny Approve Verification task for Consumer Premium Savings Product

  @REG_TC_0219 @Loan
  Scenario: REG_TC_0219
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       | CDLDrivingYears |
      | Loan        | Equipment   | Commercial   | Commercial Large Ticket Equipment |               2 |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And User should be able to Decline Approve task for Commercial Large Ticket Equipment Loan

  @REG_TC_0220 @Loan
  Scenario: REG_TC_0220
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       | CDLDrivingYears |
      | Loan        | Equipment   | Commercial   | Commercial Large Ticket Equipment |               2 |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And User should be able to Deny Approve task for Commercial Large Ticket Equipment Loan

  @Loan @REG_TC_0221
  Scenario: REG_TC_0221
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       |
      | Loan        | Factoring   | Commercial   | Commercial Small Ticket Factoring |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral  and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And User should be able to Decline Approve One task for Commercial Small Ticket Factoring Loan

  @Loan @REG_TC_0222 @TT
  Scenario: REG_TC_0222
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       |
      | Loan        | Factoring   | Commercial   | Commercial Small Ticket Factoring |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral  and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And User should be able to Deny Approve One task for Commercial Small Ticket Factoring Loan

  @Loan @REG_TC_0223 
  Scenario: REG_TC_0223
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       |
      | Loan        | Factoring   | Commercial   | Commercial Small Ticket Factoring |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral  and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And Second User should be able to Deny Approve Two task for Commercial Small Ticket Factoring Loan

  @Loan @REG_TC_0223
  Scenario: REG_TC_0224
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       |
      | Loan        | Factoring   | Commercial   | Commercial Large Ticket Factoring |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral  and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And User should be able to put on hold Compile Credit Summary task for Large Ticket Factoring Loan

  @Loan @REG_TC_0225
  Scenario: REG_TC_0225
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       |
      | Loan        | Factoring   | Commercial   | Commercial Large Ticket Factoring |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral  and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And User should be able to put on hold 8821 and Tax Guard Report task for Large Ticket Factoring Loan

  @Loan @REG_TC_0226
  Scenario: REG_TC_0226
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       |
      | Loan        | Factoring   | Commercial   | Commercial Large Ticket Factoring |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral  and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And User should be able to put on hold TMS Discovery and Setup task for Large Ticket Factoring Loan

  @Loan @REG_TC_0227
  Scenario: REG_TC_0227
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       |
      | Loan        | Factoring   | Commercial   | Commercial Large Ticket Factoring |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral  and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And User should be able to Decline Approve task for Large Ticket Factoring Loan

  @Loan @REG_TC_0228
  Scenario: REG_TC_0228
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       |
      | Loan        | Factoring   | Commercial   | Commercial Large Ticket Factoring |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral  and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And User should be able to put on hold Prefunding Legal Review task for Large Ticket Factoring Loan

  @Deposit @REG_TC_0229
  Scenario: REG_TC_0229
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                 |
      | Deposit     | Savings     | Consumer     | Consumer High Yield Savings |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Request KIQ questions for Customer opening a savings Account

  @REG_TC_0230 @Loan
  Scenario: REG_TC_0230
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       | CDLDrivingYears |
      | Loan        | Equipment   | Commercial   | Commercial Small Ticket Equipment |               2 |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And User should be able to decline Compile Credit Summary task for Small Ticket Equipment

  @Deposit @REG_TC_0231
  Scenario: REG_TC_0231
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName          |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 12 Month CD |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Put on Hold Customer Verification QA task for Consumer 12 Month CD

  @Deposit @REG_TC_0232
  Scenario: REG_TC_0232
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName          |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 18 Month CD |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Put on Hold Send Welcome Email task for Consumer 18 Month CD

  @Deposit @REG_TC_0233
  Scenario: REG_TC_0233
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType            | CustomerType | ProductName          |
      | Deposit     | Certificate of Deposit | Consumer     | Consumer 24 Month CD |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Put on Hold Funding task for Consumer 24 Month CD

  @Deposit @REG_TC_0234
  Scenario: REG_TC_0234
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName              |
      | Deposit     | Savings     | Consumer     | Consumer Premium Savings |
    And Fills the Details for the Individual Information
    Then Product should be added in OnBoarding results Table
    And User should be able to Put On hold Application Verification task for Consumer Premium Savings

  @Deposit @REG_TC_0235
  Scenario: REG_TC_0235
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                 |
      | Deposit     | Savings     | Commercial   | Commercial Business Savings |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Put on Hold Customer verification Task for Commercial Business Savings

  @Deposit @REG_TC_0236
  Scenario: REG_TC_0236
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                 |
      | Deposit     | Savings     | Commercial   | Commercial Business Savings |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Put on Hold CIF Account Creation Task for Commercial Business Savings

  @Deposit @REG_TC_0237
  Scenario: REG_TC_0237
    Given User is Starting to create a Product
    When user creates a Deposit product with specfications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                 |
      | Deposit     | Savings     | Commercial   | Commercial Business Savings |
    And Fills the Details for the Legal Entity
      | LegalEntity     |
      | Sole Proprietor |
    Then Product should be added in OnBoarding results Table
    And User should be able to Put on Hold CIF Funding Task for Commercial Business Savings

  @Loan @REG_TC_0238
  Scenario: REG_TC_0238
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       | CDLDrivingYears |
      | Loan        | Equipment   | Commercial   | Commercial Small Ticket Equipment |               2 |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And User should be able to Put on Hold Standard Exception task for Commercial small ticket equipment

  @Loan @REG_TC_0239 
  Scenario: REG_TC_0239
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       | CDLDrivingYears |
      | Loan        | Equipment   | Commercial   | Commercial Small Ticket Equipment |               2 |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And User should be able to Put on Hold Equipment Checklist task for Commercial small ticket equipment

  @Loan @REG_TC_0240  
  Scenario: REG_TC_0240
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       | CDLDrivingYears |
      | Loan        | Equipment   | Commercial   | Commercial Large Ticket Equipment |               2 |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And Use should be able to put on hold Check In Loan Package Task for Commercial Large Ticket Equipment
    
     @Loan @REG_TC_0241
  Scenario: REG_TC_0241
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       | CDLDrivingYears |
      | Loan        | Equipment   | Commercial   | Commercial Large Ticket Equipment |               2 |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And Use should be able to put on hold Complie Credit Summary Task for Commercial Large Ticket Equipment
    
     @Loan @REG_TC_0242  
  Scenario: REG_TC_0242
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       | CDLDrivingYears |
      | Loan        | Equipment   | Commercial   | Commercial Large Ticket Equipment |               2 |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And Use should be able to put on hold Collateral Valuation Task for Commercial Large Ticket Equipment
    
     @Loan @REG_TC_0243
  Scenario: REG_TC_0243
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       | CDLDrivingYears |
      | Loan        | Equipment   | Commercial   | Commercial Large Ticket Equipment |               2 |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And Use should be able to put on hold Scoring Task for Commercial Large Ticket Equipment
    
        @Loan @REG_TC_0244 
  Scenario: REG_TC_0244
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       | CDLDrivingYears |
      | Loan        | Equipment   | Commercial   | Commercial Large Ticket Equipment |               2 |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And Use should be able to put on hold Standard Exception Task for Commercial Large Ticket Equipment
    
    
        @Loan @REG_TC_0245 
  Scenario: REG_TC_0245
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       | CDLDrivingYears |
      | Loan        | Equipment   | Commercial   | Commercial Large Ticket Equipment |               2 |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And Use should be able to put on hold Send Approve Letter Task for Commercial Large Ticket Equipment
    
     @Loan @REG_TC_0246 
  Scenario: REG_TC_0246
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       | CDLDrivingYears |
      | Loan        | Equipment   | Commercial   | Commercial Large Ticket Equipment |               2 |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral and Equipment Info and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And Use should be able to put on hold Equipment CheckList Task for Commercial Large Ticket Equipment
    
     @Loan @REG_TC_0246  
      Scenario: REG_TC_0246
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       |
      | Loan        | Factoring   | Commercial   | Commercial Small Ticket Factoring |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral  and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And Use should be able to put on hold Scoring Task for Commercial Small Ticket Factoring
    
     @Loan @REG_TC_0247 
  Scenario: REG_TC_0247
    Given User is Starting to create a Product
    When user creates a Loan product with specifications and Clicks create
      | ProductLine | ProductType | CustomerType | ProductName                       |
      | Loan        | Factoring   | Commercial   | Commercial Large Ticket Factoring |
    And Fills the Details for the Loans Legal Entity
      | LegalEntity |
      | Corporation |
    Then Entity details should be saved
    When User fills opportunity ,collateral  and starts Process
      | BusinessType | Amount |
      | New Business |  14000 |
    Then user should be able to Start the Process
    And Use should be able to put on hold Check In Loan Package Task for Commercial Large Ticket Factoring Loan