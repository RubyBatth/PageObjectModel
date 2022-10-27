 @FunctionalTest
Feature: Free CRM application testing
@SmokeTest @RegressionTest
Scenario: Login with correct username and password
Given This is a valid login test

@RegressionTest
Scenario: Login with incorrect username and password
Given This is a invalid login test

@SmokeTest
Scenario: Create  a contact
Given This is a contact  test case

@SmokeTest @RegressionTest
Scenario: Create  a contact
Given This is a contact  test case

@RegressionTest
Scenario: Create  a deal
Given This is a deal test case

@SmokeTest
Scenario: Create  a tasks
Given This is a tasks  test case

@SmokeTest
Scenario: Create  a case
Given This is a case  test case

@SmokeTest @RegressionTest
Scenario: verify left panel links
Given clicking on left panel links

@SmokeTest
Scenario: Search a deal
Given This is a Search deal test

@SmokeTest
Scenario: Search a contact
Given This is a Search contact test

@SmokeTest @RegressionTest
Scenario: Search a case
Given This is a Search case test

@SmokeTest @RegressionTest
Scenario: Search a task
Given This is a Search task test

@SmokeTest @End2End
Scenario: Search a call
Given This is a Search call test

@SmokeTest @End2End
Scenario: Search a email
Given This is a Search email test

@SmokeTest @End2End
Scenario: Search a docs
Given This is a Search docs test

@SmokeTest @End2End
Scenario: Search a forms
Given This is a Search forms test

@End2End
Scenario: Application Logout
Given This is a logout test

Scenario: browser closed
Given This is a close browser test




