package com.tab.af.reporting;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Base64;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.tab.af.engine.ConcurrentEngine;
import com.tab.af.engine.DriverEngine;
import com.tab.af.testbase.TestBase;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ReportLibrary {
    private DriverEngine engine;
    private boolean takeScreenshotPassFlag = Boolean.parseBoolean(TestBase.props.getProperty("screenshot.passed.step"));
    private boolean takeScreenshotFailFlag = Boolean.parseBoolean(TestBase.props.getProperty("screenshot.failed.step"));

    public DriverEngine getEngine() {
	return engine;
    }

    public ReportLibrary(DriverEngine engine) {
	this.engine = engine;
    }

    public void reportInfo(String message) {
	ExtentTestManager.getTest().log(Status.INFO, message);
    }

    public void reportPass(String message) {
	if (takeScreenshotPassFlag)
	    passedLogWithScreenshot(message);
	else
	    ExtentTestManager.getTest().log(Status.PASS, message);
    }

    public void reportPassFullPage(String message) {
	try {
	    ExtentTestManager.getTest().log(Status.PASS, message,
		    MediaEntityBuilder.createScreenCaptureFromBase64String(capturefullPageBase64()).build());
	} catch (IOException e) {
	    System.out.println(
		    "passedLogWithScreenshot Screenshot could not be captured. Possible causes are directory not found or access to it.");
	    e.printStackTrace();
	}
    }

    public void reportPass(String message, boolean takeScreenshot) {
	if (takeScreenshotPassFlag && takeScreenshot)
	    passedLogWithScreenshot(message);
	else
	    ExtentTestManager.getTest().log(Status.PASS, message);
    }

    public void reportFail(String message) {
	if (takeScreenshotFailFlag)
	    failedLogWithScreenshot(message);
	else
	    ExtentTestManager.getTest().log(Status.FAIL, message);
    }

    public void reportFail(String message, boolean takeScreenshot) {
	if (takeScreenshotFailFlag && takeScreenshot)
	    failedLogWithScreenshot(message);
	else
	    ExtentTestManager.getTest().log(Status.FAIL, message);
    }

    public void reportHardFail(Exception e, String message) {
	if (takeScreenshotFailFlag) {
	    failedLogWithScreenshot(message + e.getMessage());
	    Assert.fail();
	} else {
	    ExtentTestManager.getTest().log(Status.FAIL, message);
	    Assert.fail();
	}
    }

    public void reportHardFail(String message, boolean takeScreenshot) {
	if (takeScreenshotFailFlag && takeScreenshot) {
	    failedLogWithScreenshot(message);
	    Assert.fail();
	} else {
	    ExtentTestManager.getTest().log(Status.FAIL, message);
	    Assert.fail();
	}
    }

    public void reportHardFailFullPage(String message) {
	try {
	    ExtentTestManager.getTest().log(Status.FAIL, message,
		    MediaEntityBuilder.createScreenCaptureFromBase64String(capturefullPageBase64()).build());
	    Assert.fail();
	} catch (IOException e) {
	    System.out.println(
		    "passedLogWithScreenshot Screenshot could not be captured. Possible causes are directory not found or access to it.");
	    e.printStackTrace();
	    Assert.fail();
	}
    }

    private void failedLogWithScreenshot(String message) {
	String base64String = captureBase64();
	try {
	    ExtentTestManager.getTest().log(Status.FAIL, message,
		    MediaEntityBuilder.createScreenCaptureFromBase64String(base64String).build());
	} catch (IOException e) {
	    System.out.println(
		    "failedLogWithScreenshot > Screenshot could not be captured. Possible causes are directory not found or access to it.");
	    e.printStackTrace();
	}
    }

    private void passedLogWithScreenshot(String message) {
	String base64String = captureBase64();
	try {
	    ExtentTestManager.getTest().log(Status.PASS, message,
		    MediaEntityBuilder.createScreenCaptureFromBase64String(base64String).build());
	} catch (IOException e) {
	    System.out.println(
		    "passedLogWithScreenshot Screenshot could not be captured. Possible causes are directory not found or access to it.");
	    e.printStackTrace();
	}
    }

    public String captureBase64() {
	// File source = takeScreenShot();
	String base64Screenshot = ((TakesScreenshot) ConcurrentEngine.getEngine().getWebDriver())
		.getScreenshotAs(OutputType.BASE64);
//		try {
//			byte[] fileContent = FileUtils.readFileToByteArray(source);
//			base64Screenshot = Base64.getEncoder().encodeToString(fileContent);
//		} catch (IOException io) {
//			System.out.println("Screenshot file not found or inaccessible.");
//			io.printStackTrace();
//		}
	return base64Screenshot;
    }

    public File takeScreenShot() {
	File srcFile = null;
	if (ConcurrentEngine.getEngine() != null) {
	    if (ConcurrentEngine.getEngine().getWebDriver() != null) {
		try {
		    srcFile = ((TakesScreenshot) ConcurrentEngine.getEngine().getWebDriver())
			    .getScreenshotAs(OutputType.FILE);
		} catch (Exception e) {
		    System.out.println("Could not capture screenshot" + e);
		}
	    }
	}
	return srcFile;
    }

    public String capturefullPageBase64() {
	BufferedImage bi = null;
	if (ConcurrentEngine.getEngine() != null) {
	    if (ConcurrentEngine.getEngine().getWebDriver() != null) {
		try {
		    bi = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100))
			    .takeScreenshot(ConcurrentEngine.getEngine().getWebDriver()).getImage();
		} catch (Exception e) {
		    System.out.println("Could not capture screenshot" + e);
		}
	    }
	}
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	try {
	    ImageIO.write(bi, "PNG", out);
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	byte[] bytes = out.toByteArray();
	return Base64.getEncoder().encode(bytes).toString();
    }
}
