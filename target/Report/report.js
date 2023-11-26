$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/Product2.feature");
formatter.feature({
  "name": "validate the login functionality of healthcare page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "validate the productS",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user ShOuld Click Search box passinG values",
  "keyword": "When "
});
formatter.match({
  "location": "ProductStep2.userShOuldClickSearchBoxPassinGValues()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Should input DetailS oF the PagE",
  "keyword": "When "
});
formatter.match({
  "location": "ProductStep2.userShouldInputDetailSOFThePagE()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user shouLd click thE searcH bUtton",
  "keyword": "And "
});
formatter.match({
  "location": "ProductStep2.userShouLdClickThESearcHBUtton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should NavigAte to Correct credential page Are NoT",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductStep2.userShouldNavigAteToCorrectCredentialPageAreNoT()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: chk con\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.StepDefinition.ProductStep2.userShouldNavigAteToCorrectCredentialPageAreNoT(ProductStep2.java:84)\r\n\tat ✽.user should NavigAte to Correct credential page Are NoT(file:src/test/resources/FeatureFiles/Product2.feature:15)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});