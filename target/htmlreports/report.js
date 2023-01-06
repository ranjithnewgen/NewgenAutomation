$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/imo.feature");
formatter.feature({
  "name": "GTM_IMO Queue funcionalities",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User have to login with valid user id and password in omniapp URL",
  "keyword": "Given "
});
formatter.match({
  "location": "GtmImo_StepDefinition.user_have_to_login_with_valid_user_id_and_password_in_omniapp_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to select process name and enter the workitem number need to process",
  "keyword": "When "
});
formatter.match({
  "location": "GtmImo_StepDefinition.user_have_to_select_process_name_and_enter_the_workitem_number_need_to_process()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To check the process is in end stage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@end"
    }
  ]
});
formatter.step({
  "name": "User have to be in end stage",
  "keyword": "And "
});
formatter.match({
  "location": "GtmImo_StepDefinition.user_have_to_be_in_end_stage()"
});
formatter.result({
  "status": "passed"
});
});