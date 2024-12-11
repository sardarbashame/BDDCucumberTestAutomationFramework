Feature: HAC_1165_Verify packaging estimate creation with IO Commissioning

 @regtest
  Scenario: Login as service scheduler and verify the packaging estimate creation
    Given Login as SERVICE SCH USER NAME
    When HAC1165PKGC select the applicaton
    When HAC1165PKGC close all the open tabs
    When HAC1165PKGC close the bottom bar
    When HAC1165PKGC click on cases tab
    When HAC1165PKGC create new case
    When HAC1165PKGC user is on estimate tab
    When HAC1165PKGC verify the pricebook options
    When HAC1165PKGC select values on estimate flow step1
    When HAC1165PKGC select PKG tab
    When HAC1165PKGC verify the field label number of tech
 #   When HAC1165PKGC verify the field value number of tech
    When HAC1165PKGC verify the field label number of days
    When HAC1165PKGC verify the field label number of hours
    When HAC1165PKGC select from date
    When HAC1165PKGC select to date
    When HAC1165PKGC select view confirmation
    Then HAC1165PKGC generate estimate pdf


