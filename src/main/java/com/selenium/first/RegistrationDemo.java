package com.selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationDemo {
    WebDriver driver;

    By RegLink = By.linkText("REGISTER");
    By Firstname = By.name("firstName");
    By Lastname =By.name("lastName");
    By Phone = By.name("phone");
    By Email = By.name("userName");
    By Address = By.name("address1");
    By City = By.name("city");
    By State = By.name("state");
    By PostalCode = By.name("postalCode");
    By Country = By.name("country");
    By username= By.name("email");
    By Password=By.name("password");
    By Confirm =By.name("confirmPassword");
    By Submit = By.name("submit");

    RegistrationDemo(WebDriver driver)
    {this.driver =driver;}

    public void ClickRegLink()
    {driver.findElement(RegLink).click();}

    public void Registration(String a, String b, String c)
    {driver.findElement(Firstname).sendKeys("achu");
    driver.findElement(Lastname).sendKeys("achu1");
    driver.findElement(Phone).sendKeys("89r4fj");}
}
