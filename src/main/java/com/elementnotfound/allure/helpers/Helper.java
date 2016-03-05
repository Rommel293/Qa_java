package com.elementnotfound.allure.helpers;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.ScreenshotException;
import ru.yandex.qatools.allure.annotations.Attachment;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

/**
 * Created by Chmp on 21.07.2015.
 */
public class Helper {

    public static void screenshotFailedTest() {
        try {
            WebDriver returned = new Augmenter().augment(getWebDriver());
            if (returned != null) {
                allureScreenshot(((TakesScreenshot) returned).getScreenshotAs(OutputType.BYTES));
            }
        } catch (ScreenshotException se) {
            se.printStackTrace();
        }
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    private static byte[] allureScreenshot(byte[] screenshot) {
        return screenshot;
    }
}
/**
 * test edit
 */