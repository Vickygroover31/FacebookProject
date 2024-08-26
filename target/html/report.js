$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Login.feature");
formatter.feature({
  "name": "Create the Facebook Account",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.background({
  "name": "User Launch the Application",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the Facebook Application  \"https://www.facebook.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.faceBook.stepDefinition.CreateAccount.launch_the_facebook_application(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the Launched Application  \"https://www.facebook.com/\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.faceBook.stepDefinition.CreateAccount.validate_the_launched_application(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks on Create Account",
  "keyword": "When "
});
formatter.match({
  "location": "com.faceBook.stepDefinition.CreateAccount.user_clicks_on_create_account()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User gives information",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@infoinonedimlist"
    },
    {
      "name": "@onedimlist"
    }
  ]
});
formatter.step({
  "name": "User enters the information with one dim list",
  "rows": [
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "com.faceBook.stepDefinition.CreateAccount.user_enters_the_information_with_one_dim_list(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks on Sign-up list",
  "keyword": "And "
});
formatter.match({
  "location": "com.faceBook.stepDefinition.CreateAccount.user_clicks_on_sign_up_list()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
});