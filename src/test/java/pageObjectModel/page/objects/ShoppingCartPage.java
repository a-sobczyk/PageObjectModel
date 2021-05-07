package pageObjectModel.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjectModel.driver.manager.DriverManager;

public class ShoppingCartPage {

    WebDriverWait wait;

    public ShoppingCartPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
        wait = new WebDriverWait(DriverManager.getWebDriver(), 5);
    }

    @FindBy(xpath = "//a[contains(text(),'Proceed to Checkout')]")
    WebElement proceedToCheckoutButton;

    public void clickProceedToCheckoutButton() {
        wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckoutButton)).click();
    }
}
