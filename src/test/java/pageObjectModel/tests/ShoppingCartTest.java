package pageObjectModel.tests;

import org.junit.Assert;
import org.junit.Test;
import pageObjectModel.page.objects.*;

public class ShoppingCartTest extends TestBase {

    @Test
    public void asNotLoggedInUserIShallNotProceedToCheckout() {

        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnEnterStoreLink();

        MainMiddleSectionPage mainMiddleSectionPage = new MainMiddleSectionPage(driver);
        mainMiddleSectionPage.fishLinkClick();

        FishPage fishPage = new FishPage(driver);
        fishPage.angelfishClick();

        AnglefishCartPage anglefishCartPage = new AnglefishCartPage(driver);
        anglefishCartPage.smallAnglefishAddToCart();

        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.clickProceedToCheckoutButton();

        LoginPage loginPage = new LoginPage(driver);

        Assert.assertEquals("You must sign on before attempting to check out. Please sign on and try checking out again.", loginPage.getSingOnWarningMessage());
    }
}
