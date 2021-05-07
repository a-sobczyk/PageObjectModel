package pageObjectModel.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjectModel.driver.manager.DriverManager;

public class FooterPage {

    WebDriverWait wait;

    @FindBy(css = "#Banner img[src*='dog']")
    private WebElement banner;

    public FooterPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
        wait = new WebDriverWait(DriverManager.getWebDriver(), 5);
    }

    public WebElement getBannerAfterLoginLogo() {
        return wait.until(ExpectedConditions.visibilityOf(banner));
    }
}
