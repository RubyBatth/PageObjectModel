Feature: Deal data creation
Scenario: Free CRM Create a new deal scenario

    Given User is already on Login Page 
    When Title of Login page is Free CRM
   Then User enters Username and Password
   |rupinderkaurbaath@gmail.com|Redrose94|
    Then User clicks on Login button 
  Then User is on Homepage
   Then User moves to new deal page
  Then User enters deal details 
 |test deal| 1000 | 50 | 10|
    Then Close the browser
  