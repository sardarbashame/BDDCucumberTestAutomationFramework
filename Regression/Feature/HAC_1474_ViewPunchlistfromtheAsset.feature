Feature: HAC_1473_Automate Create Punchlist from Daily Notes
  @regtest
  Scenario: Login as service scheduler and HAC_1473_Automate Create Punchlist from Daily Notes
    Given Login as SERVICE TECHNICIAN USER NAME
    When select the Assets application
    When close all the open tabs
    When Click on recently created Assets in the grid
    When Click on Related Records tab
    When Create New Pnuch List Items
    Then Verify Punch List Items created and displayed
