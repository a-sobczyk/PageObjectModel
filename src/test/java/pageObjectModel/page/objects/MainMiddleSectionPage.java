package pageObjectModel.page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.driver.manager.DriverManager;
import pageObjectModel.waits.WaitForElement;

public class MainMiddleSectionPage {

    public MainMiddleSectionPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(css = "area[alt='Fish']")
    WebElement fishLink;

    public FishPage fishLinkClick() {
        WaitForElement.waitUntilElementIsClickable(fishLink);
        fishLink.click();
        return new FishPage();
    }
}
