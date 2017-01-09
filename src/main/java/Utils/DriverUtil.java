package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverUtil {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if(driver == null){
            driver = new ChromeDriver();
            System.setProperty("webdriver.chrome.driver", "chromedriver");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        return driver;
    }
}
