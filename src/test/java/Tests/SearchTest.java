package Tests;

import Managers.ConfigurationManager;
import Pages.HomePage;
import org.testng.annotations.*;

public class SearchTest extends BaseTest {

    ConfigurationManager configurationManager = new ConfigurationManager();

    @Test
    public void searchMethod() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.getPage()
                .searchKeyword(configurationManager.getConfig("search.keyword"))
                .executeSearch();
        Thread.sleep(3000);
    }
}
