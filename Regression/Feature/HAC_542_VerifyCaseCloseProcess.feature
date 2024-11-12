Feature: HAC_542_Verify the case closure process

  @Test
  Scenario: Login as service manager and verify the case closure process
    Given HAC542 login as a service manager
    When HAC542 select the applicaton
    When HAC542 close all the open tabs
    When HAC542 close the bottom bar
    When HAC542 select cases tab
    When HAC542 create new case
    Then HAC542 click case close quick action
    Then HAC542 close case with a reason


 
    

  
