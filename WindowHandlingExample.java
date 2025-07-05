import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Set;

public class WindowHandlingExample {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open the demo website
        driver.get("https://demo.guru99.com/popup.php");

        // Click on the link that opens a new window
        driver.findElement(By.xpath("//*[text()='Click Here']")).click();

        // Get the parent window handle
        String parentWindow = driver.getWindowHandle();

        // Get all window handles
        Set<String> allWindows = driver.getWindowHandles();

        // Loop through each window
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(parentWindow)) {
                // Switch to the child window
                driver.switchTo().window(windowHandle);

                // Perform actions in child window
                driver.findElement(By.name("emailid")).sendKeys("test@example.com");
                driver.findElement(By.name("btnLogin")).click();

                // Optional: wait to see the result
                Thread.sleep(3000);

                // Close the child window
                driver.close();
            }
        }

        // Switch back to parent window
        driver.switchTo().window(parentWindow);       // Close the main browser
        driver.quit();
    }
}
