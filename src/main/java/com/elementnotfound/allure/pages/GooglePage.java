package com.elementnotfound.allure.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Created by Chmp on 21.07.2015.
 */
public class GooglePage {
    public SearchResultsPage searchFor(String text) {
        $(By.name("q")).val(text).pressEnter();
        return page(SearchResultsPage.class);
    }
}