import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {
    public static void main(String[] args) {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // Open demo alert page
        driver.get("https://demo.guru99.com/test/delete_customer.php");

        // Fill Customer ID and submit
        driver.findElement(By.name("cusid")).sendKeys("123456");
        driver.findElement(By.name("submit")).click();

        // Switch to alert
        Alert alert = driver.switchTo().alert();

        // Get alert text
        System.out.println("Alert Text: " + alert.getText());

        // Accept the alert (click OK)
        alert.accept();

        // If there is a second alert, handle it too
        Alert secondAlert = driver.switchTo().alert();
        System.out.println("Second Alert: " + secondAlert.getText());
        secondAlert.accept();

        // Close the browser
        driver.quit();
    }
}
