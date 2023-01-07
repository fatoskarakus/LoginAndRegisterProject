package StepDefinitions;

import Pages.LoginPage;
import Pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {

    WebDriver driver;
    LoginPage login;
    RegisterPage register;
    String sUrl="https://example.testproject.io/web/";

    @Given("Open the Homepage")
    public void openTheHomepage() {
        System.out.println("Sayfa Açılıyor.");
        System.setProperty("webdriver.chrome.driver", "C:/Users/FATMA/Selenium/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(sUrl);
        driver.manage().window().maximize();
    }

    @When("Send the UsernameAndPassword {string} and {string}")
    public void sendTheUsernameAndPasswordAnd(String userName, String password) throws InterruptedException {
        login=new LoginPage(driver);
        login.loginValidUser(userName,password);

    }

    @Then("LogoutOfApp")
    public void logoutofapp() {
        login.CloseApp();
    }

    @Then("Give the email {string}")
    public void giveTheEmail(String email) {
        register.GiveTheEmail(email);
    }

    @Then("Give the Adress {string}")
    public void giveTheAdress(String adress) {
        register.GiveTheAdress(adress);
    }

    @Then("Give the Phone {string}")
    public void giveThePhone(String Phone) {
        register.GiveThePhone(Phone);
    }

    @Then("Click the Save Button")
    public void clickTheSaveButton() {
        register.ClickTheSaveButton();
    }

    @Then("Select the Country")
    public void SelectTheCountry() throws InterruptedException {
        register=new RegisterPage(driver);
        register.selectTheCountry();
        Thread.sleep(50);
    }

    @Then("Click the Logout Button")
    public void ClickTheLogoutButton() {
        register.clickTheLogoutButton();
    }

}
