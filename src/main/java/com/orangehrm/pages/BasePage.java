package com.orangehrm.pages;

import com.microsoft.playwright.Page;

/**
 * BasePage class contains common methods used by all page objects.
 */
public class BasePage {

    protected Page page;

    public BasePage(Page page) {
        this.page = page;
    }

    public void navigateTo(String url) {
        page.navigate(url);
    }

    public void waitForPageLoad() {
        page.waitForLoadState();
    }

    public void click(String selector) {
        page.click(selector);
    }

    public void fill(String selector, String text) {
        page.fill(selector, text);
    }

    public String getText(String selector) {
        return page.innerText(selector);
    }

    public boolean isVisible(String selector) {
        return page.isVisible(selector);
    }

    public void close() {
        page.close();
    }

    public void waitForSelector(String selector) {
        page.waitForSelector(selector);
    }

    public void waitForTimeout(int timeout) {
        page.waitForTimeout(timeout);
    }

}
