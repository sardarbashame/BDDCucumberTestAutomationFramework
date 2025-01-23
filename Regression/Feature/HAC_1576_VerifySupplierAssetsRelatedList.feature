Feature: HAC_1546_Verify supplier assets related list on account

  Scenario: verify supplier assets related list
    Given Login as service user
    When HAC145 select the applicaton
    When HAC145 close all the open tabs
    When HAC145 close the bottom bar
    When HAC145 select accounts tab
    When HAC145 create new customer account
    Then HAC1576 verify supplier assets related list

    
