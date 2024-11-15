Feature: HAC_622_Verify the Trade Name field on the customer account

  @regtest
  Scenario Outline: Login as Service Users and Verify the Trade Name field
    Given HAC622 user enters <username> and <password>
    When HAC622 select the applicaton
    When HAC622 close all the open tabs
    When HAC622 close the bottom bar
    When HAC622 select accounts tab
    When HAC622 create new customer account
    Then HAC622 verify trade name

    Examples: 
      | username                              | password    |
      | testservicescheduler@gmail.com        | H@ctest1 |

  
