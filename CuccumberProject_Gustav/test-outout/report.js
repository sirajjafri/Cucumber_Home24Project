$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Siraj Jafri/git/CuccumberProject_Gustav/src/main/java/Features/RegistrationUser.feature");
formatter.feature({
  "line": 1,
  "name": "www.home24.de Registration scenario",
  "description": "",
  "id": "www.home24.de-registration-scenario",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Registering user on Home24",
  "description": "",
  "id": "www.home24.de-registration-scenario;registering-user-on-home24",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on prelogin Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of the page is correct",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Clicks on Signin button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user redirects to registration page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on Continue button and enters \"\u003cFName\u003e\", \"\u003cLName\u003e\", \"\u003cStreet\u003e\", \"\u003cPostal\u003e\", \"\u003cCity\u003e\", \"\u003cEmail\u003e\", \"\u003cPass\u003e\", \"\u003cCPass\u003e\" and clicks Continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user redirects to Home page post login",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user logs out from homepage post login",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "www.home24.de-registration-scenario;registering-user-on-home24;",
  "rows": [
    {
      "cells": [
        "FName",
        "LName",
        "Street",
        "Postal",
        "City",
        "Email",
        "Pass",
        "CPass"
      ],
      "line": 17,
      "id": "www.home24.de-registration-scenario;registering-user-on-home24;;1"
    },
    {
      "cells": [
        "Siraj",
        "Jafri",
        "Church road",
        "20801",
        "Bermingham",
        "mlp@gmail.com",
        "Test@123",
        "Test@123"
      ],
      "line": 18,
      "id": "www.home24.de-registration-scenario;registering-user-on-home24;;2"
    },
    {
      "cells": [
        "Siraj",
        "Jafri",
        "Church road",
        "20801",
        "Bermingham",
        "nkp@gmail.com",
        "Test@123",
        "Test@123"
      ],
      "line": 19,
      "id": "www.home24.de-registration-scenario;registering-user-on-home24;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": "Registering user on Home24",
  "description": "",
  "id": "www.home24.de-registration-scenario;registering-user-on-home24;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on prelogin Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of the page is correct",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Clicks on Signin button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user redirects to registration page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on Continue button and enters \"Siraj\", \"Jafri\", \"Church road\", \"20801\", \"Bermingham\", \"mlp@gmail.com\", \"Test@123\", \"Test@123\" and clicks Continue button",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user redirects to Home page post login",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user logs out from homepage post login",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStepDefinition.user_is_on_prelogin_Home_page()"
});
formatter.result({
  "duration": 17465710764,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStepDefinition.title_of_the_page_is_correct()"
});
formatter.result({
  "duration": 69972817,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStepDefinition.clicks_on_Signin_button()"
});
formatter.result({
  "duration": 7248542402,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStepDefinition.user_redirects_to_registration_page()"
});
formatter.result({
  "duration": 3020488507,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Siraj",
      "offset": 43
    },
    {
      "val": "Jafri",
      "offset": 52
    },
    {
      "val": "Church road",
      "offset": 61
    },
    {
      "val": "20801",
      "offset": 76
    },
    {
      "val": "Bermingham",
      "offset": 85
    },
    {
      "val": "mlp@gmail.com",
      "offset": 99
    },
    {
      "val": "Test@123",
      "offset": 116
    },
    {
      "val": "Test@123",
      "offset": 128
    }
  ],
  "location": "RegistrationStepDefinition.user_clicks_on_Continue_button_and_enters_and_clicks_Continue_button(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 12310808348,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStepDefinition.user_redirects_to_Home_page_post_login()"
});
formatter.result({
  "duration": 20483814,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStepDefinition.user_logs_out_from_homepage_post_login()"
});
formatter.result({
  "duration": 11433253846,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 709643465,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Registering user on Home24",
  "description": "",
  "id": "www.home24.de-registration-scenario;registering-user-on-home24;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on prelogin Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of the page is correct",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Clicks on Signin button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user redirects to registration page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on Continue button and enters \"Siraj\", \"Jafri\", \"Church road\", \"20801\", \"Bermingham\", \"nkp@gmail.com\", \"Test@123\", \"Test@123\" and clicks Continue button",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5,
    6,
    7
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user redirects to Home page post login",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user logs out from homepage post login",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationStepDefinition.user_is_on_prelogin_Home_page()"
});
formatter.result({
  "duration": 16710226291,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStepDefinition.title_of_the_page_is_correct()"
});
formatter.result({
  "duration": 15115074,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStepDefinition.clicks_on_Signin_button()"
});
formatter.result({
  "duration": 4504912420,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStepDefinition.user_redirects_to_registration_page()"
});
formatter.result({
  "duration": 3029497988,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Siraj",
      "offset": 43
    },
    {
      "val": "Jafri",
      "offset": 52
    },
    {
      "val": "Church road",
      "offset": 61
    },
    {
      "val": "20801",
      "offset": 76
    },
    {
      "val": "Bermingham",
      "offset": 85
    },
    {
      "val": "nkp@gmail.com",
      "offset": 99
    },
    {
      "val": "Test@123",
      "offset": 116
    },
    {
      "val": "Test@123",
      "offset": 128
    }
  ],
  "location": "RegistrationStepDefinition.user_clicks_on_Continue_button_and_enters_and_clicks_Continue_button(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 11661187847,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStepDefinition.user_redirects_to_Home_page_post_login()"
});
formatter.result({
  "duration": 18882109,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStepDefinition.user_logs_out_from_homepage_post_login()"
});
formatter.result({
  "duration": 11044612210,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 1187613627,
  "status": "passed"
});
});