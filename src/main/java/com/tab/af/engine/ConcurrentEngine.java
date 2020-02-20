package com.tab.af.engine;

import static org.testng.Assert.assertNotNull;

import java.util.concurrent.ConcurrentHashMap;

import org.openqa.selenium.Capabilities;

import com.tab.af.testbase.TestBase;

public class ConcurrentEngine {
    private static ConcurrentHashMap<Long, DriverEngine> engines = new ConcurrentHashMap<>();

    public static DriverEngine getEngine() {
	return engines.get(Thread.currentThread().getId());
    }

    public static void createEngine(Capabilities caps, String browserName, boolean remoteExecution) throws Exception {
	try {
	    DriverEngine engine = new DriverEngine();
	    engine.setUpWebDriver(browserName, caps, remoteExecution);
	    assertNotNull(engine.getWebDriver().getWrappedDriver(), "Webdriver was not set up correctly.");
	    engines.putIfAbsent(Thread.currentThread().getId(), engine);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    public static void destroyEngine() {
	if (engines.containsKey(Thread.currentThread().getId())) {
	    if (!TestBase.props.getProperty("run.type").equalsIgnoreCase("api")
		    || !getEngine().getWebDriver().toString().contains("null")) {
		{
		    cleanUpDriverProcesses();
		}
	    }
	    engines.remove(Thread.currentThread().getId());
	}
    }

    public static void closeDriver() {
	getEngine().getWebDriver().close();
    }

    public static void cleanUpDriverProcesses() {
	getEngine().getWebDriver().quit();
    }
}
