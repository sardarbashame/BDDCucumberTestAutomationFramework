Feature: HAC_1478_Assign processing service appointment to a service technician
@test3
  Scenario: Login as service scheduler and assign processing service appointment to a service technician
    Given Login as SERVICE SCH USER NAME
    When HAC1165 select the applicaton
    When HAC1165 close all the open tabs
    When HAC1165 close the bottom bar
    When HAC1165 click on cases tab
    When HAC1165 create new case
    When HAC1165 user is on estimate tab
    When HAC1165 verify the pricebook options
    When HAC1165 select values on estimate flow step1
    When HAC1165 verify the field label number of days
		When HAC1165 verify the field label number of hours
    When HAC1165 verify the field label number of tech
    When HAC1165 select from date
    When HAC1165 select to date
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