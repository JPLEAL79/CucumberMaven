package runner.brower_manager;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager{

    @Override
    public void createDriver(){

        System.setProperty("webdriver.gecko.driver", "./src/test/resources/webdrivers/geckodriver.exe");
        driver = new FirefoxDriver();

    }

}
