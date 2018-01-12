package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by mkowalczuk on 2015-10-23.
 */
public class MailPage {

    WebDriver driver;

    public MailPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=':3k']")
    WebElement firstMail;

    @FindBy(xpath = "//*[@id=':2']/div/div[2]/div/table/tr/td[1]/div[2]/div[1]/div[2]")
    WebElement assertion;


    public void clickFirst(){
        firstMail.click();
    }

    public boolean assertionDisplayed(){

        boolean sprawdz = assertion.isDisplayed();
        return sprawdz;
    }


}
