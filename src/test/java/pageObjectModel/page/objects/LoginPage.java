package pageObjectModel.page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.driver.manager.DriverManager;
import pageObjectModel.waits.WaitForElement;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
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
        WaitForElement.waitUntilElementsVisible(usernameField);
        usernameField.clear();
        usernameField.sendKeys(userName);
    }

    public void typeIntoPasswordField(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickOnLoginButton() {
        signOnButton.click();
    }

    public String getWarningMessage() {
        WaitForElement.waitUntilElementsVisible(warningMessage);
        return warningMessage.getText();
    }

    public String getSingOnWarningMessage() {
        WaitForElement.waitUntilElementsVisible(singOnMessage);
        return singOnMessage.getText();
    }

}
