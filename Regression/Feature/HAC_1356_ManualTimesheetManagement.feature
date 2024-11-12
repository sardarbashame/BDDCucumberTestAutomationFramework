Feature: HAC_1356 Manual Timesheet Management

   
  Scenario: Login as service user and HAC_1356_Manual Timesheet Management
    Given Login as SERVICE REP USER NAME
    When select the Field Service application
    When close all the open tabs
    When click on Service Appointments tab
    When verify TLI number displayed under Service Appointments details tab
    Then Change status to Travel to Customer Location
    When Click on Timesheet & Expenses sub tab
    Then Click on TimeSheet Entries and verify all the lables under details tab

   