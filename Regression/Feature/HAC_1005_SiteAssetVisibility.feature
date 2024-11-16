Feature: HAC_1005_View Site Asset from Service Appointment

@regtest 
  Scenario Outline: Login as service scheduler and view site asset from Service Appointment
    Given HAC1005 user enters <username> and <password>
    When HAC1005 select the applicaton
    When HAC1005 close all the open tabs
    When HAC1005 click on field service tab
    When HAC1005 select usa packaging policy
    When HAC1005 select service appointment filter
    When HAC1005 select service appointment
    When HAC1005 click edit button from service appointment
 		When HAC1005 click related tab on service appointment
 		When HAC1005 verify the assets on service appointment


    Examples: 
      | username                       | password | CaseContact | CaseFirstName | CaseSub     | Pricebook                           | InspectionEstimateMatrix | Estimateitem     |
      | testservicescheduler@gmail.com | H@ctest1 | FN6 MN6 LN6 | FN6           | TestCase110 | USA Domestic MPA-PEPSICO (FritoLay) | CEIA Drop Through        | IO/Commissioning |
