package Pages;

//https://example.testproject.io/web/

//12345


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    //initializing driver
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //Objects Repository
    By UserName = By.xpath("//input[@id='name']");

    By Password = By.xpath("//input[@id='password']");

    By loginButton = By.xpath("//button[@id='login']");

    //Methods
    public void enterUserName(String pusername) {
        driver.findElement(UserName).sendKeys(pusername);
    }

    public void enterPassword(String ppassword) {
        driver.findElement(Password).sendKeys(ppassword);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void loginValidUser(String puserName, String ppassword) throws InterruptedException {
        driver.findElement(UserName).sendKeys(puserName);
        Thread.sleep(50);
        driver.findElement(Password).sendKeys(ppassword);
        Thread.sleep(50);
        driver.findElement(loginButton).click();
    }
    public void CloseApp(){
        driver.close();
    }
}
