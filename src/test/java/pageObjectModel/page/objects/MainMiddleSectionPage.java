package pageObjectModel.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainMiddleSectionPage {

    private WebDriver driver;
    WebDriverWait wait;

    public MainMiddleSectionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 5);
    }

    @FindBy(xpath = "//area[@alt='Fish']")
    WebElement fishLink;

    public void fishLinkClick() {
        wait.until(ExpectedConditions.elementToBeClickable(fishLink)).click();
    }
}
