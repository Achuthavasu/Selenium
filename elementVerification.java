import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;

public class elementVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open demo site
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        // Click the Start button to load the element
        driver.findElement(By.cssSelector("#start button")).click();

        // ✅ Method 1: Using findElements() - safe way
        List<WebElement> elements = driver.findElements(By.cssSelector("#finish h4"));
        if (!elements.isEmpty()) {
            System.out.println("Method 1: Element is present (found using findElements).");
        } else {
            System.out.println("Method 1: Element is NOT present.");
        }

        // ✅ Method 2: Try-Catch with findElement()
        try {
            WebElement element = driver.findElement(By.cssSelector("#finish h4"));
            System.out.println("Method 2: Element is present (found using try-catch).");
        } catch (NoSuchElementException e) {
            System.out.println("Method 2: Element is NOT present.");
        }

        // ✅ Method 3: Using Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            WebElement dynamicElement = wait.until(
                    ExpectedConditions.presenceOfElementLocated(By.cssSelector("#finish h4"))
            );
            System.out.println("Method 3: Element appeared with Explicit Wait.");
        } catch (TimeoutException e) {
            System.out.println("Method 3: Element did NOT appear within wait time.");
        }

        driver.quit();
    }
}