Feature: Create Lead functionality of the leaftaps application example of dynamic parameters

Scenario Outline: Create Lead with multiple data

Given Launch the browser for dynamic parameters
And Load the URL for static parameters
When Enter the username as 'DemoCSR' for dynamic parameters
And Enter the password as 'crmsfa' for dynamic parameters
And Click on the login button for dynamic parameters
Then It should navigate to the next page for dynamic parameters
When Click on the crmsfa link
Then It should navigate to leads home page
When Click on the Leads link
And Clik on the Create Lead link
And Enter the companyname as <companyName>
And Enter the firstname as <firstName>
And Enter the lastname as <lastName>
And Click on the Create Lead button
Then Lead should be created

Examples: 
|companyName|firstName|lastName|
|Cognizant|Yabath|J|
|TCS|Joshva|Jeyasingh|

