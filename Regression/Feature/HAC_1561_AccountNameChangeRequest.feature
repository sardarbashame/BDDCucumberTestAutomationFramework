Feature: HAC_1561 Account Name Change Request
@test3
 Scenario: account name change request from SF
    Given Login as system administrator
    When HAC387 select the applicaton
    When HAC387 close all the open tabs
    When HAC387 close the bottom bar
    When HAC1561 select an account from global search
    When HAC1561 submit name change request