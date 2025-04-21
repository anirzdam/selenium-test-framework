package com.example.tests;

import com.example.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

    @Test
    public void testSearch() {
        // Open DuckDuckGo website
        driver.get("https://duckduckgo.com");
        
        // Perform a search
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.submit();

        // Verify search results
        WebElement results = driver.findElement(By.id("links"));
        Assert.assertTrue(results.isDisplayed(), "Search results are not displayed.");
    }
}
