package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TelerikSearchPage {
    public TelerikSearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy( xpath = "//button=[@id='onetrust-accept-btn-handler']")
    public WebElement cookie;


    @FindBy(xpath = "(//*[name()='svg'])[4]")
    public WebElement search;

    @FindBy(xpath = "//input[@placeholder='search']")
    public WebElement searchBox;

    @FindBy(xpath = "(//span[contains(text(),'Search')])[2]")
    public WebElement searchButton;

    @FindBy(xpath = "(//b[contains(text(),'keyword test')])[2]")
    public WebElement result;

    @FindBy (xpath = "//h4[@class= 'TK-Search-Results-List-Item-H'][1]")
    public WebElement result2;
    @FindBy (xpath= "//p[@class= 'TK-Search-Results-List-Item-P'][1]")
    public WebElement result3;
    @FindBy(xpath= "(//li[@class='TK-Search-Results-List-Item'])[1]/p")
    public WebElement result4;

}
