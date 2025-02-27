Feature: HAC_1358 _Preferred Resource
@regtest
  Scenario: Login as service user and HAC_1358 _Preferred Resource
    Given Login as SERVICE SCH USER NAME
    When HAC1478 select the applicaton
    When HAC1478 close all the open tabs
    When HAC1478 close the bottom bar
    #Step -1
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
    #Step -2
    Then HAC1478 click on work order link
    Then HAC1478 create work order
    Then HAC1478 create service appointments
    Then HAC1478 click service appointment link
    Then HAC1478 select a service appointment
    Then HAC1478 select a schedule start date
    Then HAC1478 select a schedule end date
    Then HAC1478 click related tab
    Then HAC1478 assign service resource
    #Step-3
    When select the Field Service application
    When close all the open tabs
    When click on Field Service tab
    When Search SA number and Click Edit
    Then Verify Resources Preference label and Count
