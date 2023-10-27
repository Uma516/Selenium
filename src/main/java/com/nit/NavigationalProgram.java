package com.nit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigationalProgram {

    public static  void main(String[] args) {

        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=+");
        WebDriver driver=new ChromeDriver(options);

        driver.navigate().to("https://www.amazon.com/");
        System.out.println(driver.getCurrentUrl());

        driver.navigate().to("https://flipkart.com/");
        System.out.println(driver.getCurrentUrl());

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().refresh();
    }
}
