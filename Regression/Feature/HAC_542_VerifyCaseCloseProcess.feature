Feature: HAC_542_Verify the case closure process
@regtest
  Scenario: Login as service manager and verify the case closure process
    Given Login as SERVICE SCH USER NAME
    When HAC542 select the applicaton
    When HAC542 close all the open tabs
    When HAC542 close the bottom bar
    When HAC542 select cases tab
    When HAC542 create new case
    Then HAC542 click case close quick action
    Then HAC542 close case with a reason


 
    

  
