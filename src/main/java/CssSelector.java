import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\USERDATA\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement user = driver.findElement(By.cssSelector(".inputtext._55r1._6luy"));
        user.sendKeys("achutha.pearl@gmail.com");
        WebElement password = driver.findElement(By.cssSelector("._9npi"));
        password.sendKeys("vasuachu2229");
        WebElement login = driver.findElement(By.cssSelector("._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy"));
        login.click();
        Thread.sleep(5000);
        driver.close();
    }
}
