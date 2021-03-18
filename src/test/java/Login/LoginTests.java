package Login;
import Pages.AccountHomePage;
import Pages.HomePage;
import Pages.LoginPage;
import org.junit.Test;
import ro.leroymerlin.AppTest;

import static org.testng.Assert.assertEquals;

public class LoginTests extends AppTest {

    @Test
    public void testSuccesfulLogin()
    {
        LoginPage loginPage = homePage.clickLoginLink();
        loginPage.setUsername("alex.alexrafa@gmail.com");
        loginPage.setPassword("Leroymerlin201701.");
        AccountHomePage accountHomePage = loginPage.clickLoginButton();
        assertEquals (accountHomePage.getAlertText(), "Bine ai venit, Alexandru!", "Alert test inccorect!");
    }
}
