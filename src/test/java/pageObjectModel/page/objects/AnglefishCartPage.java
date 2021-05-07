package pageObjectModel.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.driver.manager.DriverManager;

import java.util.List;

public class AnglefishCartPage {

    public AnglefishCartPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(xpath = "//a[@class='Button']")
    List<WebElement> anglefishAddCartButtons;

    public void smallAnglefishAddToCart() {
        anglefishAddCartButtons.get(1).click();
    }

}
