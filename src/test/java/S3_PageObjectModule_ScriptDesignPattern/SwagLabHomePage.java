package S3_PageObjectModule_ScriptDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage {
    @FindBy(xpath="//div[@class='app_logo']") private WebElement logoText;

    public SwagLabHomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public String getLogoText(){
    String actLogoText=logoText.getText();
    return actLogoText;
    }
}
