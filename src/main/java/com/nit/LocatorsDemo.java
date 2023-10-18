package com.nit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class LocatorsDemo {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("silk sarees");
        driver.findElement(By.id("nav-search-submit-button")).click();

    }
}
