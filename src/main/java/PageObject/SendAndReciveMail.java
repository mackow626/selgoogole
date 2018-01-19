package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

import static java.lang.Thread.sleep;


/**
 * Created by mkowalczuk on 2015-10-23.
 */
public class SendAndReciveMail {
    private WebDriver driver;

    public SendAndReciveMail(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='T-I J-J5-Ji T-I-KE L3']")
    WebElement create;

    @FindBy(xpath = "//*[@name='to']")
    WebElement addressee;

    @FindBy(xpath = "//*[@name='subjectbox']")
    WebElement subject;

    @FindBy(xpath = "//*[@class='Am Al editable LW-avf']")
    WebElement content;

    @FindBy(xpath = "//*[@class='T-I J-J5-Ji aoO T-I-atl L3']")
    WebElement send;

    @FindBy(xpath = "//*[@id=':50']")
    WebElement recived;

    @FindBy(xpath = "//*[@class='xY a4W']")
    private
    WebElement assertion;

    Random ran = new Random();
    private Double randomSubject = ran.nextDouble();

    public Double getRandomSubject(){
        return randomSubject;
    }


    public void clickCreate(){
        create.click();}
    public void insertContent(String tekst){
        content.sendKeys(tekst);}
    public void insertAddressee(String mail){
     //   addressee.click();
        addressee.sendKeys(mail);
    }
    public void insertSubject(){
    //    subject.click();
        subject.sendKeys(randomSubject.toString());
    }
    public void clickSend(){
        send.click();}
    public void clickRecived(){
        recived.click();}
    public WebElement getAssertion(){
        return assertion;
    }


    public static void wait1(int czasWMS){

        try {
            sleep(czasWMS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
