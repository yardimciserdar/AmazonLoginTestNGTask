package tests.us_001_Test;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.us_001_Page.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;



public class TC_002 extends TestBaseRapor {
@Test
    public void TC_002(){
        AmazonPage obj ;
        obj = new AmazonPage();

        extentTest = extentReports.createTest("AmazonTest_TC_002","user gecerli email ve password ile giriş yapar \n" +
                "belirtilen telefonu alir");
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        extentTest.info("amazon anasayfasina gider");
        ReusableMethods.waitFor(2);


        obj.allTabsIcon.click();
        ReusableMethods.waitFor(1);
        obj.signInButton.click();
        extentTest.pass("Sign In butonunun calıştığını test eder");
        ReusableMethods.waitFor(1);
        Assert.assertTrue(obj.signInText.isDisplayed());
        extentTest.pass("Sign In yazısının görünürlüğünü test eder");
        obj.emailBox.sendKeys(ConfigReader.getProperty("amazonEmail") + Keys.ENTER);

        Assert.assertTrue(obj.passwordText.isDisplayed());
        extentTest.pass("password yazısının görünürlüğünü test eder");
        obj.passwordbox.sendKeys(ConfigReader.getProperty("amazonPassword") + Keys.ENTER);
        ReusableMethods.waitFor(1);

        obj.searchBox.sendKeys("samsung" + Keys.ENTER);
        ReusableMethods.waitFor(1);

        Assert.assertTrue(obj.resultSamsungtext.isDisplayed());
        extentTest.pass("samsung yazısının görünürlüğünü test eder");

        obj.cellPhonesButton.click();
        extentTest.pass("cell phone butonunu tıklayabildiğini test eder");
        ReusableMethods.waitFor(1);

        obj.pageTwo.click();
        extentTest.pass("2. sayfayı tıklayabildiğini test eder");
        obj.pageTwo.sendKeys(Keys.PAGE_DOWN);
        ReusableMethods.waitFor(2);

        //obj.getPageTwoText.sendKeys(Keys.PAGE_DOWN );
        Assert.assertTrue(obj.getPageTwoText.isDisplayed());
        extentTest.pass("2. sayfanın görünür olduğunu test eder");
        ReusableMethods.waitFor(2);

        obj.fivethLinePhone.click();
        extentTest.pass("Beşinci telefonun tıklandığını test eder");
        ReusableMethods.waitFor(2);

        obj.addToListButton.click();
        extentTest.pass("add to list butonunun tıklandığını test eder");
        ReusableMethods.waitFor(2);


       obj.addToListViewListButton.click();
        extentTest.pass("view your List butonunun tıklanır olduğunu test eder");
        ReusableMethods.waitFor(2);

        obj.shoppingListDeleteItem.click();
        ReusableMethods.waitFor(2);

        Assert.assertTrue(obj.shopingDeletedText.isDisplayed());
        extentTest.pass("deleted yazısnın görünür olduğunu test eder");


        Driver.closeDriver();



























    }
}
