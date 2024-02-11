package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Popups {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\USERDATA\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Thread.sleep(1000);

        Alert j = driver.switchTo().alert();
        j.accept();

//        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
//        Thread.sleep(1000);
//        driver.switchTo().alert().dismiss();
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Thread.sleep(1000);
        Alert kk = driver.switchTo().alert();
        kk.sendKeys("hello");
        kk.accept();
        driver.close();

    }
}
