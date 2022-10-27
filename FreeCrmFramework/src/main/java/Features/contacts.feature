Feature: Free CRM Create Contacts
Scenario Outline: Free CRM Create a new Contact Scenario

    Given User is already on Login Page 
    When Title of Login page is Free CRM
   Then User enters "<Username>" and "<Password>"
    Then User clicks on Login button 
  Then User is on Homepage
   Then User moves to Create page
  Then User enters contact details "<Firstname>" and "<Lastname>" and "<Position>"
    Then Close the browser
  
  Examples:
  |Username                   |Password  |Firstname|Lastname|Position|
  |rupinderkaurbaath@gmail.com| Redrose94| Peter   |Tom     |Manager|
  |rupinderkaurbaath@gmail.com| Redrose94|David    |Dsauza  |Director|
  