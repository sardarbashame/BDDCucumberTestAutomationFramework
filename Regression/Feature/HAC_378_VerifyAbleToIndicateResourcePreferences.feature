Feature: HAC_378 Verify Ability to Indicate Resource Preferences for an Account

  @regtest
  Scenario Outline: HAC_378_Verify Able to indicate Resource Prefences on an Account
    Given Login as SERVICE SCH USER NAME
    When HAC145 select the applicaton
    When HAC145 close all the open tabs
    When HAC145 close the bottom bar
    When HAC145 select accounts tab
    When HAC145 create new Account based on Type "<AccType>", "<AccName>", "<TradeName>", "<Industry>",
    When click on the Resource prefence link and add new Resource preference "<ServiceResource>", "<DrpDownPreferenceType>","<PreferenceTypesCnt>"

    Examples: 
      | AccType  | AccName          | TradeName | Industry   |                        | ServiceResource             | DrpDownPreferenceType |
      | Customer | AutoTestCustomer | TestTrade | Automotive | Test Service Resource2 | Preferred,Required,Excluded |                     3 |
