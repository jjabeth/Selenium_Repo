Feature: Login functionality of salesforce Application

Scenario: Login with valid credentials

Given Launch the browser for salesForce
And Load the url for salesForce
When Enter the username as dilip@testleaf.com
And Enter the password as leaf@2024
And Click on the login in button
Then It shoul navigated to HomePage
When Click on toggle menu button from the left corner
And Click view All and click Sales from App Launcher
And Click on Accounts tab
And Click on New button
And Enter your name as account name
And Select Ownership as Public
And Click on the save button 
Then verify Account name