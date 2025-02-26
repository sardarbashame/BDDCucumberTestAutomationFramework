Feature: HAC_1170_Send Estimates to Customer

@regtest
  Scenario: Login as service scheduler and verify the processing estimate creation
    Given Login as SERVICE SCH USER NAME
    When HAC1170 select the applicaton
    When HAC1170 close all the open tabs
    When HAC1170 close the bottom bar
    When HAC1170 click on cases tab
    When HAC1170 create new case
    When HAC1170 user is on estimate tab
    When HAC1170 verify the pricebook options
    When HAC1170 select values on estimate flow step1
    When HAC1170 verify the field label number of tech
    When HAC1170 verify the field label number of days
    When HAC1170 verify the field label number of hours
    When HAC1170 select from date
    When HAC1170 select to date
    When HAC1170 select view confirmation
    #Then HAC1170 generate estimate pdf
    Then HAC1170 navigate back to case record
    Then HAC1170 verify the estimate version
