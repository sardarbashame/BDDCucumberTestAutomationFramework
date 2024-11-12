Feature: HAC_1358 _Preferred Resource

 @Test11
  Scenario Outline: Login as service scheduler and HAC_1358 _Preferred Resource
    Given Login as SERVICE SCH USER NAME
    When select the Field Service application
    When close all the open tabs
    When click on Service Appointments tab
    When Create New Service Appointment with "<ParentRecord>", "<Status>", "<CaseSub>"
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
      | username                       | password | ParentRecord               |Status|
      | testservicescheduler@gmail.com | H@ctest1 | United Batter and Breading |In Progress|
