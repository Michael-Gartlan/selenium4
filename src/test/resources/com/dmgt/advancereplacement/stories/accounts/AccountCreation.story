


Scenario: Login to salesforce
Given the user is on the Salesforce home page

When I login with username <username> and password <password>
When I create a new account

Examples:
|username|password|href|
|michael.gartlan@dmgmedia.co.uk.mailuser.uat|Summer_12|Accounts|
 
