package com.nit.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PracticePrograms {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("macbook");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input")).click();
        driver.findElement(By.id("search")).sendKeys("sarees");
        driver.findElement(By.xpath("/html/body/div[1]/div[6]/script/text()")).click();
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input")).click();

    }

}
