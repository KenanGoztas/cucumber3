package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.TelerikPricePage;
import utilities.Driver;

public class TelerikPriceSteps {
    TelerikPricePage telerikPricePage = new TelerikPricePage();
    WebDriver driver = Driver.getDriver();
    String actualNumber;

    @Given("Kullanici {string} ana sayfaya gider")
    public void kullaniciAnaSayfayaGider(String arg0) {
        driver.get(arg0);
    }

    @When("Kullanici cookies i kabul eder")
    public void kullaniciCookiesIKabulEder() {
        telerikPricePage.cookieid.click();
    }

    @And("Kullanici pricing e tiklar")
    public void kullaniciPricingETiklar() {
        telerikPricePage.pricing.click();
    }
    @And("Kullanici satin al linkine tiklar")
    public void kullaniciSatinAlLinkineTiklar() {
        telerikPricePage.buyNowFirst.click();
    }

    @And("ana sayfaya tekrar doner")
    public void anaSayfayaTekrarDoner() {
        telerikPricePage.goToHomepage.click();
    }

    @And("Kullanici tekrar pricing e tiklar")
    public void kullaniciTekrarPricingETiklar() {
        telerikPricePage.pricing.click();
    }

    @And("tekrar urun ekler")
    public void tekrarUrunEkler() {
        telerikPricePage.buyNowSecond.click();
    }

    @And("Kullanci tekrar ana sayfaya doner")
    public void kullanciTekrarAnaSayfayaDoner() {
        telerikPricePage.goToHomepage.click();
    }

    @Then("sepette urun sayisinin arttigini gorur")
    public void sepetteUrunSayisininArttiginiGorur() {
        String expected = "2";
        Assert.assertEquals(expected, telerikPricePage.shoppingCart.getText());
    }

    @And("kullanici sepete uzerindeki mevcut sayiyi alir")
    public void kullaniciSepeteUzerindekiMevcutSayiyiAlir() {
        actualNumber= telerikPricePage.shoppingCart.getText();

    }

    @And("kullanici sepete tekrar gider")
    public void kullaniciSepeteTekrarGider() {
        telerikPricePage.shoppingCart.click();
    }

    @And("kullanici sepetteki urunlerden bir tanesini Delete linki ile siler")
    public void kullaniciSepettekiUrunlerdenBirTanesiniDeleteLinkiIleSiler() {
        telerikPricePage.deleteItem.click();
    }

    @And("kullanici ana sayfaya geri doner")
    public void kullaniciAnaSayfayaGeriDoner() {
        telerikPricePage.goToHomepage.click();

    }

    @Then("kullanici sepet simgesi uzerindeki sayinin bir eksildigini kontrol eder")
    public void kullaniciSepetSimgesiUzerindekiSayininBirEksildiginiKontrolEder() {
Assert.assertFalse(telerikPricePage.shoppingCart.getText().equals(actualNumber));    }
}
