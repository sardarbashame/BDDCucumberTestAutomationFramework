@Test
Feature: Verify Ability to Indicate Resource Preferences for an Account

  Scenario Outline: HAC_378_Verify Able to indicate Resource Prefences on an Account
    Given Login as SERVICE REP USER NAME
    When HAC145 select the applicaton
    When close all the open tabs
    When close the bottom bar
    When HAC145 select accounts tab
    When HAC145 create new Account based on Type "<AccType>", "<AccName>", "<TradeName>", "<Industry>", "<DropDownValues>"
    When click on the Resource prefence link and add new Resource preference "<ServiceResource>", "<DrpDownPreferenceType>","<PreferenceTypesCnt>"

    Examples: 
      | AccType  | AccName          | TradeName | Industry   | DropDownValues          | ServiceResource        | DrpDownPreferenceType       | PreferenceTypesCnt |
      | Customer | AutoTestCustomer | TestTrade | Automotive | Customer,Prospect,Other | Test Service Resource2 | Preferred,Required,Excluded |                  3 |
