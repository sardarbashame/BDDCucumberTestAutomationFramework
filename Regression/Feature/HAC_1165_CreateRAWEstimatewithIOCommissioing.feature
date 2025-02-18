Feature: HAC_1165_Verify raw estimate creation with IOcommissioning

  Scenario: Login as service scheduler and verify the raw estimate creation
 		Given Login as system administrator
    When HAC1165 select the applicaton
    When HAC1165 close all the open tabs
    When HAC1165 close the bottom bar
    When HAC1165 click on cases tab
    When HAC1165 create new case
    When HAC1165 user is on estimate tab
    When HAC1165 verify the pricebook options
    When HAC1165RC select values on estimate flow step1
    When HAC1165RC select RAW tab
    #When HAC1165RC verify the field label number of tech
 #   When HAC1165RC verify the field value number of tech
    #When HAC1165RC verify the field label number of days
    #When HAC1165RC verify the field label number of hours
    When HAC1165RC select from date
    When HAC1165RC select to date
    When HAC1165RC select view confirmation
    When HAC1165 save the estimate
    #Then HAC1165 generate estimate pdf 
