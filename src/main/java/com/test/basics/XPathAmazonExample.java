package com.test.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAmazonExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Selenium");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}