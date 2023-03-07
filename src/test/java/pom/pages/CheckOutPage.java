package pom.pages;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.base.BasePage;

public class CheckOutPage extends BasePage {

    private final By firstNameField = By.cssSelector("#billing_first_name");
    private final By lastNameField = By.cssSelector("#billing_last_name");
    private final By addressField = By.cssSelector("#billing_address_1");
    private final By cityField = By.cssSelector("#billing_city");
    private final By zipCodeField = By.cssSelector("#billing_postcode");
    private final By emailField = By.cssSelector("#billing_email");
    private final By loginButton = By.cssSelector(".showlogin");
    private final By loginUserField = By.cssSelector("#username");
    private final By loginPasswordField = By.cssSelector("#password");
    private final By loginSubmitButton = By.cssSelector("button[value='Login']");
    private final By placeOrderButton = By.cssSelector("#place_order");


    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    public CheckOutPage enterFirstNameField(String firstName){
        driver.findElement(firstNameField).clear();
        driver.findElement(firstNameField).sendKeys(firstName);
        return this;
    }

    public CheckOutPage enterLastNameField(String lastName){
        driver.findElement(lastNameField).clear();
        driver.findElement(lastNameField).sendKeys(lastName);
        return this;
    }

    public CheckOutPage enterAddressField(String address){
        driver.findElement(addressField).clear();
        driver.findElement(addressField).sendKeys(address);
        return this;
    }

    public CheckOutPage enterCityField(String city){
        driver.findElement(cityField).clear();
        driver.findElement(cityField).sendKeys(city);
        return this;
    }

    public CheckOutPage enterZipCodeField(String zipCode){
        driver.findElement(zipCodeField).clear();
        driver.findElement(zipCodeField).sendKeys(zipCode);
        return this;
    }

    public CheckOutPage enterEmailField(String email){
        driver.findElement(emailField).clear();
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public CheckOutPage enterLoginUserField(String user){
        driver.findElement(emailField).sendKeys(user);
        return this;
    }

    public CheckOutPage enterLoginPasswordField(String password){
        driver.findElement(loginPasswordField).sendKeys(password);
        return this;
    }

    public OrderConfirmPage clickPlaceOrderButton(){
        driver.findElement(placeOrderButton).click();
        return new OrderConfirmPage(driver);
    }

    public CheckOutPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return this;
    }

    public CheckOutPage clickLoginSubmitButton(){
        driver.findElement(loginSubmitButton).click();
        return this;
    }



}
