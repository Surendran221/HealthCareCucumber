Feature: validate the login functionality of healthcare page
Scenario: validate the login valid username and valid password
Given user should open chrome and load url
When user should input valid username and valid password
And user should click the login button
Then user should navigate to correct credential page are not

