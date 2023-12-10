package com.nit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorsWithXpathAxes {
    public static void main(String[] args) {

        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-orign=+");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//https:amazon.com/"));

    }
}
