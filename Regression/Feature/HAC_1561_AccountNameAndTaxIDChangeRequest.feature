Feature: HAC_1561 Account Name and Tax ID Change Request

 Scenario: account name change request from SF
    Given Login as system administrator
    When HAC387 select the applicaton
    When HAC387 close all the open tabs
    When HAC387 close the bottom bar
    When HAC1561 select an account from global search
    When HAC1561 submit name and tax id change request