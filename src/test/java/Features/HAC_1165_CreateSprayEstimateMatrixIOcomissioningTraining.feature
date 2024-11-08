Feature: Verify HAC_1165_CreateINSP Estimate Matrix


  
  Scenario Outline: Login as service user and HAC_1165_Create Spray Estimate Matrix  IO/comissioning+Training
    Given HAC1165 user enters <username> and <password>
    When HAC1165 select the applicaton
    When close all the open tabs
    When close the bottom bar
    When click on cases tab
    When Create new case with help of "<CaseContact>", "<CaseFirstName>", "<CaseSub>"
    When HAC1165 user is on estimate tab
    When Create Estimations with SPRAY "<Pricebook>", "<SprayEstimateMatrix>", "<Estimateitem>"
    Then User click on SPRAY Tab
    When HAC1165 verify the field label number of tech
    When HAC1165 verify the field label number of days
    When HAC1165 verify the field label number of hours
    When HAC1165 select from date
    When HAC1165 select to date
    When HAC1165 select view confirmation
    Then user click on Save Estimation
    When User click on Show All quick link
    Then Click on QuoteEstimates and verify quote is created in the details page

    Examples: 
      | username                       | password    | CaseContact | CaseFirstName | CaseSub     | Pricebook                              | SprayEstimateMatrix                    | Estimateitem                |
      | mubeen.mohiuddin@gerent.com.qa | Strange@234 | FN6 MN6 LN6 | FN6           | TestCase100 | CANADA Domestic MPA-PEPSICO (FRITOLAY) | BASIC 1-STAGE / 2-STAGE Coating System | IO/Commissioning + Training |
