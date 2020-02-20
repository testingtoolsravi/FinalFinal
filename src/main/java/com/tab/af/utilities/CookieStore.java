package com.tab.af.utilities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookieStore {
    static Set<Cookie> cookies;

    public void getCookie() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.navigate().to("https://onboardingint.tabbank.com/app/#!");
	((JavascriptExecutor) driver).executeScript("arguments[0].value='';",
		driver.findElement(By.xpath("//*[@cuba-id='passwordField']")));
	driver.findElement(By.xpath("//*[@cuba-id='passwordField']")).sendKeys("abc123");
	driver.findElement(By.xpath("//*[text()='Submit']//..//parent::div")).click();
	driver.findElement(By.xpath("//*[@cuba-id='accounting']")).click();
	File file = new File("Cookies.data");
	try {
	    // Delete old file if exists
	    file.delete();
	    file.createNewFile();
	    FileWriter fileWrite = new FileWriter(file);
	    BufferedWriter Bwrite = new BufferedWriter(fileWrite);
	    // loop for getting the cookie information
	    // loop for getting the cookie information
	    for (Cookie ck : driver.manage().getCookies()) {
		Bwrite.write((ck.getName() + ";" + ck.getValue() + ";" + ck.getDomain() + ";" + ck.getPath() + ";"
			+ ck.getExpiry() + ";" + ck.isSecure()));
		Bwrite.newLine();
	    }
	    Bwrite.close();
	    fileWrite.close();
	    putCookie();
	} catch (Exception ex) {
	    ex.printStackTrace();
	}
	driver.quit();
    }

    public void putCookie() {
	try {
	    File file = new File("Cookies.data");
	    FileReader fileReader = new FileReader(file);
	    BufferedReader Buffreader = new BufferedReader(fileReader);
	    String strline;
	    WebDriver driver = new ChromeDriver();
	    Cookie ck = null;
	    while ((strline = Buffreader.readLine()) != null) {
		StringTokenizer token = new StringTokenizer(strline, ";");
		while (token.hasMoreTokens()) {
		    String name = token.nextToken();
		    String value = token.nextToken();
		    String domain = token.nextToken();
		    String path = token.nextToken();
		    Date expiry = null;
		    String val = null;
		    if (!(token.nextToken() == null)) {
			expiry = new Date(val);
		    }
		    Boolean isSecure = new Boolean(token.nextToken()).booleanValue();
		    ck = new Cookie(name, value, domain, path, expiry, isSecure);
		    System.out.println(ck);
		}
		Buffreader.close();
		fileReader.close();
		// This will add the stored cookie to your current session
		// driver.get("https://onboardingint.tabbank.com/app/#!");
		driver.get("http://www.example.com/this404page");
		driver.manage().addCookie(ck);
		driver.get("https://onboardingint.tabbank.com/app/#!");
		((JavascriptExecutor) driver).executeScript("location.reload(true);", "");
	    }
	} catch (Exception ex) {
	    ex.printStackTrace();
	}
    }
}