package Tests;

import Managers.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {

    public static WebDriver driver;
    static DriverManager driverManager = new DriverManager();

    @BeforeClass
    @Parameters("browserName")
    public static void createDriver(String browserName) {
        driver = driverManager.createDriver(browserName);
    }

    @AfterClass
    public static void closeDriver() {
        driver.quit();
    }

}
