$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/first_login.feature");
formatter.feature({
  "name": "Sign in into the system",
  "description": "  As a guest\n  I want to sign in into the system\n  So that I could do booking",
  "keyword": "Feature"
});
formatter.background({
  "name": "I as Guest go to Sign in page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I click on button Create account",
  "keyword": "Given "
});
formatter.match({
  "location": "Def.iClickOnButton()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Successful sign in",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I enter a new email address into Email address text field",
  "keyword": "When "
});
formatter.match({
  "location": "Def.iEnterANewEmailAddressIntoTextField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter a valid password into Password text field",
  "keyword": "And "
});
formatter.match({
  "location": "Def.iEnterAPasswordIntoTextField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on sign in submit button Create account",
  "keyword": "And "
});
formatter.match({
  "location": "Def.iClickOnSignInButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see a pop up window with message to activate your account.",
  "keyword": "Then "
});
formatter.match({
  "location": "Def.iSeeAPopUpWindowWithMessageToActivateYourAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "I as Guest go to Sign in page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I click on button Create account",
  "keyword": "Given "
});
formatter.match({
  "location": "Def.iClickOnButton()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Email already exists in the system",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I enter an existing in data base email address into Email address text field",
  "keyword": "When "
});
formatter.match({
  "location": "Def.iEnterAnExistingInDataBaseEmailAddressIntoTextField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter a valid password into Password text field",
  "keyword": "And "
});
formatter.match({
  "location": "Def.iEnterAPasswordIntoTextField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on sign in submit button Create account",
  "keyword": "And "
});
formatter.match({
  "location": "Def.iClickOnSignInButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see a pop up window with message to enter another email.",
  "keyword": "Then "
});
formatter.match({
  "location": "Def.iSeeAPopUpWindowWithMessageToEnterAnotherEmail()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});