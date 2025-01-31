Feature: HAC_1545_Verify asset list views

  Scenario: verify the asset list views
    Given Login as SERVICE SCH USER NAME
    When HAC1122 select the applicaton
    When HAC1122 close all the open tabs
    When HAC1122 close the bottom bar
    When HAC1546 select assets tab
    Then HAC1545 verify assets list views