package com.nit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class LocatorsWithCssSelector {

    public static void main(String[] args) {

        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=+");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("/html/body/header/div/div/div[2]/div/input")).sendKeys("macbook");
            }
        }



