Feature: HAC_1575_Remove IC Prefix

  Scenario: verify IC prefix is removed
    Given Login as SERVICE SCH USER NAME
    When HAC1122 select the applicaton
    When HAC1122 close all the open tabs
    When HAC1122 close the bottom bar
    When HAC1546 select assets tab
    When HAC1546 select all active assets list view
    When HAC1546 select a asset
    Then HAC1548 verify the Prod Order Info Section
    Then HAC1548 verify the PurchaseSale Info Section

    
