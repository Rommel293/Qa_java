package com.elementnotfound.allure.pages;

import com.elementnotfound.allure.helpers.FailedTestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.fail;

/**
 * Created by Chmp on 21.07.2015.
 */
@Listeners({FailedTestListener.class})
public class GoogleTest {

    @Test
    public void testSearchSelenide() {
        GooglePage page = open("http://google.com/ncr", GooglePage.class);
        SearchResultsPage results = page.searchFor("selenide");
        results.getResults().get(0).shouldHave(text("Selenide: concise UI tests in Java"));
        fail();
    }
}