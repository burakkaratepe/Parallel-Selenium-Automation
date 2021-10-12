package Pages;

import org.openqa.selenium.support.PageFactory;
import Tests.BaseTest;

public class BasePage extends BaseTest {
    protected BasePage() {
        PageFactory.initElements(driver, this);
    }
}
