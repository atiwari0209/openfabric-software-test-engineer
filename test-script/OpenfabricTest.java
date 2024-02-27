import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class OpenfabricTest {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Navigate to the Openfabric Testnet platform
        driver.get("https://openfabric.testnet");

        // Find and click on the "Help Center" link in the footer
        WebElement helpCenterLink = driver.findElement(By.linkText("Help Center"));
        helpCenterLink.click();

        String currentUrl = driver.getCurrentUrl();

        // Verify if the URL redirects to the main page
        if (currentUrl.equals("https://openfabric.testnet/")) {
            System.out.println("Bug 1: Help Center Link Redirects to Main Page - Test Failed");
        } else {
            System.out.println("Bug 1: Help Center Link Redirects to Main Page - Test Passed");
        }

        driver.quit();
    }
}
