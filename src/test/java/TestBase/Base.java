package TestBase;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.browserlaunchers.locators.InternetExplorerLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import PageObject.Poczatek.WyslijOdbierz;

import java.io.File;
import java.lang.reflect.Method;

import java.util.concurrent.TimeUnit;

/**
 * Created by mkowalczuk on 2015-10-22.
 */
public class Base {

    public WebDriver driver;
    public long startTime;

    @BeforeMethod
    @Parameters({"przegladarka"})
    public void Przegladarka(String przegladarka){
        startTime = System.currentTimeMillis();

        if(przegladarka.equals("firefox")){
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }else if(przegladarka.equals("Chrome"))
        {
            File file = new File("chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }else if(przegladarka.equals("IE")){ // niedzia�a TODO
            driver=new InternetExplorerDriver();
           // driver.manage().window().maximize();
        }

        driver.get("https://mail.google.com/");
    }

    @AfterMethod

    public void Zakoncz(){
        driver.close();

    }

}
