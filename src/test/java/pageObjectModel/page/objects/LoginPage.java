package pageObjectModel.page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjectModel.driver.manager.DriverManager;

public class LoginPage {

    private WebDriverWait wait;

    public LoginPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
        wait = new WebDriverWait(DriverManager.getWebDriver(), 5);
    }

    @FindBy(name = "username")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(name = "signon")
    private WebElement signOnButton;

    @FindBy(css = "#Content ul[class='messages'] li")
    private WebElement warningMessage;

    @FindBy(xpath = "//li[contains(text(), 'You must sign on before')]")
    private WebElement singOnMessage;

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

    public String getSingOnWarningMessage() {
        return wait.until(ExpectedConditions.visibilityOf(singOnMessage)).getText();
    }

}
