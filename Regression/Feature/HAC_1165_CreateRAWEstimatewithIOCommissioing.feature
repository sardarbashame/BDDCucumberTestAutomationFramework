Feature: HAC_1165_Verify raw estimate creation with IOcommissioning
@regtest
  Scenario: Login as service scheduler and verify the raw estimate creation
    Given Login as SERVICE SCH USER NAME
    When HAC1165RC select the applicaton
    When HAC1165RC close all the open tabs
    When HAC1165RC close the bottom bar
    When HAC1165RC click on cases tab
    When HAC1165RC create new case
    When HAC1165RC user is on estimate tab
    When HAC1165RC verify the pricebook options
    When HAC1165RC select values on estimate flow step1
    When HAC1165RC verify the field label number of tech
 #   When HAC1165RC verify the field value number of tech
    When HAC1165RC verify the field label number of days
    When HAC1165RC verify the field label number of hours
    When HAC1165RC select RAW tab
    When HAC1165RC select from date
    When HAC1165RC select to date
    When HAC1165RC select view confirmation
    Then HAC1165RC generate estimate pdf  
