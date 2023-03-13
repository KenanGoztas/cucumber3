package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.TelerikPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class TelerikStepdefs {
    TelerikPage telerikPage = new TelerikPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));

    @Given("Kullanici ana sayfaya gider")
    public void kullaniciAnaSayfayaGider() {
        Driver.getDriver().get("https://www.telerik.com");
    }

    @When("Kullanici Cookies ile ilgili onayi kabul eder")
    public void kullaniciCookiesIleIlgiliOnayiKabulEder() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Accept and Close']"))).click();
    }

    @And("Kullanici ust menu bardan Pricing linkine tiklar")
    public void kullaniciUstMenuBardanPricingLinkineTiklar() {
telerikPage.pricing2.click();
    }

    @And("Kullanici bir paketi buy now butonu ile sepete ekler")
    public void kullaniciBirPaketiBuyNowButonuIleSepeteEkler() {
        telerikPage.buyNow2.click();
    }

    @And("Kullanici ana sayfaya tekrar geri gider")
    public void kullaniciAnaSayfayaTekrarGeriGider() {
        telerikPage.homePage2.click();
    }

    @Then("Kullanici sepet simgesi uzerindeki rakami dogrular")
    public void kullaniciSepetSimgesiUzerindekiRakamiDogrular() {
        String expected = "1";
        Assert.assertEquals(expected, telerikPage.counter.getText());

    }
}
