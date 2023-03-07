package pom.base;

import org.openqa.selenium.WebDriver;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BasePage {
    protected WebDriver driver;
    protected Properties properties;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void readConfig() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/config.properties"));
        properties = new Properties();
        properties.load(reader);
        reader.close();
    }
}
