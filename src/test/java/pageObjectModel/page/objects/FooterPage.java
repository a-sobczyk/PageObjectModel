package pageObjectModel.page.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.driver.manager.DriverManager;
import pageObjectModel.waits.WaitForElement;

public class FooterPage {

    Logger logger = LogManager.getRootLogger();

    @FindBy(css = "#Banner img[src*='dog']")
    private WebElement banner;

    public FooterPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public boolean getBannerAfterLoginLogo() {
        WaitForElement.waitUntilElementsVisible(banner);
        boolean isDisplayed = banner.isDisplayed();
        logger.info("Returning status of banner after login: {}", isDisplayed);
        return isDisplayed;
    }
}
