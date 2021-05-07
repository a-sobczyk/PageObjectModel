package pageObjectModel.page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.driver.manager.DriverManager;
import pageObjectModel.waits.WaitForElement;

public class FooterPage {

    @FindBy(css = "#Banner img[src*='dog']")
    private WebElement banner;

    public FooterPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public WebElement getBannerAfterLoginLogo() {
        WaitForElement.waitUntilElementsVisible(banner);
        return banner;
    }
}
