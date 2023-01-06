package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualityPage {

    public QualityPage() {

        PageFactory.initElements(Driver.getDriver(),this);}

        @FindBy (xpath = "//a[@class='btn btn-sign-in-simple']")
        public WebElement login;

        @FindBy (xpath = "//input[@name='email']")
        public WebElement email;

        @FindBy (xpath = "//input[@name='password']")
        public WebElement password;

        @FindBy (xpath = "//*[@class='btn red radius-5 mt-4 w-100']")
        public  WebElement giris;











}
