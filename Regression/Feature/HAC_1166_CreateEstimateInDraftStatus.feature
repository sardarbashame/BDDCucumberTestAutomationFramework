Feature: HAC_1166_Verify processing estimate creation in draft status

   Scenario: Login as service scheduler and verify the processing estimate creation in draft status
		Given Login as SERVICE SCH USER NAME
    When HAC1165 select the applicaton
    When HAC1165 close all the open tabs
    When HAC1165 close the bottom bar
    When HAC1165 click on cases tab
    When HAC1165 create new case
    When HAC1165 user is on estimate tab
    When HAC1165 verify the pricebook options
    When HAC1166 select values on estimate flow step1
    When HAC1166 verify the field label number of tech
    When HAC1166 verify the field label number of days
    When HAC1166 verify the field label number of hours
    When HAC1166 select from date
    When HAC1166 select to date
    When HAC1166 select view confirmation
    Then HAC1166 save estimate
    Then HAC1166 select quoteestimate related list
    Then HAC1166 verify estimate is in draft status

