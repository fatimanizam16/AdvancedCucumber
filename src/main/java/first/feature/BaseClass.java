package first.feature;

import first.feature.Utils.PropertiesUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;

public class BaseClass {

    public static WebDriver driver;
    public static void initializerDriver(){
        Properties properties= PropertiesUtil.loadApplicationProps();
        String url= properties.get("application.url").toString();
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver= new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
//        Assert.assertTrue(driver.getTitle().equals("Qafox.com"));

    }

    public static void closeDriver(){
        driver.quit();
    }

}
