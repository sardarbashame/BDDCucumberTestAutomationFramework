Feature: Verify the case close reasons

 
  Scenario: Login as service manager and verify the case closure reasons
    Given HAC550 login as a service manager
    When HAC550 select the applicaton
    When HAC550 close all the open tabs
    When HAC550 close the bottom bar
    When HAC550 select cases tab
    When HAC550 create new case
    Then HAC550 click case close quick action
    Then HAC550 verify case close reasons


 
    

  
