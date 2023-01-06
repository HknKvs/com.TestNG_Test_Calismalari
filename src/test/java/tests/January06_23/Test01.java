package tests.January06_23;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.QualityPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class Test01 {

    //1- https://www.qualitydemy.com/ anasayfasina gidin
    //2- login linkine basin
    // 3- Kullanici email’i olarak valid email girin
    // 4- Kullanici sifresi olarak valid sifre girin
    // 5- Login butonuna basarak login olun
    // 6- Basarili olarak giris yapilabildigini test edin

    @Test
    public void test01() {

        Driver.getDriver().get("https://www.qualitydemy.com/");
        Driver.getDriver().findElement(By.xpath("//a[@onclick='cookieAccept();']")).click();
        SoftAssert softAssert=new SoftAssert();
        QualityPage qualityPage=new QualityPage();
        qualityPage.login.click();
        qualityPage.email.sendKeys("user_1106147@login.com");
        qualityPage.password.sendKeys("31488081");
        qualityPage.giris.click();
        String actualMyCourses=Driver.getDriver().findElement(By.xpath("(//div[@class='icon'])[2]")).getText();
        String expectedMyCourses="My courses";
        Assert.assertTrue(actualMyCourses.contains(expectedMyCourses));
        softAssert.assertAll();
        ReusableMethods.bekle(5);
        Driver.closeDriver();












    }


}
