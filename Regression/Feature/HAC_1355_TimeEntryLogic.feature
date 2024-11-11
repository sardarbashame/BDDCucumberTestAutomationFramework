Feature: Verify timesheet entry logic on service appointments
@Test
  Scenario Outline: Login as service technician and verify the timesheet entries on service appointment
    Given HAC1355 login as service technician
	 	When HAC1355 select the field service applicaton
    When HAC1355 close all the open tabs
    Then HAC1355 select the service appointments tab
    Then HAC1355 select all service appointments listview
    Then HAC1355 select a service appointment
    Then HAC1355 update the service appointment status to In Progress
    Then HAC1355 update the service appointment status to completed
    Then HAC1355 click on timesheet and expenses tab
    Then HAC1355 verify the timesheet entry for labor time

    Examples: 
      | username                         | password | casename      |
      | jausterman@heatandcontrol.com.qa | H@ctest1 | PROCAutoCase1 |
