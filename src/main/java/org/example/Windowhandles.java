package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Windowhandles {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\USERDATA\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/windows");
        String WindowId = driver.getWindowHandle();
        System.out.println(WindowId);
        driver.findElement(By.xpath("//button[@id='home']")).click();
        Set<String> windowIds = driver.getWindowHandles(); //return ids of all windows

        //1.iterator method

//        Iterator<String> it = windowIds.iterator();
//        String parentWindowId = it.next();
//        String childWindowId = it.next();
//
//        System.out.println(parentWindowId);
//        System.out.println(childWindowId);

        //2.Using List method to print window ids

//        List<String> windowIdsList= new ArrayList<>(windowIds);
//        String parentWindowId = windowIdsList.get(0);
//        String childWindowId = windowIdsList.get(1);
//        System.out.println(parentWindowId);
//        System.out.println(childWindowId);
//
//        //switching to another window using window ids - this allows the DRIVER to switch to another window
//
//        driver.switchTo().window(childWindowId);
//        System.out.println(driver.getTitle());
//        driver.close(); // closes the single window where the driver is pointing
//        driver.quit(); // closes the all window

    }
}
