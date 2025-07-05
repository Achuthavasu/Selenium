import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Set;

public class cookies {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open demo site
        driver.get("https://www.selenium.dev/");

        // ✅ Get all cookies
        Set<Cookie> allCookies = driver.manage().getCookies();
        System.out.println("Total cookies: " + allCookies.size());

        for (Cookie cookie : allCookies) {
            System.out.println("Cookie Name: " + cookie.getName() + ", Value: " + cookie.getValue());
        }

        // ✅ Add a custom cookie
        Cookie newCookie = new Cookie("TestCookie", "123456");
        driver.manage().addCookie(newCookie);
        System.out.println("Cookie added: " + newCookie.getName());

        // ✅ Get specific cookie by name
        Cookie testCookie = driver.manage().getCookieNamed("TestCookie");
        System.out.println("Retrieved Cookie: " + testCookie);

        // ✅ Delete a specific cookie
        driver.manage().deleteCookieNamed("TestCookie");
        System.out.println("TestCookie deleted.");

        // ✅ Delete all cookies
        driver.manage().deleteAllCookies();
        System.out.println("All cookies deleted.");

        driver.quit();
    }
}
