Feature: Login functionality of salesforce Application for DynmicPara

Scenario Outline: Login with valid credentials for DynmicPara

Given Launch the browser for salesForce to DynmicPara
And Load the url for salesForce for DynmicPara
When Enter the username for DynmicPara as <userName>
And Enter the password for DynmicPara as <password> 
And Click on the login in button for DynmicPara
Then It shoul navigated to HomePage for DynmicPara
When Click on toggle menu button from the left corner for DynmicPara
And Click view All and click Sales from App Launcher for DynmicPara
And Click on Accounts tab for DynmicPara
When Search for the account using unique account name as <accountName>
  And Click the dropdown icon next to the account and select Edit
  And Enter a unique number in the Phone field <phoneNumber>
   And Set Type to Technology Partner 
  And Set Industry to Healthcare 
  And Enter the Billing Address <billAddress>
  And Enter the Shipping Address <shipAddress>
  And Set Customer Priority to Low 
  And Set SLA to Silver  
  And Set Upsell Opportunity to No
  And Set Active to NO
  And Click on the Save button 
  Then  verify the phone number

  Examples:s
  #|userName|password|accountName|phoneNumber|type|industry|billAddress|shipAddress|cusPriority|SLA|Active|upsellOpportuinity|
  |userName|password|accountName|phoneNumber|billAddress|shipAddress|
  |dilip@testleaf.com|leaf@2024|Joshva|123456546|Chennai|Thoothukudi|
  

  