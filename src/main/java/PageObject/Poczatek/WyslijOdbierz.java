package PageObject.Poczatek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

import static java.lang.Thread.sleep;


/**
 * Created by mkowalczuk on 2015-10-23.
 */
public class WyslijOdbierz {
    WebDriver driver;

    public WyslijOdbierz(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='T-I J-J5-Ji T-I-KE L3']")
    WebElement Utworz;

    @FindBy(xpath = "//*[@name='to']")
    WebElement adresat;

    @FindBy(xpath = "//*[@name='subjectbox']")
    WebElement temat;

    @FindBy(xpath = "//*[@class='Am Al editable LW-avf']")
    WebElement tresc;

    @FindBy(xpath = "//*[@class='T-I J-J5-Ji aoO T-I-atl L3']")
    WebElement wyslij;

    @FindBy(xpath = "//*[@id=':50']")
    WebElement odebrane;

    @FindBy(xpath = "//*[@class='xY a4W']")
    WebElement asercja;

    Random ran = new Random();
    Double tematString = ran.nextDouble();

    public Double getTematString(){
        return tematString;
    }


    public void klikUtworz(){Utworz.click();}
    public void wprowadzTresc(String tekst){tresc.sendKeys(tekst);}
    public void wprowadzAdresata(String mail){
     //   adresat.click();
        adresat.sendKeys(mail);
    }
    public void wprowadzTemat(){
    //    temat.click();
        temat.sendKeys(tematString.toString());
    }
    public void klikWyslij(){wyslij.click();}
    public void klikOdebrane(){odebrane.click();}
    public WebElement getAsercja(){
        return asercja;
    }


    public static void czekaj(int czasWMS){

        try {
            sleep(czasWMS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
