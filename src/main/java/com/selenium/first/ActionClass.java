package com.selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ActionClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\USERDATA\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();
        WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        Actions act = new Actions(driver);

        act.contextClick(button).build().perform();// right click of mouse

//        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
//        driver.switchTo().frame("iframeResult");
//        WebElement field1 =driver.findElement(By.xpath("//input[@id='field1']"));
//        field1.clear();
//        field1.sendKeys("welcome");
//        WebElement button= driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
//        Actions act = new Actions(driver);
//        act.doubleClick(button).build().perform();

    }
}

