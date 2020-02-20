package com.tab.af.web.runners;

import java.io.IOException;

import com.tab.af.testbase.TestBase;
import com.tab.af.web.pages.BasePage;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;

@CucumberOptions(features = { "src/test/resources/features" }, glue = { "com.tab.af.web",
	"com.tab.af.testbase" }, plugin = { "pretty", "rerun:target/WebRerun.txt" })
public class WebTestRunner extends TestBase {
    @After()
    public void removeUsedData() {
	BasePage.removeTestData();
    }

    @After
    public void after(Scenario scenario) throws IOException {
//	if (scenario.isFailed()) {
//	    byte[] bytes = (ConcurrentEngine.getEngine().getWebDriver()).getScreenshotAs(OutputType.BYTES);
//	    scenario.embed(bytes, "image/png");
//	    ExtentTestManager.getTest().log(Status.FAIL, scenario.getName());
//	} else {
//	    ExtentTestManager.getTest().log(Status.PASS, scenario.getName());
//	}
    }
}
