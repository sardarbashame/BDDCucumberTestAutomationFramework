@Test
Feature: Verify account types

  Scenario Outline: Verify able to create customer account type
    Given Login as service user
    When HAC145 select the applicaton
    When HAC145 close all the open tabs
    When HAC145 close the bottom bar
    When HAC145 select accounts tab
    When HAC145 create new Account based on Type "<AccType>", "<AccName>", "<TradeName>", "<Industry>", "<DropDownValues>"
    Then HAC94 Verify Account type after new account created and displaying in the edit details page "<AccType>","<AccTypesCnt>"

    Examples: 
      | username                       | password    | AccType  | AccName          | TradeName | Industry   | DropDownValues          | AccTypesCnt |
      | mubeen.mohiuddin@gerent.com.qa | Strange@234 | Customer | AutoTestCustomer | TestTrade | Automotive | Customer,Prospect,Other |           3 |

  Scenario Outline: Verify able to create supplier account type
    Given Login as service user
    When HAC145 select the applicaton
    When HAC145 close all the open tabs
    When HAC145 close the bottom bar
    When HAC145 select accounts tab
    When HAC145 create new Account based on Type "<AccType>", "<AccName>", "<TradeName>", "<Industry>", "<DropDownValues>"
    Then HAC94 Verify Account type after new account created and displaying in the edit details page "<EditAccType>","<AccTypesCnt>"

    Examples: 
      | username                       | password    | AccType  | AccName          | TradeName | Industry   | DropDownValues                        | EditAccType | AccTypesCnt |
      | mubeen.mohiuddin@gerent.com.qa | Strange@234 | Supplier | AutoTestCustomer | TestTrade | Automotive | Intercompany,OEM,Partner,Vendor,Other | Partner     |           5 |
