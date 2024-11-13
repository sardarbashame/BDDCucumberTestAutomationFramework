Feature: HAC_1165_Verify raw estimate creation with IOcommissioning+Training
@Test
  Scenario Outline: Login as service scheduler and verify the raw estimate creation
    Given HAC1165RCT user enters <username> and <password>
    When HAC1165RCT select the applicaton
    When HAC1165RCT close all the open tabs
    When HAC1165RCT close the bottom bar
    When HAC1165RCT click on cases tab
    When HAC1165RCT create new case
    When HAC1165RCT user is on estimate tab
    When HAC1165RCT verify the pricebook options
    When HAC1165RCT select values on estimate flow step1
    When HAC1165RCT verify the field label number of tech
 #   When HAC1165RCT verify the field value number of tech
    When HAC1165RCT verify the field label number of days
    When HAC1165RCT verify the field label number of hours
    When HAC1165RCT select RAW tab
    When HAC1165RCT select from date
    When HAC1165RCT select to date
    When HAC1165RCT select view confirmation
    Then HAC1165RCT generate estimate pdf

    Examples: 
      | username                       | password | casename      |
      | testservicescheduler@gmail.com | H@ctest1 | PROCAutoCase1 |
