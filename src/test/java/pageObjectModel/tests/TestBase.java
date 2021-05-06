package pageObjectModel.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

    public WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.get("http://przyklady.javastart.pl/jpetstore/");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
