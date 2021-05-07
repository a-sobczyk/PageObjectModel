package pageObjectModel.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjectModel.driver.manager.DriverManager;
import pageObjectModel.driver.manager.DriverUtils;

public class TestBase {

    @Before
    public void setup() {
        DriverManager.getWebDriver();
        DriverUtils.navigateToPage("http://przyklady.javastart.pl/jpetstore/");
        DriverUtils.setInitialConfiguration();
    }

    @After
    public void tearDown() {
        DriverManager.disposeDriver();
    }
}
