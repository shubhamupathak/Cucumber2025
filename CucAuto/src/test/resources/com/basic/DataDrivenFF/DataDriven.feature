Feature: Login HR Management
I Want to validate the Username and Password field of Login Page.

Scenario Outline: Validate HRM Login Page multiple fields
Given User is on HRM login page
When User enters "<UserName>" as username
And User enters "<Password>" as password
Then Check username "<UserName>" is present in username textbox
And Check password "<Password>" is present in password textbox
Examples:
	|UserName	|Password	|
	|Admin		|admin123	|
	|Shubham	|Test@1234|
