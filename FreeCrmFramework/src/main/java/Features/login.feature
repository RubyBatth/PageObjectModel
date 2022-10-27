#Author:your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#Without examples keyword
Feature: Free CRM Login Feature
  I want to use this template for my feature file

Scenario: Free CRM Login Test Scenario
    Given User is already on Login Page 
    When Title of Login page is Free CRM
   Then User enters "rupinderkaurbaath@gmail.com" and "Redrose94"
    Then User clicks on Login button 
  Then User is on Homepage
  
  #With examples keyword
Scenario Outline: Free CRM Login Test Scenario
    Given User is already on Login Page 
    When Title of Login page is Free CRM
   Then User enters "<Username>" and "<Password>"
    Then User clicks on Login button 
  Then User is on Homepage
  Then Close the browser
  
  Examples:
  |Username                    |Password  |
  |rupinderkaurbaath@gmail.com | Redrose94|
  |test94              |   test@64 |
  
  