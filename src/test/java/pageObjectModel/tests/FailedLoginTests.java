package pageObjectModel.tests;

import org.junit.Assert;
import org.junit.Test;
import pageObjectModel.page.objects.LandingPage;
import pageObjectModel.page.objects.LoginPage;
import pageObjectModel.page.objects.TopMenuPage;

public class FailedLoginTests extends TestBase{

    @Test
    public void asUserTryToLogInWithIncorrectLoginAndPassword() {

        LandingPage landingPage = new LandingPage();
        landingPage
                .clickOnEnterStoreLink()
                .clickOnSignInLink()
                .typeIntoUserNameField("NotExistingLogin")
                .typeIntoPasswordField("NotProperPassword")
                .clickOnLoginButton();

        LoginPage loginPage = new LoginPage();
        String messageLabel = loginPage.getWarningMessage();

        Assert.assertEquals(messageLabel, "Invalid username or password. Signon failed.");
    }
}
