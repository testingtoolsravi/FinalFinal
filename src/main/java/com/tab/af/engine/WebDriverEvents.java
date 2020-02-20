package com.tab.af.engine;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.joda.time.DateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.tab.af.testbase.TestBase;

public class WebDriverEvents implements WebDriverEventListener {
    private static Logger log;
    private static WebDriverEvents webDriverEvents = null;

    private WebDriverEvents() {
    }

    public synchronized static WebDriverEvents getInstance() {
	if (Boolean.parseBoolean(TestBase.props.getProperty("Selenium.Event.log"))) {
	    if (log == null) {
		setupEvents();
	    }
	    if (webDriverEvents == null) {
		webDriverEvents = new WebDriverEvents();
	    }
	}
	return webDriverEvents;
    }

    private static void setupEvents() {
	String dir = System.getProperty("user.dir") + "\\src\\test\\resources\\logs\\";
	String date = DateTime.now().toString("MMddyyyyhhmmss");
	File file = new File(dir + "Event Log " + date + ".txt");
	if (file.exists()) {
	    file.delete();
	}
	FileHandler fh = null;
	log = Logger.getLogger("Webdriver Logger");
	try {
	    fh = new FileHandler(file.getPath(), true);
	    log.addHandler(fh);
	    log.setUseParentHandlers(false);
	    SimpleFormatter formatter = new SimpleFormatter();
	    fh.setFormatter(formatter);
	} catch (SecurityException | IOException e) {
	    e.printStackTrace();
	} finally {
	    fh.close();
	}
    }

    @Override
    public void beforeAlertAccept(WebDriver driver) {
	log.info("Thread: " + Thread.currentThread().getName() + " Before Alert Accept");
    }

    @Override
    public void afterAlertAccept(WebDriver driver) {
	log.info("Thread: " + Thread.currentThread().getName() + " After Alert Accept");
    }

    @Override
    public void afterAlertDismiss(WebDriver driver) {
	log.info("Thread: " + Thread.currentThread().getName() + " After Alert Dismiss");
    }

    @Override
    public void beforeAlertDismiss(WebDriver driver) {
	log.info("Thread: " + Thread.currentThread().getName() + " Before Alert Accept");
    }

    @Override
    public void beforeNavigateTo(String url, WebDriver driver) {
	log.info("Thread: " + Thread.currentThread().getName() + " Before Navigate to :" + url);
    }

    @Override
    public void afterNavigateTo(String url, WebDriver driver) {
	log.info("Thread: " + Thread.currentThread().getName() + " After Navigate to :" + url + "in Browser: ");
    }

    @Override
    public void beforeNavigateBack(WebDriver driver) {
	log.info("Thread: " + Thread.currentThread().getName() + " Before Navigate Back");
    }

    @Override
    public void afterNavigateBack(WebDriver driver) {
	log.info("Thread: " + Thread.currentThread().getName() + " After Navigate Back");
    }

    @Override
    public void beforeNavigateForward(WebDriver driver) {
	log.info("Thread: " + Thread.currentThread().getName() + " Before Navigate Forward");
    }

    @Override
    public void afterNavigateForward(WebDriver driver) {
	log.info("Thread: " + Thread.currentThread().getName() + " After Navigate Forward");
    }

    @Override
    public void beforeNavigateRefresh(WebDriver driver) {
	log.info("Thread: " + Thread.currentThread().getName() + " Before Navigate Refresh");
    }

    @Override
    public void afterNavigateRefresh(WebDriver driver) {
	log.info("Thread: " + Thread.currentThread().getName() + " Before Navigate Refresh");
    }

    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
	log.info("Thread: " + Thread.currentThread().getName() + " Before FindBy");
    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {
	log.info("Thread: " + Thread.currentThread().getName() + " Before FindBy " + by.toString());
    }

    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
	log.info("Thread: " + Thread.currentThread().getName() + " Before Click on: " + element.toString());
    }

    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {
	log.info("Thread: " + Thread.currentThread().getName() + " After Click on: " + element.toString());
    }

    @Override
    public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
	log.info("Thread: " + Thread.currentThread().getName() + " Before Change value of: " + element.toString()
		+ " value to Send: " + keysToSend[0].toString());
    }

    @Override
    public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
	log.info("Thread: " + Thread.currentThread().getName() + " After Change value of: " + element.toString()
		+ " value to Send: " + keysToSend[0].toString());
    }

    @Override
    public void beforeScript(String script, WebDriver driver) {
	log.info("Thread: " + Thread.currentThread().getName() + " Before Executing Script: " + script);
    }

    @Override
    public void afterScript(String script, WebDriver driver) {
	log.info("Thread: " + Thread.currentThread().getName() + " After Executing Script: " + script);
    }

    @Override
    public void beforeSwitchToWindow(String windowName, WebDriver driver) {
	log.info("Thread: " + Thread.currentThread().getName() + " Before Switch to Window: " + windowName);
    }

    @Override
    public void afterSwitchToWindow(String windowName, WebDriver driver) {
	log.info("Thread: " + Thread.currentThread().getName() + " After Switch to Window: " + windowName);
    }

    @Override
    public void onException(Throwable throwable, WebDriver driver) {
	log.info("Thread: " + Thread.currentThread().getName() + " Exception Encountered: " + throwable.getMessage());
    }

    @Override
    public <X> void beforeGetScreenshotAs(OutputType<X> target) {
    }

    @Override
    public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
    }

    @Override
    public void beforeGetText(WebElement element, WebDriver driver) {
    }

    @Override
    public void afterGetText(WebElement element, WebDriver driver, String text) {
    }
}
