Feature: Verify HAC_1366_Create Cases with Multiple Asset
  @Test
  Scenario Outline: Login as service user and HAC_1366_Create Cases with Multiple Asset
    Given Login as SERVICE SCH USER NAME
    When HAC1165 select the applicaton
    When HAC1165 close all the open tabs
    When HAC1165 close the bottom bar
    When HAC1165 click on cases tab
    When Create new case with help of "<CaseContact>", "<CaseFirstName>", "<CaseSub>"
    Then Add Asset and Verify Asset is displayed in the list view
   

    Examples: 
      | CaseContact | CaseFirstName | CaseSub     | 
      | FN6 MN6 LN6 | FN6           | TestCase110 | 
