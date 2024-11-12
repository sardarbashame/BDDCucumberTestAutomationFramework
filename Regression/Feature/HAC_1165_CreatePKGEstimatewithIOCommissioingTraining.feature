Feature: HAC_1165_Verify packaging estimate creation with IO Commissioning+Training

 @Test 
  Scenario Outline: Login as service scheduler and verify the packaging estimate creation
    Given HAC1165PKGCT user enters <username> and <password>
    When HAC1165PKGCT select the applicaton
    When HAC1165PKGCT close all the open tabs
    When HAC1165PKGCT close the bottom bar
    When HAC1165PKGCT click on cases tab
    When HAC1165PKGCT create new case
    When HAC1165PKGCT user is on estimate tab
    When HAC1165PKGCT verify the pricebook options
    When HAC1165PKGCT select values on estimate flow step1
    When HAC1165PKGCT select PKG tab
    When HAC1165PKGCT verify the field label number of tech
 #   When HAC1165PKGCT verify the field value number of tech
    When HAC1165PKGCT verify the field label number of days
    When HAC1165PKGCT verify the field label number of hours
    When HAC1165PKGCT select from date
    When HAC1165PKGCT select to date
    When HAC1165PKGCT select view confirmation
    Then HAC1165PKGCT generate estimate pdf

    Examples: 
      | username                       | password | casename      |
      | testservicescheduler@gmail.com | H@ctest1 | PROCAutoCase1 |
