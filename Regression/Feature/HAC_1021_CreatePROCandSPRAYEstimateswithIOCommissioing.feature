Feature: HAC_1021_Verify processing and spray combination of estimate creation with IOCommissioning

 @regtest
  Scenario: Login as service scheduler and verify the processing and spray estimates creation
    Given Login as SERVICE SCH USER NAME
    When HAC1165PICT select the applicaton
    When HAC1165PICT close all the open tabs
    When HAC1165PICT close the bottom bar
    When HAC1165PICT click on cases tab
    When HAC1165PICT create new case
    When HAC1165PICT user is on estimate tab
    When HAC1165PICT verify the pricebook options
    When HAC1165PICT select processing and inspection values on estimate flow step1
    When HAC1165PICT verify the field label number of tech
 #   When HAC1165PICT verify the field value number of tech
    When HAC1165PICT verify the field label number of days
    When HAC1165PICT verify the field label number of hours
    When HAC1165PICT select from date
    When HAC1165PICT select to date
    Then HAC1165PICT user click on SPRAY Tab
    When HAC1165PICT select from date for SPRAY
    When HAC1165PICT select to date for SPRAY
    When HAC1165PICT select view confirmation
    Then HAC1165PICT generate estimate pdf

