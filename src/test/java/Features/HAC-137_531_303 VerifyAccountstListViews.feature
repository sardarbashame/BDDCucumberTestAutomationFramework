Feature: Verify the account list views
@Test
  Scenario Outline: Login as Service Users and Verify the account list views
    Given HAC137 user enters <username> and <password>
    When HAC137 select the applicaton
    When HAC137 close all the open tabs
    When HAC137 close the bottom bar
    When HAC137 user is on accounts home page
    When HAC137 click on accounts list view button
    Then HAC137 verify the all accounts list view
    Then HAC137 verify the my accounts list view
    Then HAC137 verify the customer accounts list view
    Then HAC137 verify the prospect accounts list view
    Then HAC137 verify the intercompany accounts list view
    Then HAC137 verify the oem accounts list view
    Then HAC137 select all accounts list view
    Then HAC137 verify the account name header in all accounts list view
    Then HAC137 verify the account site header in all accounts list view
    Then HAC137 verify the phone header in all accounts list view
    Then HAC137 verify the type header in all accounts list view
    Then HAC137 verify the shipping city header in all accounts list view
    Then HAC137 verify the corporate group header in all accounts list view
    Then HAC137 verify the shipping stateprovince name header in all accounts list view
    Then HAC137 verify the shipping country header in all accounts list view
    Then HAC137 verify the super region header in all accounts list view
    Then HAC137 verify the operating hours header in all accounts list view
    Then HAC137 verify the parent account header in all accounts list view
    Then HAC137 verify the account record type header in all accounts list view
    
    When HAC137 click on accounts list view button
    Then HAC137 select my accounts list view
    Then HAC137 verify the account name header in all accounts list view
    Then HAC137 verify the account site header in all accounts list view
    Then HAC137 verify the phone header in all accounts list view
    Then HAC137 verify the type header in all accounts list view
    Then HAC137 verify the shipping city header in all accounts list view
    Then HAC137 verify the shipping stateprovince name header in all accounts list view
    Then HAC137 verify the shipping country header in all accounts list view
    Then HAC137 verify the super region header in all accounts list view
    
		When HAC137 click on accounts list view button
		Then HAC137 select customer accounts list view
    Then HAC137 verify the account name header in all accounts list view
    Then HAC137 verify the account site header in all accounts list view
    Then HAC137 verify the phone header in all accounts list view
    Then HAC137 verify the type header in all accounts list view
    Then HAC137 verify the shipping city header in all accounts list view
    Then HAC137 verify the corporate group header in all accounts list view
    Then HAC137 verify the shipping stateprovince name header in all accounts list view
    Then HAC137 verify the shipping country header in all accounts list view
    Then HAC137 verify the super region header in all accounts list view
   
  
 		When HAC137 click on accounts list view button
		Then HAC137 select prospect accounts list view
    Then HAC137 verify the account name header in all accounts list view
    Then HAC137 verify the phone header in all accounts list view
    Then HAC137 verify the type header in all accounts list view
    Then HAC137 verify the shipping city header in all accounts list view
    Then HAC137 verify the shipping stateprovince name header in all accounts list view
    Then HAC137 verify the shipping country header in all accounts list view
    Then HAC137 verify the super region header in all accounts list view
    
    When HAC137 click on accounts list view button
		Then HAC137 select intercompany accounts list view
    Then HAC137 verify the account name header in all accounts list view
    Then HAC137 verify the phone header in all accounts list view
    Then HAC137 verify the type header in all accounts list view
    Then HAC137 verify the shipping city header in all accounts list view
    Then HAC137 verify the shipping stateprovince name header in all accounts list view
    Then HAC137 verify the shipping country header in all accounts list view
    Then HAC137 verify the super region header in all accounts list view
    
    
    Examples: 
      | username            | password    |
      | hctestcsr@gmail.com | M@shaallah2 |
