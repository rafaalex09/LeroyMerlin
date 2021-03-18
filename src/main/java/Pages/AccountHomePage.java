package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountHomePage {
    private WebDriver driver;
    private By statusAlert = By.linkText("Bine ai venit, Alexandru!");
    public AccountHomePage(WebDriver driver)
    {
        this.driver = driver;
    }
    public String getAlertText()
    {
        return driver.findElement(statusAlert).getText();
    }

}
