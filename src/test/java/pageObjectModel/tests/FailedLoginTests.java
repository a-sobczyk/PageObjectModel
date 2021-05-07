package pageObjectModel.tests;

import pageObjectModel.page.objects.LandingPage;
import pageObjectModel.page.objects.LoginPage;
import pageObjectModel.page.objects.TopMenuPage;
import org.junit.Assert;
import org.junit.Test;

public class FailedLoginTests extends TestBase{

    @Test
    public void asUserTryToLogInWithIncorrectLoginAndPassword() {

        LandingPage landingPage = new LandingPage();
        landingPage.clickOnEnterStoreLink();

        TopMenuPage topMenuPage = new TopMenuPage();
        topMenuPage.clickOnSignInLink();

        LoginPage loginPage = new LoginPage();

        loginPage.typeIntoUserNameField("NotExistingLogin");
        loginPage.typeIntoPasswordField("NotProperPassword");
        loginPage.clickOnLoginButton();

        String messageLabel = loginPage.getWarningMessage();

        Assert.assertEquals(messageLabel, "Invalid username or password. Signon failed.");
    }
}
