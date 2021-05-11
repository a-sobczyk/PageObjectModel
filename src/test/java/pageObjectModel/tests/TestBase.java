package pageObjectModel.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
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
