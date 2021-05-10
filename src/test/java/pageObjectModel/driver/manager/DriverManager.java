package pageObjectModel.driver.manager;

import org.openqa.selenium.WebDriver;
import pageObjectModel.driver.BrowserFactory;
import pageObjectModel.driver.BrowserType;

public class DriverManager {

    private static final BrowserType BROWSER_TYPE = BrowserType.FIREFOX;
    private static WebDriver driver;

    private DriverManager() {
    }

    public static WebDriver getWebDriver() {
        if (driver == null) {
            driver = BrowserFactory.getBrowser(BrowserType.CHROME);
        }
        return driver;
    }

    public static void disposeDriver(){
        driver.close();
        if(!BROWSER_TYPE.equals(BrowserType.FIREFOX)) {
            driver.quit();
        }
        driver = null;
    }
}
