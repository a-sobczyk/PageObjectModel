package pageObjectModel.driver.manager;

import org.openqa.selenium.WebDriver;
import pageObjectModel.configuration.LocalWebDriverProperties;
import pageObjectModel.driver.BrowserFactory;
import pageObjectModel.driver.BrowserType;

public class DriverManager {

    private static WebDriver driver;

    private DriverManager() {
    }

    public static WebDriver getWebDriver() {
        if (driver == null) {
            driver = BrowserFactory.getBrowser(LocalWebDriverProperties.getLocalBrowser());
        }
        return driver;
    }

    public static void disposeDriver(){
        driver.close();
        if(!LocalWebDriverProperties.getLocalBrowser().equals(BrowserType.FIREFOX)) {
            driver.quit();
        }
        driver = null;
    }
}
