$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("createContact.feature");
formatter.feature({
  "line": 1,
  "name": "Create new contact",
  "description": "",
  "id": "create-new-contact",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user opens corrrect browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user should navigate to corrrect URL",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters user name",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button2",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user is logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "createNewContact.user_opens_corrrect_browser()"
});
formatter.result({
  "duration": 5951168957,
  "status": "passed"
});
formatter.match({
  "location": "createNewContact.user_should_navigate_to_corrrect_URL()"
});
formatter.result({
  "duration": 8095191616,
  "status": "passed"
});
formatter.match({
  "location": "createNewContact.user_enters_user_name()"
});
formatter.result({
  "duration": 972475350,
  "status": "passed"
});
formatter.match({
  "location": "createNewContact.user_enters_password()"
});
formatter.result({
  "duration": 496124687,
  "status": "passed"
});
formatter.match({
  "location": "createNewContact.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 205580676,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_is_logged_in_successfully()"
});
formatter.result({
  "duration": 261724,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "user should be able to create new contact record",
  "description": "",
  "id": "create-new-contact;user-should-be-able-to-create-new-contact-record",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@CreateContact"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "user should be present on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user should click on contact",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "new button should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user enters all the required details",
  "rows": [
    {
      "cells": [
        "Elston",
        "desa",
        "Diago",
        "elston.desa@corp.com",
        "Co-operator"
      ],
      "line": 18
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "contact should be saved successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "createNewContact.user_should_be_present_on_homepage()"
});
formatter.result({
  "duration": 10092317782,
  "status": "passed"
});
formatter.match({
  "location": "createNewContact.user_should_click_on_contact()"
});
formatter.result({
  "duration": 7268234342,
  "status": "passed"
});
formatter.match({
  "location": "createNewContact.new_button_should_be_displayed()"
});
formatter.result({
  "duration": 10792409693,
  "status": "passed"
});
formatter.match({
  "location": "createNewContact.user_enters_all_the_required_details(DataTable)"
});
formatter.result({
  "duration": 9884518097,
  "status": "passed"
});
formatter.match({
  "location": "createNewContact.contact_should_be_saved_successfully()"
});
formatter.result({
  "duration": 67390359,
  "status": "passed"
});
formatter.after({
  "duration": 822824085,
  "status": "passed"
});
});