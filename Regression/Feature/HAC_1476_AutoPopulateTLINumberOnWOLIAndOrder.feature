Feature: HAC_1476_ Auto populate TLI Number on WOLI and Order
@regtest
  Scenario Outline: Login as service user and 1476_ Auto populate TLI Number on WOLI and Order
    Given Login as SERVICE SCH USER NAME
    When HAC1478 select the applicaton
    When HAC1478 close all the open tabs
    When HAC1478 close the bottom bar
    When HAC1478 click on cases tab
    When Create new case with "<ContactName>", "<CaseType>", "<SalesOrder>"
    Then Verify TLI number is displayed under Case details tab
    Then HAC1478 click on work order link
    Then HAC1478 create work order
    Then Verify TLI number is displayed under Case details tab
    When Add New Work Order Line Items
    Then Verify TLI number is displayed under Case details tab

    Examples: 
      | ContactName         | CaseType   | SalesOrder |
      | FN6 MN6 LN6 Suffix6 | Scheduling |   00000101 |
