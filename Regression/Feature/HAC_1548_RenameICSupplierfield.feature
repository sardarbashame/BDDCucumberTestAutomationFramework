Feature: HAC_1548_Rename IC Supplier field

  Scenario: verify the supllier field on the asset details tab
    Given Login as SERVICE SCH USER NAME
    When HAC1122 select the applicaton
    When HAC1122 close all the open tabs
    When HAC1122 close the bottom bar
    When HAC1546 select assets tab
    When HAC1546 select all active assets list view
    When HAC1546 select a asset
    Then HAC1548 verify the supplier field

    
