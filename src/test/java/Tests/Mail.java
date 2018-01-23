package Tests;

import PageObject.LogPage;
import PageObject.MailPage;
import PageObject.SendAndReciveMail;
import org.testng.Assert;
import org.testng.annotations.Test;
import data.dataProvider;

import java.util.concurrent.TimeUnit;


/**
 * Created by mkowalczuk on 2015-10-22.
 */
public class Mail extends dataProvider {


    @Test (description="Prosze login", dataProvider = "mail")
         public void Login1(String login, String haslo){

//        LogPage pagelogowanie = new LogPage(driver);
//
//        pagelogowanie.login(login,haslo);
//      //  TimeUnit.NANOSECONDS.toSeconds(1000000000000L);
//        pagelogowanie.wait1(5000);
//
//        long diff = System.currentTimeMillis() - startTime;
//
//        System.out.println("Load time was test 1 " + diff);
//
//        Assert.assertTrue(pagelogowanie.getAssertion().isDisplayed());
//        Assert.assertTrue(diff<15000);

    }

    @Test (description="Odczytaj mail", dataProvider = "mail")
    public void readMail(String login, String haslo){

//        LogPage logPage = new LogPage(driver);
//        MailPage mailPage = new MailPage(driver);
//
//        logPage.login(login,haslo);
//        mailPage.clickFirst();
//        long diff = System.currentTimeMillis() - startTime;
//
//        Assert.assertTrue(mailPage.assertionDisplayed());
//
//        System.out.println("Load time was test 2 " + diff);
//        Assert.assertTrue(diff < 20000);
    }

    @Test (description="sendRecive", dataProvider = "mail")
    public void sendRecive(String login, String haslo, String mail, String zawartosc) throws InterruptedException {

//        LogPage pagelogowanie = new LogPage(driver);
//        SendAndReciveMail wyslijodbierz = new SendAndReciveMail(driver);
//
//        pagelogowanie.login(login,haslo);
//
//        wyslijodbierz.clickCreate();
//        driver.switchTo().parentFrame();
//        wyslijodbierz.insertAddressee(mail);
//        wyslijodbierz.insertSubject();
//        wyslijodbierz.insertContent(zawartosc);
//        wyslijodbierz.clickSend();
//
//        for (int i = 0; i <= 12; i++) {
//             if(!wyslijodbierz.getAssertion().getText().contains(wyslijodbierz.getRandomSubject().toString())) {
//                    wyslijodbierz.wait1(5000);
//            }else{
//                 Assert.assertTrue(wyslijodbierz.getAssertion().getText().contains(wyslijodbierz.getRandomSubject().toString()));
//                 System.out.println("test wykonany pozytywnie za tym obrotem   "+ i);
//                 break;
//             }
//        }

     //   System.out.println(wyslijodbierz.getAssertion().getText());

       // System.out.println(wyslijodbierz.getRandomSubject().toString());

       // System.out.println("Load time was test 3 " + diff);

    }

}
