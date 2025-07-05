import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class Waits {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // ✅ 1. Implicit Wait (Applies globally)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Open demo wait page
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        // Click "Start" button
        driver.findElement(By.cssSelector("#start button")).click();

        // ✅ 2. Explicit Wait - Wait until "Hello World!" is visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement helloText = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish h4"))
        );
        System.out.println("Explicit Wait Result: " + helloText.getText());

        // ✅ 3. Fluent Wait - Wait until the same "Hello World!" text appears
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement fluentResult = fluentWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement el = driver.findElement(By.cssSelector("#finish h4"));
                if (el.isDisplayed()) {
                    return el;
                }
                return null;
            }
        });

        System.out.println("Fluent Wait Result: " + fluentResult.getText());

        driver.quit();
    }
}