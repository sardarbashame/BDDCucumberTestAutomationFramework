Feature: HAC_1165_Verify raw estimate creation with IOcommissioning+Training+Testing
@regtest
  Scenario Outline: Login as service scheduler and verify the raw estimate creation
    Given HAC1165RCTT user enters <username> and <password>
    When HAC1165RCTT select the applicaton
    When HAC1165RCTT close all the open tabs
    When HAC1165RCTT close the bottom bar
    When HAC1165RCTT click on cases tab
    When HAC1165RCTT create new case
    When HAC1165RCTT user is on estimate tab
    When HAC1165RCTT verify the pricebook options
    When HAC1165RCTT select values on estimate flow step1
    When HAC1165RCTT verify the field label number of tech
 #   When HAC1165RCTT verify the field value number of tech
    When HAC1165RCTT verify the field label number of days
    When HAC1165RCTT verify the field label number of hours
    When HAC1165RCTT select RAW tab
    When HAC1165RCTT select from date
    When HAC1165RCTT select to date
    When HAC1165RCTT select view confirmation
    Then HAC1165RCTT generate estimate pdf

    Examples: 
      | username                       | password | casename      |
      | testservicescheduler@gmail.com | H@ctest1 | PROCAutoCase1 |
