Feature: Verify processing service appointments creation

@regtest
  Scenario Outline: Login as service scheduler and create processing service appointments
    Given HAC1478 user enters <username> and <password>
    When HAC1478 select the applicaton
    When HAC1478 close all the open tabs
    When HAC1478 close the bottom bar
   	When HAC1478 click on cases tab
   	When HAC1478 create new case
    When HAC1478 user is on estimate tab
   	When HAC1478 select values on estimate flow step1
 #  	When HAC1478 select pkg tab
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
    Then HAC1478 select a schedule start date
    Then HAC1478 select a schedule end date
    Then HAC1478 click related tab
    Then HAC1478 assign service resource
    Then HAC1478 update sa status to dispatched
    Then HAC1478 logout as service scheduler
    Then HAC1478 login as service technician
    Then HAC1478 select the field service applicaton
    Then HAC1478 select the service appointments tab
    Then HAC1478 select all service appointments listview
    Then HAC1478 select dispatched service appointment
    

    Examples: 
      | username                       | password    | casename      |
      | testservicescheduler@gmail.com | H@ctest1 | PROCAutoCase1 |
