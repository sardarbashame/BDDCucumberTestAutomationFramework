Feature: HAC_387_Verify the Industry field on the customer account

  @regtest
  Scenario: Login as Service Users and Verify the Industry field
    Given Login as SERVICE SCH USER NAME
    When HAC387 select the applicaton
    When HAC387 close all the open tabs
    When HAC387 close the bottom bar
    When HAC387 select accounts tab
    When HAC387 create new customer account
    Then HAC387 verify industry name
