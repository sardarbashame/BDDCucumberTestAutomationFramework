Feature: Verify the case page layout fields

 @Test
  Scenario Outline: Login as service scheduler and verify the case page layout fields
    Given HAC408 user enters <username> and <password>
    When HAC408 select the applicaton
    When HAC408 close all the open tabs
    When HAC408 close the bottom bar
    When HAC408 select cases tab
    When HAC408 create new case
    Then HAC408 click case team
    Then HAC408 add case team
    

    Examples: 
      | username                              | password    |
      | testservicescheduler@gmail.com        | H@ctest1 |

  
