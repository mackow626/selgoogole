package TestBase;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.File;

import java.util.concurrent.TimeUnit;

/**
 * Created by mkowalczuk on 2015-10-22.
 */
public class Base {

    public WebDriver driver;
    public long startTime;

    @BeforeMethod
    @Parameters({"webbrowser", "webSite"})
    public void setUp(String webbrowser, String webSite){
        startTime = System.currentTimeMillis();

        if(webbrowser.equals("firefox")){
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }else if(webbrowser.equals("Chrome"))
        {
            File file = new File("chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }else if(webbrowser.equals("IE")){ // TODO
            driver=new InternetExplorerDriver();
           // driver.manage().window().maximize();
        }

        driver.get(webSite);
    }

    @AfterMethod

    public void tearDown(){
        driver.close();


    }

}
