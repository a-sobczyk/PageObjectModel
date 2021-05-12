package pageObjectModel.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pageObjectModel.configuration.ConfigurationProperties;
import pageObjectModel.configuration.PropertiesLoader;
import pageObjectModel.driver.manager.DriverManager;
import pageObjectModel.driver.manager.DriverUtils;

import java.util.Properties;

public class TestBase {

    @BeforeClass
    public static void beforeClass() {
        PropertiesLoader propertiesLoader = new PropertiesLoader();
        Properties propertiesFromFile = propertiesLoader.getPropertiesFromFile("configuration.properties");
        ConfigurationProperties.setProperties(propertiesFromFile);
    }

    @BeforeMethod
    public void setup() {
        DriverManager.getWebDriver();
        DriverUtils.navigateToPage("http://przyklady.javastart.pl/jpetstore/");
        DriverUtils.setInitialConfiguration();
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.disposeDriver();
    }
}
