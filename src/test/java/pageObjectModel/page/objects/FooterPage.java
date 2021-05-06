package pageObjectModel.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FooterPage {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(css = "#Banner img[src*='dog']")
    private WebElement banner;

    public FooterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 5);
    }

    public WebElement getBannerAfterLoginLogo() {
        return wait.until(ExpectedConditions.visibilityOf(banner));
    }
}
