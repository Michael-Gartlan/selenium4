Scenario: Create a Private Advertiser Account
Given the user is on the Salesforce home page
When I login to glue as Mail user
When I navigate to the New Account page with Record Type 'Advertiser'
When I select Account Type as 'Private Advertiser'
When I fill in Mandatory fields for Advertiser
When I click on Save
And I link with CCI
When I click on Account Mapping
And I verify Account Mapping