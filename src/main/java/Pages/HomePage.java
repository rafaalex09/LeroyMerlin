package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By LoginLink =  By.linkText("Conectează-te");

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public LoginPage clickLoginLink()
    {
        driver.findElement(LoginLink).click();
        return new  LoginPage(driver);
    }
}
