package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    By usernametxt = By.name("username");
    By passwordtxt = By.name("password");
    By loginBtn = By.xpath("//input[@value='Log In']");

    By customerlogintxt = By.tagName("h2");

    By registerLink = By.linkText("Register");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        driver.findElement(usernametxt).sendKeys("hello");
        driver.findElement(passwordtxt).sendKeys("hello");
        driver.findElement(loginBtn).click();
    }

    public void gotoRegisterPage() {
        driver.findElement(registerLink).click();
    }

    public String getcuslogText() {
        return driver.findElement(customerlogintxt).getText();
    }


}
