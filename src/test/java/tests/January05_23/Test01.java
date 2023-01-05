package tests.January05_23;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class Test01 {

    @Test
    public void test01() {

        Driver.getDriver().get("https://www.amazon.com");
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        String expectedKelime="Nutella";
        String actualKelime=amazonPage.aramaSonucuElementi.getText();
        Assert.assertTrue(actualKelime.contains(expectedKelime));
        Driver.closeDriver();

    }

}
