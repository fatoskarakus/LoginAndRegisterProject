package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegisterPage {

    WebDriver driver;
    WebElement element;

    //initializing driver
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    //idendifiers
    By CountryInfo = By.cssSelector("select[id=\"country\"]");
    By AdressInfo = By.cssSelector("input[id=\"address\"]");
    By Email = By.cssSelector("input[id=\"email\"]");
    By Phone = By.cssSelector("input[id=\"phone\"]");
    By SaveButton = By.cssSelector("button[id=\"save\"]");
    By LogOutButton = By.cssSelector("button[id=\"logout\"]");
    By SaveText=By.cssSelector("span[class=\"tp-saved\"]");


    //Methods
    public void selectTheCountry() throws InterruptedException {
        element = driver.findElement(CountryInfo);
        Select select = new Select(element);
        select.selectByIndex(1);
        Thread.sleep(50);
    }

    public void GiveTheAdress(String adress) {
        driver.findElement(AdressInfo).sendKeys(adress);
    }

    public void GiveTheEmail(String email) {
        driver.findElement(Email).sendKeys(email);
    }

    public void GiveThePhone(String phone) {
        driver.findElement(Phone).sendKeys(phone);
    }

    public void ClickTheSaveButton() {
        driver.findElement(SaveButton).click();
        Assert.assertEquals(driver.findElement(SaveText).getText(),"Saved");
        System.out.println("Kayıt işlemi gerçekleşmiştir");
    }

    public void clickTheLogoutButton() {
        driver.findElement(LogOutButton).click();
    }

}
