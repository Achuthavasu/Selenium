package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    public RegisterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "customer.firstName")
    WebElement firstnameTextBox;

    @FindBy(id = "customer.lastName")
    WebElement lastnameTextBox;

    public void registerAcc(String firstname, String lastname) {
        firstnameTextBox.sendKeys(firstname);
        lastnameTextBox.sendKeys(lastname);
    }

}
