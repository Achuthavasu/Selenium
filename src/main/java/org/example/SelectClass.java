package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\USERDATA\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        WebElement drpLabelEle = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
        Select drpLable = new Select(drpLabelEle);
//        drpLable.selectByValue("AGO");
//        drpLable.selectByVisibleText("Aruba");
        List<WebElement> listofalloptions =drpLable.getOptions();
        for(WebElement a : listofalloptions)
        {
            if(a.getText().equals("Cuba"))
            {a.click();
            break;}
        }
        Thread.sleep(5000);
        driver.close();

    }
}
