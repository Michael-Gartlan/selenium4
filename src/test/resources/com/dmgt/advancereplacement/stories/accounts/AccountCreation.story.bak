Scenario: Create a Billing Agency Account
Given the user is on the Salesforce home page
When I login to glue as Mail user
When I navigate to the New Account page with Record Type 'Agency'
When I select Account Type as 'Billing Agency'
When I fill in Mandatory fields for Billing Agency
When I click on Save
And I link with CCI
When I click on Account Mapping
And I verify Account Mapping
And I return to Billing Account
When I click on Finance Account
And I verify Finance Account

Scenario: Create a Booking Agency Account
Given the user is on the Salesforce home page
When I login to glue as Mail user
When I navigate to the New Account page with Record Type 'Agency'
When I select Account Type as 'Booking Agency'
When I fill in Mandatory fields for Booking Agency
When I click on Save
And I link with CCI
When I click on Account Mapping
And I verify Account Mapping

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

Scenario: Link Billing to Booking
Given the user is on the Salesforce home page
When I login to glue as Mail user
When I navigate to the New Account page with Record Type 'Agency'
When I select Account Type as 'Billing Agency'
When I fill in Mandatory fields for Billing Agency
When I click on Save
When I create a new Relationship of type Billing
Then the relationship is successfully made

Scenario: Link Booking to Client
Given the user is on the Salesforce home page
When I login to glue as Mail user
When I navigate to the New Account page with Record Type 'Agency'
When I select Account Type as 'Booking Agency'
When I fill in Mandatory fields for Booking Agency
When I click on Save
When I create a new Relationship of type Booking
Then the relationship is successfully made

