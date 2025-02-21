Feature: Validate Google Search
I Want to validate the Search Function of google
Scenario: Validate google search
Given User need to launch google site
When User enters "Ferrari" as keyword
Then Check keyword "Ferrari" is present in searchbox
