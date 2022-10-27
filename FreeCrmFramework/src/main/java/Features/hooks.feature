Feature: Free CRM app test

Scenario: free crm create deal test
Given User is on deal page
When User fills the deals form
Then Deal is created 

Scenario: free crm create contact test
Given User is on contact page
When User fills the contact form
Then contact is created 


Scenario Outline: free crm create mail test
Given User is on mail page
When User fills the mail form 
Then mail is created 
Examples:
|mail1|
|mail2|
|mail3|
|mail4|


