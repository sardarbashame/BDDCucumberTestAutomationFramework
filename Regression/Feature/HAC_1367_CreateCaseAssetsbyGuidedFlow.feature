Feature: HAC_1367_Verify case assets creation by guided flow
@Test
   Scenario Outline: Login as service scheduler and Verify case assets creation by guided flow
    Given HAC1367 user enters <username> and <password>
    When HAC1367 select the applicaton
    When HAC1367 close all the open tabs
    When HAC1367 close the bottom bar
    When HAC1367 click on cases tab
    When HAC1367 create new case
    Then Add Asset and Verify Asset is displayed in the list view
    

    Examples: 
      | username                       | password | casename      |
      | testservicescheduler@gmail.com | H@ctest1 | PROCAutoCase1 |
