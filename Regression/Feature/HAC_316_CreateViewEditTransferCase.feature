
Feature: HAC_316_create view edit transfer a case

  Scenario: Login as service technician and create a case
    Given Login as SERVICE SCH USER NAME
    When HAC316 select the applicaton
    When HAC316 close all the open tabs
    When HAC316 close the bottom bar
    When HAC316 click on cases tab
    When HAC1165 create new case

 
  Scenario: Login as service technician and update the case status
    Given Login as SERVICE SCH USER NAME
    When HAC316 select the applicaton
    When HAC316 close all the open tabs
    When HAC316 close the bottom bar
    When HAC316 click on cases tab
    When HAC1165 create new case
    Then HAC316 update case status to In Progress
    Then HAC316 save the case
 

  Scenario Outline: Login as service technician and transfer the case status
    Given Login as SERVICE SCH USER NAME
    When HAC316 select the applicaton
    When HAC316 close all the open tabs
    When HAC316 close the bottom bar
    When HAC316 click on cases tab
    When HAC1165 create new case
    Then HAC316 transfer the case
