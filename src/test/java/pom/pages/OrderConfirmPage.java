package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.base.BasePage;

public class OrderConfirmPage extends BasePage {

    private final By orderConfirmMessage = By.cssSelector(".woocommerce-notice");
    public OrderConfirmPage(WebDriver driver) {
        super(driver);
    }

    public String getOrderConfirmMessage(){
        return driver.findElement(orderConfirmMessage).getText();
    }
}
