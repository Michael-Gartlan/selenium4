


Scenario: Create a Billing Agency Account
Given the user is on the Salesforce home page
When I login with username <username> and password <password>
When I navigate to the New Account page with Record Type 'Advertiser'

Examples:
|username|password|href|
|michael.gartlan@dmgmedia.co.uk.mailuser.uat|Summer_12|Accounts|
 
