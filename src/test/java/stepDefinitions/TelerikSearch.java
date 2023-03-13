package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.TelerikSearchPage;
import utilities.Driver;

import java.time.Duration;


public class TelerikSearch {
    WebDriver driver= Driver.getDriver();
    WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

    TelerikSearchPage telerikSearchPage= new TelerikSearchPage();
    @Given("Kullanici verilen internet sayfasina gider")
    public void kullaniciVerilenInternetSayfasinaGider() {
        driver.get("https://www.telerik.com/support/demos");
    }
    @When("Kullanici ana sayfaya yonlenir Cookie icin gelen seceneklerden Accept and Closea tiklar")
    public void kullanici_ana_sayfaya_yonlenir_cookie_icin_gelen_seceneklerden_accept_and_closea_tiklar() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Accept and Close']"))).click();

        //telerikSearchPage.cookie.submit();
    }

    @And("Kullanici ana sayfaya yonlenir ust menu bar dan arama simgesine tiklar")
    public void kullanici_ana_sayfaya_yonlenir_ust_menu_bar_dan_arama_simgesine_tiklar() {
        telerikSearchPage.search.click();
    }

    @And("Kullanici search box kutusuna {string} yazar")
    public void kullaniciSearchBoxKutusunaYazar(String arg0) {
        telerikSearchPage.searchBox.sendKeys(arg0);
    }

    @And("Kullanici arama butonuna tiklar.")
    public void kullanici_arama_butonuna_tiklar() {
        telerikSearchPage.searchButton.click();
    }

    @Then("Arama sonucu çıkan ilk seçeneigin ilgili kelimeleri barindirdigi Assert edilir.")
    public void arama_sonucu_çıkan_ilk_seçeneigin_ilgili_kelimeleri_barindirdigi_assert_edilir() {
    }


    @Then("Arama sonucu çıkan ilk seçeneigin {string} barindirdigi Assert edilir")
    public void aramaSonucuÇıkanIlkSeçeneiginBarindirdigiAssertEdilir(String arg0) {
        System.out.println(telerikSearchPage.result4.getText());
        Assert.assertTrue(telerikSearchPage.result4.getText().contains(arg0));
    }

    @And("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        //Driver.closeDriver();
        System.out.println("kapaniş");
    }
}