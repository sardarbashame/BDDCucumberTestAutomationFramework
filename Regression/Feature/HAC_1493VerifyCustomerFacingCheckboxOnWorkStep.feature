Feature: HAC_1493_ verify customer facing checkbox

@regtest
  Scenario Outline: verify customer facing checkbox on work step
    Given HAC1493 user enters <username> and <password>
    When HAC1493 select the applicaton
    When HAC1493 close all the open tabs
    When HAC1493 close the bottom bar
   	When HAC1493 click on cases tab
   	When HAC1493 create new case
    When HAC1493 user is on estimate tab
   	When HAC1493 select values on estimate flow step1
 #  	When HAC1493 select pkg tab
    When HAC1493 verify the field label number of tech
    When HAC1493 verify the field label number of days
    When HAC1493 verify the field label number of hours
    When HAC1493 select from date
    When HAC1493 select to date
    When HAC1493 select view confirmation
    Then HAC1493 save estimate
    Then HAC1493 click on work order link
    Then HAC1493 create work order
    Then HAC1493 click work steps link
    Then HAC1493 create new work step
   
    Examples: 
      | username                       | password    | casename      |
      | testservicescheduler@gmail.com | H@ctest1 | PROCAutoCase1 |
