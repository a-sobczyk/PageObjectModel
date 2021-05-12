package pageObjectModel.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectModel.page.objects.LandingPage;

public class PositiveLoginTests extends TestBase{

    @Test
    public void asUserLoginUsingValidLoginAndPassword() {

        LandingPage landingPage = new LandingPage();
        boolean isBannerAfterLoginDisplayed = landingPage
                .clickOnEnterStoreLink()
                .clickOnSignInLink()
                .typeIntoUserNameField("j2ee")
                .typeIntoPasswordField("j2ee")
                .clickOnLoginButton()
                .getBannerAfterLoginLogo();

        Assert.assertTrue(isBannerAfterLoginDisplayed);
    }
}
