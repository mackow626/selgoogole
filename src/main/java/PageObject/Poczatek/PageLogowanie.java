package PageObject.Poczatek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by mkowalczuk on 2015-10-22.
 */
public class PageLogowanie {

    WebDriver driver;

    public PageLogowanie(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='Email']")
    WebElement login;

    @FindBy(xpath = "//input[@id='next']")
    WebElement dalej;

    @FindBy(xpath = "//input[@id='Passwd']")
    WebElement haslo;

    @FindBy(xpath = "//input[@id='signIn']")
    WebElement ZalogujSie;

    @FindBy(xpath = "//*[@id='gbq1']/div/a/span")
    WebElement assercja;



    public void zaloguj(String login1, String haslo1){
        login.sendKeys(login1);
        dalej.click();
        haslo.sendKeys(haslo1);
        ZalogujSie.click();
    }

    public WebElement asercja(){
        return assercja;
    }









}
