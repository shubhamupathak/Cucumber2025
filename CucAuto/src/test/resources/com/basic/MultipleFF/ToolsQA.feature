Feature: Validate ToolsQA

I Want to validate that provided URL has launch correct or not
Scenario: Validate URL
Given User need to launch given URL
Then Check keyword "Selenium Tutorial" header is present in searchbox
