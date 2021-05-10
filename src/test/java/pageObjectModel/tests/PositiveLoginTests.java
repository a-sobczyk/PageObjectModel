package pageObjectModel.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import pageObjectModel.page.objects.FooterPage;
import pageObjectModel.page.objects.LandingPage;
import pageObjectModel.page.objects.LoginPage;
import pageObjectModel.page.objects.TopMenuPage;

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
