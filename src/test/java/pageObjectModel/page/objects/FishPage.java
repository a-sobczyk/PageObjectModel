package pageObjectModel.page.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.driver.manager.DriverManager;
import pageObjectModel.waits.WaitForElement;

public class FishPage {

    Logger logger = LogManager.getRootLogger();

    public FishPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(xpath = "//a[contains(text(),'FI-SW-01')]")
    WebElement anglefish;

    public AnglefishCartPage angelfishClick() {
        WaitForElement.waitUntilElementIsClickable(anglefish);
        anglefish.click();
        logger.info("Clicked on Angelfish button");
        return new AnglefishCartPage();
    }
}
