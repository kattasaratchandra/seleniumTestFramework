package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.base.BasePage;

public class StorePage extends BasePage {

    private final By searchButton = By.cssSelector("button[value='Search']");

    private final By searchField = By.cssSelector("#woocommerce-product-search-field-0");
    private final By pageTitleText = By.cssSelector(".woocommerce-products-header__title.page-title");
    private final By addToCartButton = By.cssSelector("a[aria-label='Add “Blue Shoes” to your cart']");
    private final By viewCartButton = By.cssSelector("a[title='View cart']");

    public StorePage(WebDriver driver) {
        super(driver);
    }

    public StorePage enterSearchField(String product){
        driver.findElement(searchField).sendKeys(product);
        return this;
    }

    public StorePage clickSearchButton(){
        driver.findElement(searchButton).click();
        return this;
    }

    public StorePage search(String product){
        enterSearchField(product);
        clickSearchButton();
        return this;
    }

    public String getPageTitleText(){
        return driver.findElement(pageTitleText).getText();
    }

    //Blue Shoes
    public StorePage clickAddToCartButton(String productName){
        By element = By.cssSelector("a[aria-label='Add “"+ productName +"” to your cart']");
        driver.findElement(element).click();
        return this;
    }

    public CartPage clickViewToCartButton(){
        driver.findElement(viewCartButton).click();
        return new CartPage(driver);
    }
}
