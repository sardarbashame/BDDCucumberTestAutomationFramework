Feature: HAC_322_Verify the case page layout fields


  Scenario: Login as service scheduler and verify the case page layout fields
    Given Login as SERVICE SCH USER NAME
    When HAC322 select the applicaton
    When HAC322 close all the open tabs
    When HAC322 close the bottom bar
    When HAC322 select cases tab
    When HAC322 create new case
    Then HAC322 verify account name field label
    Then HAC322 verify contact name field label
  	Then HAC322 verify case related list quick links
 
  
