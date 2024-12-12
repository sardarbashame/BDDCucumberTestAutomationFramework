Feature: HAC_1208 -FSR Punchlist view
@Test

  Scenario: Login as service scheduler and HAC_1208 -FSR Punchlist view
    Given Login as SERVICE TECHNICIAN USER NAME
    When select the Field Service application
    When close all the open tabs
    Then HAC1478 select the service appointments tab
    When Click on recently created SA in the grid
    When Click on Field Service Report tab
    When Create New Equipment Information under Field Service
    Then Verify Equipment Information created and displayed Under Field Service
   
