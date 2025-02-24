Feature: HAC_702_Verify the case types and subtypes

  @regtest
  Scenario: Login as service manager and verify the case types and subtypes
   Given Login as SERVICE SCH USER NAME
    When HAC702 select the applicaton
    When HAC702 close all the open tabs
    When HAC702 close the bottom bar
    When HAC702 select cases tab
    Then HAC702 verify case subtypes for billing type
    Then HAC702 verify case subtypes for emergency type
    Then HAC702 verify case subtypes for equipment type
    Then HAC702 verify case subtypes for feedback type
    Then HAC702 verify case subtypes for general type
    Then HAC702 verify case subtypes for junkspam type
    Then HAC702 verify case subtypes for newprojectscheduling type
    Then HAC702 verify case subtypes for parts type
    Then HAC702 verify case subtypes for sales type
    Then HAC702 verify case subtypes for scheduling type


 
    

  
