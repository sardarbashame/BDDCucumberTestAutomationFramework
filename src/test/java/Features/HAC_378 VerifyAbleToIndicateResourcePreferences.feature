@Test
Feature: Verify Ability to Indicate Resource Preferences for an Account

  Scenario Outline: HAC_378_Verify Able to indicate Resource Prefences on an Account
    Given Login as service user
    When HAC145 select the applicaton
    When HAC145 close all the open tabs
    When HAC145 close the bottom bar
    When HAC145 select accounts tab
    When HAC145 create new Account based on Type "<AccType>", "<AccName>", "<TradeName>", "<Industry>", "<DropDownValues>"
    When click on the Resource prefence link and add new Resource preference

    Examples: 
      | AccType  | AccName          | TradeName | Industry   | DropDownValues          |
      | Customer | AutoTestCustomer | TestTrade | Automotive | Customer,Prospect,Other |
