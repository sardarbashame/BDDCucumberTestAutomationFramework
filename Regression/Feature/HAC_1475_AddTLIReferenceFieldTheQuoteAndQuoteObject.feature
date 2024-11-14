Feature: HAC_1475_Add TLI reference field to the Quote list view & Quote Object
@regtest
  Scenario: Login as service scheduler user and HAC_1475_Add TLI reference field to the Quote list view & Quote Object
    Given Login as SERVICE SCH USER NAME
    When HAC1165 select the applicaton
    When close all the open tabs
    When close the bottom bar
    When click on Quote tab
    Then Verify TLI number column under All Quotes and Estimates filter
