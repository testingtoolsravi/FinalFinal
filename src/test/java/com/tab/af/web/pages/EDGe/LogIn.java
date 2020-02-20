package com.tab.af.web.pages.EDGe;

import java.util.concurrent.ConcurrentHashMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.tab.af.testbase.TestBase;
import com.tab.af.web.pages.BasePage;

public class LogIn extends BasePage {
    public LogIn() {
	PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Login']//following::input[1]")
    private WebElement txt_UserName;
    @FindBy(xpath = "//div[text()='Password']//following::input[1]")
    private WebElement txt_Password;
    @FindBy(xpath = "//span[text()='Submit']")
    private WebElement btn_Login;

    public EdgeHomePage loginToApplication() {
	try {
	    setTestDataMap(new ConcurrentHashMap<String, String>());
	    String URL = "";
	    URL = TestBase.props.getProperty("edge.int.url");
	    webActions.loadURL(URL);
	    base(LogIn.class);
	    webActions.waitUntilPresentAndDisplayed(txt_UserName, "UserName");
	    TestBase.props.put("build.version", global.getBuildVersionFromSource(webActions.getPageSource()));
	    String userName = TestBase.props.getProperty("user.login");
	    String password = TestBase.props.getProperty("user.loginpassword");
	    webActions.clearAndSendKeysByChar(txt_UserName, userName, "UserName");
	    webActions.clearAndSendKeysByChar(txt_Password, password, "Password");
	    webActions.clickBYJS(btn_Login, "Login button");
	    report.reportPass("Login Success");
	} catch (Exception e) {
	    report.reportHardFail(e, "Login With Valid Credentials");
	}
	return (EdgeHomePage) base(EdgeHomePage.class);
    }

    @Override
    protected ExpectedCondition getPageLoadCondition() {
	// TODO Auto-generated method stub
	return ExpectedConditions.visibilityOf(txt_UserName);
    }
}
