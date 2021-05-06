package pageObjectModel.tests;

import pageObjectModel.page.objects.FooterPage;
import pageObjectModel.page.objects.LandingPage;
import pageObjectModel.page.objects.LoginPage;
import pageObjectModel.page.objects.TopMenuPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class PositiveLoginTests extends TestBase{

    @Test
    public void asUserLoginUsingValidLoginAndPassword() {

        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnEnterStoreLink();

        TopMenuPage topMenuPage = new TopMenuPage(driver);
        topMenuPage.clickOnSignInLink();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeIntoUserNameField("j2ee");
        loginPage.typeIntoPasswordField("j2ee");
        loginPage.clickOnLoginButton();

        FooterPage footerPage = new FooterPage(driver);
        WebElement bannerAfterLoginLogo = footerPage.getBannerAfterLoginLogo();

        Assert.assertTrue(bannerAfterLoginLogo.isDisplayed());
    }
}
