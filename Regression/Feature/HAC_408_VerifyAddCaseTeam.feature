Feature: HAC_408_Verify the case page layout fields

  @regtest
  Scenario: Login as service scheduler and verify the case page layout fields
    Given Login as SERVICE SCH USER NAME
    When HAC408 select the applicaton
    When HAC408 close all the open tabs
    When HAC408 close the bottom bar
    When HAC408 select cases tab
    When HAC408 create new case
    Then HAC408 click case team
    Then HAC408 add case team