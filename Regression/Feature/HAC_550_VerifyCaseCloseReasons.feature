Feature: HAC_550_Verify the case close reasons

  @regtest
  Scenario: Login as service manager and verify the case closure reasons
    Given Login as SERVICE SCH USER NAME
    When HAC550 select the applicaton
    When HAC550 close all the open tabs
    When HAC550 close the bottom bar
    When HAC550 select cases tab
    When HAC550 create new case
    Then HAC550 click case close quick action
    Then HAC550 verify case close reasons