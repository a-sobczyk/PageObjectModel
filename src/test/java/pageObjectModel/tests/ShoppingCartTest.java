package pageObjectModel.tests;

import org.junit.Assert;
import org.junit.Test;
import pageObjectModel.page.objects.*;

public class ShoppingCartTest extends TestBase {

    @Test
    public void asNotLoggedInUserIShallNotProceedToCheckout() {

        LandingPage landingPage = new LandingPage();
        landingPage.clickOnEnterStoreLink();

        MainMiddleSectionPage mainMiddleSectionPage = new MainMiddleSectionPage();
        mainMiddleSectionPage.fishLinkClick();

        FishPage fishPage = new FishPage();
        fishPage.angelfishClick();

        AnglefishCartPage anglefishCartPage = new AnglefishCartPage();
        anglefishCartPage.smallAnglefishAddToCart();

        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
        shoppingCartPage.clickProceedToCheckoutButton();

        LoginPage loginPage = new LoginPage();

        Assert.assertEquals("You must sign on before attempting to check out. Please sign on and try checking out again.", loginPage.getSingOnWarningMessage());
    }
}
