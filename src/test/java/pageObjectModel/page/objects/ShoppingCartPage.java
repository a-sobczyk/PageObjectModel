package pageObjectModel.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingCartPage {

    WebDriver driver;
    WebDriverWait wait;

    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 5);
    }

    @FindBy(xpath = "//a[contains(text(),'Proceed to Checkout')]")
    WebElement proceedToCheckoutButton;

    public void clickProceedToCheckoutButton() {
        wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckoutButton)).click();
    }
}
