package StepDefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    static WebDriver driver;

    @Before
    public void beforeScenario()
    {
        System.setProperty("webdriver.chrome.driver", "D:\\FBids\\src\\test\\Utilities\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @After
    public void afterScenario(){
        driver.quit();

    }

}
