Feature: HAC_1122_Verify contact creation

 @regtest
  Scenario Outline: Login as service scheduler and verify the contact creation
    Given HAC1122 user enters <username> and <password>
    When HAC1122 select the applicaton
    When HAC1122 close all the open tabs
    When HAC1122 close the bottom bar
    When HAC1122 select contacts tab
    When HAC1122 create new customer contact
    Then HAC1122 verify name field label
    Then HAC1122 verify account name field label
    Then HAC1122 verify title field label
    Then HAC1122 verify department field label
    Then HAC1122 verify email field label
    Then HAC1122 verify phone field label
    Then HAC1122 verify reportsto field label
    Then HAC1122 verify contactcurrency field label
    Then HAC1122 verify contactowner field label
    Then HAC1122 verify preferredlanguage field label
    Then HAC1122 verify mailingaddress field label
    Then HAC1122 verify location field label
    Then HAC1122 verify asstphone field label
    Then HAC1122 verify preferredtechnician field label
    Then HAC1122 verify otherphone field label
    Then HAC1122 verify mobile field label
    Then HAC1122 verify shift field label
    Then HAC1122 verify donotcall field label
    Then HAC1122 verify emailoptout field label

    Examples: 
      | username                              | password    |
      | testservicescheduler@gmail.com        | H@ctest1 |

  
