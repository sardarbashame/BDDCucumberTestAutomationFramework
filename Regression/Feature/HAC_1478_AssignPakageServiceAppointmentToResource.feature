Feature: HAC_1478_Assign packaging service appointment to a service technician

@regtest
  Scenario Outline: Login as service scheduler and assign packaging service appointments
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
    Then HAC1478 create service appointments
    Then HAC1478 click service appointment link
    Then HAC1478 select a service appointment
    Then HAC1478 click related tab
    Then HAC1478 assign service resource
    

    Examples: 
      | username                       | password    | casename      |
      | testservicescheduler@gmail.com | H@ctest1 | PROCAutoCase1 |
