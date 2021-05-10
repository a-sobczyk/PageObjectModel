package pageObjectModel.page.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.driver.manager.DriverManager;
import pageObjectModel.waits.WaitForElement;

import java.util.List;

public class AnglefishCartPage {

    Logger logger = LogManager.getRootLogger();

    public AnglefishCartPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(xpath = "//a[@class='Button']")
    List<WebElement> anglefishAddCartButtons;

    public void smallAnglefishAddToCart() {
        WaitForElement.waitUntilElementIsClickable(anglefishAddCartButtons.get(1));
        anglefishAddCartButtons.get(1).click();
        logger.info("Clicked small angelfish add to cart button");
    }

}
