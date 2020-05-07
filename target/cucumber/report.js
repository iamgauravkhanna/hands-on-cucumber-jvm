$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/GoogleSearch.feature");
formatter.feature({
  "name": "Google Search",
  "description": "  Need to search word \"selenium\" on Google",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Simple Search",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Open Google Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "step_defs.GoogleSearch.methodOne()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Text \"selenium\" is entered",
  "keyword": "When "
});
formatter.match({
  "location": "step_defs.GoogleSearch.methodTwo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "results for \"selenium\" is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "step_defs.GoogleSearch.methodThree()"
});
formatter.result({
  "status": "passed"
});
});