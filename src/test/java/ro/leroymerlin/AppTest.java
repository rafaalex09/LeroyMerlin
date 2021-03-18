package ro.leroymerlin;

import static org.junit.Assert.assertTrue;

import Pages.HomePage;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class AppTest 
{
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.leroymerlin.ro/");
//        driver.manage().window().maximize();
        homePage = new HomePage(driver);

        System.out.println(driver.getTitle());
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
