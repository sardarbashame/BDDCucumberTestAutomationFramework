Feature: Verify HAC_1165_CreateSPRAY Estimate Matrix


  Scenario Outline: Login as service user and HAC_1165_Create Spray Estimate Matrix  IO/comissioning
    Given Login as SERVICE SCH USER NAME
    When HAC1165 select the applicaton
    When close all the open tabs
    When close the bottom bar
    When click on cases tab
    When HAC1165 create new case
    When HAC1165 user is on estimate tab
    When Create Estimations with SPRAY "<Pricebook>", "<SprayEstimateMatrix>", "<purpose>"
    Then User click on SPRAY Tab
    When HAC1165 verify the field label number of tech
    When HAC1165 verify the field label number of days
    When HAC1165 verify the field label number of hours
    When HAC1165 select from date SPRAY
    When HAC1165 select tos date SPRAY
    When HAC1165 select view confirmation
    Then user click on Save Estimation
    When User click on Show All quick link
    Then Click on QuoteEstimates and verify quote is created in the details page

    Examples: 
      | Pricebook                              | SprayEstimateMatrix                    | purpose          |
      | CANADA Domestic MPA-PEPSICO (FRITOLAY) | BASIC 1-STAGE / 2-STAGE Coating System | IO/Commissioning |
