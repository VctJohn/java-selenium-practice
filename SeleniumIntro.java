package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "J:\\Selenium notes\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.speedtest.net");
        
        System.out.println(driver.getTitle());
        
        System.out.println(driver.getCurrentUrl());
        
        driver.close();

  
    }
}
