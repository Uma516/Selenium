package com.nit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class LocatorsDemo {

    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
       List<WebElement>slides=driver.findElements(By.className("a-carousel-card"));
        System.out.println("Number of slides="+slides.size());
        List<WebElement>images=driver.findElements(By.tagName("img"));
        System.out.println("Total number of images:="+images.size());
        List<WebElement>link=driver.findElements(By.tagName("a"));
        System.out.println("Total number of links:="+link.size());
         driver.quit();

    }
}
