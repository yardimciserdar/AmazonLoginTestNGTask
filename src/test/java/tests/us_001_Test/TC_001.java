package tests.us_001_Test;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.us_001_Page.HepsiburadaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_001 extends TestBaseRapor {
    HepsiburadaPage obj;
@Test
    public void test001(){
        obj = new HepsiburadaPage();
        extentTest = extentReports.createTest("us_001_TC_001","user gecerli email ve password ile giriş yapar \n" +
                "belirtilen telefonu alir");
        Driver.getDriver().get(ConfigReader.getProperty("hepsiBuradaUrl"));
        extentTest.info("hepsiburada anasayfasina gider");

        obj.uyeOlGirisYapButonu.click();
    extentTest.pass("Uye Ol butonunun calıştığını test eder");
        obj.girisYapButonu.click();
    extentTest.pass("Giris butonunun calıştığını test eder");
        obj.emailBox.sendKeys(ConfigReader.getProperty("gecerliEmail"));
        obj.emailgirisYapButton.click();

        obj.passwordBox.sendKeys(ConfigReader.getProperty("gecerliPassword"));
        obj.passwordGirisYapButton.click();

        obj.searchBox.sendKeys("samsung" + Keys.ENTER);

        obj.searchResultSummaryBar.isDisplayed();
    extentTest.pass("Samsung telefon arama sonuçlarının çıktığını test eder");

        obj.kategoriTelefonButton.click();
        obj.cepTelefonuButton.click();

    Assert.assertTrue(obj.samsungYazısıKontrol.isDisplayed());
    extentTest.pass("Samasung arama sonuçları");












    }
}
