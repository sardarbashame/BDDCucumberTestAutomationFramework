Feature: HAC_1021_Verify processing and packaging combination of estimate creation with IOCommissioning + Training

 Scenario: Login as service scheduler and verify the processing and packaging estimates creation
    Given Login as SERVICE SCH USER NAME
    When HAC1165 select the applicaton
    When HAC1165 close all the open tabs
    When HAC1165 close the bottom bar
    When HAC1165 click on cases tab
    When HAC1165 create new case
    When HAC1165 user is on estimate tab
    When HAC1165 verify the pricebook options
    When HAC1165PICTT select processing and packaging values on estimate flow step1
    When HAC1165PICTT verify the field label number of tech
 		#When HAC1165PICTT verify the field value number of tech
    #When HAC1165PICTT verify the field label number of days
    #When HAC1165PICTT verify the field label number of hours
    When HAC1165PICTT select from date
    When HAC1165PICTT select to date
    Then HAC1165PICTT user click on PKG Tab
    When HAC1165PICTT select from date for PKG
    When HAC1165PICTT select to date for PKG
    When HAC1165PICTT select view confirmation
   	When HAC1165 save the estimate
    #Then HAC1165PIC generate estimate pdf  
