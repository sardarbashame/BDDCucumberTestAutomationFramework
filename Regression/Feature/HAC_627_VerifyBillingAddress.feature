Feature: HAC_627_Verify the Billing Address

 @regtest
  Scenario: Login as Service Users and Verify the billing Address
    Given Login as SERVICE SCH USER NAME
    When HAC627 select the applicaton
    When HAC627 close all the open tabs
    When HAC627 close the bottom bar
    When HAC627 user is on exsiting account details
    Then HAC627 verify the billing Address on exsiting account record