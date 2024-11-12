Feature: HAC_136 Verify Allow Activities to create Log, Task and Event for Customer Account
@Test3
  Scenario Outline: HAC_136_Verify Allow Activities to Create Log, Task and Event for Customer Account
    Given Login as SERVICE SCH USER NAME
    When HAC145 select the applicaton
    When HAC145 close all the open tabs
    When HAC145 close the bottom bar
    When HAC145 select accounts tab
    When HAC145 create new Account based on Type "<AccType>", "<AccName>", "<TradeName>", "<Industry>", "<DropDownValues>"
    When click on Log a call
    When click on Create New task
    When click on Create New Event

    Examples: 
      | AccType  | AccName          | TradeName | Industry   | DropDownValues          |
      | Customer | AutoTestCustomer | TestTrade | Automotive | Customer,Prospect,Other |

  @Test3
  Scenario: HAC_136_Verify Allow Activities to Create Log, Task and Event for Customer Account
    Given Login as SERVICE SCH USER NAME
    When HAC145 select the applicaton
    When HAC145 close all the open tabs
    When HAC145 close the bottom bar
    When HAC1122 select contacts tab
    When HAC1122 create new customer contact
    When click on Log a call
    When click on Create New task
    When click on Create New Event
