Feature: HAC_1005_View Site Asset from Service Appointment

  @test2
  Scenario: Login as service user and HAC_1005_View Site Asset from Service Appointment
    Given Login as SERVICE SCH USER NAME
    When HAC1005 select the applicaton
    When HAC1005 close all the open tabs
    When HAC1005 click on field service tab
    When HAC1005 select usa packaging policy
    When HAC1005 select service appointment filter
    When HAC1005 select service appointment
    When HAC1005 click edit button from service appointment
    When HAC1005 click related tab on service appointment
    Then HAC1005 verify site asset on service appointment
