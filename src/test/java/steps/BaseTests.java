package steps;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import pages.LoginPage;

public class BaseTests {
    protected WebDriver driver = Hooks.getDriver();
    protected HomePage homePage = PageFactory.initElements(driver,HomePage.class);
    protected LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);

}
