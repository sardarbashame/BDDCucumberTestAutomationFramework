Feature: HAC_1493_verify customer facing checkbox on work step

 Scenario Outline: Login as service scheduler and verify the customer facing checkbox
    Given HAC1478 user enters <username> and <password>
    When HAC1478 select the applicaton
    When HAC1478 close all the open tabs
    When HAC1478 close the bottom bar
   	When HAC1478 click on cases tab
   	When HAC1478 create new case
    When HAC1478 user is on estimate tab
   	When HAC1478 select values on estimate flow step1
    When HAC1478 verify the field label number of tech
    When HAC1478 verify the field label number of days
    When HAC1478 verify the field label number of hours
    When HAC1478 select from date
    When HAC1478 select to date
    When HAC1478 select view confirmation
    Then HAC1478 save estimate
    Then HAC1478 click on work order link
    Then HAC1478 create work order
    Then HAC1493 create work step
    Then HAC1493 verify customer facing checkbox
 
    

    Examples: 
      | username                       | password    | casename      |
      | testservicescheduler@gmail.com | H@ctest1 | PROCAutoCase1 |
