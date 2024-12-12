Feature: HAC_622_Verify the Trade Name field on the customer account

  @regtest
  Scenario: Login as Service Users and Verify the Trade Name field
    Given Login as SERVICE SCH USER NAME
    When HAC622 select the applicaton
    When HAC622 close all the open tabs
    When HAC622 close the bottom bar
    When HAC622 select accounts tab
    When HAC622 create new customer account
    Then HAC622 verify trade name  
