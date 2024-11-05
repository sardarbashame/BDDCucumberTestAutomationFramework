Feature: Verify the Industry field on the customer account

@Test
  Scenario Outline: Login as Service Users and Verify the Industry field
    Given HAC387 user enters <username> and <password>
    When HAC387 select the applicaton
    When HAC387 close all the open tabs
    When HAC387 close the bottom bar
    When HAC387 select accounts tab
    When HAC387 create new customer account
    Then HAC387 verify industry name

    Examples: 
      | username                              | password    |
      | testservicescheduler@gmail.com        | M@shaallah1 |

  
