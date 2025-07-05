import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling{
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open demo site with frame
        driver.get("https://demo.guru99.com/test/guru99home/");

        // Wait a bit to let iframe load
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // ✅ Switch to frame by WebElement (YouTube frame)
        WebElement frameElement = driver.findElement(By.xpath("//iframe[contains(@src, 'youtube.com')]"));
        driver.switchTo().frame(frameElement);

        // Now you're inside the frame — can interact with elements here
        System.out.println("Switched to frame successfully");

        // ✅ Switch back to main (default) content
        driver.switchTo().defaultContent();

        driver.quit();
    }
}
