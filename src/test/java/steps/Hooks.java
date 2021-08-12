package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import runner.brower_manager.DriverManager;
import runner.brower_manager.DriverManagerFactory;
import runner.brower_manager.DriverType;


public class Hooks {

    private static WebDriver driver;
    private DriverManager driverManager;

    @Before
    public void setUp() {
        driverManager= DriverManagerFactory.getManager(DriverType.CHROME);
        driver=driverManager.getDriver();
        driver.get("https://www.easy.cl/");
        driver.manage().window().maximize();

    }

    @After
    public void tearDown() {
       driverManager.quitDriver();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
