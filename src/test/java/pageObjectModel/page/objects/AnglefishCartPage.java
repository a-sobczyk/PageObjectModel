package pageObjectModel.page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.driver.manager.DriverManager;
import pageObjectModel.waits.WaitForElement;

import java.util.List;

public class AnglefishCartPage {

    public AnglefishCartPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(xpath = "//a[@class='Button']")
    List<WebElement> anglefishAddCartButtons;

    public void smallAnglefishAddToCart() {
        WaitForElement.waitUntilElementIsClickable(anglefishAddCartButtons.get(1));
        anglefishAddCartButtons.get(1).click();
    }

}
