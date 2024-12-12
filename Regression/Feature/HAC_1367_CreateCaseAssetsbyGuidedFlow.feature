Feature: HAC_1367_Verify case assets creation by guided flow
@regtest
   Scenario: Login as service scheduler and Verify case assets creation by guided flow
    Given Login as SERVICE SCH USER NAME
    When HAC1367 select the applicaton
    When HAC1367 close all the open tabs
    When HAC1367 close the bottom bar
    When HAC1367 click on cases tab
    When HAC1367 create new case
    Then Add Asset and Verify Asset is displayed in the list view   

