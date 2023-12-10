package com.nit.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class
ImplicitWaitDemo {

    public static void main(String[] args) {


        //it is used to detect the browser in local
       ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        //it is used to launch the browser
        WebDriver driver=new ChromeDriver(options);
        //it is used to hit the URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        // it is used to maximize the browser window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

       driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
       driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
       driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();



    }
}
