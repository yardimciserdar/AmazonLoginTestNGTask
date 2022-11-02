package pages.us_001_Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//i[@class='hm-icon nav-sprite']" )
    public WebElement allTabsIcon;


    @FindBy(xpath ="(//a[@class='hmenu-item'])[35]" )
    public WebElement signInButton;

    @FindBy(xpath ="//input[@id='ap_email']" )
    public WebElement emailBox;

    @FindBy(xpath ="//input[@id='continue']" )
    public WebElement continueButton;

    @FindBy(xpath ="//input[@id='ap_password']" )
    public WebElement passwordbox;

    @FindBy(xpath ="//input[@id='signInSubmit']" )
    public WebElement passwordSignInButton ;

    @FindBy(xpath ="//input[@id='twotabsearchtextbox']" )
    public WebElement searchBox;

    @FindBy(xpath ="//span[text()='\"samsung\"']" )
    public WebElement resultSamsungtext ;

    @FindBy(xpath ="(//span[@class='a-size-base a-color-base'])[2]" )
    public WebElement cellPhonesButton;

    @FindBy(xpath ="(//a[@class='s-pagination-item s-pagination-button'])[1]" )
    public WebElement pageTwo;

    @FindBy(xpath ="(//span[@class='a-size-medium a-color-base a-text-normal'])[7]" )
    public WebElement fivethLinePhone;

    @FindBy(xpath ="//span[@aria-label='Current page, page 2']" )
    public WebElement getPageTwoText;

    @FindBy(xpath ="//input[@id='add-to-wishlist-button-submit']" )
    public WebElement addToListButton;

    @FindBy(xpath ="//a[text()='View Your List']" )
    public WebElement addToListViewListButton ;

    @FindBy(xpath ="//input[@name='submit.deleteItem']" )
    public WebElement shoppingListDeleteItem;

    @FindBy(xpath ="(//div[@class='a-alert-content'])[12]" )
    public WebElement shopingDeletedText;

    @FindBy(xpath ="//h1[@class='a-spacing-small']" )
    public WebElement signInText;

    @FindBy(xpath ="//label[@for='ap_password']" )
    public WebElement passwordText;





}
