package pageObjectModel.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FishPage {

    private WebDriver driver;

    public FishPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'FI-SW-01')]")
    WebElement anglefish;

    public void angelfishClick() {
        anglefish.click();
    }
}
