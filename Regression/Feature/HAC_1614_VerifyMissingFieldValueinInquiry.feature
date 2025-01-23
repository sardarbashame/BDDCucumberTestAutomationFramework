Feature: HAC_1614 verify the missing field value in inquiry object

  Scenario: verify the missing field value in inquiry
    Given Login as system administrator
    When HAC1122 select the applicaton
    When HAC1122 close all the open tabs
    When HAC1122 close the bottom bar
    When HAC1614 select inquiries object
    When HAC1614 select an inquiry
   	When HAC1614 verify the new picklist value in sales office

    
