package pageObjectModel.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectModel.page.objects.LandingPage;
import pageObjectModel.page.objects.MainMiddleSectionPage;

public class ShoppingCartTest extends TestBase {

    @Test
    public void asNotLoggedInUserIShallNotProceedToCheckout() {

        LandingPage landingPage = new LandingPage();
        landingPage.clickOnEnterStoreLink();

        MainMiddleSectionPage mainMiddleSectionPage = new MainMiddleSectionPage();
        String singOnWarningMessage = mainMiddleSectionPage
                .fishLinkClick()
                .angelfishClick()
                .smallAnglefishAddToCart()
                .clickProceedToCheckoutButton()
                .getSingOnWarningMessage();

        Assert.assertEquals("You must sign on before attempting to check out. Please sign on and try checking out again.", singOnWarningMessage);
    }
}
