Feature: HAC_1473_Automate Create Punchlist from Daily Notes


  Scenario: Login as service scheduler and HAC_1473_Automate Create Punchlist from Daily Notes
    Given Login as SERVICE TECHNICIAN USER NAME
    When select the Field Service application
    When close all the open tabs
    Then HAC1478 select the service appointments tab
    When Click on recently created SA in the grid
    When Click on Daily Notes tab and create new daily notes
    Then Verify Notes and Punch list is created and displayed
