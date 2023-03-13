package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TelerikPage {
    public TelerikPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy( xpath = "//button=[@id='onetrust-accept-btn-handler']")
    public WebElement cookie;
    @FindBy( xpath = "//button[text()='Accept and Close']")
    public WebElement cookie2;
    @FindBy(xpath = "//*[@id=\"js-tlrk-nav-drawer\"]/ul[1]/li[5]/a")
    public WebElement pricing;
    @FindBy(xpath = "(//a[@class='TK-Menu-Item-Link'])[5]")
    public WebElement pricing2;
    @FindBy(xpath = "(//a[contains(text(),'Buy now')])[2]")
    public WebElement buyNow;
    @FindBy(xpath = "(//a[@class='Btn Btn--prim4 u-db'])[1]")
    public WebElement buyNow2;

    @FindBy(xpath = "(//*[name()='svg'])[1]")
    public WebElement homePage;
    @FindBy(css ="a[class='TK-TLRK-Logo']" )
    public WebElement homePage2;

    @FindBy(xpath = "//span[@class='TK-Counter TK-Counter--SC TK-Counter--Visible']")
    public WebElement counter;

}
