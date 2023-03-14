package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;
import pom.base.BasePage;

public class CartPage extends BasePage {

    private final By productName = By.cssSelector("td[class='product-name'] a");
    private final By proceedToCheckOutButton = By.cssSelector(".checkout-button");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getProductName(){
        return driver.findElement(productName).getText();
    }

    public CheckOutPage clickProceedToCheckOutButton(){
        driver.findElement(proceedToCheckOutButton).click();
        return new CheckOutPage(driver);
    }


}
