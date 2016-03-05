package com.elementnotfound.allure.helpers;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * Created by Chmp on 21.07.2015.
 */
public class FailedTestListener implements ITestListener {

    public void onTestStart(ITestResult result) {}

    public void onTestSuccess(ITestResult result) {}

    public void onTestFailure(ITestResult result) {
        Helper.screenshotFailedTest();
    }

    public void onTestSkipped(ITestResult result) {}

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        Helper.screenshotFailedTest();
    }

    public void onStart(ITestContext context) {}

    public void onFinish(ITestContext context) {}
}