import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class NaiveTests {

    private WebDriver driver;
    private Properties properties;

    @Test
    public void guestCheckoutUsingDirectBankTransfer() throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/config.properties"));
        properties = new Properties();
        properties.load(reader);
        reader.close();
        driver.get(properties.getProperty("url"));
        driver.findElement(By.cssSelector("#menu-item-1227 > a")).click();
        driver.findElement(By.cssSelector("button[value='Search']")).click();
        Assert.assertEquals(driver.findElement(
                By.cssSelector(".woocommerce-products-header__title.page-title")).getText(), "Search results: “”");
        driver.findElement(By.cssSelector("a[aria-label='Add “Blue Shoes” to your cart']")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("a[title='View cart']")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector("td[class='product-name'] a")).getText(), "Blue Shoes");
        driver.findElement(By.cssSelector(".checkout-button")).click();
        driver.findElement(By.cssSelector("#billing_first_name")).sendKeys(properties.getProperty("firstName"));
        driver.findElement(By.cssSelector("#billing_last_name")).sendKeys(properties.getProperty("lastName"));
        driver.findElement(By.cssSelector("#billing_address_1")).sendKeys(properties.getProperty("address"));
        driver.findElement(By.cssSelector("#billing_city")).sendKeys(properties.getProperty("city"));
        driver.findElement(By.cssSelector("#billing_postcode")).sendKeys(properties.getProperty("zipcode"));
        driver.findElement(By.cssSelector("#billing_email")).sendKeys(properties.getProperty("email"));
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#place_order")).click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.findElement(By.cssSelector(".woocommerce-notice")).getText(), "Thank you. Your order has been received.");
        driver.quit();
    }



    @Test
    public void loginAndCheckoutUsingDirectBankTransfer() throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/config.properties"));
        properties = new Properties();
        properties.load(reader);
        reader.close();
        driver.get(properties.getProperty("url"));
        driver.findElement(By.cssSelector("#menu-item-1227 > a")).click();
        driver.findElement(By.cssSelector("button[value='Search']")).click();
        Assert.assertEquals(driver.findElement(
                By.cssSelector(".woocommerce-products-header__title.page-title")).getText(), "Search results: “”");
        driver.findElement(By.cssSelector("a[aria-label='Add “Blue Shoes” to your cart']")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("a[title='View cart']")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector("td[class='product-name'] a")).getText(), "Blue Shoes");
        driver.findElement(By.cssSelector(".checkout-button")).click();
        driver.findElement(By.cssSelector(".showlogin")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#username")).sendKeys(properties.getProperty("loginUsername"));
        driver.findElement(By.cssSelector("#password")).sendKeys(properties.getProperty("loginPassword"));
        driver.findElement(By.cssSelector("button[value='Login']")).click();
        driver.findElement(By.cssSelector("#billing_first_name")).clear();
        driver.findElement(By.cssSelector("#billing_first_name")).sendKeys(properties.getProperty("firstName"));
        driver.findElement(By.cssSelector("#billing_last_name")).clear();
        driver.findElement(By.cssSelector("#billing_last_name")).sendKeys(properties.getProperty("lastName"));
        driver.findElement(By.cssSelector("#billing_address_1")).clear();
        driver.findElement(By.cssSelector("#billing_address_1")).sendKeys(properties.getProperty("address"));
        driver.findElement(By.cssSelector("#billing_city")).clear();
        driver.findElement(By.cssSelector("#billing_city")).sendKeys(properties.getProperty("city"));
        driver.findElement(By.cssSelector("#billing_postcode")).clear();
        driver.findElement(By.cssSelector("#billing_postcode")).sendKeys(properties.getProperty("zipcode"));
        driver.findElement(By.cssSelector("#billing_email")).clear();
        driver.findElement(By.cssSelector("#billing_email")).sendKeys(properties.getProperty("email"));
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#place_order")).click();
        Thread.sleep(5000);
        Assert.assertEquals(driver.findElement(By.cssSelector(".woocommerce-notice")).getText(), "Thank you. Your order has been received.");
        driver.quit();
    }




}
