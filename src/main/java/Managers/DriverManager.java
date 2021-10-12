package Managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    WebDriver driver;
    ConfigurationManager configurationManager = new ConfigurationManager();

    public WebDriver createDriver(String browserName) {
        switch (browserName) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver", configurationManager.getConfig("geckodriver.path"));
                driver = new FirefoxDriver();
                break;
            case "chrome":
                System.setProperty("webdriver.chrome.driver", configurationManager.getConfig("chromedriver.path"));
                driver = new ChromeDriver();
                break;
        }
        driver.manage().timeouts().implicitlyWait(Integer.parseInt(configurationManager.getConfig("wait.implicityWait")), TimeUnit.SECONDS);
        return driver;
    }
}
