Feature: HAC_1121_Verify the contact list views

  Scenario: Login as service user and verify the contact list views
    Given Login as SERVICE SCH USER NAME
    When HAC1124 select the applicaton
    When HAC1124 close all the open tabs
    When HAC1124 close the bottom bar
 		When HAC1124 user is on contact home page
    When HAC1124 click on contact list view button
    Then HAC1124 verify the customer contact list view
    Then HAC1124 verify the heat and control billing contacts list view
    Then HAC1124 verify the heat and control sales contacts list view
    Then HAC1124 verify the vendor contacts list view
    Then HAC1124 select the customer contacts list view
    Then HAC1124 verify the name column in customer contact list view
    Then HAC1124 verify the title column in customer contact list view
    Then HAC1124 verify the account name column in customer contact list view
    Then HAC1124 verify the phone column in customer contact list view
    Then HAC1124 verify the mobile column in customer contact list view
    Then HAC1124 verify the preferred phone column in customer contact list view
    Then HAC1124 verify the email column in customer contact list view
    Then HAC1124 verify the mailing city column in customer contact list view
    When HAC1124 click on contact list view button
    Then HAC1124 select the heatandcontrolbilling contacts list view
    Then HAC1124 verify the name column in customer contact list view
    Then HAC1124 verify the account name column in customer contact list view
    Then HAC1124 verify the phone column in customer contact list view
    Then HAC1124 verify the email column in customer contact list view
    Then HAC1124 verify the title column in customer contact list view
    When HAC1124 click on contact list view button
    Then HAC1124 select the heatandcontrolsales contacts list view
    Then HAC1124 verify the name column in customer contact list view
    Then HAC1124 verify the account name column in customer contact list view
    Then HAC1124 verify the phone column in customer contact list view
    Then HAC1124 verify the email column in customer contact list view
    Then HAC1124 verify the title column in customer contact list view
    When HAC1124 click on contact list view button
    Then HAC1124 select the vendor contacts list view
    Then HAC1124 verify the name column in customer contact list view
    Then HAC1124 verify the account name column in customer contact list view
    Then HAC1124 verify the phone column in customer contact list view
    Then HAC1124 verify the email column in customer contact list view
    Then HAC1124 verify the title column in customer contact list view
