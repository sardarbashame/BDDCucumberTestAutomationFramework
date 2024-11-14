Feature: HAC-1355 Verify timesheet entry logic on service appointments

  Scenario Outline: Login as service technician and verify the timesheet entries on service appointment
    
  	When HAC1355 login as service technician
	 	When HAC1355 select the field service applicaton
    When HAC1355 close all the open tabs
    Then HAC1355 select the service appointments tab
    Then HAC1355 select all service appointments listview
    Then HAC1355 select a service appointment
    Then HAC1355 update the service appointment status to In Progress
    Then HAC1355 update the service appointment status to completed

