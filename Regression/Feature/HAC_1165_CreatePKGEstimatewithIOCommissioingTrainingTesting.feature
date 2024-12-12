Feature: HAC_1165_Verify packaging estimate creation with IO Commissioning+Training+Testing

  @regtest
  Scenario: Login as service scheduler and verify the packaging estimate creation
    Given Login as SERVICE SCH USER NAME
    When HAC1165PKGCTT select the applicaton
    When HAC1165PKGCTT close all the open tabs
    When HAC1165PKGCTT close the bottom bar
    When HAC1165PKGCTT click on cases tab
    When HAC1165PKGCTT create new case
    When HAC1165PKGCTT user is on estimate tab
    When HAC1165PKGCTT verify the pricebook options
    When HAC1165PKGCTT select values on estimate flow step1
    When HAC1165PKGCTT select PKG tab
    When HAC1165PKGCTT verify the field label number of tech
    #   When HAC1165PKGCTT verify the field value number of tech
    When HAC1165PKGCTT verify the field label number of days
    When HAC1165PKGCTT verify the field label number of hours
    When HAC1165PKGCTT select from date
    When HAC1165PKGCTT select to date
    When HAC1165PKGCTT select view confirmation
    Then HAC1165PKGCTT generate estimate pdf
