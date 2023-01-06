Feature: GTM_IMO Queue funcionalities
Background:
Given    User have to login with valid user id and password in omniapp URL
When     User have to select process name and enter the workitem number need to process

@imo1
Scenario: TO check the GTM IMO Queue funcionalities
And       User have to click the GTM workitem in the my search queue
And       User have to fill the required fields and click approve button

@imo2
Scenario: TO check the GTM IMO Queue funcionalities after approval
And       User have to fill the required fields
Then      User have to Submit it

@end
Scenario: To check the process is in end stage
And       User have to be in end stage

