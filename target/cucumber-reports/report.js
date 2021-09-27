$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AppDownload.feature");
formatter.feature({
  "line": 2,
  "name": "To get App Download Links",
  "description": "",
  "id": "to-get-app-download-links",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AppDownload"
    }
  ]
});
formatter.scenarioOutline({
  "line": 10,
  "name": "To verify App Download Links from Footer",
  "description": "",
  "id": "to-get-app-download-links;to-verify-app-download-links-from-footer",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 11,
  "name": "user is on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user clicks on Download app button for \u003cstore\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "direct to the download page",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "to-get-app-download-links;to-verify-app-download-links-from-footer;",
  "rows": [
    {
      "cells": [
        "store"
      ],
      "line": 15,
      "id": "to-get-app-download-links;to-verify-app-download-links-from-footer;;1"
    },
    {
      "cells": [
        "apple"
      ],
      "line": 16,
      "id": "to-get-app-download-links;to-verify-app-download-links-from-footer;;2"
    },
    {
      "cells": [
        "google"
      ],
      "line": 17,
      "id": "to-get-app-download-links;to-verify-app-download-links-from-footer;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "A windows system",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I initialize Browser",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "enter URL",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "WebPage should be Open",
  "keyword": "Then "
});
formatter.match({
  "location": "UrbanLadderStepDefinition.a_windows_system()"
});
formatter.result({
  "duration": 169868100,
  "status": "passed"
});
formatter.match({
  "location": "UrbanLadderStepDefinition.i_initialize_browser()"
});
formatter.result({
  "duration": 3493980600,
  "status": "passed"
});
formatter.match({
  "location": "UrbanLadderStepDefinition.enter_url()"
});
formatter.result({
  "duration": 964675900,
  "status": "passed"
});
formatter.match({
  "location": "UrbanLadderStepDefinition.webpage_should_be_open()"
});
formatter.result({
  "duration": 94223800,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "To verify App Download Links from Footer",
  "description": "",
  "id": "to-get-app-download-links;to-verify-app-download-links-from-footer;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@AppDownload"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user is on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user clicks on Download app button for apple",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "direct to the download page",
  "keyword": "Then "
});
formatter.match({
  "location": "UrbanLadderStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 648858400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "apple",
      "offset": 39
    }
  ],
  "location": "UrbanLadderStepDefinition.user_clicks_on_download_app_button_for(String)"
});
formatter.result({
  "duration": 36962400,
  "status": "passed"
});
formatter.match({
  "location": "UrbanLadderStepDefinition.direct_to_the_download_page()"
});
formatter.result({
  "duration": 35900,
  "status": "passed"
});
