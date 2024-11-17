Feature: HAC_1165_Verify processing estimate creation with IOcommissioing+Training+Testing

@regtest
  Scenario: Login as Service Scheduler and Verify the processing estimate creation
   Given Login as SERVICE SCH USER NAME
    When HAC1165CTT select the applicaton
    When HAC1165CTT close all the open tabs
    When HAC1165CTT close the bottom bar
    When HAC1165CTT click on cases tab
    When HAC1165CTT create new case
    When HAC1165CTT user is on estimate tab
    When HAC1165CTT verify the pricebook options
    When HAC1165CTT select values on estimate flow step1
    When HAC1165CTT verify the field label number of tech
 #   When HAC1165CTT verify the field value number of tech
    When HAC1165CTT verify the field label number of days
    When HAC1165CTT verify the field label number of hours
    When HAC1165CTT select from date
    When HAC1165CTT select to date
    When HAC1165CTT select view confirmation
    Then HAC1165CTT generate estimate pdf

  