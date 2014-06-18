
Scenario: Looking up the definition of 'apple'
Given the user is on the Wikionary home page
When the user looks up the definition of the word 'apple'
Then they should see the definition 'The apple is the pomaceous fruit of the apple tree'

Scenario: Looking up the definition of 'pear'
Given the user is on the Wikionary home page
When the user looks up the definition of the word 'pear'
Then they should see the definition 'The pear is any of several tree'
