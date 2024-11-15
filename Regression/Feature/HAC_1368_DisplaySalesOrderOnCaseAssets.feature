Feature: HAC_1368_Verify sales order on case assets
@regtest
   Scenario Outline: Login as service scheduler and Verify case assets creation by guided flow
    Given HAC1368 user enters <username> and <password>
    When HAC1368 select the applicaton
    When HAC1368 close all the open tabs
    When HAC1368 close the bottom bar
    When HAC1368 click on cases tab
    When HAC1368 create new case
    Then Add Asset and Verify Asset is displayed in the list view
    

    Examples: 
      | username                       | password | casename      |
      | testservicescheduler@gmail.com | H@ctest1 | PROCAutoCase1 |
