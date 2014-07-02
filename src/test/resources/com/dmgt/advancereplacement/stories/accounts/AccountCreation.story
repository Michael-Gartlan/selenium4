!--Scenario: Create a Billing Agency Account
!--Given the user is on the Salesforce home page
!--When I login to glue as Mail user
!--When I navigate to the New Account page with Record Type 'Agency'
!--When I select Account Type as 'Billing Agency'
!--When I fill in Mandatory fields for Booking Agency
!--And I click on Save
!--Then the account should be saved without error

!--Scenario: Create a Booking Agency Account
!--Given the user is on the Salesforce home page
!--When I login to glue as Mail user
!--When I navigate to the New Account page with Record Type 'Agency'
!--When I select Account Type as 'Booking Agency'
!--When I fill in Mandatory fields for Booking Agency
!--And I click on Save
!--Then the account should be saved without error 


Scenario: Create a Client Advertiser Account
Given the user is on the Salesforce home page
When I login to glue as Mail user
When I navigate to the New Account page with Record Type 'Advertiser'
When I select Account Type as 'Client Advertiser'
When I fill in Mandatory fields for Booking Agency
And I click on Save
Then the account should be saved without error