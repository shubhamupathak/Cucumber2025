Feature: Login HR Management

Scenario: Validate HRM Login Page multiple fields
Given User is on HRM login page
When User enters username
And User enters password
Then Check username is present in username textbox
And Check password is present in password textbox
