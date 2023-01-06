package tests.January06_23;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.Driver;

public class Test02 {

    // https://www.booking.com/ sayfasina gidelim
    // para birimi olarak TL secelim
    // ulke olarak Turkiye yi secelim
    // sayfanin en altindan ulgeler kismini secelim
    // ulkeler sayfasindan turkiye yi secelim
    // turkiye sayfasinin secildigini test edin

    @Test
    public void test01() {

        Driver.getDriver().get("https://www.booking.com/");
        WebElement paraBirimi=Driver.getDriver().findElement(By.xpath("//span[@class='bui-button__text']"));
        paraBirimi.click();







    }

}
