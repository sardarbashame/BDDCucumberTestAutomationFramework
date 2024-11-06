Feature: Verify processing service appointments creation

@regtest
  Scenario Outline: Login as service scheduler and create processing service appointments
    Given HAC1478pkg user enters <username> and <password>
    When HAC1478pkg select the applicaton
    When HAC1478pkg close all the open tabs
    When HAC1478pkg close the bottom bar
   	When HAC1478pkg click on cases tab
   	When HAC1478pkg create new case
    When HAC1478pkg user is on estimate tab
   	When HAC1478pkg select values on estimate flow step1
   	When HAC1478pkg select pkg tab
    When HAC1478pkg verify the field label number of tech
    When HAC1478pkg verify the field label number of days
    When HAC1478pkg verify the field label number of hours
    When HAC1478pkg select from date
    When HAC1478pkg select to date
    When HAC1478pkg select view confirmation
    Then HAC1478pkg save estimate
    Then HAC1478pkg click on work order link
    Then HAC1478pkg create work order
    Then HAC1478pkg create service appointments
    Then HAC1478pkg click service appointment link
    Then HAC1478pkg select a service appointment
    Then HAC1478pkg click related tab
    Then HAC1478pkg assign service resource
    

    Examples: 
      | username                       | password    | casename      |
      | testservicescheduler@gmail.com | H@ctest1 | PROCAutoCase1 |
