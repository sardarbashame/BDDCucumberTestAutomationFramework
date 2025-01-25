Feature: HAC_1021_Verify processing and inspection combination of estimate creation with IOCommissioning + Training

 @test3
  Scenario: Login as service scheduler and verify the processing and inspection estimates creation
    Given Login as SERVICE SCH USER NAME
    When HAC1165PIC select the applicaton
    When HAC1165PIC close all the open tabs
    When HAC1165PIC close the bottom bar
    When HAC1165PIC click on cases tab
    When HAC1165PIC create new case
    When HAC1165PIC user is on estimate tab
    When HAC1165PIC verify the pricebook options
    When HAC1165PIC select processing and inspection values on estimate flow step1
    When HAC1165PIC verify the field label number of tech
 #   When HAC1165PIC verify the field value number of tech
    When HAC1165PIC verify the field label number of days
    When HAC1165PIC verify the field label number of hours
    When HAC1165PIC select from date
    When HAC1165PIC select to date
    Then HAC1165PIC user click on INSP Tab
    When HAC1165PIC select from date for INSP
    When HAC1165PIC select to date for INSP
    When HAC1165PIC select view confirmation
    Then HAC1165PIC generate estimate pdf   
   

