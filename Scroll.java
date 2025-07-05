import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll{
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open a scrollable website
        driver.get("https://www.selenium.dev/");

        // Scroll down by 1000 pixels
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000);");

        // Wait a few seconds
        Thread.sleep(2000);

        // Scroll up by 500 pixels
        js.executeScript("window.scrollBy(0, -500);");

        // Wait before closing
        Thread.sleep(2000);
        driver.quit();
    }
}
//Scroll to a Specific Element:
//WebElement element = driver.findElement(By.id("footer"));
//js.executeScript("arguments[0].scrollIntoView(true);", element);
//Scroll to Bottom of Page:
//js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

