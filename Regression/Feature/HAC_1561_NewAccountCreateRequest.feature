Feature: HAC_1561 New Account Creation Request from SF to SAP

 Scenario: New account creation request in SF
    Given Login as SERVICE SCH USER NAME
    When HAC387 select the applicaton
    When HAC387 close all the open tabs
    When HAC387 close the bottom bar
    When HAC387 select accounts tab
    When HAC1561 create new account request