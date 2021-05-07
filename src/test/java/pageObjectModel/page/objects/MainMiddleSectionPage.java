package pageObjectModel.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjectModel.driver.manager.DriverManager;

public class MainMiddleSectionPage {

    WebDriverWait wait;

    public MainMiddleSectionPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
        wait = new WebDriverWait(DriverManager.getWebDriver(), 5);
    }

    @FindBy(xpath = "//area[@alt='Fish']")
    WebElement fishLink;

    public void fishLinkClick() {
        wait.until(ExpectedConditions.elementToBeClickable(fishLink)).click();
    }
}
