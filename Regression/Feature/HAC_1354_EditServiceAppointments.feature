Feature: Edit service appointments

  Scenario Outline: Login as service technician and edit the service appointments
    Given HAC1354 login as service technician
	 	When HAC1354 select the field service applicaton
    When HAC1354 close all the open tabs
    Then HAC1354 select the service appointments tab
    Then HAC1354 select all service appointments listview
    Then HAC1354 select a service appointment
    Then HAC1354 verify service appointment statuses
    Then HAC1354 update the service appointment status to In Progress
    Then HAC1354 update the service appointment status to completed

    Examples: 
      | username                         | password | casename      |
      | jausterman@heatandcontrol.com.qa | H@ctest1 | PROCAutoCase1 |
