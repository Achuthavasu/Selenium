package com.selenium.first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.RegisterPage;

public class PageObjectModelSele {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\USERDATA\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        HomePage homePage = new HomePage(driver);
        System.out.println(homePage.getcuslogText());
        homePage.login("hello", "hello");
        homePage.gotoRegisterPage();
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.registerAcc("hello", "hello");
        driver.quit();

    }
}
