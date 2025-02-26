Feature: HAC_387 Verify the Industry field on the customer account
@test3
 Scenario: Login as service user and verify the Industry field
    Given Login as SERVICE SCH USER NAME
    When HAC387 select the applicaton
    When HAC387 close all the open tabs
    When HAC387 close the bottom bar
    When HAC387 select accounts tab
    When HAC387 create new customer account
    Then HAC387 verify industry name