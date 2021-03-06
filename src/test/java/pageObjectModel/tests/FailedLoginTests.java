package pageObjectModel.tests;

import org.testng.annotations.Test;
import pageObjectModel.driver.manager.DriverUtils;
import pageObjectModel.page.objects.LoginPage;

import static org.testng.Assert.assertEquals;
import static pageObjectModel.navigation.ApplicationURLs.LOGIN_URL;

public class FailedLoginTests extends TestBase{

    @Test
    public void asUserTryToLogInWithIncorrectLoginAndPassword() {
        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();
        loginPage
                .typeIntoUserNameField("NotExistingLogin")
                .typeIntoPasswordField("NotProperPassword")
                .clickOnLoginButton();
        String warningMessage = loginPage.getWarningMessage();

        assertEquals(warningMessage, "Invalid username or password. Signon failed.");
    }
}
