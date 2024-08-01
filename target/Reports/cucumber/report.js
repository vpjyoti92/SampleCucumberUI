$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Test1.feature");
formatter.feature({
  "line": 1,
  "name": "Validating today deal on home page",
  "description": "",
  "id": "validating-today-deal-on-home-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Validate amazon",
  "description": "",
  "id": "validating-today-deal-on-home-page;validate-amazon",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Test1"
    },
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Launch Google using Chrome broswer and https://www.google.com/ url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click on title link",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Input \"Automation\" on Search inputbox",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Closed the driver",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 20
    },
    {
      "val": "https://www.google.com/",
      "offset": 39
    }
  ],
  "location": "ValidationSteps.launch_Google(String,String)"
});
formatter.result({
  "duration": 12460686100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "title",
      "offset": 9
    }
  ],
  "location": "ValidationSteps.clickLink(String)"
});
formatter.result({
  "duration": 115400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\"Automation\"",
      "offset": 6
    },
    {
      "val": "Search",
      "offset": 22
    }
  ],
  "location": "ValidationSteps.inputValues(String,String)"
});
formatter.result({
  "duration": 257601900,
  "status": "passed"
});
formatter.match({
  "location": "ValidationSteps.close()"
});
formatter.result({
  "duration": 684043600,
  "status": "passed"
});
formatter.uri("Test2.feature");
formatter.feature({
  "line": 1,
  "name": "Validating SeeAllDealsLink",
  "description": "",
  "id": "validating-seealldealslink",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Validate amazon",
  "description": "",
  "id": "validating-seealldealslink;validate-amazon",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Test2"
    },
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Launch Amazon Application using Chrome broswer and https://www.amazon.in/ url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click on SeeAllDealsLink link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Validate deals displayed in new page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Closed the driver",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 32
    },
    {
      "val": "https://www.amazon.in/",
      "offset": 51
    }
  ],
  "location": "ValidationSteps.launch_Amazon_Application(String,String)"
});
formatter.result({
  "duration": 23121742500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SeeAllDealsLink",
      "offset": 9
    }
  ],
  "location": "ValidationSteps.clickLink(String)"
});
formatter.result({
  "duration": 810127300,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003ca class\u003d\"a-link-normal as-title-block-right see-more truncate-1line\" href\u003d\"/gp/goldbox/?ie\u003dUTF8\u0026amp;ref\u003dnav_topnav_deals\u0026amp;pd_rd_w\u003dz0knd\u0026amp;pf_rd_p\u003df690369a-7bb4-48bb-9349-f68a447ef06d\u0026amp;pf_rd_r\u003dAYV9ANBNKADESPHJ2KDM\u0026amp;pd_rd_r\u003dfd4c20d0-612a-4207-9e5a-d20a73ec2f80\u0026amp;pd_rd_wg\u003dHgkkj\u0026amp;ref_\u003dpd_gw_unk\"\u003e...\u003c/a\u003e is not clickable at point (226, 690). Other element would receive the click: \u003cimg alt\u003d\"Best prices on boAt Headphones, Speakers and Soundbars\" src\u003d\"https://m.media-amazon.com/images/I/319N5XBU5XL._AC_SY200_.jpg\" class\u003d\"product-image _deals-shoveler-v2_style_dealImage__3nlqg\" data-a-hires\u003d\"https://m.media-amazon.com/images/I/319N5XBU5XL._AC_SY400_.jpg\"\u003e\n  (Session info: chrome\u003d96.0.4664.45)\n  (Driver info: chromedriver\u003d2.36.540470 (e522d04694c7ebea4ba8821272dbef4f9b818c91),platform\u003dWindows NT 10.0.19043 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00274.0.0\u0027, revision: \u00273a21814679\u0027\nSystem info: host: \u0027LAPTOP-4RQ0LB43\u0027, ip: \u0027192.168.0.168\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [ee356d2f0a9e49a3c241bdb0352175fd, clickElement {id\u003d0.0818648102458639-1}]\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.36.540470 (e522d04694c7eb..., userDataDir: C:\\Users\\JYOTIP~1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 96.0.4664.45, webStorageEnabled: true}\nElement: [[ChromeDriver: chrome on XP (ee356d2f0a9e49a3c241bdb0352175fd)] -\u003e partial link text: See all deals]\nSession ID: ee356d2f0a9e49a3c241bdb0352175fd\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:217)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:169)\r\n\tat org.openqa.selenium.remote.codec.jwp.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:41)\r\n\tat org.openqa.selenium.remote.codec.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:83)\r\n\tat org.openqa.selenium.remote.codec.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:47)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:139)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:559)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:251)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:77)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:52)\r\n\tat com.sun.proxy.$Proxy17.click(Unknown Source)\r\n\tat base.BasePage.clickonLink(BasePage.java:177)\r\n\tat step_definitions.ValidationSteps.clickLink(ValidationSteps.java:41)\r\n\tat ✽.When Click on SeeAllDealsLink link(Test2.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ValidationSteps.validate_deals()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ValidationSteps.close()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("Test3.feature");
formatter.feature({
  "line": 1,
  "name": "Validating Category Selection , Switching Back",
  "description": "",
  "id": "validating-category-selection-,-switching-back",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Validate amazon",
  "description": "",
  "id": "validating-category-selection-,-switching-back;validate-amazon",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Test3"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Launch Amazon Application using Chrome broswer and https://www.amazon.in/ url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click on SeeAllDealsLink link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Validate deals displayed in new page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Hover on Category link",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Click on BabyLink link",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Hover on Category link",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Click on BeautyLink link",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Took the snapshot",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Navigate back to Amazon Page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Click on SignInLink link",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 32
    },
    {
      "val": "https://www.amazon.in/",
      "offset": 51
    }
  ],
  "location": "ValidationSteps.launch_Amazon_Application(String,String)"
});
formatter.result({
  "duration": 44636089800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SeeAllDealsLink",
      "offset": 9
    }
  ],
  "location": "ValidationSteps.clickLink(String)"
});
formatter.result({
  "duration": 15412528100,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d96.0.4664.45)\n  (Driver info: chromedriver\u003d2.36.540470 (e522d04694c7ebea4ba8821272dbef4f9b818c91),platform\u003dWindows NT 10.0.19043 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00274.0.0\u0027, revision: \u00273a21814679\u0027\nSystem info: host: \u0027LAPTOP-4RQ0LB43\u0027, ip: \u0027192.168.0.168\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [4da6a5f70cde09153143149160c8c6b5, findElement {using\u003dpartial link text, value\u003dSee all deals}]\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.36.540470 (e522d04694c7eb..., userDataDir: C:\\Users\\JYOTIP~1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 96.0.4664.45, webStorageEnabled: true}\nSession ID: 4da6a5f70cde09153143149160c8c6b5\r\n\tat sun.reflect.GeneratedConstructorAccessor14.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:217)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:169)\r\n\tat org.openqa.selenium.remote.codec.jwp.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:41)\r\n\tat org.openqa.selenium.remote.codec.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:83)\r\n\tat org.openqa.selenium.remote.codec.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:47)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:139)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:559)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:383)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:375)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy17.toString(Unknown Source)\r\n\tat java.lang.String.valueOf(String.java:2994)\r\n\tat java.lang.StringBuilder.append(StringBuilder.java:131)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.toString(ExpectedConditions.java:298)\r\n\tat java.lang.String.valueOf(String.java:2994)\r\n\tat java.lang.StringBuilder.append(StringBuilder.java:131)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:229)\r\n\tat base.BasePage.clickonLink(BasePage.java:176)\r\n\tat step_definitions.ValidationSteps.clickLink(ValidationSteps.java:41)\r\n\tat ✽.When Click on SeeAllDealsLink link(Test3.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ValidationSteps.validate_deals()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ValidationSteps.click_on_categoryLink()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "BabyLink",
      "offset": 9
    }
  ],
  "location": "ValidationSteps.clickLink(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ValidationSteps.click_on_categoryLink()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "BeautyLink",
      "offset": 9
    }
  ],
  "location": "ValidationSteps.clickLink(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ValidationSteps.takescreenshot()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ValidationSteps.navigateTo()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "SignInLink",
      "offset": 9
    }
  ],
  "location": "ValidationSteps.clickLink(String)"
});
formatter.result({
  "status": "skipped"
});
});