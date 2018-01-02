package PageObject.Poczatek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by mkowalczuk on 2015-10-23.
 */
public class PageMail {

    WebDriver driver;

    public PageMail(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=':3k']")
    WebElement pierwszyMail;

    @FindBy(xpath = "//*[@id=':2']/div/div[2]/div/table/tr/td[1]/div[2]/div[1]/div[2]")
    WebElement assercja;


    public void klikPierwszymail(){
        pierwszyMail.click();
    }

    public boolean czyAsercjaWidoczna(){

        boolean sprawdz = assercja.isDisplayed();
        return sprawdz;
    }


}
