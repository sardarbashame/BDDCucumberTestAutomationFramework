Feature: HAC_1369_TLIReferenceonKeysObjects
@regtest
  Scenario: Login as service user and HAC_1369_TLI Reference on Keys Objects For Quote,Inquiries,Order and Order Product
    Given Login as SERVICE SCH USER NAME
    When HAC1165 select the applicaton
    When HAC1165 close all the open tabs
    When HAC1165 close the bottom bar
    When click on Quote tab
    Then verify TLI number displayed under Quote details tab
    When select the Inquiries application
    When verify TLI number displayed under Inquiries details tab
    When click on Orders tab
    Then verify TLI number displayed under Order details tab
    When click on Orders Related tab
    Then verify TLI number displayed under Order product details tab
@regtest
  Scenario: Login as service user and HAC_1369_TLI Reference on Keys Objects For Work Order and  Service Appointments
    Given Login as SERVICE SCH USER NAME
    When select the Field Service application
    When HAC1165 close all the open tabs
    When click on Work Order tab
    Then verify TLI number displayed under Work Order details tab
    When click on Service Appointments tab
    Then verify TLI number displayed under Service Appointments details tab
