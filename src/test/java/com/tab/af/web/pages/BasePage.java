package com.tab.af.web.pages;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;
import com.tab.af.actions.ShadowActions;
import com.tab.af.actions.WebActions;
import com.tab.af.engine.ConcurrentEngine;
import com.tab.af.reporting.ReportLibrary;
import com.tab.af.testbase.TestBase;
import com.tab.af.utilities.JSONReader;
import com.tab.af.utilities.OnBoardApplicants;

public abstract class BasePage<T> {
    private static ConcurrentHashMap<Long, Map<String, String>> testDataMap = new ConcurrentHashMap<Long, Map<String, String>>();
    private static ConcurrentHashMap<Long, Map<OnBoardApplicants, Map<String, String>>> applicant = new ConcurrentHashMap();
    protected WebDriver driver;
    protected WebActions webActions = ConcurrentEngine.getEngine().getWebActions();
    protected ReportLibrary report = ConcurrentEngine.getEngine().getReportLibrary();
    private final long PAGELOADTIMEOUT = Long.parseLong(TestBase.props.getProperty("page.load.wait"));
    protected JSONReader json = JSONReader.getInstance();
    protected Globals global = new Globals();
    protected Faker faker = new Faker();
    protected ShadowActions shadow = ConcurrentEngine.getEngine().getShadowActions();

    public BasePage() {
	this.driver = ConcurrentEngine.getEngine().getWebDriver();
    }

    public T base(Class<T> pageClass) {
	T page = null;
	try {
	    page = PageFactory.initElements(ConcurrentEngine.getEngine().getWebDriver(), pageClass);
	    ExpectedCondition pageLoadCondition = ((BasePage) page).getPageLoadCondition();
	    waitForPageToLoad(pageLoadCondition);
	} catch (TimeoutException e) {
	    // To Shorten the Message in the Summary Report
	    report.reportHardFail(e, "Scenario Failed on Page : ");
	}
	return page;
    }

    private void waitForPageToLoad(ExpectedCondition<?> pageLoadCondition) {
	WebDriverWait wait = new WebDriverWait(driver, PAGELOADTIMEOUT);
	wait.until(pageLoadCondition);
    }

    /**
     * Returns the Map Associated with the Current Thread for Main Applicant or Loan
     * Company and to Store the Data for the test Associated
     * 
     * @return dataMap<String,String>
     */
    public Map<String, String> getTestDataMap() {
	return testDataMap.get(Thread.currentThread().getId());
    }

    public void setTestDataMap(Map<String, String> map) {
	testDataMap.put(Thread.currentThread().getId(), map);
    }

    protected abstract ExpectedCondition getPageLoadCondition();

    public String shortenedStackTrace(Exception e, int maxLines) {
	StringWriter writer = new StringWriter();
	e.printStackTrace(new PrintWriter(writer));
	String[] lines = writer.toString().split("\n");
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < Math.min(lines.length, maxLines); i++) {
	    sb.append(lines[i]).append("\n");
	}
	return sb.toString();
    }

    /**
     * Get Test Data For Multiple Applicants Using OnBoardApplicants ENUM by Thread
     * 
     * @return
     */
    public Map<String, String> getApplicant(OnBoardApplicants applicantNo) {
	if (applicant.containsKey(Thread.currentThread().getId())) {
	    Map<OnBoardApplicants, Map<String, String>> map = applicant.get(Thread.currentThread().getId());
	    return map.get(applicantNo);
	} else {
	    return null;
	}
    }

    /**
     * Set Test Data for Multiple Applicant Using OnBoardApplicants ENUM by Thread
     * 
     * @param map
     */
    public void setApplicant(OnBoardApplicants applicantNo, Map map) {
	Map<OnBoardApplicants, Map<String, String>> hmap = new HashMap<OnBoardApplicants, Map<String, String>>();
	if (applicant.containsKey(Thread.currentThread().getId())) {
	    hmap = applicant.get(Thread.currentThread().getId());
	    hmap.put(applicantNo, map);
	} else {
	    hmap.put(applicantNo, map);
	    applicant.put(Thread.currentThread().getId(), hmap);
	}
    }

    public static void removeTestData() {
	if (testDataMap.get(Thread.currentThread().getId()) != null) {
	    testDataMap.remove(Thread.currentThread().getId());
	    if (applicant.get(Thread.currentThread().getId()) != null) {
		applicant.remove(Thread.currentThread().getId());
	    }
	}
    }
}