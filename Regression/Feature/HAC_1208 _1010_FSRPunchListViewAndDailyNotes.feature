Feature: HAC_1208 _1010_FSRPunchListViewAndDailyNotes


  Scenario: Login as service scheduler and HAC_1208_1010 -FSR Punchlist view and Daily Notes 
    Given Login as SERVICE TECHNICIAN USER NAME
    When select the Field Service application
    When close all the open tabs
    Then HAC1478 select the service appointments tab
    When Click on recently created SA in the grid
    When Click on Daily Notes tab
    When Create New Punch List Items under Field Service
    Then Verify Punch List Items created and displayed Under Field Service
    When Create Daily Notes under Field Service
    Then Verify Notes and Punch list is created and displayed
