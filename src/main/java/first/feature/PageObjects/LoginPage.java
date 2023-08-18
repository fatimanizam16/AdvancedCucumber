package first.feature.PageObjects;

import first.feature.BaseClass;
import first.feature.Utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseClass {

    private static String txtEmail = "//input[@id='input-email']";
    private static String txtPassword= "//input[@id='input-password']";
    private static String btnLogin= "//input[@value='Login']";
    private static String linkForgotPassword= "//form[@action='https://tutorialsninja.com/demo/index.php?route=account/login']//div//a";

    public static void enterEmail (String username){
        BrowserUtils.enterText(txtEmail,username);
    }
    public static void enterPassword (String password){
        BrowserUtils.enterText(txtPassword,password);
    }

    public static void clickLoginBtn (){
        BrowserUtils.clickElement(btnLogin);
    }
    public static void clickForgotPassword (){
        driver.findElement(By.xpath(linkForgotPassword)).click();
    }
}
