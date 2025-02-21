Feature: Login HR Management
I Want to validate the Username and Password field of Login Page.
Scenario: Validate HRM Login Page multiple fields
Given User is on HRM login page
When User enters "Admin" as username
And User enters "admin123" as password
Then Check username "Admin" is present in username textbox
And Check password "admin123" is present in password textbox

Scenario: Click on login button
Given User is on HRM login page
When User clicks submit button
Then Check user is on dashboard page