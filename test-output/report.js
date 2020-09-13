$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Background.feature");
formatter.feature({
  "line": 1,
  "name": "Background Change",
  "description": "As a user, I want the background color to change when I click on the button",
  "id": "background-change",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7995396300,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Sky Blue Background",
  "description": "",
  "id": "background-change;sky-blue-background",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "the Set SkyBlue Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on the Set SkyBlue Background button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "ChangeSteps.the_Set_SkyBlue_Background_button_exists()"
});
formatter.result({
  "duration": 157192400,
  "status": "passed"
});
formatter.match({
  "location": "ChangeSteps.i_click_on_the_Set_SkyBlue_Background_button()"
});
formatter.result({
  "duration": 79012800,
  "status": "passed"
});
formatter.match({
  "location": "ChangeSteps.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 36199000,
  "status": "passed"
});
formatter.before({
  "duration": 6789372900,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "White Background Change",
  "description": "",
  "id": "background-change;white-background-change",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "the Set White Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I click on Set White Background button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "ChangeSteps.the_Set_White_Background_button_exists()"
});
formatter.result({
  "duration": 168594800,
  "status": "passed"
});
formatter.match({
  "location": "ChangeSteps.i_click_on_Set_White_Background_button()"
});
formatter.result({
  "duration": 57067600,
  "status": "passed"
});
formatter.match({
  "location": "ChangeSteps.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 44460600,
  "status": "passed"
});
});