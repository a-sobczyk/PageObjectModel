package pageObjectModel.page.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjectModel.driver.manager.DriverManager;
import pageObjectModel.waits.WaitForElement;

public class LoginPage {

    private Logger logger = LogManager.getRootLogger();

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
        logger.info("Typed into User Name field: {}", userName);
    }

    public void typeIntoPasswordField(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
        logger.info("Typed into Password field: {}", password);
    }

    public void clickOnLoginButton() {
        signOnButton.click();
        logger.info("Clicked on Login Button");
    }

    public String getWarningMessage() {
        WaitForElement.waitUntilElementsVisible(warningMessage);
        String warningText = warningMessage.getText();
        logger.info("Returned warning message was: {}", warningText);
        return warningText;
    }

    public String getSingOnWarningMessage() {
        WaitForElement.waitUntilElementsVisible(singOnMessage);
        String singOnWarningMessage = singOnMessage.getText();
        logger.info("Returned sing on warning message was: {}", singOnWarningMessage);
        return singOnWarningMessage;
    }

}
