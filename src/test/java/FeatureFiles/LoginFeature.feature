Feature: Testing the login feature of FaceBook app

Background:
Given The browser is open
And the application is loaded

Scenario: Testing the login feature with valid data
When the user enters valid username
And the user enters valid password
And the user clicks on login button
Then the Homepage should be display

Scenario: testing the forgotten link
When the user clicks on forgotten link
Then find your acc page should be displayed