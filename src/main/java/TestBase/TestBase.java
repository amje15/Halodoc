package TestBase;

import Utility.constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;

    public static void initialise(){
        if(constants.browser_name.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver",constants.chromedriver_path);
            driver=new ChromeDriver();}
            driver.manage().window().maximize();
            driver.get(constants.URL);
            driver.manage().timeouts().pageLoadTimeout(constants.timeunit, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(constants.timeunit,TimeUnit.SECONDS);

        }


}
