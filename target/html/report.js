$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("facebookTaskFeature.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook application testing",
  "description": "",
  "id": "facebook-application-testing",
  "keyword": "Feature"
});
formatter.before({
  "duration": 23160396829,
  "status": "passed"
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
  "name": "the user logs into the facebook application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDeffsforFacebookTask.the_user_logs_into_the_facebook_application()"
});
formatter.result({
  "duration": 16051305671,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User should be logged out then sign out is clicked",
  "description": "",
  "id": "facebook-application-testing;user-should-be-logged-out-then-sign-out-is-clicked",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "the user clicks on the signout button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user should be logged out of the application",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDeffsforFacebookTask.the_user_clicks_on_the_signout_button()"
});
formatter.result({
  "duration": 7698640230,
  "status": "passed"
});
formatter.match({
  "location": "StepDeffsforFacebookTask.the_user_should_be_logged_out_of_the_application()"
});
formatter.result({
  "duration": 23067238,
  "status": "passed"
});
formatter.after({
  "duration": 29936,
  "status": "passed"
});
formatter.before({
  "duration": 25381136945,
  "status": "passed"
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
  "name": "the user logs into the facebook application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDeffsforFacebookTask.the_user_logs_into_the_facebook_application()"
});
formatter.result({
  "duration": 38787816817,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User should navigate to event homepage when clicked on event link",
  "description": "",
  "id": "facebook-application-testing;user-should-navigate-to-event-homepage-when-clicked-on-event-link",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "the user clicks on the event link",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "the user should be navigated to the event homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDeffsforFacebookTask.the_user_clicks_on_the_event_link()"
});
formatter.result({
  "duration": 4318294874,
  "status": "passed"
});
formatter.match({
  "location": "StepDeffsforFacebookTask.the_user_should_be_navigated_to_the_event_homepage()"
});
formatter.result({
  "duration": 702254764,
  "status": "passed"
});
formatter.after({
  "duration": 39344,
  "status": "passed"
});
formatter.before({
  "duration": 32895348748,
  "status": "passed"
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
  "name": "the user logs into the facebook application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDeffsforFacebookTask.the_user_logs_into_the_facebook_application()"
});
formatter.result({
  "duration": 82180394793,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User should able to select the dynamic contents",
  "description": "",
  "id": "facebook-application-testing;user-should-able-to-select-the-dynamic-contents",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "the user clicks on a dynamic contents",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "the user should be navigated to the selcted event",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDeffsforFacebookTask.the_user_clicks_on_a_dynamic_contents()"
});
formatter.result({
  "duration": 71356217535,
  "status": "passed"
});
formatter.match({
  "location": "StepDeffsforFacebookTask.the_user_should_be_navigated_to_the_selcted_event()"
});
formatter.result({
  "duration": 39896397783,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for js return document.readyState\u003d\u003d\"complete\"; to be executable (tried for 30 second(s) with 500 MILLISECONDS interval)\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027LAPTOP-6E953G70\u0027, ip: \u0027192.168.0.60\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.29.461591 (62ebf098771772160f391d75e589dc567915b233), userDataDir\u003dC:\\Users\\Sreedhar\\AppData\\Local\\Temp\\scoped_dir9060_1460}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d58.0.3029.110, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: be7472a402bdcec8cb43ee164dea035e\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:80)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:232)\r\n\tat com.Sunrisesoftware.FacebookTask.BaseClass.waitForPageLoad(BaseClass.java:22)\r\n\tat com.Sunrisesoftware.FacebookTask.Pageobjects.NewsFeedHomePage.getTitle(NewsFeedHomePage.java:39)\r\n\tat com.Sunrisesoftware.FacebookTask.StepDeffsforFacebookTask.the_user_should_be_navigated_to_the_selcted_event(StepDeffsforFacebookTask.java:101)\r\n\tat ✽.Then the user should be navigated to the selcted event(facebookTaskFeature.feature:16)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 379329,
  "status": "passed"
});
});