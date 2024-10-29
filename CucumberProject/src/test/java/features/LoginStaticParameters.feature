Feature: Login functionality of the leaftaps application example of static parameters

Scenario: Login with valid credentials for static parameters

Given Launch the browser for static parameters
And Load the URL for static parameters
When Enter the username as 'DemoCSR' for static parameters
And Enter the password as 'crmsfa' for static parameters
And Click on the login button for static parameters
Then It should navigate to the next page for static parameters

Scenario: Login with invalid credentials for static parameters

Given Launch the browser for static parameters
And Load the URL for static parameters
When Enter the username as 'Demo' for static parameters
And Enter the password as 'crmsfa' for static parameters
And Click on the login button for static parameters
Then It should throw error message for static parameters
