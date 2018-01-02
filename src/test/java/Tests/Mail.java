package Tests;

import PageObject.Poczatek.PageLogowanie;
import PageObject.Poczatek.PageMail;
import PageObject.Poczatek.WyslijOdbierz;
import TestBase.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import data.dataProvider;

import java.util.concurrent.TimeUnit;


/**
 * Created by mkowalczuk on 2015-10-22.
 */
public class Mail extends dataProvider {


    @Test (description="Prosze zaloguj", dataProvider = "mail")
         public void Logowanie1(String login, String haslo){

        PageLogowanie pagelogowanie = new PageLogowanie(driver);

        //long startTime = System.currentTimeMillis();


        pagelogowanie.zaloguj(login,haslo);
        TimeUnit.NANOSECONDS.toSeconds(1000000000000L);

        long diff = System.currentTimeMillis() - startTime;

        System.out.println("Load time was test 1 " + diff);

        Assert.assertTrue(pagelogowanie.asercja().isDisplayed());
        Assert.assertTrue(diff<15000);

    }

    @Test (description="Odczytaj mail", dataProvider = "mail")
    public void odczytMail(String login, String haslo){

        PageLogowanie pagelogowanie = new PageLogowanie(driver);
        PageMail pagemail = new PageMail(driver);

        pagelogowanie.zaloguj(login,haslo);
        pagemail.klikPierwszymail();
        long diff = System.currentTimeMillis() - startTime;

        Assert.assertTrue(pagemail.czyAsercjaWidoczna());

        System.out.println("Load time was test 2 " + diff);
        Assert.assertTrue(diff < 20000);
    }

    @Test (description="wyslijOdbierzmail", dataProvider = "mail")
    public void wyslijOdbierzmail(String login, String haslo, String mail, String zawartosc) throws InterruptedException {

        PageLogowanie pagelogowanie = new PageLogowanie(driver);
        WyslijOdbierz wyslijodbierz = new WyslijOdbierz(driver);

        pagelogowanie.zaloguj(login,haslo);

        wyslijodbierz.klikUtworz();
        driver.switchTo().parentFrame();
        wyslijodbierz.wprowadzAdresata(mail);
        wyslijodbierz.wprowadzTemat();
        wyslijodbierz.wprowadzTresc(zawartosc);
        wyslijodbierz.klikWyslij();

        for (int i = 0; i <= 12; i++) {
             if(!wyslijodbierz.getAsercja().getText().contains(wyslijodbierz.getTematString().toString())) {
                    wyslijodbierz.czekaj(5000);
            }else{
                 Assert.assertTrue(wyslijodbierz.getAsercja().getText().contains(wyslijodbierz.getTematString().toString()));
                 System.out.println("test wykonany pozytywnie za tym obrotem   "+ i);
                 break;
             }
        }

     //   System.out.println(wyslijodbierz.getAsercja().getText());

       // System.out.println(wyslijodbierz.getTematString().toString());

       // System.out.println("Load time was test 3 " + diff);

    }

}
