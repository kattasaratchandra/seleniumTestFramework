package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class DriverExecutableTests {

    private WebDriver driver;

    @BeforeMethod
    public void setUpDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void test(){
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        System.out.println("The title is: " + actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle);
    }



}
