$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/eventPromotion.feature");
formatter.feature({
  "line": 1,
  "name": "Create event promotion",
  "description": "As a client I want to create a event promotion so that discounted item can be created",
  "id": "create-event-promotion",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4351765800,
  "status": "passed"
});
formatter.before({
  "duration": 3576238100,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Users would be able to add new promotion",
  "description": "",
  "id": "create-event-promotion;users-would-be-able-to-add-new-promotion",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "a user with username \"support\" and password \"l2w0OoJCmjwS@0jT\" already logged in on website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user navigate to Marketing -\u003e Event Promotion",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Event Promotions page shows up",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks Create Promotion",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Create Event Promotion page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Event details will be provided",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "support",
      "offset": 22
    },
    {
      "val": "l2w0OoJCmjwS@0jT",
      "offset": 45
    }
  ],
  "location": "EventPromotionSteps.a_user_with_username_and_password_already_logged_in_on_website(String,String)"
});
formatter.result({
  "duration": 3175457800,
  "status": "passed"
});
formatter.match({
  "location": "EventPromotionSteps.user_navigate_to_Marketing_Event_Promotion()"
});
formatter.result({
  "duration": 51102800,
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d84.0.4147.105)\nBuild info: version: \u00273.7.1\u0027, revision: \u00278a0099a\u0027, time: \u00272017-11-06T21:01:39.354Z\u0027\nSystem info: host: \u0027SON-CORP-5RV1Q\u0027, ip: \u002710.50.65.17\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.105, chrome: {chromedriverVersion: 84.0.4147.30 (48b3e868b4cc0..., userDataDir: C:\\Users\\MKONOV~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:61893}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 09540834b9f0164ab029606904669cce\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat page.DashboardPage.login(DashboardPage.java:34)\r\n\tat steps.EventPromotionSteps.user_navigate_to_Marketing_Event_Promotion(EventPromotionSteps.java:37)\r\n\tat ✽.When user navigate to Marketing -\u003e Event Promotion(./src/test/java/features/eventPromotion.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "EventPromotionSteps.event_Promotions_page_shows_up()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EventPromotionSteps.user_clicks_Create_Promotion()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EventPromotionSteps.create_Event_Promotion_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "EventPromotionSteps.event_details_will_be_provided()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 5749207300,
  "status": "passed"
});
formatter.after({
  "duration": 2628904500,
  "status": "passed"
});
});