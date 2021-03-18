package ro.leroymerlin;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class AppTest 
{
    private WebDriver driver;
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.leroymerlin.ro/");
        driver.manage().window().maximize();
        WebElement inspiratieLink = driver.findElement(By.linkText("INSPIRATIE"));
        inspiratieLink.click();

//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println(links.size());
        System.out.println(driver.getTitle());
//        driver.quit();
    }
    public static void main(String args[])
    {
        AppTest test = new AppTest();
        test.setUp();
    }
    /*@Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }*/
}
