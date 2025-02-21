Feature: Login HR Management
I Want to validate the Username and Password field of Login Page.

Background: User launches HRM application
Given User is on HRM login page

Scenario: Validate HRM Login Page multiple fields
When User enters "Admin" as username
And User enters "admin123" as password
Then Check username "Admin" is present in username textbox
And Check password "admin123" is present in password textbox

Scenario: Click on login button
When User clicks submit button
Then Check user is on dashboard page