import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {
    public static void main(String[] args) {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to the test page
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

        // Initialize Actions class
        Actions actions = new Actions(driver);

        // Right-click (context click)
        WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));
        actions.contextClick(rightClickBtn).perform();

        // Double-click
        WebElement doubleClickBtn = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        actions.doubleClick(doubleClickBtn).perform();

        // Example hover (replace with real element if needed)
        // WebElement hoverElement = driver.findElement(By.xpath("your_xpath_here"));
        // actions.moveToElement(hoverElement).perform();

        // Close the browser
        driver.quit();}}


//Drag and drop: actions.dragAndDrop(sourceElement, targetElement).perform();
//What is the difference between perform() and build().perform()?
//
//perform() executes a single action.
//
//build().perform() is used to compile a sequence of actions before execution (mainly useful when chaining multiple actions).
//How would you simulate keyboard key presses like CTRL+A using Actions class?
//        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
//How to perform click and hold?
//        actions.clickAndHold(element).perform();

// driver.get("https://www.google.com");
//
//WebElement searchBox = driver.findElement(By.name("q"));
//
//// ✅ Type text and press ENTER key
//Actions actions = new Actions(driver);
//        actions.sendKeys(searchBox, "Selenium WebDriver").sendKeys(Keys.ENTER).perform();
//
//// Or use this single line:
//// searchBox.sendKeys("Selenium WebDriver", Keys.ENTER);
