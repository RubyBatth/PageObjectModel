Feature: Deal data creation

Scenario: Free CRM Create a new deal scenario

    Given User is already on Login Page 
    When Title of Login page is Free CRM
   Then User enters Username and Password
   |Username                   |Password|
   |rupinderkaurbaath@gmail.com|Redrose94|
   
    Then User clicks on Login button 
  Then User is on Homepage
   Then User moves to new deal page
  Then User enters deal details
  |Title    |Amount|Probability|Commission| 
 |test deal1| 1000 | 50        | 10       |
 |test deal2| 2000 | 60        | 20       |
 |test deal3| 3000 | 70        | 30       |
 
 Then Close the browser