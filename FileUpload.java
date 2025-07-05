import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {
    public static void main(String[] args) {
        // Setup WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open demo upload site
        driver.get("https://demo.guru99.com/test/upload/");

        // Provide full file path to the input element
        driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\path\\to\\your\\file.txt");

        // Check the terms checkbox (required)
        driver.findElement(By.id("terms")).click();

        // Click the Upload button
        driver.findElement(By.id("submitbutton")).click();

        // Optionally, wait to see result
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close browser
        driver.quit();
    }
}
