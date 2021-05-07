package pageObjectModel.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.driver.manager.DriverManager;

public class FishPage {

    public FishPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(xpath = "//a[contains(text(),'FI-SW-01')]")
    WebElement anglefish;

    public void angelfishClick() {
        anglefish.click();
    }
}
