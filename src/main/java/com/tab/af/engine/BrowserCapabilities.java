package com.tab.af.engine;

import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;

import com.google.gson.Gson;
import com.tab.af.testbase.TestBase;

public class BrowserCapabilities {
    public Capabilities getCapabilities(String browserName) throws IOException, ParseException {
	JSONParser parser = new JSONParser();
	Map<String, String> map = new HashMap<>();
	FileReader reader = new FileReader(
		System.getProperty("user.dir") + "\\src\\main\\resources\\capabilities.json");
	Object obj = parser.parse(reader);
	JSONObject parentObject = (JSONObject) obj;
	JSONObject browser = (JSONObject) parentObject.get(browserName);
	JSONObject arguments = (JSONObject) browser.get("arguments");
	JSONObject capabilities = (JSONObject) browser.get("capabilities");
	if (browserName.equalsIgnoreCase("chrome")) {
	    map = new Gson().fromJson(arguments.toString(), Map.class);
	    ChromeOptions options = new ChromeOptions();
	    Set<String> keys = map.keySet();
	    for (String key : keys) {
		options.addArguments(map.get(key));
	    }
	    options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
	    options.setExperimentalOption("useAutomationExtension", false);
	    Map<String, Object> prefs = new HashMap<>();
	    prefs.put("credentials_enable_service", false);
	    prefs.put("password_manager_enabled", false);
	    options.setExperimentalOption("prefs", prefs);
	    // File file = new File(System.getProperty("user.dir") +
	    // "\\src\\main\\resources\\XPath-Helper_v2.0.2 (1).crx");
	    // options.addExtensions(file);
	    map.clear();
	    map = new Gson().fromJson(capabilities.toString(), Map.class);
	    keys = map.keySet();
	    for (String key : keys) {
		options.setCapability(key, map.get(key));
	    }
	    return options;
	}
	if (browserName.equalsIgnoreCase("firefox")) {
	    map = new Gson().fromJson(arguments.toString(), Map.class);
	    FirefoxOptions options = new FirefoxOptions();
	    if (TestBase.props.getProperty("run.type").equals("local")) {
		options.setBinary(TestBase.props.getProperty("firefox.binary.path"));
	    }
	    Set<String> keys = map.keySet();
	    for (String key : keys) {
		options.addArguments(map.get(key));
	    }
	    map.clear();
	    map = new Gson().fromJson(capabilities.toString(), Map.class);
	    keys = map.keySet();
	    for (String key : keys) {
		options.setCapability(key, map.get(key));
	    }
	    return options;
	}
	if (browserName.equalsIgnoreCase("ie")) {
	    InternetExplorerOptions options = new InternetExplorerOptions();
	    map = new Gson().fromJson(capabilities.toString(), Map.class);
	    Set<String> keys = map.keySet();
	    for (String key : keys) {
		options.setCapability(key, map.get(key));
	    }
	    return options;
	}
	return null;
    }
}
