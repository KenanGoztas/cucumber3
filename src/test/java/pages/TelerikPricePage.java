package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;
import utilities.Driver;

public class TelerikPricePage {
    public TelerikPricePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement cookieid;
    @FindBy(xpath = "//a[@class='TK-Menu-Item-Link'][normalize-space()='Pricing']")
    public WebElement pricing;
    @FindBy(xpath = "//a[@href='/purchase.aspx'][1]")
    public WebElement pricing2;

    @FindBy(xpath="(//a[@class='Btn Btn--prim4 u-db'][normalize-space()='Buy now'])[1]")
    public WebElement buyNowFirst;
    @FindBy(xpath="(//a[@class='Btn Btn--prim4 u-db'][normalize-space()='Buy now'])[2]")
    public WebElement buyNowSecond;

    @FindBy(xpath="//a[@aria-label='Go to Homepage']")
    public WebElement goToHomepage;
    @FindBy(xpath="//span[@class='TK-Counter TK-Counter--SC TK-Counter--Visible']")
    public WebElement shoppingCart;
    @FindBy(xpath="(//a[@class='e2e-delete-item btn-delete-item ng-star-inserted'][normalize-space()='Delete Item'])[1]")
    public WebElement deleteItem;

}
