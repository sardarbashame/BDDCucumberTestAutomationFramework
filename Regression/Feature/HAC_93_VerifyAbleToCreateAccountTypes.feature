Feature: HAC_93_Verify account types

  @regtest
  Scenario Outline: Verify able to create customer account type
    Given Login as SERVICE SCH USER NAME
    When HAC145 select the applicaton
    When HAC145 close all the open tabs
    When HAC145 close the bottom bar
    When HAC145 select accounts tab
    When HAC145 create new Account based on Type "<AccType>", "<AccName>", "<TradeName>", "<Industry>",
    Then HAC94 Verify Account type after new account created and displaying in the edit details page "<AccType>"

    Examples: 
      | AccType  | AccName          | TradeName | Industry   |
      | Customer | AutoTestCustomer | TestTrade | Automotive |

  @regtest
  Scenario Outline: HAC_93_Verify able to create supplier account type
    Given Login as SERVICE SCH USER NAME
    When HAC145 select the applicaton
    When HAC145 close all the open tabs
    When HAC145 close the bottom bar
    When HAC145 select accounts tab
    When HAC145 create new Account based on Type "<AccType>", "<AccName>", "<TradeName>", "<Industry>",
    Then HAC94 Verify Account type after new account created and displaying in the edit details page "<EditAccType>"

    Examples: 
      | AccType  | AccName          | TradeName | Industry   | EditAccType |
      | Supplier | AutoTestCustomer | TestTrade | Automotive | Partner     |
