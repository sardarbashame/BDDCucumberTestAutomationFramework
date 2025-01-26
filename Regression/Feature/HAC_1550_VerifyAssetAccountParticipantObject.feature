Feature: HAC_1550_Verify asset account participant object

  Scenario: verify asset account participant object
    Given Login as SERVICE SCH USER NAME
    When HAC1122 select the applicaton
    When HAC1122 close all the open tabs
    When HAC1122 close the bottom bar
    When HAC1546 select assets tab
    When HAC1546 select all active assets list view
    When HAC1546 select a asset
    When HAC1550 click new button from the asset account participant related list
    Then HAC1550 verify the orgin picklist options
    
