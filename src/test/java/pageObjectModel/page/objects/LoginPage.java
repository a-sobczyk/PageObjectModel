package pageObjectModel.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(name = "username")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(name = "signon")
    private WebElement signOnButton;

    @FindBy(css = "#Content ul[class='messages'] li")
    private WebElement warningMessage;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 5);
    }

    public void typeIntoUserNameField(String userName) {
        usernameField.clear();
        usernameField.sendKeys(userName);
    }

    public void typeIntoPasswordField(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickOnLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(signOnButton));
        signOnButton.click();
    }

    public String getWarningMessage() {
        return warningMessage.getText();
    }

}
