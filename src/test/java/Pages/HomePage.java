package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    String URL = "https://www.google.com/";

    @FindBy(xpath = "//input[@name='q']")
    private WebElement searchInput;

    public HomePage getPage() {
        driver.get(URL);
        return this;
    }

    public HomePage searchKeyword(String keyword) {
        searchInput.sendKeys(keyword);
        return this;
    }

    public HomePage executeSearch() {
        searchInput.submit();
        return this;
    }
}
