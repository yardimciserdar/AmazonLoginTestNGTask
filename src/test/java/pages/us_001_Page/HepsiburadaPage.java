package pages.us_001_Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HepsiburadaPage {
    public HepsiburadaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//div[@id='myAccount']" )
    public WebElement uyeOlGirisYapButonu;

    @FindBy(xpath ="//a[@id='login']" )
    public WebElement girisYapButonu;

    @FindBy(xpath ="//input[@id='txtUserName']" )
    public WebElement emailBox;

    @FindBy(xpath ="//button[@id='btnLogin']" )
    public WebElement emailgirisYapButton;

    @FindBy(xpath ="//div[@id='myAccount']" )
    public WebElement UyeGirisYapButton;

    @FindBy(xpath ="//input[@id='txtPassword']" )
    public WebElement passwordBox;

    @FindBy(xpath ="//button[@id='btnEmailSelect']" )
    public WebElement passwordGirisYapButton;

    @FindBy(xpath ="//input[@type='text']" )
    public WebElement searchBox;

    @FindBy(xpath ="//div[@id='/21797185156/Desktop-Masthead/Desktop-Masthead-Diger-googleAdvertisement']" )
    public WebElement araButton;

    @FindBy(xpath ="//div[@class='searchResultSummaryBar-CbyZhv5896ASVcYBLKmx']" )
    public WebElement searchResultSummaryBar;

    @FindBy(xpath ="(//div[@class='treeCategoryContent-XPVj5InCxOWIJtyTC35Z'])[1]" )
    public WebElement kategoriTelefonButton ;

    @FindBy(xpath ="(//div[@class='treeCategoryContent-XPVj5InCxOWIJtyTC35Z'])[1]" )
    public WebElement cepTelefonuButton ;

    @FindBy(xpath ="//div[@class='searchResultSummaryBar-CbyZhv5896ASVcYBLKmx']" )
    public WebElement samsungYazısıKontrol;

    @FindBy(xpath ="//div[@class='paginatorStyle-OQbSBb_oQve3e_k9LEg5']" )
    public WebElement sonSayfaYazisi ;

    @FindBy(xpath ="(//div[@class='moria-ProductCard-eSkbaN bVPpxo s4veoiphei8'])[5]" )
    public WebElement samsungSondan5CepTelefonu ;

    @FindBy(xpath ="//div[@class='customerAccount-Like-13gj2']" )
    public WebElement begenButton ;

    @FindBy(xpath ="//div[@class='hb-toast-text']" )
    public WebElement begenPopUpText;

    @FindBy(xpath ="//button[@id='addToCart']" )
    public WebElement sepeteEkleButton;

    @FindBy(xpath ="//div[@class='hb-toast-text']" )
    public WebElement sepeteEklendiPopUpText;

    @FindBy(xpath ="(//span[@class='sf-OldMyAccount-d0xCHLV38UCH5cD9mOXq'])[1]" )
    public WebElement HesabimButton;

    @FindBy(xpath ="//a[@title='Beğendiklerim']" )
    public WebElement begendiklerimButton;

    @FindBy(xpath ="//h1[@id='product-name']" )
    public WebElement productName ;

    @FindBy(xpath ="//h3[@data-test-id='product-card-name']" )
    public WebElement begendiklerimSayfasiProductName;

    @FindBy(xpath ="//div[@data-test-id='product-info-wrapper']" )
    public WebElement begendiklerimSayfasındakiUrun ;

    @FindBy(xpath ="//span[@class='checkoutui-ProductOnBasketHeader-22Wrk']" )
    public WebElement sepeteEklendiPopUp ;

    @FindBy(xpath ="(//button[@type='button'])[8]" )
    public WebElement sepeteEklePopUpSepeteEkleButton ;

    @FindBy(xpath ="//input[@id='selectedCheckBox']" )
    public WebElement sepetimSayafasiUrunClick ;

    @FindBy(xpath ="//span[text()='Kaldır']" )
    public WebElement kaldirButton;

    @FindBy(xpath ="//div[@class='hb-toast-text']" )
    public WebElement urunKaldirildiPopUpText ;

    @FindBy(xpath ="//h1[text()='Sepetin şu an boş']" )
    public WebElement sepetinBosText;











}
