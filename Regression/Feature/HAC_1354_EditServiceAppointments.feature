Feature: HAC_1354_Edit service appointments
@Test
  Scenario Outline: Login as service technician and edit the service appointments
    
    Given HAC1478 user enters <testschedulerusername> and <password>
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
    Then HAC1478 select a schedule start date
    Then HAC1478 select a schedule end date
    Then HAC1478 click related tab
    Then HAC1478 assign service resource
    Then HAC1478 update sa status to dispatched
    Then HAC1478 logout as service scheduler
        
    When HAC1354 login as service technician
	 	When HAC1354 select the field service applicaton
    When HAC1354 close all the open tabs
    Then HAC1354 select the service appointments tab
    Then HAC1354 select all service appointments listview
    Then HAC1354 select a service appointment
    Then HAC1354 verify service appointment statuses
    Then HAC1354 update the service appointment status to In Progress
    Then HAC1354 update the service appointment status to completed

    Examples: 
      | testschedulerusername          | password | casename      |
      | testservicescheduler@gmail.com | H@ctest1 | PROCAutoCase1 |
