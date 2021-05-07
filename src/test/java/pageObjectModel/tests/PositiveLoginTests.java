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
        landingPage.clickOnEnterStoreLink();

        TopMenuPage topMenuPage = new TopMenuPage();
        topMenuPage.clickOnSignInLink();

        LoginPage loginPage = new LoginPage();
        loginPage.typeIntoUserNameField("j2ee");
        loginPage.typeIntoPasswordField("j2ee");
        loginPage.clickOnLoginButton();

        FooterPage footerPage = new FooterPage();
        WebElement bannerAfterLoginLogo = footerPage.getBannerAfterLoginLogo();

        Assert.assertTrue(bannerAfterLoginLogo.isDisplayed());
    }
}
