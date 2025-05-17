package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {


    private static WebDriver driver;

    public static void initDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }

    public static WebDriver getDriver() {

        if (driver == null) {
            initDriver();
        }
        return driver;
    }

    public static void finisDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
