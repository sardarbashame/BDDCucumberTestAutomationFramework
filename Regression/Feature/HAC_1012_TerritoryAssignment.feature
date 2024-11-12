Feature: HAC_1012_ Territory Assignment
@Test
  Scenario: Login as service user and HAC_1012_ Territory Assignment
    Given Login as SERVICE SCH USER NAME
    When select the Field Service application
    When close all the open tabs
    When click on Service Resources tab
    When Click on recently created SA in the grid
    Then Verify Service Territories list view is displayed
@Test
  Scenario: Login as service user and HAC_1012_ Territory Assignment drag and Drop under Field Service
    Given Login as SERVICE SCH USER NAME
    When select the Field Service application
    When close all the open tabs
    When click on Field Service tab
    When Select any one of appointmentand Drag and Drop to gantt
