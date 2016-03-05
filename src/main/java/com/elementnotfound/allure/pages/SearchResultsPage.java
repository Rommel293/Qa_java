package com.elementnotfound.allure.pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by Chmp on 21.07.2015.
 */
public class SearchResultsPage {
    public ElementsCollection getResults() {
        return $$("#ires li.g");
    }
}
