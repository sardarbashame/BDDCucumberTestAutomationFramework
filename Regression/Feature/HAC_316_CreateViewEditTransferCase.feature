Feature: HAC_316_create view edit transfer a case
 
 @regtest
  Scenario Outline: Login as service technician and create a case
    Given HAC316 user enters <username> and <password>
    When HAC316 select the applicaton
    When HAC316 close all the open tabs
    When HAC316 close the bottom bar
    When HAC316 click on cases tab
    When HAC316 create new case

    Examples: 
      | username                       | password |
      | testservicescheduler@gmail.com | H@ctest1 |
 @regtest
  Scenario Outline: Login as service technician and update the case status
    Given HAC316 user enters <username> and <password>
    When HAC316 select the applicaton
    When HAC316 close all the open tabs
    When HAC316 close the bottom bar
    When HAC316 click on cases tab
    When HAC316 create new case
    Then HAC316 update case status to In Progress
    Then HAC316 save the case

    Examples: 
      | username                       | password |
      | testservicescheduler@gmail.com | H@ctest1 |
 @regtest
  Scenario Outline: Login as service technician and transfer the case status
    Given HAC316 user enters <username> and <password>
    When HAC316 select the applicaton
    When HAC316 close all the open tabs
    When HAC316 close the bottom bar
    When HAC316 click on cases tab
    When HAC316 create new case
    Then HAC316 transfer the case

    Examples: 
      | username                       | password |
      | testservicescheduler@gmail.com | H@ctest1 |
