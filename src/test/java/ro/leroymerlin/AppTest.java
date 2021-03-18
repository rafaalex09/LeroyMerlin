package ro.leroymerlin;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AppTest 
{
    private WebDriver driver;
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.leroymerlin.ro/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.quit();
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
