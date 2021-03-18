package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernameField = By.id("client_email");
    private By passwordField = By.id("password-field");
    private By loginButton = By.id("client_save");
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void setUsername (String username)
    {
        driver.findElement(usernameField).sendKeys(username);
    }
    public  void setPassword(String password)
    {
        driver.findElement(passwordField).sendKeys(password);
    }
    public AccountHomePage clickLoginButton()
    {
        driver.findElement(loginButton).click();
        return new AccountHomePage(driver);
    }
}
