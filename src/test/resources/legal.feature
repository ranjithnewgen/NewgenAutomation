
Feature:  Validaion of GTM Legal workflow
@login
Scenario: Legal User Login Functionality
Given     Legal User have to launch the URL 
When      Legal User have to enter valid credientials
Then      Legal User should be in homepage

@legal
Scenario: GTM Legal Stage
Given     Legal User have to select process as GTM
When      Legal User have to enter workitem no and navigate to Legal stage
And       Legal User have to enter mandatory fields
Then      Legal User have to save and click ok