import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class Screenshot {
    public static void main(String[] args) throws IOException {
        // Setup WebDriverManager and launch browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to a website
        driver.get("https://example.com");

        // Take screenshot and save as a file
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:/users/hp/screenshot.png"));

        // Close browser
        driver.quit();
    }
}