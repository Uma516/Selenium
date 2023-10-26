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
                options.addArguments("--remote-allow-origins=*");
                WebDriver driver=new ChromeDriver(options);
                driver.get("https://www.amazon.com/");
                driver.manage().window().maximize();
                //css tag with id
                // driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("dictionary");
               // driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("dictionary");

                //tag class
                // driver.findElement(By.cssSelector("input.nav-input")).sendKeys("dates");
                //driver.findElement(By.cssSelector(".nav-input")).sendKeys("dates");

                //tag with attribute(place holder )
                driver.findElement(By.cssSelector("input[placeholder='Search Amazon']")).sendKeys("toys");
            }
        }



