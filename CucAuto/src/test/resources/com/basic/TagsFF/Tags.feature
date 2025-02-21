@Important
Feature: Login HR Management
I Want to validate the Username and Password field of Login Page.

@Case1
Scenario: Validate HRM Login Page multiple fields
Given User is on HRM login page
When User enters "Admin" as username
And User enters "admin123" as password
Then Check username "Admin" is present in username textbox
And Check password "admin123" is present in password textbox

@Case2
Scenario: Click on login button
Given User is on HRM login page
When User clicks submit button
Then Check user is on dashboard page

@Case3
Scenario: Launch Google Search Engine
Given User need to launch google URL
Then Check user is on search page