Feature: Login HR Management
I Want to validate the Username and Password field of Login Page.

Scenario: Validate HRM Login for multiple users.
Given User is on HRM login page
When User enters following data
	|UserName	|Password	|
	|Admin		|admin123	|
	|Shubham	|Test@1234|