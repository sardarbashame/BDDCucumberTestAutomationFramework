Feature: HAC_1012_ Territory Assignment
@regtest
  Scenario: Login as service user and HAC_1012_ Territory Assignment
    Given Login as SERVICE SCH USER NAME
    When select the Field Service application
    When HAC145 close all the open tabs
    When click on Service Resources tab
    When Click on recently created SA in the grid
    Then Verify Service Territories list view is displayed

@regtest
  Scenario Outline: Login as service user and HAC_1012_ Territory Assignment drag and Drop under Field Service
    Given Login as SERVICE SCH USER NAME
    When select the Field Service application
    When HAC145 close all the open tabs
    When click on Service Appointments tab
    When Create New Service Appointment with "<ParentRecord>", "<Status>", "<serviceTerritory>"
    When select the Field Service application
    When close all the open tabs
    When click on Field Service tab
    When Select any one of appointmentand Drag and Drop to gantt

    Examples: 
      | ParentRecord               | Status | serviceTerritory          |
      | United Batter and Breading | None   | US - Processing Pencil In |
