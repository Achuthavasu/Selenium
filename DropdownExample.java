import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownExample {
    public static void main(String[] args) {
        // Setup WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open a sample dropdown site
        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

        // Example for dropdown (Use your actual dropdown page)
        driver.get("https://demo.guru99.com/test/newtours/register.php");

        // Locate the dropdown WebElement
        WebElement countryDropdown = driver.findElement(By.name("country"));

        // Create a Select object
        Select select = new Select(countryDropdown);

        // Select by visible text
        select.selectByVisibleText("INDIA");

        // Select by value
        select.selectByValue("ANGOLA");

        // Select by index
        select.selectByIndex(5);

        // Get all options
        System.out.println("Available options:");
        for (WebElement option : select.getOptions()) {
            System.out.println(option.getText());
        }

        // Close the browser
        driver.quit();
    }
}