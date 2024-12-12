Feature: HAC_1021_Verify processing and packaging combination of estimate creation with IOCommissioning + Training
@regtest
 Scenario: Login as service scheduler and verify the processing and packaging estimates creation
    Given Login as SERVICE SCH USER NAME
    When HAC1165PICTT select the applicaton
    When HAC1165PICTT close all the open tabs
    When HAC1165PICTT close the bottom bar
    When HAC1165PICTT click on cases tab
    When HAC1165PICTT create new case
    When HAC1165PICTT user is on estimate tab
    When HAC1165PICTT verify the pricebook options
    When HAC1165PICTT select processing and inspection values on estimate flow step1
    When HAC1165PICTT verify the field label number of tech
 #   When HAC1165PICTT verify the field value number of tech
    When HAC1165PICTT verify the field label number of days
    When HAC1165PICTT verify the field label number of hours
    When HAC1165PICTT select from date
    When HAC1165PICTT select to date
    Then HAC1165PICTT user click on PKG Tab
    When HAC1165PICTT select from date for PKG
    When HAC1165PICTT select to date for PKG
    When HAC1165PICTT select view confirmation
    Then HAC1165PICTT generate estimate pdf