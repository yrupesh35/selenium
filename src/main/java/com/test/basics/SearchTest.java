package com.test.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        // Locate search box using name
        driver.findElement(By.name("q")).sendKeys("Selenium");

        Thread.sleep(3000);
        driver.quit();
    }
}