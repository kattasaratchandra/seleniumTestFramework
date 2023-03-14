package pom.driver_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
;

public class DriverManager {

    public WebDriver driverIntialization(){
        ChromeOptions chromeOptions = new ChromeOptions();
        //Enables web socket connections from the specified origins only. '*' allows any origin. ↪
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        return driver;
    }
}
