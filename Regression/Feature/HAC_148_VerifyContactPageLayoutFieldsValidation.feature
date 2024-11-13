Feature: HAC_148_Verify the contact page layout fields

  @Test
  Scenario Outline: Login as service scheduler and verify the contact page layout fields
    Given HAC148 user enters <username> and <password>
    When HAC148 select the applicaton
    When HAC148 close all the open tabs
    When HAC148 close the bottom bar
    When HAC148 select contacts tab
    When HAC148 create new customer contact
    Then HAC148 verify name field label
    Then HAC148 verify name field value
    Then HAC148 verify account name field label
    Then HAC148 verify account name field value
    Then HAC148 verify title field label
    Then HAC148 verify title field value
    Then HAC148 verify department field label
    Then HAC148 verify department field value
    Then HAC148 verify email field label
    Then HAC148 verify phone field label
    Then HAC148 verify reportsto field label
    Then HAC148 verify contactcurrency field label
    Then HAC148 verify contactowner field label
    Then HAC148 verify preferredlanguage field label
    Then HAC148 verify mailingaddress field label
    Then HAC148 verify contact related list quick links

    Examples: 
      | username                       | password |
      | testservicescheduler@gmail.com | H@ctest1 |
