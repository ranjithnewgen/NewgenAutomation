Feature:  Validaion of GTM Initiate workflow



@login
Scenario: Login Functionality
Given     User have to launch the URL 
When      User have to enter valid credientials
Then      User should be in homepage

@workitemno
Scenario: Getting Workitem no and filling mandatory fields
Given     User have to click GTM Initiate option
When      User have to get workitem no
And       User have to fill  mandatory fields
And       User have to upload  document
And       User have to submit  document and navigate to parent window






       

       
