package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class test {
    public static void main(String[] args) {

        // Path to chromedriver.exe (NOT chrome.exe)
        System.setProperty("webdriver.chrome.driver", "J:\\eclipse-workspace\\chromedriver-win64\\chromedriver.exe");

        // Tell Selenium to use the Chrome 142 browser binary
        ChromeOptions options = new ChromeOptions();
        options.setBinary("J:\\eclipse-workspace\\chrome-win64\\chrome.exe");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium Java tutorial");
        searchBox.submit();

        try { Thread.sleep(3000); } catch (Exception e) {}

        driver.quit();
    }
}