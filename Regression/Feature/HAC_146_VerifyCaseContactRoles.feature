Feature: HAC_146_create and verify the case contact roles


  Scenario Outline: Login as service users and add engineer as case contact role
    Given Login as SERVICE SCH USER NAME
    When HAC146 select the applicaton
    When HAC146 close all the open tabs
    When HAC146 close the bottom bar
    When HAC146 click on cases tab
    When HAC146 create new case
    When HAC146 add engineer contact role


  Scenario Outline: Login as service users and add engineering manager as case contact role
    Given Login as SERVICE SCH USER NAME
    When HAC146 select the applicaton
    When HAC146 close all the open tabs
    When HAC146 close the bottom bar
    When HAC146 click on cases tab
    When HAC146 create new case
    When HAC146 add engineering manager contact role



  Scenario Outline: Login as service users and Verify the case contact roles
    Given Login as SERVICE SCH USER NAME
    When HAC146 select the applicaton
    When HAC146 close all the open tabs
    When HAC146 close the bottom bar
    When HAC146 click on cases tab
    When HAC146 create new case
    Then HAC146 verify case contact roles

