Feature: HAC_1561 Account Name Change Request

#Background: recall the account name change request
    #Given Login as system administrator
    #When HAC387 select the applicaton
    #When HAC387 close all the open tabs
    #When HAC387 close the bottom bar
    #When HAC1561 select an account from global search
    #When HAC1561 recall name change request

 Scenario: account name change request from SF
    Given Login as SERVICE SCH USER NAME
    When HAC387 select the applicaton
    When HAC387 close all the open tabs
    When HAC387 close the bottom bar
    When HAC1561 select an account from global search
    When HAC1561 submit name change request