Feature: HAC_1482_Auto populate work order no in Expense record
  @Test
  Scenario: Login as service user and HAC_1482_Auto populate work order no in Expense record
    Given Login as SERVICE SCH USER NAME
    When select the Field Service application
    When close all the open tabs
    When click on Service Appointments tab
    When Select any existing Service Appointment
    When Click on Timesheet & Expenses sub tab
    When Create New Expanses and save it
    Then Open Created Exanses and verify work order number is displayed
