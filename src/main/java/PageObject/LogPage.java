package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by mkowalczuk on 2015-10-22.
 */
public class LogPage {

    WebDriver driver;

    public LogPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='Email']")
    WebElement login;

    @FindBy(xpath = "//input[@id='next']")
    WebElement forward;

    @FindBy(xpath = "//input[@id='Passwd']")
    WebElement password;

    @FindBy(xpath = "//input[@id='signIn']")
    WebElement logIn;

    @FindBy(xpath = "//*[@id='gbq1']/div/a/span")
    WebElement assertion;



    public void login(String login1, String haslo1){
        login.sendKeys(login1);
        forward.click();
        password.sendKeys(haslo1);
        logIn.click();
    }

    public WebElement getAssertion(){
        return assertion;
    }









}
