Feature: HAC_1170_Send Estimates to Customer

 Scenario: Login as service scheduler and verify the processing estimate creation
 	 Given Login as SERVICE SCH USER NAME
    When HAC1165 select the applicaton
    When HAC1165 close all the open tabs
    When HAC1165 close the bottom bar
    When HAC1165 click on cases tab
    When HAC1165 create new case
    When HAC1165 user is on estimate tab
    When HAC1165 verify the pricebook options
    When HAC1165CT select values on estimate flow step1
    When HAC1165 verify the field label number of days
		When HAC1165 verify the field label number of hours
    When HAC1165 verify the field label number of tech
	#	When HAC1165 verify the field value number of tech
    When HAC1165 select from date
    When HAC1165 select to date
    When HAC1165 select view confirmation
    Then HAC1170 generate estimate pdf
   # Then HAC1170 navigate back to case record
   # Then HAC1170 verify the estimate version
