package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.base.BaseTest;
import pom.pages.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class NaiveTests extends BaseTest {

    private Properties properties;
    @Test
    public void guestCheckoutUsingDirectBankTransfer() throws InterruptedException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/config.properties"));
        properties = new Properties();
        properties.load(reader);
        reader.close();
        StorePage storePage = new HomePage(driver)
                .load().
                clickStoreMenuLink().
                search("Blue");
        String actualTitle = storePage.getPageTitleText();
        Assert.assertEquals(actualTitle, "Search results: “Blue”");
        storePage
                .clickAddToCartButton("Blue Shoes");
        Thread.sleep(5000);
        CartPage cartPage = storePage.clickViewToCartButton();
        String actualProductName = cartPage.getProductName();
        Assert.assertEquals(actualProductName, "Blue Shoes");
        CheckOutPage checkOutPage = cartPage.clickProceedToCheckOutButton();
        checkOutPage
                .enterFirstNameField(properties.getProperty("firstName"))
                .enterLastNameField(properties.getProperty("lastName"))
                .enterAddressField(properties.getProperty("address"))
                .enterCityField(properties.getProperty("city"))
                .enterZipCodeField(properties.getProperty("zipcode"))
                .enterEmailField(properties.getProperty("email"));
        Thread.sleep(5000);
        OrderConfirmPage orderConfirmPage = checkOutPage.clickPlaceOrderButton();
        Thread.sleep(5000);
        String actualOrderCofirmMessage = orderConfirmPage.getOrderConfirmMessage();
        Assert.assertEquals(actualOrderCofirmMessage, "Thank you. Your order has been received.");

    }


    @Test
    public void loginAndCheckoutUsingDirectBankTransfer() throws InterruptedException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/config.properties"));
        properties = new Properties();
        properties.load(reader);
        reader.close();
        StorePage storePage = new HomePage(driver)
                .load().
                clickStoreMenuLink().
                search("Blue");
        String actualTitle = storePage.getPageTitleText();
        Assert.assertEquals(actualTitle, "Search results: “Blue”");
        storePage
                .clickAddToCartButton("Blue Shoes");
        Thread.sleep(5000);
        CartPage cartPage = storePage.clickViewToCartButton();
        String actualProductName = cartPage.getProductName();
        Assert.assertEquals(actualProductName, "Blue Shoes");
        CheckOutPage checkOutPage = cartPage.clickProceedToCheckOutButton();
        Thread.sleep(5000);
        checkOutPage
                .clickLoginButton();
        Thread.sleep(5000);
        checkOutPage
                .enterLoginUserField(properties.getProperty("loginUsername"))
                .enterLoginPasswordField(properties.getProperty("loginPassword"))
                .clickLoginSubmitButton()
                .enterFirstNameField(properties.getProperty("firstName"))
                .enterLastNameField(properties.getProperty("lastName"))
                .enterAddressField(properties.getProperty("address"))
                .enterCityField(properties.getProperty("city"))
                .enterZipCodeField(properties.getProperty("zipcode"))
                .enterEmailField(properties.getProperty("email"));
        Thread.sleep(5000);
        OrderConfirmPage orderConfirmPage = checkOutPage.clickPlaceOrderButton();
        Thread.sleep(5000);
        String actualOrderCofirmMessage = orderConfirmPage.getOrderConfirmMessage();
        Assert.assertEquals(actualOrderCofirmMessage, "Thank you. Your order has been received.");
    }




}
