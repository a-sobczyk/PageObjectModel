package pageObjectModel.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AnglefishCartPage {

    WebDriver driver;

    public AnglefishCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='Button']")
    List<WebElement> anglefishAddCartButtons;

    public void smallAnglefishAddToCart() {
        anglefishAddCartButtons.get(1).click();
    }

}
