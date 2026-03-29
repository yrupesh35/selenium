package com.test.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("XPath Selenium");

        Thread.sleep(3000);
        driver.quit();
    }
}