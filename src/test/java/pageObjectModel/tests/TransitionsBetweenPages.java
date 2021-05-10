package pageObjectModel.tests;

import org.junit.Assert;
import org.junit.Test;
import pageObjectModel.driver.manager.DriverUtils;
import pageObjectModel.page.objects.LandingPage;
import pageObjectModel.page.objects.TopMenuPage;

import static pageObjectModel.navigation.ApplicationURLs.APPLICATION_URL;

public class TransitionsBetweenPages extends TestBase{

    @Test
    public void transitionFromLandingPageToLoginPage() {
        DriverUtils.navigateToPage(APPLICATION_URL);

        LandingPage landingPage = new LandingPage();
        boolean islogoIsDisplayed = landingPage
                .clickOnEnterStoreLink()
                .storeLogoIsDisplayed();

        TopMenuPage topMenuPage = new TopMenuPage();
        boolean isLoginButtonDisplayed = topMenuPage
                .clickOnSignInLink()
                .loginButtonIsDisplayed();

        Assert.assertTrue(islogoIsDisplayed);
        Assert.assertTrue(isLoginButtonDisplayed);
    }

}
