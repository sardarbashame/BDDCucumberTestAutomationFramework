Feature: Verify processing estimate creation

<<<<<<< HEAD:src/test/java/Features/HAC-1165 CreateProcessingEstimatewithIOCommissioing.feature
   @regtest
=======
  Scenario: Login as Service Scheduler and Verify the processing estimate creation
    Given Login as service user

  @Test
>>>>>>> 88e5c101390800f6e1993ee525f7fe7b9e66e365:src/test/java/Features/HAC-1165 CreateProcessingEstimate.feature
  Scenario Outline: Login as Service Scheduler and Verify the processing estimate creation
    Given HAC1165 user enters <username> and <password>
    When HAC1165 select the applicaton
    When HAC1165 close all the open tabs
    When HAC1165 close the bottom bar
    When HAC1165 click on cases tab
    When HAC1165 create new case
    When HAC1165 user is on estimate tab
    When HAC1165 verify the pricebook options
    When HAC1165 select values on estimate flow step1
    When HAC1165 verify the field label number of tech
 #   When HAC1165 verify the field value number of tech
    When HAC1165 verify the field label number of days
    When HAC1165 verify the field label number of hours
    When HAC1165 select from date
    When HAC1165 select to date
    When HAC1165 select view confirmation
    Then HAC1165 generate estimate pdf

    Examples: 
      | username                       | password    |
      | mubeen.mohiuddin@gerent.com.qa | Strange@234 |
