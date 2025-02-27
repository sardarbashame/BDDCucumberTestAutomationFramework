Feature: Verify HAC_1165_CreateINSP Estimate Matrix with IOCommissioning

  @regtest
  Scenario Outline: Login as service user and Verify HAC_1165_CreateINSP Estimate Matrix
    Given Login as SERVICE SCH USER NAME
    When HAC1165 select the applicaton
    When HAC1165 close all the open tabs
    When HAC1165 close the bottom bar
    When HAC1165 click on cases tab
    When Create new case with help of "<CaseContact>", "<CaseFirstName>", "<CaseSub>"
    When HAC1165 user is on estimate tab
    When Create Estimations with INSP "<Pricebook>", "<ProductFamily>", "<ProductCategory>", "<Purpose>"
    Then User click on INSP Tab
    When HAC1165 verify the field label number of tech
    When HAC1165 verify the field label number of days
    When HAC1165 verify the field label number of hours
    When HAC1165 select from date INSP
    When HAC1165 select to date INSP
    When HAC1165 select view confirmation
    Then user click on Save Estimation

    #Then HAC1165 generate estimate pdf
    Examples: 
      | CaseContact         | CaseFirstName | CaseSub     | Pricebook                           | ProductFamily | ProductCategory   | Purpose          |
      | FN6 MN6 LN6 Suffix6 | FN6           | TestCase110 | USA Domestic MPA-PEPSICO (FritoLay) | INSP          | CEIA Drop Through | IO/Commissioning |
