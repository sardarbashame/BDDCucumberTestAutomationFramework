Feature: HAC_1165_Verify processing estimate creation with IOCommissioning + Training

@regtest
  Scenario: Login as Service Scheduler and Verify the processing estimate creation
    Given Login as SERVICE SCH USER NAME
    When HAC1165CT select the applicaton
    When HAC1165CT close all the open tabs
    When HAC1165CT close the bottom bar
    When HAC1165CT click on cases tab
    When HAC1165CT create new case
    When HAC1165CT user is on estimate tab
    When HAC1165CT verify the pricebook options
    When HAC1165CT select values on estimate flow step1
    When HAC1165CT verify the field label number of tech
 #   When HAC1165CT verify the field value number of tech
    When HAC1165CT verify the field label number of days
    When HAC1165CT verify the field label number of hours
    When HAC1165CT select from date
    When HAC1165CT select to date
    When HAC1165CT select view confirmation
    Then HAC1165CT generate estimate pdf   